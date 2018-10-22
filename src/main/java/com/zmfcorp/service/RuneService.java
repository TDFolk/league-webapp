package com.zmfcorp.service;

import com.zmfcorp.dao.MissingStaticDataDao;
import com.zmfcorp.dao.RuneDataDao;
import com.zmfcorp.dto.*;
import com.zmfcorp.dto.staticdata.RuneDto;
import com.zmfcorp.dto.staticdata.RuneListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Trent on 5/30/2017.
 */

@Service
public class RuneService extends HttpService {
    private String uri;

    @Autowired
    RuneDataDao runeDataDao;

    @Autowired
    MissingStaticDataDao missingStaticDataDao;

    public RuneCompleteInfoDto getRunePagesByName(String summonerName) {
        SummonerDto summoner_info;
        long summonerId;
        String str_summonerId;
        RunePagesDto rune_info = new RunePagesDto();

        try {
            uri = buildURI(leagueConfiguration.getPath_summonerInfo() + summonerName, null);
            summoner_info = restTemplate.getForObject(uri, SummonerDto.class);

            summonerId = summoner_info.getId();
            str_summonerId = Long.toString(summonerId);
            uri = buildURI(leagueConfiguration.getPath_summonerRunes() + str_summonerId, null);
            rune_info = restTemplate.getForObject(uri, RunePagesDto.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        runeDataDao.setRuneListDto(initStaticRuneData());
        RuneCompleteInfoDto result = buildCompleteRuneData(rune_info);


        return result;
    }

    public RuneCompleteInfoDto buildCompleteRuneData(RunePagesDto rune_pages) {
        RuneCompleteInfoDto complete_info = new RuneCompleteInfoDto();
        complete_info.setSummonerId(rune_pages.getSummonerId());
        int rune_info_counter = 0;
        int rune_counter;

        for (RunePageDto rune_page: rune_pages.getPages()) {
            rune_counter = 0;
            RuneInfoDto rune_info = new RuneInfoDto();
            rune_info.setId(rune_page.getId());
            rune_info.setName(rune_page.getName());
            rune_info.setCurrent(rune_page.isCurrent());
            Map<String, Double> runeStatTotals = new HashMap<>();

            for (RuneSlotDto rune_slot: rune_page.getSlots()) {
                rune_info.getRunes().add(runeDataDao.getRuneListDto().getData().get(Integer.toString(rune_slot.getRuneId())));
                RuneDto rune = rune_info.getRunes().get(rune_counter);
                updateRuneStatTotals(runeStatTotals, rune);
                rune.setImageURL(
                    leagueConfiguration.getData_dragon_host() + leagueConfiguration.getData_dragon_runes() +
                    rune.getImage().getFull());
                rune_counter++;
            }
            // Round stats / adjust for scaling runes
            Map<String, Double> copyMap = new HashMap<>(runeStatTotals);
            for (Map.Entry<String, Double> entry: copyMap.entrySet()) {
                String scalingCheck = new String();
                String key = entry.getKey();
                Double entryValue = entry.getValue();
                if (entry.getKey().length() > 7) {
                    scalingCheck = entry.getKey().substring(0, 7);
                }
                if (scalingCheck.equals("Scaling")) {
                    key = entry.getKey().substring(8) + " at level 18";
                    entryValue *= 18;
                    runeStatTotals.remove(entry.getKey());
                }
                double roundedValue = (double) Math.round(entryValue * 100) / 100;
                runeStatTotals.put(key, roundedValue);
            }
            rune_info.setRuneStatTotals(runeStatTotals);
            Collections.sort(rune_info.getRunes());
            complete_info.getRunePages().add(rune_info);
            rune_info_counter++;
        }
        Collections.sort(complete_info.getRunePages());
        complete_info.setNumberofPages(rune_info_counter);
        return complete_info;
    }

    public RuneListDto initStaticRuneData() {
        RuneListDto result = new RuneListDto();

        try {
            Map<String, String> queries = new HashMap<>();
            queries.put("tags", leagueConfiguration.getTag());
            uri = buildURI(leagueConfiguration.getPath_staticdata_runeData(), queries);
            result = restTemplate.getForObject(uri, RuneListDto.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public void updateRuneStatTotals(Map<String, Double> runeStatTotals, RuneDto rune) {
        String statKey = rune.getName().substring(rune.getName().indexOf("of") + 3);
        boolean isMissingData = false;

        for (Map.Entry<String, Map<String,Double>> entry: missingStaticDataDao.getPrecisionStats().entrySet()) {
            // entry.getKey() is either Greater Quintessence of Precision or Greater Mark of Precision
            if (entry.getKey().equals(rune.getName())) {
                for (Map.Entry<String, Double> inner_entry : entry.getValue().entrySet()) {
                    // inner_entry.getKey is either Lethality or Magic Penetration
                    if (runeStatTotals.containsKey(inner_entry.getKey())) {
                        Double previousValue = runeStatTotals.get(inner_entry.getKey());
                        Double updatedValue = previousValue + inner_entry.getValue();
                        runeStatTotals.put(inner_entry.getKey(), updatedValue);
                        isMissingData = true;
                    }
                    else {
                        runeStatTotals.put(inner_entry.getKey(), inner_entry.getValue());
                        isMissingData = true;
                    }
                }
            }
        }

        for (Map.Entry<String, Double> entry: missingStaticDataDao.getLethalityStats().entrySet()) {
            // entry.getKey() is either Greater Mark of Lethality, Mark of Lethality,
            // Greater Quintessence of Lethality, or Quintessence of Lethality
            if (entry.getKey().equals(rune.getName())) {
                if (runeStatTotals.containsKey(statKey)) {
                    Double previousValue = runeStatTotals.get(statKey);
                    Double updatedValue = previousValue + entry.getValue();
                    runeStatTotals.put(statKey, updatedValue);
                    isMissingData = true;
                } else {
                    runeStatTotals.put(statKey, entry.getValue());
                    isMissingData = true;
                }
            }
        }

        if (!isMissingData) {
            try {
                if (runeStatTotals.containsKey(statKey)) {
                    Double previousValue = runeStatTotals.get(statKey);
                    Double updatedValue = previousValue + rune.getStats().determineStat();
                    runeStatTotals.put(statKey, updatedValue);
                }
                else {
                    runeStatTotals.put(statKey, rune.getStats().determineStat());
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }


    }


}

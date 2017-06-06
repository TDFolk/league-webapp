package com.zmfcorp.league.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.javafx.collections.MappingChange;
import com.zmfcorp.league.dao.RuneDataDao;
import com.zmfcorp.league.dto.*;
import com.zmfcorp.league.dto.staticdata.RuneListDto;
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

    public RuneCompleteInfoDto getRunePagesByName(String summonerName) {
        Map<String, SummonerDto> summoner_info;
        SummonerDto summoner;
        long summonerId;
        String str_summonerId;
        Map<String, RunePagesDto> rune_info;
        RunePagesDto runePagesDto = new RunePagesDto();

        try {
            uri = buildURI(leagueConfiguration.getPath_summonerByName() + summonerName);
            summoner_info = restTemplate.getForObject(uri, Map.class);

            summoner = mapper.convertValue(summoner_info.get(summonerName), SummonerDto.class);
            summonerId = summoner.getId();
            str_summonerId = Long.toString(summonerId);
            uri = buildURI(leagueConfiguration.getPath_runes_masteries() + str_summonerId + "/runes");
            rune_info = restTemplate.getForObject(uri, Map.class);

            runePagesDto = mapper.convertValue(rune_info.get(str_summonerId), RunePagesDto.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        runeDataDao.setRuneListDto(initStaticRuneData());
        RuneCompleteInfoDto result = buildCompleteRuneData(runePagesDto);

        return result;
    }

    public RuneCompleteInfoDto buildCompleteRuneData(RunePagesDto rune_pages) {
        RuneCompleteInfoDto complete_info = new RuneCompleteInfoDto();
        complete_info.setSummonerId(rune_pages.getSummonerId());
        int counter = 0;

        for (RunePageDto rune_page: rune_pages.getPages()) {
            RuneInfoDto rune_info = new RuneInfoDto();
            rune_info.setId(rune_page.getId());
            rune_info.setName(rune_page.getName());
            rune_info.setCurrent(rune_page.isCurrent());

            for (RuneSlotDto rune_slot: rune_page.getSlots()) {
                rune_info.getRunes().add(runeDataDao.getRuneListDto().getData().get(Integer.toString(rune_slot.getRuneId())));
            }
            Collections.sort(rune_info.getRunes());
            complete_info.getRunePages().add(rune_info);
            counter++;
        }
        Collections.sort(complete_info.getRunePages());
        complete_info.setNumberofPages(counter);
        return complete_info;
    }

    public RuneListDto initStaticRuneData() {
        RuneListDto result = new RuneListDto();

        try {
            uri = buildURI(leagueConfiguration.getPath_staticdata_runes());
            result = restTemplate.getForObject(uri, RuneListDto.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

}

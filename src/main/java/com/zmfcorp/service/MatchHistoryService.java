package com.zmfcorp.service;

import com.zmfcorp.dto.ChampionDto;
import com.zmfcorp.dto.MatchListDto;
import com.zmfcorp.dto.MatchReferenceDto;
import com.zmfcorp.dto.SummonerDto;

/**
 * Created by Trent on 7/2/2017.
 */
public class MatchHistoryService extends HttpService{
    private String uri;

    public String getLastPlayedChamp(String summonerName) {
        SummonerDto summoner_info;
        MatchListDto matchlist_info;
        ChampionDto champion_info = new ChampionDto();
        long summonerAccountId;
        String strAccountId;
        int champ_number;
        String strChampNumber;


        try {
            uri = buildURI(leagueConfiguration.getPath_summonerInfo() + summonerName, null);
            summoner_info = restTemplate.getForObject(uri, SummonerDto.class);

            summonerAccountId = summoner_info.getAccountId();
            strAccountId = Long.toString(summonerAccountId);
            uri = buildURI(leagueConfiguration.getPath_matchHistoryRecent() + strAccountId + "/recent", null);
            matchlist_info = restTemplate.getForObject(uri, MatchListDto.class);

            champ_number = matchlist_info.getMatches().get(0).getChampion();
            strChampNumber = Integer.toString(champ_number);
            uri = buildURI(leagueConfiguration.getPath_staticdata_championData() + strChampNumber, null);
            champion_info = restTemplate.getForObject(uri, ChampionDto.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return champion_info.getName();
    }
}

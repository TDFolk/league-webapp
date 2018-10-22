package com.zmfcorp.configuration;

import com.zmfcorp.dao.MissingStaticDataDao;
import com.zmfcorp.dao.RuneDataDao;
import com.zmfcorp.service.MatchHistoryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Trent on 6/2/2017.
 */

@Configuration
public class LeagueConfiguration {
    @Value("${league.api.host}")
    private String leagueAPI_host;

    @Value("${league.api.key}")
    private String api_key;

    @Value("${path.summoner.v3.name}")
    private String path_summonerInfo;

    @Value("${path.runes.v3}")
    private String path_summonerRunes;

    @Value("${path.staticdata.v3.runes}")
    private String path_staticdata_runeData;

    @Value("${staticdata.tag}")
    private String tag;

    @Value("${league.data.dragon.host}")
    private String data_dragon_host;

    @Value("${data.dragon.runes}")
    private String data_dragon_runes;

    @Value("${path.match-history.v3.account}")
    private String path_matchHistoryRecent;

    @Value("${path.staticdata.v3.champions}")
    private String path_staticdata_championData;

    @Bean
    public RuneDataDao runeDataDao() {
        return new RuneDataDao();
    }

    @Bean
    public MatchHistoryService matchHistoryService() {
        return new MatchHistoryService();
    }

    @Bean
    public MissingStaticDataDao missingStaticDataDao() {
        return new MissingStaticDataDao();
    }

    public String getLeagueAPI_host() {
        return leagueAPI_host;
    }

    public String getApi_key() {
        return api_key;
    }

    public String getPath_summonerInfo() {
        return path_summonerInfo;
    }

    public String getPath_summonerRunes() {
        return path_summonerRunes;
    }

    public String getPath_staticdata_runeData() {
        return path_staticdata_runeData;
    }

    public String getTag() {
        return tag;
    }

    public String getData_dragon_host() {
        return data_dragon_host;
    }

    public String getData_dragon_runes() {
        return data_dragon_runes;
    }

    public String getPath_matchHistoryRecent() {
        return path_matchHistoryRecent;
    }

    public String getPath_staticdata_championData() {
        return path_staticdata_championData;
    }
}

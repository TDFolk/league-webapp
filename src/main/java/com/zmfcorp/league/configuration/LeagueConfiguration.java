package com.zmfcorp.league.configuration;

import com.zmfcorp.league.dao.RuneDataDao;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Trent on 6/2/2017.
 */

@Configuration
public class LeagueConfiguration {
    @Value("${league.api.host}")
    private String leagueAPI_host;

    @Value("${league.api.key}")
    private String api_key;

    @Value("${path.summonerv1-4.byname}")
    private String path_summonerByName;

    @Value("${path.runes/masteriesv1-4}")
    private String path_runes_masteries;

    @Value("${path.statcdata.runes}")
    private String path_staticdata_runes;

    @Bean
    public RuneDataDao runeDataDao() {
        return new RuneDataDao();
    }

    public String getLeagueAPI_host() {
        return leagueAPI_host;
    }

    public String getApi_key() {
        return api_key;
    }

    public String getPath_summonerByName() {
        return path_summonerByName;
    }

    public String getPath_runes_masteries() {
        return path_runes_masteries;
    }

    public String getPath_staticdata_runes() {
        return path_staticdata_runes;
    }
}

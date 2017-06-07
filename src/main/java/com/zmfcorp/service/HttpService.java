package com.zmfcorp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zmfcorp.configuration.LeagueConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by Trent on 6/3/2017.
 */

@Service
public class HttpService {
    @Autowired
    LeagueConfiguration leagueConfiguration;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UriComponentsBuilder uriComponentsBuilder;

    @Autowired
    HttpHeaders httpHeaders;

    @Autowired
    ObjectMapper mapper;

    protected String buildURI(String uri_path) {
        uriComponentsBuilder = UriComponentsBuilder.newInstance();
        uriComponentsBuilder.scheme("https").host(leagueConfiguration.getLeagueAPI_host())
            .path(uri_path).queryParam("api_key", leagueConfiguration.getApi_key()).build();
        return uriComponentsBuilder.toUriString();
    }

}

package com.zmfcorp.controller;

import com.zmfcorp.service.MatchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Trent on 7/2/2017.
 */

@RestController
@RequestMapping("/match-history")
public class MatchHistoryController {
    @Autowired
    MatchHistoryService matchHistoryService;

    @RequestMapping(value = "/last-played/{name}", method = RequestMethod.GET)
    public String lastPlayedChamp(@PathVariable("name") String summonerName) {
        return matchHistoryService.getLastPlayedChamp(summonerName);
    }

}

package com.zmfcorp.controller;

import com.zmfcorp.dto.RuneCompleteInfoDto;
import com.zmfcorp.service.RuneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Trent on 5/30/2017.
 */

@RestController
@RequestMapping("/runes")
public class RuneController {
    private static Logger log = LoggerFactory.getLogger(RuneController.class);
    @Autowired
    RuneService runeService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public RuneCompleteInfoDto getRunePagesBySummonerName(@PathVariable("name") String summonerName) {
        log.info("Hit 'getRunePagesBySummonerName' endpoint! Summoner -> {}", summonerName);
        return runeService.getRunePagesByName(summonerName);
    }
}

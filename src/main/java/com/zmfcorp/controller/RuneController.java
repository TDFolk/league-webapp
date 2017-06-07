package com.zmfcorp.controller;

import com.zmfcorp.dto.RuneCompleteInfoDto;
import com.zmfcorp.service.RuneService;
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

    @Autowired
    RuneService runeService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public RuneCompleteInfoDto getRunePagesBySummonerName(@PathVariable("name") String summonerName) {
        return runeService.getRunePagesByName(summonerName);
    }
}

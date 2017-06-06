package com.zmfcorp.league.dao;

import com.zmfcorp.league.dto.staticdata.RuneListDto;
import com.zmfcorp.league.service.HttpService;
import com.zmfcorp.league.service.RuneService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Trent on 6/3/2017.
 */
public class RuneDataDao {
    private RuneListDto runeListDto;


    public RuneListDto getRuneListDto() {
        return runeListDto;
    }

    public void setRuneListDto(RuneListDto runeListDto) {
        this.runeListDto = runeListDto;
    }
}

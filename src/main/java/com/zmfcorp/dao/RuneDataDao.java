package com.zmfcorp.dao;

import com.zmfcorp.dto.staticdata.RuneListDto;

import java.io.Serializable;

/**
 * Created by Trent on 6/3/2017.
 */
public class RuneDataDao implements Serializable {
    private RuneListDto runeListDto;

    public RuneListDto getRuneListDto() {
        return runeListDto;
    }

    public void setRuneListDto(RuneListDto runeListDto) {
        this.runeListDto = runeListDto;
    }
}

package com.zmfcorp.dto;

import com.zmfcorp.dto.staticdata.ImageDto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trent on 6/3/2017.
 */
public class RuneCompleteInfoDto implements Serializable {
    long summonerId;
    int numberofPages;
    List<RuneInfoDto> runePages = new ArrayList<RuneInfoDto>();

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public List<RuneInfoDto> getRunePages() {
        return runePages;
    }

    public void setRunePages(List<RuneInfoDto> runePages) {
        this.runePages = runePages;
    }

    public int getNumberofPages() {
        return numberofPages;
    }

    public void setNumberofPages(int numberofPages) {
        this.numberofPages = numberofPages;
    }
}

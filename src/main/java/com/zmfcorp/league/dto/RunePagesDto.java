package com.zmfcorp.league.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Trent on 5/31/2017.
 */
public class RunePagesDto implements Serializable {
    long summonerId;
    Set<RunePageDto> pages = new HashSet<RunePageDto>(); //Collection of rune pages associated with the summoner.

    public Set<RunePageDto> getPages() {
        return pages;
    }

    public void setPages(Set<RunePageDto> pages) {
        this.pages = pages;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }
}

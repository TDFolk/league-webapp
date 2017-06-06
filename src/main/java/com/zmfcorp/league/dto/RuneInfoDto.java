package com.zmfcorp.league.dto;

import com.zmfcorp.league.dto.staticdata.RuneDto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Trent on 6/3/2017.
 */
public class RuneInfoDto implements Serializable, Comparable<RuneInfoDto> {
    long id; // Rune page ID
    String name; // Rune page name
    boolean current; //Indicates if the page is the current page.
    List<RuneDto> runes = new ArrayList<RuneDto>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public List<RuneDto> getRunes() {
        return runes;
    }

    public void setRunes(List<RuneDto> runes) {
        this.runes = runes;
    }

    public int compareTo(RuneInfoDto o) {
        return this.name.toLowerCase().compareTo(o.name.toLowerCase());
    }
}

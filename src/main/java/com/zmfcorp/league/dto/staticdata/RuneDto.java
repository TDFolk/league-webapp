package com.zmfcorp.league.dto.staticdata;

/**
 * Created by Trent on 6/3/2017.
 */
public class RuneDto implements Comparable<RuneDto> {
    int id;
    String name;
    String description;
    MetaDataDto rune;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MetaDataDto getRune() {
        return rune;
    }

    public void setRune(MetaDataDto rune) {
        this.rune = rune;
    }

    public int compareTo(RuneDto o) {
        return this.name.toLowerCase().compareTo(o.name.toLowerCase());
    }
}

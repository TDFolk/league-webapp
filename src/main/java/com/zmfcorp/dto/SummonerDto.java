package com.zmfcorp.dto;

import java.io.Serializable;

/**
 * Created by Trent on 6/3/2017.
 */
public class SummonerDto implements Serializable{
    long profileIconId; // ID of the summoner icon associated with the summoner.
    long revisionDate; // Date summoner was last modified specified as epoch milliseconds.
    long id;
    String name;
    int summonerLevel;

    public long getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

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

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }
}

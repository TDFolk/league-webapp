package com.zmfcorp.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trent on 7/2/2017.
 */
public class MatchListDto {
    List<MatchReferenceDto> matches = new ArrayList<>();
    Integer totalGames;
    Integer startIndex;
    Integer endIndex;

    public List<MatchReferenceDto> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReferenceDto> matches) {
        this.matches = matches;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }
}

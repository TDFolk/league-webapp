package com.zmfcorp.dto.staticdata;

/**
 * Created by Trent on 6/3/2017.
 */
public class MetaDataDto {
    boolean isRune;
    String tier;
    String type;

    public boolean isRune() {
        return isRune;
    }

    public void setRune(boolean rune) {
        isRune = rune;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

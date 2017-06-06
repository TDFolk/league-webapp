package com.zmfcorp.league.dto;

import java.io.Serializable;

/**
 * Created by Trent on 5/31/2017.
 */
public class RuneSlotDto implements Serializable {
    int runeSlotId;
    //Rune ID associated with the rune slot. For static information correlating to rune IDs, please refer to the LoL Static Data API.
    int runeId;




    public int getRuneId() {
        return runeId;
    }
    public void setRuneId(int runeId) {
        this.runeId = runeId;
    }
    public int getRuneSlotId() {
        return runeSlotId;
    }
    public void setRuneSlotId(int runeSlotId) {
        this.runeSlotId = runeSlotId;
    }
}

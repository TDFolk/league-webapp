package com.zmfcorp.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Trent on 5/31/2017.
 */
public class RunePageDto implements Serializable {
    long id; // Rune page ID
    String name; // Rune page name
    boolean current; //Indicates if the page is the current page.
    Set<RuneSlotDto> slots = new HashSet<RuneSlotDto>();

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public Set<RuneSlotDto> getSlots() {
        return slots;
    }

    public void setSlots(Set<RuneSlotDto> slots) {
        this.slots = slots;
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
}

package com.zmfcorp.league.dto.staticdata;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Trent on 6/3/2017.
 */
public class RuneListDto {
    String type;
    String version;
    Map<String, RuneDto> data = new HashMap<String, RuneDto>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, RuneDto> getData() {
        return data;
    }

    public void setData(Map<String, RuneDto> data) {
        this.data = data;
    }
}

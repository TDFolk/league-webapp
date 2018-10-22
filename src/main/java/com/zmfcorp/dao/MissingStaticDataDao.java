package com.zmfcorp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Trent on 6/17/2017.
 */
public class MissingStaticDataDao {
    private Map<String, Map<String, Double>> precisionStats = new HashMap<>();
    private Map<String, Double> lethalityStats = new HashMap<>();

    public MissingStaticDataDao() {
        Map<String, Double> precisionMark = new HashMap<>();
        precisionMark.put("Lethality", 1.13);
        precisionMark.put("Magic Penetration", 0.62);
        precisionStats.put("Greater Mark of Precision", precisionMark);

        Map<String, Double> precisionQuint = new HashMap<>();
        precisionQuint.put("Lethality", 2.24);
        precisionQuint.put("Magic Penetration", 1.4);
        precisionStats.put("Greater Quintessence of Precision", precisionQuint);

        lethalityStats.put("Greater Mark of Lethality", 1.60);
        lethalityStats.put("Mark of Lethality", 1.25);
        lethalityStats.put("Greater Quintessence of Lethality", 3.20);
        lethalityStats.put("Quintessence of Lethality", 2.49);
    }

    public Map<String, Map<String, Double>> getPrecisionStats() {
        return precisionStats;
    }

    public Map<String, Double> getLethalityStats() {
        return lethalityStats;
    }
}

package com.zmfcorp.dto.staticdata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * Created by Trent on 6/12/2017.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuneStatsDto {
    @JsonProperty("PercentTimeDeadModPerLevel")
    Double percentTimeDeadModPerLevel;
    @JsonProperty("PercentArmorPenetrationModPerLevel")
    Double percentArmorPenetrationModPerLevel;
    @JsonProperty("PercentCritDamageMod")
    Double percentCritDamageMod;
    @JsonProperty("PercentSpellBlockMod")
    Double percentSpellBlockMod;
    @JsonProperty("PercentHPRegenMod")
    Double percentHPRegenMod;
    @JsonProperty("PercentMovementSpeedMod")
    Double percentMovementSpeedMod;
    @JsonProperty("FlatSpellBlockMod")
    Double flatSpellBlockMod;
    @JsonProperty("FlatEnergyRegenModPerLevel")
    Double flatEnergyRegenModPerLevel;
    @JsonProperty("FlatEnergyPoolMod")
    Double flatEnergyPoolMod;
    @JsonProperty("FlatMagicPenetrationModPerLevel")
    Double flatMagicPenetrationModPerLevel;
    @JsonProperty("PercentLifeStealMod")
    Double percentLifeStealMod;
    @JsonProperty("FlatMPPoolMod")
    Double flatMPPoolMod;
    @JsonProperty("PercentCooldownMod")
    Double percentCooldownMod;
    @JsonProperty("PercentMagicPenetrationMod")
    Double percentMagicPenetrationMod;
    @JsonProperty("FlatArmorPenetrationModPerLevel")
    Double flatArmorPenetrationModPerLevel;
    @JsonProperty("FlatMovementSpeedMod")
    Double flatMovementSpeedMod;
    @JsonProperty("FlatTimeDeadModPerLevel")
    Double flatTimeDeadModPerLevel;
    @JsonProperty("FlatArmorModPerLevel")
    Double flatArmorModPerLevel;
    @JsonProperty("PercentAttackSpeedMod")
    Double percentAttackSpeedMod;
    @JsonProperty("FlatDodgeModPerLevel")
    Double flatDodgeModPerLevel;
    @JsonProperty("PercentMagicDamageMod")
    Double percentMagicDamageMod;
    @JsonProperty("PercentBlockMod")
    Double percentBlockMod;
    @JsonProperty("FlatDodgeMod")
    Double flatDodgeMod;
    @JsonProperty("FlatEnergyRegenMod")
    Double flatEnergyRegenMod;
    @JsonProperty("FlatHPModPerLevel")
    Double flatHPModPerLevel;
    @JsonProperty("PercentAttackSpeedModPerLevel")
    Double percentAttackSpeedModPerLevel;
    @JsonProperty("PercentSpellVampMod")
    Double percentSpellVampMod;
    @JsonProperty("FlatMPRegenMod")
    Double flatMPRegenMod;
    @JsonProperty("PercentHPPoolMod")
    Double percentHPPoolMod;
    @JsonProperty("PercentDodgeMod")
    Double percentDodgeMod;
    @JsonProperty("FlatAttackSpeedMod")
    Double flatAttackSpeedMod;
    @JsonProperty("FlatArmorMod")
    Double flatArmorMod;
    @JsonProperty("FlatMagicDamageModPerLevel")
    Double flatMagicDamageModPerLevel;
    @JsonProperty("FlatHPRegenMod")
    Double flatHPRegenMod;
    @JsonProperty("PercentPhysicalDamageMod")
    Double percentPhysicalDamageMod;
    @JsonProperty("FlatCritChanceModPerLevel")
    Double flatCritChanceModPerLevel;
    @JsonProperty("FlatSpellBlockModPerLevel")
    Double flatSpellBlockModPerLevel;
    @JsonProperty("PercentTimeDeadMod")
    Double percentTimeDeadMod;
    @JsonProperty("FlatBlockMod")
    Double flatBlockMod;
    @JsonProperty("PercentMPPoolMod")
    Double percentMPPoolMod;
    @JsonProperty("FlatMagicDamageMod")
    Double flatMagicDamageMod;
    @JsonProperty("PercentMPRegenMod")
    Double percentMPRegenMod;
    @JsonProperty("PercentMovementSpeedModPerLevel")
    Double percentMovementSpeedModPerLevel;
    @JsonProperty("PercentCooldownModPerLevel")
    Double percentCooldownModPerLevel;
    @JsonProperty("FlatMPModPerLevel")
    Double flatMPModPerLevel;
    @JsonProperty("FlatEnergyModPerLevel")
    Double flatEnergyModPerLevel;
    @JsonProperty("FlatPhysicalDamageMod")
    Double flatPhysicalDamageMod;
    @JsonProperty("FlatHPRegenModPerLevel")
    Double flatHPRegenModPerLevel;
    @JsonProperty("FlatCritDamageMod")
    Double flatCritDamageMod;
    @JsonProperty("PercentArmorMod")
    Double percentArmorMod;
    @JsonProperty("FlatMagicPenetrationMod")
    Double flatMagicPenetrationMod;
    @JsonProperty("PercentCritChanceMod")
    Double percentCritChanceMod;
    @JsonProperty("FlatPhysicalDamageModPerLevel")
    Double flatPhysicalDamageModPerLevel;
    @JsonProperty("PercentArmorPenetrationMod")
    Double percentArmorPenetrationMod;
    @JsonProperty("PercentEXPBonus")
    Double percentEXPBonus;
    @JsonProperty("FlatMPRegenModPerLevel")
    Double flatMPRegenModPerLevel;
    @JsonProperty("PercentMagicPenetrationModPerLevel")
    Double percentMagicPenetrationModPerLevel;
    @JsonProperty("FlatTimeDeadMod")
    Double flatTimeDeadMod;
    @JsonProperty("FlatMovementSpeedModPerLevel")
    Double flatMovementSpeedModPerLevel;
    @JsonProperty("FlatGoldPer10Mod")
    Double flatGoldPer10Mod;
    @JsonProperty("FlatArmorPenetrationMod")
    Double flatArmorPenetrationMod;
    @JsonProperty("FlatCritDamageModPerLevel")
    Double flatCritDamageModPerLevel;
    @JsonProperty("FlatHPPoolMod")
    Double flatHPPoolMod;
    @JsonProperty("FlatCritChanceMod")
    Double flatCritChanceMod;
    @JsonProperty("FlatEXPBonus")
    Double flatEXPBonus;

    public Double getPercentTimeDeadModPerLevel() {
        return percentTimeDeadModPerLevel;
    }

    public void setPercentTimeDeadModPerLevel(Double percentTimeDeadModPerLevel) {
        percentTimeDeadModPerLevel = percentTimeDeadModPerLevel;
    }

    public Double getPercentArmorPenetrationModPerLevel() {
        return percentArmorPenetrationModPerLevel;
    }

    public void setPercentArmorPenetrationModPerLevel(Double percentArmorPenetrationModPerLevel) {
        this.percentArmorPenetrationModPerLevel = percentArmorPenetrationModPerLevel;
    }

    public Double getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(Double percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public Double getPercentSpellBlockMod() {
        return percentSpellBlockMod;
    }

    public void setPercentSpellBlockMod(Double percentSpellBlockMod) {
        this.percentSpellBlockMod = percentSpellBlockMod;
    }

    public Double getPercentHPRegenMod() {
        return percentHPRegenMod;
    }

    public void setPercentHPRegenMod(Double percentHPRegenMod) {
        this.percentHPRegenMod = percentHPRegenMod;
    }

    public Double getPercentMovementSpeedMod() {
        return percentMovementSpeedMod;
    }

    public void setPercentMovementSpeedMod(Double percentMovementSpeedMod) {
        this.percentMovementSpeedMod = percentMovementSpeedMod;
    }

    public Double getFlatSpellBlockMod() {
        return flatSpellBlockMod;
    }

    public void setFlatSpellBlockMod(Double flatSpellBlockMod) {
        this.flatSpellBlockMod = flatSpellBlockMod;
    }

    public Double getFlatEnergyRegenModPerLevel() {
        return flatEnergyRegenModPerLevel;
    }

    public void setFlatEnergyRegenModPerLevel(Double flatEnergyRegenModPerLevel) {
        this.flatEnergyRegenModPerLevel = flatEnergyRegenModPerLevel;
    }

    public Double getFlatEnergyPoolMod() {
        return flatEnergyPoolMod;
    }

    public void setFlatEnergyPoolMod(Double flatEnergyPoolMod) {
        this.flatEnergyPoolMod = flatEnergyPoolMod;
    }

    public Double getFlatMagicPenetrationModPerLevel() {
        return flatMagicPenetrationModPerLevel;
    }

    public void setFlatMagicPenetrationModPerLevel(Double flatMagicPenetrationModPerLevel) {
        this.flatMagicPenetrationModPerLevel = flatMagicPenetrationModPerLevel;
    }

    public Double getPercentLifeStealMod() {
        return percentLifeStealMod;
    }

    public void setPercentLifeStealMod(Double percentLifeStealMod) {
        this.percentLifeStealMod = percentLifeStealMod;
    }

    public Double getFlatMPPoolMod() {
        return flatMPPoolMod;
    }

    public void setFlatMPPoolMod(Double flatMPPoolMod) {
        this.flatMPPoolMod = flatMPPoolMod;
    }

    public Double getPercentCooldownMod() {
        return percentCooldownMod;
    }

    public void setPercentCooldownMod(Double percentCooldownMod) {
        this.percentCooldownMod = percentCooldownMod;
    }

    public Double getPercentMagicPenetrationMod() {
        return percentMagicPenetrationMod;
    }

    public void setPercentMagicPenetrationMod(Double percentMagicPenetrationMod) {
        this.percentMagicPenetrationMod = percentMagicPenetrationMod;
    }

    public Double getFlatArmorPenetrationModPerLevel() {
        return flatArmorPenetrationModPerLevel;
    }

    public void setFlatArmorPenetrationModPerLevel(Double flatArmorPenetrationModPerLevel) {
        this.flatArmorPenetrationModPerLevel = flatArmorPenetrationModPerLevel;
    }

    public Double getFlatMovementSpeedMod() {
        return flatMovementSpeedMod;
    }

    public void setFlatMovementSpeedMod(Double flatMovementSpeedMod) {
        this.flatMovementSpeedMod = flatMovementSpeedMod;
    }

    public Double getFlatTimeDeadModPerLevel() {
        return flatTimeDeadModPerLevel;
    }

    public void setFlatTimeDeadModPerLevel(Double flatTimeDeadModPerLevel) {
        this.flatTimeDeadModPerLevel = flatTimeDeadModPerLevel;
    }

    public Double getFlatArmorModPerLevel() {
        return flatArmorModPerLevel;
    }

    public void setFlatArmorModPerLevel(Double flatArmorModPerLevel) {
        this.flatArmorModPerLevel = flatArmorModPerLevel;
    }

    public Double getPercentAttackSpeedMod() {
        return percentAttackSpeedMod;
    }

    public void setPercentAttackSpeedMod(Double percentAttackSpeedMod) {
        this.percentAttackSpeedMod = percentAttackSpeedMod;
    }

    public Double getFlatDodgeModPerLevel() {
        return flatDodgeModPerLevel;
    }

    public void setFlatDodgeModPerLevel(Double flatDodgeModPerLevel) {
        this.flatDodgeModPerLevel = flatDodgeModPerLevel;
    }

    public Double getPercentMagicDamageMod() {
        return percentMagicDamageMod;
    }

    public void setPercentMagicDamageMod(Double percentMagicDamageMod) {
        this.percentMagicDamageMod = percentMagicDamageMod;
    }

    public Double getPercentBlockMod() {
        return percentBlockMod;
    }

    public void setPercentBlockMod(Double percentBlockMod) {
        this.percentBlockMod = percentBlockMod;
    }

    public Double getFlatDodgeMod() {
        return flatDodgeMod;
    }

    public void setFlatDodgeMod(Double flatDodgeMod) {
        this.flatDodgeMod = flatDodgeMod;
    }

    public Double getFlatEnergyRegenMod() {
        return flatEnergyRegenMod;
    }

    public void setFlatEnergyRegenMod(Double flatEnergyRegenMod) {
        this.flatEnergyRegenMod = flatEnergyRegenMod;
    }

    public Double getFlatHPModPerLevel() {
        return flatHPModPerLevel;
    }

    public void setFlatHPModPerLevel(Double flatHPModPerLevel) {
        this.flatHPModPerLevel = flatHPModPerLevel;
    }

    public Double getPercentAttackSpeedModPerLevel() {
        return percentAttackSpeedModPerLevel;
    }

    public void setPercentAttackSpeedModPerLevel(Double percentAttackSpeedModPerLevel) {
        this.percentAttackSpeedModPerLevel = percentAttackSpeedModPerLevel;
    }

    public Double getPercentSpellVampMod() {
        return percentSpellVampMod;
    }

    public void setPercentSpellVampMod(Double percentSpellVampMod) {
        this.percentSpellVampMod = percentSpellVampMod;
    }

    public Double getFlatMPRegenMod() {
        return flatMPRegenMod;
    }

    public void setFlatMPRegenMod(Double flatMPRegenMod) {
        this.flatMPRegenMod = flatMPRegenMod;
    }

    public Double getPercentHPPoolMod() {
        return percentHPPoolMod;
    }

    public void setPercentHPPoolMod(Double percentHPPoolMod) {
        this.percentHPPoolMod = percentHPPoolMod;
    }

    public Double getPercentDodgeMod() {
        return percentDodgeMod;
    }

    public void setPercentDodgeMod(Double percentDodgeMod) {
        this.percentDodgeMod = percentDodgeMod;
    }

    public Double getFlatAttackSpeedMod() {
        return flatAttackSpeedMod;
    }

    public void setFlatAttackSpeedMod(Double flatAttackSpeedMod) {
        this.flatAttackSpeedMod = flatAttackSpeedMod;
    }

    public Double getFlatArmorMod() {
        return flatArmorMod;
    }

    public void setFlatArmorMod(Double flatArmorMod) {
        this.flatArmorMod = flatArmorMod;
    }

    public Double getFlatMagicDamageModPerLevel() {
        return flatMagicDamageModPerLevel;
    }

    public void setFlatMagicDamageModPerLevel(Double flatMagicDamageModPerLevel) {
        this.flatMagicDamageModPerLevel = flatMagicDamageModPerLevel;
    }

    public Double getFlatHPRegenMod() {
        return flatHPRegenMod;
    }

    public void setFlatHPRegenMod(Double flatHPRegenMod) {
        this.flatHPRegenMod = flatHPRegenMod;
    }

    public Double getPercentPhysicalDamageMod() {
        return percentPhysicalDamageMod;
    }

    public void setPercentPhysicalDamageMod(Double percentPhysicalDamageMod) {
        this.percentPhysicalDamageMod = percentPhysicalDamageMod;
    }

    public Double getFlatCritChanceModPerLevel() {
        return flatCritChanceModPerLevel;
    }

    public void setFlatCritChanceModPerLevel(Double flatCritChanceModPerLevel) {
        this.flatCritChanceModPerLevel = flatCritChanceModPerLevel;
    }

    public Double getFlatSpellBlockModPerLevel() {
        return flatSpellBlockModPerLevel;
    }

    public void setFlatSpellBlockModPerLevel(Double flatSpellBlockModPerLevel) {
        this.flatSpellBlockModPerLevel = flatSpellBlockModPerLevel;
    }

    public Double getPercentTimeDeadMod() {
        return percentTimeDeadMod;
    }

    public void setPercentTimeDeadMod(Double percentTimeDeadMod) {
        this.percentTimeDeadMod = percentTimeDeadMod;
    }

    public Double getFlatBlockMod() {
        return flatBlockMod;
    }

    public void setFlatBlockMod(Double flatBlockMod) {
        this.flatBlockMod = flatBlockMod;
    }

    public Double getPercentMPPoolMod() {
        return percentMPPoolMod;
    }

    public void setPercentMPPoolMod(Double percentMPPoolMod) {
        this.percentMPPoolMod = percentMPPoolMod;
    }

    public Double getFlatMagicDamageMod() {
        return flatMagicDamageMod;
    }

    public void setFlatMagicDamageMod(Double flatMagicDamageMod) {
        this.flatMagicDamageMod = flatMagicDamageMod;
    }

    public Double getPercentMPRegenMod() {
        return percentMPRegenMod;
    }

    public void setPercentMPRegenMod(Double percentMPRegenMod) {
        this.percentMPRegenMod = percentMPRegenMod;
    }

    public Double getPercentMovementSpeedModPerLevel() {
        return percentMovementSpeedModPerLevel;
    }

    public void setPercentMovementSpeedModPerLevel(Double percentMovementSpeedModPerLevel) {
        this.percentMovementSpeedModPerLevel = percentMovementSpeedModPerLevel;
    }

    public Double getPercentCooldownModPerLevel() {
        return percentCooldownModPerLevel;
    }

    public void setPercentCooldownModPerLevel(Double percentCooldownModPerLevel) {
        this.percentCooldownModPerLevel = percentCooldownModPerLevel;
    }

    public Double getFlatMPModPerLevel() {
        return flatMPModPerLevel;
    }

    public void setFlatMPModPerLevel(Double flatMPModPerLevel) {
        this.flatMPModPerLevel = flatMPModPerLevel;
    }

    public Double getFlatEnergyModPerLevel() {
        return flatEnergyModPerLevel;
    }

    public void setFlatEnergyModPerLevel(Double flatEnergyModPerLevel) {
        this.flatEnergyModPerLevel = flatEnergyModPerLevel;
    }

    public Double getFlatPhysicalDamageMod() {
        return flatPhysicalDamageMod;
    }

    public void setFlatPhysicalDamageMod(Double flatPhysicalDamageMod) {
        this.flatPhysicalDamageMod = flatPhysicalDamageMod;
    }

    public Double getFlatHPRegenModPerLevel() {
        return flatHPRegenModPerLevel;
    }

    public void setFlatHPRegenModPerLevel(Double flatHPRegenModPerLevel) {
        this.flatHPRegenModPerLevel = flatHPRegenModPerLevel;
    }

    public Double getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(Double flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public Double getPercentArmorMod() {
        return percentArmorMod;
    }

    public void setPercentArmorMod(Double percentArmorMod) {
        this.percentArmorMod = percentArmorMod;
    }

    public Double getFlatMagicPenetrationMod() {
        return flatMagicPenetrationMod;
    }

    public void setFlatMagicPenetrationMod(Double flatMagicPenetrationMod) {
        this.flatMagicPenetrationMod = flatMagicPenetrationMod;
    }

    public Double getPercentCritChanceMod() {
        return percentCritChanceMod;
    }

    public void setPercentCritChanceMod(Double percentCritChanceMod) {
        this.percentCritChanceMod = percentCritChanceMod;
    }

    public Double getFlatPhysicalDamageModPerLevel() {
        return flatPhysicalDamageModPerLevel;
    }

    public void setFlatPhysicalDamageModPerLevel(Double flatPhysicalDamageModPerLevel) {
        this.flatPhysicalDamageModPerLevel = flatPhysicalDamageModPerLevel;
    }

    public Double getPercentArmorPenetrationMod() {
        return percentArmorPenetrationMod;
    }

    public void setPercentArmorPenetrationMod(Double percentArmorPenetrationMod) {
        this.percentArmorPenetrationMod = percentArmorPenetrationMod;
    }

    public Double getPercentEXPBonus() {
        return percentEXPBonus;
    }

    public void setPercentEXPBonus(Double percentEXPBonus) {
        this.percentEXPBonus = percentEXPBonus;
    }

    public Double getFlatMPRegenModPerLevel() {
        return flatMPRegenModPerLevel;
    }

    public void setFlatMPRegenModPerLevel(Double flatMPRegenModPerLevel) {
        this.flatMPRegenModPerLevel = flatMPRegenModPerLevel;
    }

    public Double getPercentMagicPenetrationModPerLevel() {
        return percentMagicPenetrationModPerLevel;
    }

    public void setPercentMagicPenetrationModPerLevel(Double percentMagicPenetrationModPerLevel) {
        this.percentMagicPenetrationModPerLevel = percentMagicPenetrationModPerLevel;
    }

    public Double getFlatTimeDeadMod() {
        return flatTimeDeadMod;
    }

    public void setFlatTimeDeadMod(Double flatTimeDeadMod) {
        this.flatTimeDeadMod = flatTimeDeadMod;
    }

    public Double getFlatMovementSpeedModPerLevel() {
        return flatMovementSpeedModPerLevel;
    }

    public void setFlatMovementSpeedModPerLevel(Double flatMovementSpeedModPerLevel) {
        this.flatMovementSpeedModPerLevel = flatMovementSpeedModPerLevel;
    }

    public Double getFlatGoldPer10Mod() {
        return flatGoldPer10Mod;
    }

    public void setFlatGoldPer10Mod(Double flatGoldPer10Mod) {
        this.flatGoldPer10Mod = flatGoldPer10Mod;
    }

    public Double getFlatArmorPenetrationMod() {
        return flatArmorPenetrationMod;
    }

    public void setFlatArmorPenetrationMod(Double flatArmorPenetrationMod) {
        this.flatArmorPenetrationMod = flatArmorPenetrationMod;
    }

    public Double getFlatCritDamageModPerLevel() {
        return flatCritDamageModPerLevel;
    }

    public void setFlatCritDamageModPerLevel(Double flatCritDamageModPerLevel) {
        this.flatCritDamageModPerLevel = flatCritDamageModPerLevel;
    }

    public Double getFlatHPPoolMod() {
        return flatHPPoolMod;
    }

    public void setFlatHPPoolMod(Double flatHPPoolMod) {
        this.flatHPPoolMod = flatHPPoolMod;
    }

    public Double getFlatCritChanceMod() {
        return flatCritChanceMod;
    }

    public void setFlatCritChanceMod(Double flatCritChanceMod) {
        this.flatCritChanceMod = flatCritChanceMod;
    }

    public Double getFlatEXPBonus() {
        return flatEXPBonus;
    }

    public void setFlatEXPBonus(Double flatEXPBonus) {
        this.flatEXPBonus = flatEXPBonus;
    }

    public Double determineStat() throws Exception {
        Boolean foundStat = false;
        Double stat = new Double(0);
        try {
            if (percentTimeDeadModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentTimeDeadModPerLevel * 100;
                foundStat = true;
            }

            if (percentArmorPenetrationModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentArmorPenetrationModPerLevel * 100;
                foundStat = true;
            }

            if (percentCritDamageMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentCritDamageMod * 100;
                foundStat = true;
            }

            if (percentSpellBlockMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentSpellBlockMod * 100;
                foundStat = true;
            }

            if (percentHPRegenMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentHPRegenMod * 100;
                foundStat = true;
            }

            if (percentMovementSpeedMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMovementSpeedMod * 100;
                foundStat = true;
            }

            if (flatSpellBlockMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatSpellBlockMod;
                foundStat = true;
            }

            if (flatEnergyRegenModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatEnergyRegenModPerLevel;
                foundStat = true;
            }

            if (flatEnergyPoolMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatEnergyPoolMod;
                foundStat = true;
            }


            if (flatMagicPenetrationModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMagicPenetrationModPerLevel;
                foundStat = true;
            }

            if (percentLifeStealMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentLifeStealMod * 100;
                foundStat = true;
            }

            if (flatMPPoolMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMPPoolMod;
                foundStat = true;
            }

            if (percentCooldownMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentCooldownMod * 100;
                foundStat = true;
            }

            if (percentMagicPenetrationMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMagicPenetrationMod * 100;
                foundStat = true;
            }

            if (flatArmorPenetrationModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatArmorPenetrationModPerLevel;
                foundStat = true;
            }

            if (flatMovementSpeedMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMovementSpeedMod;
                foundStat = true;
            }

            if (flatTimeDeadModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatTimeDeadModPerLevel;
                foundStat = true;
            }

            if (flatArmorModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatArmorModPerLevel;
                foundStat = true;
            }

            if (percentAttackSpeedMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentAttackSpeedMod * 100;
                foundStat = true;
            }

            if (flatDodgeModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatDodgeModPerLevel;
                foundStat = true;
            }

            if (percentMagicDamageMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMagicDamageMod * 100;
                foundStat = true;
            }

            if (percentBlockMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentBlockMod * 100;
                foundStat = true;
            }

            if (flatDodgeMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatDodgeMod;
                foundStat = true;
            }

            if (flatEnergyRegenMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatEnergyRegenMod;
                foundStat = true;
            }

            if (flatHPModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatHPModPerLevel;
                foundStat = true;
            }

            if (percentAttackSpeedModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentAttackSpeedModPerLevel * 100;
                foundStat = true;
            }

            if (percentSpellVampMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentSpellVampMod * 100;
                foundStat = true;
            }

            if (flatMPRegenMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMPRegenMod * 5;
                foundStat = true;
            }

            if (percentHPPoolMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentHPPoolMod * 100;
                foundStat = true;
            }

            if (percentDodgeMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentDodgeMod * 100;
                foundStat = true;
            }

            if (flatAttackSpeedMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatAttackSpeedMod;
                foundStat = true;
            }

            if (flatArmorMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatArmorMod;
                foundStat = true;
            }

            if (flatMagicDamageModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMagicDamageModPerLevel;
                foundStat = true;
            }

            if (flatHPRegenMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatHPRegenMod * 5;
                foundStat = true;
            }

            if (percentPhysicalDamageMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentPhysicalDamageMod * 100;
                foundStat = true;
            }

            if (flatCritChanceModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatCritChanceModPerLevel * 100;
                foundStat = true;
            }

            if (flatSpellBlockModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatSpellBlockModPerLevel;
                foundStat = true;
            }

            if (percentTimeDeadMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentTimeDeadMod * 100;
                foundStat = true;
            }

            if (flatBlockMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatBlockMod;
                foundStat = true;
            }

            if (percentMPPoolMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMPPoolMod * 100;
                foundStat = true;
            }

            if (flatMagicDamageMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMagicDamageMod;
                foundStat = true;
            }

            if (percentMPRegenMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMPRegenMod * 100;
                foundStat = true;
            }

            if (percentMovementSpeedModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMovementSpeedModPerLevel * 100;
                foundStat = true;
            }

            if (percentCooldownModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentCooldownModPerLevel * 100;
                foundStat = true;
            }

            if (flatMPModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMPModPerLevel;
                foundStat = true;
            }

            if (flatEnergyModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatEnergyModPerLevel;
                foundStat = true;
            }

            if (flatPhysicalDamageMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatPhysicalDamageMod;
                foundStat = true;
            }

            if (flatHPRegenModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatHPRegenModPerLevel * 5;
                foundStat = true;
            }

            if (flatCritDamageMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatCritDamageMod * 100;
                foundStat = true;
            }

            if (percentArmorMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentArmorMod * 100;
                foundStat = true;
            }

            if (flatMagicPenetrationMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMagicPenetrationMod;
                foundStat = true;
            }

            if (percentCritChanceMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentCritChanceMod * 100;
                foundStat = true;
            }

            if (flatPhysicalDamageModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatPhysicalDamageModPerLevel;
                foundStat = true;
            }

            if (percentArmorPenetrationMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentArmorPenetrationMod * 100;
                foundStat = true;
            }

            if (percentEXPBonus != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentEXPBonus * 100;
                foundStat = true;
            }

            if (flatMPRegenModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMPRegenModPerLevel * 5;
                foundStat = true;
            }

            if (percentMagicPenetrationModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += percentMagicPenetrationModPerLevel * 100;
                foundStat = true;
            }

            if (flatTimeDeadMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatTimeDeadMod;
                foundStat = true;
            }

            if (flatMovementSpeedModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatMovementSpeedModPerLevel;
                foundStat = true;
            }

            if (flatGoldPer10Mod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatGoldPer10Mod;
                foundStat = true;
            }

            if (flatArmorPenetrationMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatArmorPenetrationMod;
                foundStat = true;
            }

            if (flatCritDamageModPerLevel != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatCritDamageModPerLevel * 100;
                foundStat = true;
            }

            if (flatHPPoolMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatHPPoolMod;
                foundStat = true;
            }

            if (flatCritChanceMod != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatCritChanceMod * 100;
                foundStat = true;
            }

            if (flatEXPBonus != null) {
                if (foundStat) {
                    throw new Exception("Found 2 stats");
                }
                stat += flatEXPBonus;
                foundStat = true;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return stat;
    }
}

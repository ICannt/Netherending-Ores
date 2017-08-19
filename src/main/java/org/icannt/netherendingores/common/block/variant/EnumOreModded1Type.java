package org.icannt.netherendingores.common.block.variant;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreModded1Type implements IStringSerializable {
	
    ALUMINUM_ORE ("aluminum_ore", 0, 3, 15, EnumRarity.COMMON, 1),
    COPPER_ORE ("copper_ore", 0, 3, 15, EnumRarity.COMMON, 1),
    IRIDIUM_ORE ("iridium_ore", 0, 3, 15, EnumRarity.UNCOMMON, 3),
    LEAD_ORE ("lead_ore", 0, 3, 15, EnumRarity.COMMON, 2),
    MITHRIL_ORE ("mithril_ore", 0, 3, 15, EnumRarity.RARE, 3),
    NICKEL_ORE ("nickel_ore", 0, 3, 15, EnumRarity.COMMON, 2),
    PLATINUM_ORE ("platinum_ore", 0, 3, 15, EnumRarity.UNCOMMON, 3),
    SILVER_ORE ("silver_ore", 0, 3, 15, EnumRarity.COMMON, 2),
    TIN_ORE ("tin_ore", 0, 3, 15, EnumRarity.COMMON, 1);

    private String name;
    private int light;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int harvestLevel;

    EnumOreModded1Type(String name, int light, float hardness, float resistance, EnumRarity rarity, int harvestLevel) {
        this.name = name;
        this.light = light;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;
        this.harvestLevel = harvestLevel;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getLight() {
        return light;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public EnumRarity getRarity() {
        return rarity;
    }
    
    public int getHarvestLevel() {
        return harvestLevel;
    }
}

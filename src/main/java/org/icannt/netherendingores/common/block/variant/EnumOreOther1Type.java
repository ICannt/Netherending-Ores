package org.icannt.netherendingores.common.block.variant;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreOther1Type implements IStringSerializable {
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 0, 3, 15, EnumRarity.COMMON, 0),
    END_QUARTZ_ORE ("end_quartz_ore", 0, 3, 15, EnumRarity.COMMON, 0);

    private String name;
    private int light;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int harvestLevel;

    EnumOreOther1Type(String name, int light, float hardness, float resistance, EnumRarity rarity, int harvestLevel) {
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

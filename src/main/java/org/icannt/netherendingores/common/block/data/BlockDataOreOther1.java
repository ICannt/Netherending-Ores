package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreOther1 implements IStringSerializable {
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON),
    END_QUARTZ_ORE ("end_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 0, 4, 10, 50, EnumRarity.COMMON),
    END_ARDITE_ORE ("end_ardite_ore", 0, 0, 10, 50, EnumRarity.COMMON),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 0, 4, 10, 50, EnumRarity.COMMON),
    END_COBALT_ORE ("end_cobalt_ore", 0, 4, 10, 50, EnumRarity.COMMON);

    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    
    BlockDataOreOther1(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity) {

        this.name = name;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;
        
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public int getLight() {
        return light;
    }
    
    public int getHarvestLevel() {
        return harvestLevel;
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
    
}

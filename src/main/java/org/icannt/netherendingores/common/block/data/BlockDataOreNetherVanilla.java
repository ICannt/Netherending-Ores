package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreNetherVanilla implements IStringSerializable {
	
    COAL_ORE ("coal_ore", 0, 0, 3, 15, EnumRarity.COMMON),
    DIAMOND_ORE ("diamond_ore", 0, 2, 3, 15, EnumRarity.COMMON),
    EMERALD_ORE ("emerald_ore", 0, 2, 3, 15, EnumRarity.COMMON),
    GOLD_ORE ("gold_ore", 0, 2, 3, 15, EnumRarity.COMMON),
    IRON_ORE ("iron_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    LAPIS_ORE ("lapis_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    REDSTONE_ORE ("redstone_ore", 0, 1, 3, 15, EnumRarity.COMMON);

    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;

    BlockDataOreNetherVanilla(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity) {

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

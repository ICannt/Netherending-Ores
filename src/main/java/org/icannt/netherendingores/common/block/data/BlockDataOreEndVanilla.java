package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreEndVanilla implements IStringSerializable {
	
    COAL_ORE ("coal_ore", 0, 0, 3, 15, EnumRarity.COMMON, -1),
    DIAMOND_ORE ("diamond_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    EMERALD_ORE ("emerald_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    GOLD_ORE ("gold_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    IRON_ORE ("iron_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    LAPIS_ORE ("lapis_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    REDSTONE_ORE ("redstone_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1);

    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int blockRecipeDataOrdinal;

    BlockDataOreEndVanilla(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, int blockRecipeDataOrdinal) {

        this.name = name;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;
        this.blockRecipeDataOrdinal = blockRecipeDataOrdinal;
        
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
    
    //
	public int getBlockRecipeDataOrdinal() {
		return blockRecipeDataOrdinal;
	}
    
    //
	public void setBlockRecipeDataOrdinal(int ordinal) {
		this.blockRecipeDataOrdinal = ordinal;
	}

}

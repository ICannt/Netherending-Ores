package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreOther1 implements IStringSerializable {
	
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, -1),
    END_QUARTZ_ORE ("end_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, -1),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 0, 4, 10, 50, EnumRarity.COMMON, -1),
    END_ARDITE_ORE ("end_ardite_ore", 0, 4, 10, 50, EnumRarity.COMMON, -1),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 0, 4, 10, 50, EnumRarity.COMMON, -1),
    END_COBALT_ORE ("end_cobalt_ore", 0, 4, 10, 50, EnumRarity.COMMON, -1),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", 6, 0, 3, 15, EnumRarity.COMMON, -1),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1);

	
    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int blockRecipeDataOrdinal;

    BlockDataOreOther1(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, int blockRecipeDataOrdinal) {

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

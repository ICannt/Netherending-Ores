package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreOther1Type implements IStringSerializable {
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreOverworldQuartz", "quartz_ore", "oreQuartz", 1, 0),
    END_QUARTZ_ORE ("end_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreEndQuartz", "quartz_ore", "oreQuartz", 1, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 0, 4, 10, 50, EnumRarity.COMMON, "oreOverworldArdite", "", "oreArdite", 1, 0),
    END_ARDITE_ORE ("end_ardite_ore", 0, 0, 10, 50, EnumRarity.COMMON, "oreEndArdite", "", "oreArdite", 1, 0),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 0, 4, 10, 50, EnumRarity.COMMON, "oreOverworldCobalt", "", "oreCobalt", 1, 0),
    END_COBALT_ORE ("end_cobalt_ore", 0, 4, 10, 50, EnumRarity.COMMON, "oreEndCobalt", "", "oreCobalt", 1, 0);

    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;

    private String exactOreDict;
    private String itemOreDict;
    private String blockOreDict;
    private int defaultRecipeMultiplier;
    private int recipeMultiplier;

    EnumOreOther1Type(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, 
    		String exactOreDict, String itemOreDict, String blockOreDict, int defaultRecipeMultiplier, int recipeMultiplier) {

        this.name = name;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;

        this.exactOreDict = exactOreDict;
        this.itemOreDict = itemOreDict;
        this.blockOreDict = blockOreDict;
        this.defaultRecipeMultiplier = defaultRecipeMultiplier;
        this.recipeMultiplier = recipeMultiplier;
        
    }

    public String getBlockRegistryName() {
    	return "ore_other_1"; 
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


    public String getExactOreDict() {
        return exactOreDict;
    }

    public String getItemOreDict() {
        return itemOreDict;
    }

    public String getBlockOreDict() {
        return blockOreDict;
    }

    public int getDefaultRecipeMultiplier() {
        return defaultRecipeMultiplier;
    }
    
    public int getRecipeMultiplier() {
        return recipeMultiplier;
    }
    
    public void setRecipeMultiplier(int multiplier) {
    	this.recipeMultiplier = multiplier;
    }
    
}

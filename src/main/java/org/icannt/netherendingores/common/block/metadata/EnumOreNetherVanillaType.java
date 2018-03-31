package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreNetherVanillaType implements IStringSerializable {
	
    COAL_ORE ("coal_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreNetherCoal", "coal_ore", "oreCoal", 2, 0),
    DIAMOND_ORE ("diamond_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreNetherDiamond", "diamond_ore", "oreDiamond", 2, 0),
    EMERALD_ORE ("emerald_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreNetherEmerald", "emerald_ore", "oreEmerald", 2, 0),
    GOLD_ORE ("gold_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreNetherGold", "", "oreGold", 2, 0),
    IRON_ORE ("iron_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreNetherIron", "", "oreIron", 2, 0),
    LAPIS_ORE ("lapis_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreNetherLapis", "lapis_ore", "oreLapis", 2, 0),
    REDSTONE_ORE ("redstone_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreNetherRedstone", "redstone_ore", "oreRedstone", 2, 0);

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

    EnumOreNetherVanillaType(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, 
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
    	return "ore_nether_vanilla"; 
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

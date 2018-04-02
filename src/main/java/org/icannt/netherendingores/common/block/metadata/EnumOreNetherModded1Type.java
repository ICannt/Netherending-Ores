package org.icannt.netherendingores.common.block.metadata;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreNetherModded1Type implements IStringSerializable {
	
    ALUMINUM_ORE ("aluminum_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreNetherAluminum", "", "oreAluminum", 2, 0),
    COPPER_ORE ("copper_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreNetherCopper", "", "oreCopper", 2, 0),
    IRIDIUM_ORE ("iridium_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON, "oreNetherIridium", "", "oreIridium", 2, 0),
    LEAD_ORE ("lead_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreNetherLead", "", "oreLead", 2, 0),
    MITHRIL_ORE ("mithril_ore", 0, 3, 3, 15, EnumRarity.RARE, "oreNetherMithril", "", "oreMithril", 2, 0),
    NICKEL_ORE ("nickel_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreNetherNickel", "", "oreNickel", 2, 0),
    PLATINUM_ORE ("platinum_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON, "oreNetherPlatinum", "", "orePlatinum", 2, 0),
    SILVER_ORE ("silver_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreNetherSilver", "", "oreSilver", 2, 0),
    TIN_ORE ("tin_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreNetherTin", "", "oreTin", 2, 0),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreNetherCertusQuartz", "appliedenergistics2:quartz_ore", "oreCertusQuartz", 2, 0),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreNetherChargedCertusQuartz", "appliedenergistics2:charged_quartz_ore", "oreChargedCertusQuartz", 2, 0),
    OSMIUM_ORE ("osmium_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreNetherOsmium", "", "oreOsmium", 2, 0),
    URANIUM_ORE ("uranium_ore", 0, 2, 4, 30, EnumRarity.COMMON, "oreNetherUranium", "", "oreUranium", 2, 0),
    YELLORITE_ORE ("yellorite_ore", 0, 0, 2, 10, EnumRarity.COMMON, "oreNetherYellorite", "", "oreYellorite", 2, 0);

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

    EnumOreNetherModded1Type(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, 
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

    public Block getBlockRegistryName() {
    	return Block.getBlockFromName(NetherendingOres.MOD_ID + ":ore_nether_modded_1"); 
    }
    
    public String getRecipeRegistryName() {
    	return "nether_" + name;
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

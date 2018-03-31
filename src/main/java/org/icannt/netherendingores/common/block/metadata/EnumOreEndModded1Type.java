package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreEndModded1Type implements IStringSerializable {
	
    ALUMINUM_ORE ("aluminum_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreEndAluminum", "", "oreAluminum", 2, 0),
    COPPER_ORE ("copper_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreEndCopper", "", "oreCopper", 2, 0),
    IRIDIUM_ORE ("iridium_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON, "oreEndIridium", "", "oreIridium", 2, 0),
    LEAD_ORE ("lead_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreEndLead", "", "oreLead", 2, 0),
    MITHRIL_ORE ("mithril_ore", 0, 3, 3, 15, EnumRarity.RARE, "oreEndMithril", "", "oreMithril", 2, 0),
    NICKEL_ORE ("nickel_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreEndNickel", "", "oreNickel", 2, 0),
    PLATINUM_ORE ("platinum_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON, "oreEndPlatinum", "", "orePlatinum", 2, 0),
    SILVER_ORE ("silver_ore", 0, 2, 3, 15, EnumRarity.COMMON, "oreEndSilver", "", "oreSilver", 2, 0),
    TIN_ORE ("tin_ore", 0, 1, 3, 15, EnumRarity.COMMON, "oreEndTin", "", "oreTin", 2, 0),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreEndCertusQuartz", "appliedenergistics2:quartz_ore", "oreCertusQuartz", 2, 0),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreEndChargedCertusQuartz", "appliedenergistics2:charged_quartz_ore", "oreChargedCertusQuartz", 2, 0),
    OSMIUM_ORE ("osmium_ore", 0, 0, 3, 15, EnumRarity.COMMON, "oreEndOsmium", "", "oreOsmium", 2, 0),
    URANIUM_ORE ("uranium_ore", 0, 2, 4, 30, EnumRarity.COMMON, "oreEndUranium", "", "oreUranium", 2, 0),
    YELLORITE_ORE ("yellorite_ore", 0, 0, 2, 10, EnumRarity.COMMON, "oreEndYellorite", "", "oreYellorite", 2, 0);
	
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

    EnumOreEndModded1Type(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, 
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
    	return "ore_end_modded_1"; 
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

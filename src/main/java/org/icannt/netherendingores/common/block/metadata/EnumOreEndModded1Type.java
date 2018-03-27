package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreEndModded1Type implements IStringSerializable {
	
    ALUMINUM_ORE ("aluminum_ore", EnumRarity.UNCOMMON, "oreEndAluminum", "oreAluminum", 0, 1, 3, 15, 2, 0),
    COPPER_ORE ("copper_ore", EnumRarity.UNCOMMON, "oreEndCopper", "oreCopper", 0, 1, 3, 15, 2, 0),
    IRIDIUM_ORE ("iridium_ore", EnumRarity.RARE, "oreEndIridium", "oreIridium", 0, 3, 3, 15, 2, 0),
    LEAD_ORE ("lead_ore", EnumRarity.COMMON, "oreEndLead", "oreLead", 0, 2, 3, 15, 2, 0),
    MITHRIL_ORE ("mithril_ore", EnumRarity.COMMON, "oreEndMithril", "oreMithril", 0, 3, 3, 15, 2, 0),
    NICKEL_ORE ("nickel_ore", EnumRarity.COMMON, "oreEndNickel", "oreNickel", 0, 2, 3, 15, 2, 0),
    PLATINUM_ORE ("platinum_ore", EnumRarity.COMMON, "oreEndPlatinum", "orePlatinum", 0, 3, 3, 15, 2, 0),
    SILVER_ORE ("silver_ore", EnumRarity.COMMON, "oreEndSilver", "oreSilver", 0, 2, 3, 15, 2, 0),
    TIN_ORE ("tin_ore", EnumRarity.COMMON, "oreEndTin", "oreTin", 0, 1, 3, 15, 2, 0),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", EnumRarity.COMMON, "oreEndCertusQuartz", "oreCertusQuartz", 0, 0, 3, 15, 2, 0),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", EnumRarity.COMMON, "oreEndChargedCertusQuartz", "oreChargedCertusQuartz", 0, 0, 3, 15, 2, 0),
    OSMIUM_ORE ("osmium_ore", EnumRarity.COMMON, "oreEndOsmium", "oreOsmium", 0, 0, 3, 15, 2, 0),
    URANIUM_ORE ("uranium_ore", EnumRarity.COMMON, "oreEndUranium", "oreUranium", 0, 2, 4, 30, 2, 0),
    YELLORITE_ORE ("yellorite_ore", EnumRarity.COMMON, "oreEndYellorite", "oreYellorite", 0, 0, 2, 10, 2, 0);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict;
    private String furnaceOreDict;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int defaultRecipeMultiplier;
    private int recipeMultiplier;

    EnumOreEndModded1Type(String name, EnumRarity rarity, String recipeOreDict, String furnaceOreDict, int light, int harvestLevel, float hardness, float resistance, int defaultRecipeMultiplier, int recipeMultiplier) {
        this.name = name;
        this.rarity = rarity;
        this.recipeOreDict = recipeOreDict;
        this.furnaceOreDict = furnaceOreDict;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.defaultRecipeMultiplier = defaultRecipeMultiplier;
        this.recipeMultiplier = recipeMultiplier;
    }

    @Override
    public String getName() {
        return name;
    }
    
    public EnumRarity getRarity() {
        return rarity;
    }
    
    public String getRecipeOreDict() {
        return recipeOreDict;
    }
    
    public String getFurnaceOreDict() {
        return furnaceOreDict;
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

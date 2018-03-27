package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreNetherModded1Type implements IStringSerializable {
	
    ALUMINUM_ORE ("aluminum_ore", EnumRarity.UNCOMMON, "oreNetherAluminum", "oreAluminum", 0, 1, 3, 15, 2),
    COPPER_ORE ("copper_ore", EnumRarity.UNCOMMON, "oreNetherCopper", "oreCopper", 0, 1, 3, 15, 2),
    IRIDIUM_ORE ("iridium_ore", EnumRarity.RARE, "oreNetherIridium", "oreIridium", 0, 3, 3, 15, 2),
    LEAD_ORE ("lead_ore", EnumRarity.COMMON, "oreNetherLead", "oreLead", 0, 2, 3, 15, 2),
    MITHRIL_ORE ("mithril_ore", EnumRarity.COMMON, "oreNetherMithril", "oreMithril", 0, 3, 3, 15, 2),
    NICKEL_ORE ("nickel_ore", EnumRarity.COMMON, "oreNetherNickel", "oreNickel", 0, 2, 3, 15, 2),
    PLATINUM_ORE ("platinum_ore", EnumRarity.COMMON, "oreNetherPlatinum", "orePlatinum", 0, 3, 3, 15, 2),
    SILVER_ORE ("silver_ore", EnumRarity.COMMON, "oreNetherSilver", "oreSilver", 0, 2, 3, 15, 2),
    TIN_ORE ("tin_ore", EnumRarity.COMMON, "oreNetherTin", "oreTin", 0, 1, 3, 15, 2),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", EnumRarity.COMMON, "oreNetherCertusQuartz", "oreCertusQuartz", 0, 0, 3, 15, 2),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", EnumRarity.COMMON, "oreNetherChargedCertusQuartz", "oreChargedCertusQuartz", 0, 0, 3, 15, 2),
    OSMIUM_ORE ("osmium_ore", EnumRarity.COMMON, "oreNetherOsmium", "oreOsmium", 0, 0, 3, 15, 2),
    URANIUM_ORE ("uranium_ore", EnumRarity.COMMON, "oreNetherUranium", "oreUranium", 0, 2, 4, 30, 2),
    YELLORITE_ORE ("yellorite_ore", EnumRarity.COMMON, "oreNetherYellorite", "oreYellorite", 0, 0, 2, 10, 2);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict;
    private String furnaceOreDict;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int recipeMultiplier;

    EnumOreNetherModded1Type(String name, EnumRarity rarity, String recipeOreDict, String furnaceOreDict, int light, int harvestLevel, float hardness, float resistance, int recipeMultiplier) {
        this.name = name;
        this.rarity = rarity;
        this.recipeOreDict = recipeOreDict;
        this.furnaceOreDict = furnaceOreDict;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
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
    
    public int getRecipeMultiplier() {
        return recipeMultiplier;
    }
    
}

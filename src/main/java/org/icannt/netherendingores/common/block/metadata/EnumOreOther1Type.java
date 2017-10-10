package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreOther1Type implements IStringSerializable {
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", EnumRarity.COMMON, "oreQuartz", "", 0, 0, 3, 15),
    END_QUARTZ_ORE ("end_quartz_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", EnumRarity.COMMON, "", "", 0, 4, 10, 50),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", EnumRarity.COMMON, "", "", 0, 4, 10, 50),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    NETHER_URANIUM_ORE ("nether_uranium_ore", EnumRarity.COMMON, "", "", 0, 2, 4, 30),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", EnumRarity.COMMON, "", "", 0, 0, 2, 10),
    END_ARDITE_ORE ("end_ardite_ore", EnumRarity.COMMON, "", "", 0, 0, 10, 50),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    END_COBALT_ORE ("end_cobalt_ore", EnumRarity.COMMON, "", "", 0, 4, 10, 50),
    END_OSMIUM_ORE ("end_osmium_ore", EnumRarity.COMMON, "", "", 0, 0, 3, 15),
    END_URANIUM_ORE ("end_uranium_ore", EnumRarity.COMMON, "", "", 0, 2, 4, 30),
    END_YELLORITE_ORE ("end_yellorite_ore", EnumRarity.COMMON, "", "", 0, 0, 2, 10);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict;
    private String furnaceOreDict;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;

    EnumOreOther1Type(String name, EnumRarity rarity, String recipeOreDict, String furnaceOreDict, int light, int harvestLevel, float hardness, float resistance) {
        this.name = name;
        this.rarity = rarity;
        this.recipeOreDict = recipeOreDict;
        this.furnaceOreDict = furnaceOreDict;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
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
    
}

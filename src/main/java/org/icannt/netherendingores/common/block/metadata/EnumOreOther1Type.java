package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreOther1Type implements IStringSerializable {
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", EnumRarity.COMMON, "oreQuartz", "", 0, 0, 3, 15),
    END_QUARTZ_ORE ("end_quartz_ore", EnumRarity.COMMON, "oreQuartz", "", 0, 0, 3, 15),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", EnumRarity.COMMON, "oreArdite", "", 0, 4, 10, 50),
    END_ARDITE_ORE ("end_ardite_ore", EnumRarity.COMMON, "oreArdite", "", 0, 0, 10, 50),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", EnumRarity.COMMON, "oreCobalt", "", 0, 4, 10, 50),
    END_COBALT_ORE ("end_cobalt_ore", EnumRarity.COMMON, "oreCobalt", "", 0, 4, 10, 50);

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

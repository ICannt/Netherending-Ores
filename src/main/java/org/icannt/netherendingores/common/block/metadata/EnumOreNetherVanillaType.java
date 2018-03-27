package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreNetherVanillaType implements IStringSerializable {
	
    COAL_ORE ("coal_ore", EnumRarity.COMMON, "oreNetherCoal", "oreCoal", 0, 0, 3, 15, 2),
    DIAMOND_ORE ("diamond_ore", EnumRarity.COMMON, "oreNetherDiamond", "oreDiamond", 0, 2, 3, 15, 2),
    EMERALD_ORE ("emerald_ore", EnumRarity.COMMON, "oreNetherEmerald", "oreEmerald", 0, 2, 3, 15, 2),
    GOLD_ORE ("gold_ore", EnumRarity.COMMON, "oreNetherGold", "oreGold", 0, 2, 3, 15, 2),
    IRON_ORE ("iron_ore", EnumRarity.COMMON, "oreNetherIron", "oreIron", 0, 1, 3, 15, 2),
    LAPIS_ORE ("lapis_ore", EnumRarity.COMMON, "oreNetherLapis", "oreLapis", 0, 1, 3, 15, 2),
    REDSTONE_ORE ("redstone_ore", EnumRarity.COMMON, "oreNetherRedstone", "oreRedstone", 0, 1, 3, 15, 2);

    private String name;
    private EnumRarity rarity;
    private String recipeOreDict;
    private String furnaceOreDict;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private int recipeMultiplier;

    EnumOreNetherVanillaType(String name, EnumRarity rarity, String recipeOreDict, String furnaceOreDict, int light, int harvestLevel, float hardness, float resistance, int recipeMultiplier) {
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

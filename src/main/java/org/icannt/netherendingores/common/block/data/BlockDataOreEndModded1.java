package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreEndModded1 implements IStringSerializable {

	
    ALUMINUM_ORE ("aluminum_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    COPPER_ORE ("copper_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    IRIDIUM_ORE ("iridium_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON, -1),
    LEAD_ORE ("lead_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    MITHRIL_ORE ("mithril_ore", 0, 3, 3, 15, EnumRarity.RARE, -1),
    NICKEL_ORE ("nickel_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    PLATINUM_ORE ("platinum_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON, -1),
    SILVER_ORE ("silver_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    TIN_ORE ("tin_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, -1),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON, -1),
    OSMIUM_ORE ("osmium_ore", 0, 0, 3, 15, EnumRarity.COMMON, -1),
    URANIUM_ORE ("uranium_ore", 0, 2, 4, 30, EnumRarity.COMMON, -1),
    YELLORITE_ORE ("yellorite_ore", 0, 0, 2, 10, EnumRarity.COMMON, -1),
    DILITHIUM_ORE ("dilithium_ore", 0, 2, 4, 15, EnumRarity.COMMON, -1),
    TRITANIUM_ORE ("tritanium_ore", 0, 2, 8, 15, EnumRarity.COMMON, -1);

	
    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int blockRecipeDataOrdinal;

    BlockDataOreEndModded1(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, int blockRecipeDataOrdinal) {

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

package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 28/01/19.
 */
public enum BlockDataOreEndModded2 implements IStringSerializable {

	
    ZINC_ORE ("zinc_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    RUBY_ORE ("ruby_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    SAPPHIRE_ORE ("sapphire_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    PERIDOT_ORE ("peridot_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    ELECTROTINE_ORE ("electrotine_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    AMBROSIUM_ORE ("ambrosium_ore", 6, 0, 3, 15, EnumRarity.COMMON, -1),
    GRAVITITE_ORE ("gravitite_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    ZANITE_ORE ("zanite_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1),
    ARKENIUM_ORE ("arkenium_ore", 0, 2, 3, 15, EnumRarity.COMMON, -1),
    ICESTONE_ORE ("icestone_ore", 0, 1, 3, 15, EnumRarity.COMMON, -1);

	
    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;
    private int blockRecipeDataOrdinal;

    BlockDataOreEndModded2(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity, int blockRecipeDataOrdinal) {

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

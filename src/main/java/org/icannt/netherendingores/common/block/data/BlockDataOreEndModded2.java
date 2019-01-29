package org.icannt.netherendingores.common.block.data;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 28/01/19.
 */
public enum BlockDataOreEndModded2 implements IStringSerializable {

	
    ZINC_ORE ("zinc_ore", 0, 1, 3, 15, EnumRarity.COMMON);

	
    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;

    BlockDataOreEndModded2(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity) {

        this.name = name;
        this.light = light;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;
        
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
    
}

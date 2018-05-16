package org.icannt.netherendingores.common.block.metadata;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum EnumOreEndModded1Type implements IStringSerializable {

	
    ALUMINUM_ORE ("aluminum_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    COPPER_ORE ("copper_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    IRIDIUM_ORE ("iridium_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON),
    LEAD_ORE ("lead_ore", 0, 2, 3, 15, EnumRarity.COMMON),
    MITHRIL_ORE ("mithril_ore", 0, 3, 3, 15, EnumRarity.RARE),
    NICKEL_ORE ("nickel_ore", 0, 2, 3, 15, EnumRarity.COMMON),
    PLATINUM_ORE ("platinum_ore", 0, 3, 3, 15, EnumRarity.UNCOMMON),
    SILVER_ORE ("silver_ore", 0, 2, 3, 15, EnumRarity.COMMON),
    TIN_ORE ("tin_ore", 0, 1, 3, 15, EnumRarity.COMMON),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", 0, 0, 3, 15, EnumRarity.COMMON),
    OSMIUM_ORE ("osmium_ore", 0, 0, 3, 15, EnumRarity.COMMON),
    URANIUM_ORE ("uranium_ore", 0, 2, 4, 30, EnumRarity.COMMON),
    YELLORITE_ORE ("yellorite_ore", 0, 0, 2, 10, EnumRarity.COMMON),
    DILITHIUM_ORE ("dilithium_ore", 0, 2, 4, 15, EnumRarity.COMMON),
    TRITANIUM_ORE ("tritanium_ore", 0, 2, 8, 15, EnumRarity.COMMON);

	
    private String name;
    private int light;
    private int harvestLevel;
    private float hardness;
    private float resistance;
    private EnumRarity rarity;

    EnumOreEndModded1Type(String name, int light, int harvestLevel, float hardness, float resistance, EnumRarity rarity) {

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

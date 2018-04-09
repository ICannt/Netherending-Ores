package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.block.Block;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 08/04/18.
 */
public enum BlockRecipeDataRegistry implements IStringSerializable {

    NETHER_COAL_ORE ("nether_coal_ore", "ore_nether_vanilla", 0, "coal", 2, 0),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", "ore_nether_vanilla", 1, "gem", 2, 0),
    NETHER_EMERALD_ORE ("nether_emerald_ore", "ore_nether_vanilla", 2, "gem", 2, 0),
    NETHER_GOLD_ORE ("nether_gold_ore", "ore_nether_vanilla", 3, "", 2, 0),
    NETHER_IRON_ORE ("nether_iron_ore", "ore_nether_vanilla", 4, "", 2, 0),
    NETHER_LAPIS_ORE ("nether_lapis_ore", "ore_nether_vanilla", 5, "gem", 2, 0),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", "ore_nether_vanilla", 6, "", 2, 0),
    END_COAL_ORE ("end_coal_ore", "ore_end_vanilla", 0, "coal_ore", 2, 0),
    END_DIAMOND_ORE ("end_diamond_ore", "ore_end_vanilla", 1, "diamond_ore", 2, 0),
    END_EMERALD_ORE ("end_emerald_ore", "ore_end_vanilla", 2, "emerald_ore", 2, 0),
    END_GOLD_ORE ("end_gold_ore", "ore_end_vanilla", 3, "", 2, 0),
    END_IRON_ORE ("end_iron_ore", "ore_end_vanilla", 4, "", 2, 0),
    END_LAPIS_ORE ("end_lapis_ore", "ore_end_vanilla", 5, "lapis_ore", 2, 0),
    END_REDSTONE_ORE ("end_redstone_ore", "ore_end_vanilla", 6, "redstone_ore", 2, 0),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", "ore_nether_modded_1", 0, "", 2, 0),
    NETHER_COPPER_ORE ("nether_copper_ore", "ore_nether_modded_1", 1, "", 2, 0),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", "ore_nether_modded_1", 2, "", 2, 0),
    NETHER_LEAD_ORE ("nether_lead_ore", "ore_nether_modded_1", 3, "", 2, 0),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", "ore_nether_modded_1", 4, "", 2, 0),
    NETHER_NICKEL_ORE ("nether_nickel_ore", "ore_nether_modded_1", 5, "", 2, 0),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", "ore_nether_modded_1", 6, "", 2, 0),
    NETHER_SILVER_ORE ("nether_silver_ore", "ore_nether_modded_1", 7, "", 2, 0),
    NETHER_TIN_ORE ("nether_tin_ore", "ore_nether_modded_1", 8, "", 2, 0),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", "ore_nether_modded_1", 9, "appliedenergistics2:quartz_ore", 2, 0),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", "ore_nether_modded_1", 10, "appliedenergistics2:charged_quartz_ore", 2, 0),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", "ore_nether_modded_1", 11, "", 2, 0),
    NETHER_URANIUM_ORE ("nether_uranium_ore", "ore_nether_modded_1", 12, "", 2, 0),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", "ore_nether_modded_1", 13, "", 2, 0),
    END_ALUMINUM_ORE ("end_aluminum_ore", "ore_end_modded_1", 0, "", 2, 0),
    END_COPPER_ORE ("end_copper_ore", "ore_end_modded_1", 1, "", 2, 0),
    END_IRIDIUM_ORE ("end_iridium_ore", "ore_end_modded_1", 2, "", 2, 0),
    END_LEAD_ORE ("end_lead_ore", "ore_end_modded_1", 3, "", 2, 0),
    END_MITHRIL_ORE ("end_mithril_ore", "ore_end_modded_1", 4, "", 2, 0),
    END_NICKEL_ORE ("end_nickel_ore", "ore_end_modded_1", 5, "", 2, 0),
    END_PLATINUM_ORE ("end_platinum_ore", "ore_end_modded_1", 6, "", 2, 0),
    END_SILVER_ORE ("end_silver_ore", "ore_end_modded_1", 7, "", 2, 0),
    END_TIN_ORE ("end_tin_ore", "ore_end_modded_1", 8, "", 2, 0),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", "ore_end_modded_1", 9, "appliedenergistics2:quartz_ore", 2, 0),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", "ore_end_modded_1", 10, "appliedenergistics2:charged_quartz_ore", 2, 0),
    END_OSMIUM_ORE ("end_osmium_ore", "ore_end_modded_1", 11, "", 2, 0),
    END_URANIUM_ORE ("end_uranium_ore", "ore_end_modded_1", 12, "", 2, 0),
    END_YELLORITE_ORE ("end_yellorite_ore", "ore_end_modded_1", 13, "", 2, 0),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", "ore_other_1", 0, "quartz_ore", 1, 0),
    END_QUARTZ_ORE ("end_quartz_ore", "ore_other_1", 1, "quartz_ore", 1, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", "ore_other_1", 2, "", 1, 0),
    END_ARDITE_ORE ("end_ardite_ore", "ore_other_1", 3, "", 1, 0),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", "ore_other_1", 4, "", 1, 0),
    END_COBALT_ORE ("end_cobalt_ore", "ore_other_1", 5, "", 1, 0);

    private String name;
    private String blockName;
    private int blockMeta;
    private String itemOreDict;
    private int defaultRecipeMultiplier;
    private int recipeMultiplier;
	
	BlockRecipeDataRegistry(String name, String blockName, int blockMeta, String itemOreDict, int defaultRecipeMultiplier, int recipeMultiplier) {
		
		this.name = name;
		this.blockName = blockName;
		this.blockMeta = blockMeta;
		this.itemOreDict = itemOreDict;
		this.defaultRecipeMultiplier = defaultRecipeMultiplier;
		this.recipeMultiplier = recipeMultiplier;
		
	}
	
    public Block getBlock() {
    	return Block.getBlockFromName(NetherendingOres.MOD_ID + ":" + blockName);
    }
    
    public int getBlockMeta() {
    	return blockMeta;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public String getItemOreDict() {
        return itemOreDict;
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

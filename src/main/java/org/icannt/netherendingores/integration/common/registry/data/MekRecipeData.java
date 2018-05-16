package org.icannt.netherendingores.integration.common.registry.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;

import mekanism.api.MekanismAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 20/04/18.
 */

public enum MekRecipeData implements IStringSerializable {
	
	
    NETHER_COAL_ORE ("nether_coal_ore", 2, 4, 4),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 2, 4, 4),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 2, 4, 4),
    NETHER_GOLD_ORE ("nether_gold_ore", 0, 4, 4),
    NETHER_IRON_ORE ("nether_iron_ore", 0, 4, 4),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 12, 24, 4),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 12, 24, 4),
    END_COAL_ORE ("end_coal_ore", 2, 4, 4),
    END_DIAMOND_ORE ("end_diamond_ore", 2, 4, 4),
    END_EMERALD_ORE ("end_emerald_ore", 2, 4, 4),
    END_GOLD_ORE ("end_gold_ore", 0, 4, 4),
    END_IRON_ORE ("end_iron_ore", 0, 4, 4),
    END_LAPIS_ORE ("end_lapis_ore", 12, 24, 4),
    END_REDSTONE_ORE ("end_redstone_ore", 12, 24, 4),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 0, 4, 4),
    NETHER_COPPER_ORE ("nether_copper_ore", 0, 4, 4),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 0, 4, 4),
    NETHER_LEAD_ORE ("nether_lead_ore", 0, 4, 4),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 0, 4, 4),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 0, 4, 4),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 0, 4, 4),
    NETHER_SILVER_ORE ("nether_silver_ore", 0, 4, 4),
    NETHER_TIN_ORE ("nether_tin_ore", 0, 4, 4),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 2, 4, 4),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 2, 4, 4),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 0, 4, 4),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 0, 4, 4),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 0, 4, 4),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", 0, 4, 4),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", 0, 4, 4),
    END_ALUMINUM_ORE ("end_aluminum_ore", 0, 4, 4),
    END_COPPER_ORE ("end_copper_ore", 0, 4, 4),
    END_IRIDIUM_ORE ("end_iridium_ore", 0, 4, 4),
    END_LEAD_ORE ("end_lead_ore", 0, 4, 4),
    END_MITHRIL_ORE ("end_mithril_ore", 0, 4, 4),
    END_NICKEL_ORE ("end_nickel_ore", 0, 4, 4),
    END_PLATINUM_ORE ("end_platinum_ore", 0, 4, 4),
    END_SILVER_ORE ("end_silver_ore", 0, 4, 4),
    END_TIN_ORE ("end_tin_ore", 0, 4, 4),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 2, 4, 4),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 2, 4, 4),
    END_OSMIUM_ORE ("end_osmium_ore", 0, 4, 4),
    END_URANIUM_ORE ("end_uranium_ore", 0, 4, 4),
    END_YELLORITE_ORE ("end_yellorite_ore", 0, 4, 4),
    END_DILITHIUM_ORE ("end_dilithium_ore", 0, 4, 4),
    END_TRITANIUM_ORE ("end_tritanium_ore", 0, 4, 4),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 6, 12, 4),
    END_QUARTZ_ORE ("end_quartz_ore", 6, 12, 4),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 0, 4, 4),
    END_ARDITE_ORE ("end_ardite_ore", 0, 4, 4),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 0, 4, 4),
    END_COBALT_ORE ("end_cobalt_ore", 0, 4, 4);

	
	private String name;
	private int enrich1xAmount;
	private int enrich2xAmount;
	private int enrich3xAmount;
	
	
	MekRecipeData(String name, int enrich1xAmount, int enrich2xAmount, int enrich3xAmount) {		
		this.name = name;
		this.enrich1xAmount = enrich1xAmount;
		this.enrich2xAmount = enrich2xAmount;
		this.enrich3xAmount = enrich3xAmount;
	}

	
	@Override
	public String getName() {
		return name;
	}
	

	public int getEnrichAmount(int multiplier) {
		int amount = 0;
		switch (multiplier) {
			case 1:	amount = enrich1xAmount; break;
			case 2:	amount = enrich2xAmount; break;
			case 3:	amount = enrich3xAmount;
		}
		return amount;
	}
	
	
    public static int getEnrichAmount(int index, int multiplier) {
        return values()[index].getEnrichAmount(multiplier);
    }
	
    
	private static int getMultiplier(int index) {
		return BlockRecipeData.values()[index].getRecipeMultiplier();
	}    
    
	
	public static ItemStack getEnrichItemStack(int index, int multiplier) {
		ItemStack outStack = BlockRecipeData.getOreDictBlockItemStack(index, getEnrichAmount(index, multiplier));
		if (multiplier == 1 || multiplier == 2) {
			outStack = BlockRecipeData.getOreDictCrushItemStack(index, getEnrichAmount(index, multiplier));	
		}
		return outStack;
	}
	
	
	public static void getEnrichRecipe(int index) {
		int multiplier = getMultiplier(index);
		if (getEnrichAmount(index, multiplier) > 0) {
			MekanismAPI.recipeHelper().addEnrichmentChamberRecipe(BlockRecipeData.getItemStack(index), getEnrichItemStack(index, multiplier));
		}
	}

	
}

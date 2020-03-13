package org.icannt.netherendingores.integration.common.data;

import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.lib.Log;

import mekanism.api.MekanismAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 20/04/18.
 */

public enum MekRecipeData implements IStringSerializable {
	
	
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
    END_ZINC_ORE ("end_zinc_ore", 0, 4, 4),
    END_RUBY_ORE ("end_ruby_ore", 0, 4, 4),
    END_SAPPHIRE_ORE ("end_sapphire_ore", 0, 4, 4),
    END_PERIDOT_ORE ("end_peridot_ore", 0, 4, 4),
    END_ELECTROTINE_ORE ("end_electrotine_ore", 0, 4, 4),
    END_AMBROSIUM_ORE ("end_ambrosium_ore", 0, 4, 4),
    END_GRAVITITE_ORE ("end_gravitite_ore", 0, 4, 4),
    END_ZANITE_ORE ("end_zanite_ore", 0, 4, 4),
    END_ARKENIUM_ORE ("end_arkenium_ore", 0, 4, 4),
    END_ICESTONE_ORE ("end_icestone_ore", 0, 4, 4),
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
    NETHER_ZINC_ORE ("nether_zinc_ore", 0, 4, 4),
    NETHER_RUBY_ORE ("nether_ruby_ore", 0, 4, 4),
    NETHER_SAPPHIRE_ORE ("nether_sapphire_ore", 0, 4, 4),
    NETHER_PERIDOT_ORE ("nether_peridot_ore", 0, 4, 4),
    NETHER_ELECTROTINE_ORE ("nether_electrotine_ore", 0, 4, 4),
    NETHER_AMBROSIUM_ORE ("nether_ambrosium_ore", 0, 4, 4),
    NETHER_GRAVITITE_ORE ("nether_gravitite_ore", 0, 4, 4),
    NETHER_ZANITE_ORE ("nether_zanite_ore", 0, 4, 4),
    NETHER_ARKENIUM_ORE ("nether_arkenium_ore", 0, 4, 4),
    NETHER_ICESTONE_ORE ("nether_icestone_ore", 0, 4, 4),
    NETHER_COAL_ORE ("nether_coal_ore", 2, 4, 4),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 2, 4, 4),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 2, 4, 4),
    NETHER_GOLD_ORE ("nether_gold_ore", 0, 4, 4),
    NETHER_IRON_ORE ("nether_iron_ore", 0, 4, 4),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 12, 24, 4),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 12, 24, 4),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 6, 12, 4),
    END_QUARTZ_ORE ("end_quartz_ore", 6, 12, 4),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 0, 4, 4),
    END_ARDITE_ORE ("end_ardite_ore", 0, 4, 4),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 0, 4, 4),
    END_COBALT_ORE ("end_cobalt_ore", 0, 4, 4),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", 0, 4, 4),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", 0, 4, 4),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", 0, 4, 4),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", 0, 4, 4),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", 0, 4, 4);

	
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
	
	//
	@Override
	public String getName() {
		return name;
	}
	
    //
	public int getEnrichAmount(int multiplier) {
		switch (multiplier) {
			case 1:	return enrich1xAmount;
			case 2:	return enrich2xAmount;
			case 3:	return enrich3xAmount;
		}
		return 0;
	}
	
	//
    public static int getEnrichAmount(BlockData blockData) {
        return values()[blockData.ordinal()].getEnrichAmount(blockData.getRecipeMultiplier());
    }
	
	//
	public static void addEnrichRecipe(BlockData blockData, String material) {
		if (getEnrichAmount(blockData) > 0) {
			MekanismAPI.recipeHelper().addEnrichmentChamberRecipe(blockData.getModBlockItemStack(), getEnrichItemStack(blockData, material));
		}
	}
	
	//
	public static ItemStack getEnrichItemStack(BlockData blockData, String material) {
		Log.logRecipeMsg("enrichment chamber", blockData.getName(), blockData.getOreDictOutputName("crush", material));
		return blockData.getOreDictOutputItemStack("crush", material, getEnrichAmount(blockData));
	}

	
}

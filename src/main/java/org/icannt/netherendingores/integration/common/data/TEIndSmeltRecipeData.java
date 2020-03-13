package org.icannt.netherendingores.integration.common.data;

import static java.lang.Math.round;

import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Log;

import cofh.api.util.ThermalExpansionHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 03/02/19.
 */

public enum TEIndSmeltRecipeData implements IStringSerializable {

	
    END_ALUMINUM_ORE ("end_aluminum_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_COPPER_ORE ("end_copper_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_IRIDIUM_ORE ("end_iridium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_LEAD_ORE ("end_lead_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_MITHRIL_ORE ("end_mithril_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_NICKEL_ORE ("end_nickel_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_PLATINUM_ORE ("end_platinum_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_SILVER_ORE ("end_silver_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_TIN_ORE ("end_tin_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_OSMIUM_ORE ("end_osmium_ore", 6400, 2, 10, 16000, 4, 25, 14400, 3, 100, 36000, 5, 100),
    END_URANIUM_ORE ("end_uranium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_YELLORITE_ORE ("end_yellorite_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_DILITHIUM_ORE ("end_dilithium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_TRITANIUM_ORE ("end_tritanium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_ZINC_ORE ("end_zinc_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_RUBY_ORE ("end_ruby_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_SAPPHIRE_ORE ("end_sapphire_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_PERIDOT_ORE ("end_peridot_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_ELECTROTINE_ORE ("end_electrotine_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_AMBROSIUM_ORE ("end_ambrosium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_GRAVITITE_ORE ("end_gravitite_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_ZANITE_ORE ("end_zanite_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_ARKENIUM_ORE ("end_arkenium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_ICESTONE_ORE ("end_icestone_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_COAL_ORE ("end_coal_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_DIAMOND_ORE ("end_diamond_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_EMERALD_ORE ("end_emerald_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_GOLD_ORE ("end_gold_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_IRON_ORE ("end_iron_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_LAPIS_ORE ("end_lapis_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    END_REDSTONE_ORE ("end_redstone_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_COPPER_ORE ("nether_copper_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_LEAD_ORE ("nether_lead_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_SILVER_ORE ("nether_silver_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_TIN_ORE ("nether_tin_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 6400, 2, 10, 16000, 4, 25, 14400, 3, 100, 36000, 5, 100),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_ZINC_ORE ("nether_zinc_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_RUBY_ORE ("nether_ruby_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_SAPPHIRE_ORE ("nether_sapphire_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_PERIDOT_ORE ("nether_peridot_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_ELECTROTINE_ORE ("nether_electrotine_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_AMBROSIUM_ORE ("nether_ambrosium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_GRAVITITE_ORE ("nether_gravitite_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_ZANITE_ORE ("nether_zanite_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_ARKENIUM_ORE ("nether_arkenium_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_ICESTONE_ORE ("nether_icestone_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_COAL_ORE ("nether_coal_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_GOLD_ORE ("nether_gold_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_IRON_ORE ("nether_iron_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 3200, 2, 10, 8000, 4, 25, 7200, 3, 100, 18000, 5, 100),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 1920, 2, 10, 4800, 4, 25, 4320, 3, 100, 10800, 5, 100),
    END_QUARTZ_ORE ("end_quartz_ore", 1920, 2, 10, 4800, 4, 25, 4320, 3, 100, 10800, 5, 100),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    END_ARDITE_ORE ("end_ardite_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    END_COBALT_ORE ("end_cobalt_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", 9600, 2, 10, 24000, 4, 25, 21600, 3, 100, 54000, 5, 100);

	
	private String name;
	
	private int indSmeltSand2xEnergy;
	private int indSmeltSand2xAmount;
	private int indSmeltSand2xSecondaryOutputChance;	
	private int indSmeltSand3xEnergy;
	private int indSmeltSand3xAmount;
	private int indSmeltSand3xSecondaryOutputChance;
	
	private int indSmeltRichSlag2xEnergy;
	private int indSmeltRichSlag2xAmount;
	private int indSmeltRichSlag2xSecondaryOutputChance;	
	private int indSmeltRichSlag3xEnergy;
	private int indSmeltRichSlag3xAmount;
	private int indSmeltRichSlag3xSecondaryOutputChance;
	
	TEIndSmeltRecipeData(String name,
			int indSmeltSand2xEnergy, int indSmeltSand2xAmount, int indSmeltSand2xSecondaryOutputChance, int indSmeltSand3xEnergy, 
			int indSmeltSand3xAmount, int indSmeltSand3xSecondaryOutputChance, int indSmeltRichSlag2xEnergy, int indSmeltRichSlag2xAmount, 
			int indSmeltRichSlag2xSecondaryOutputChance, int indSmeltRichSlag3xEnergy, int indSmeltRichSlag3xAmount, int indSmeltRichSlag3xSecondaryOutputChance) {
		
		this.name = name;
		
		this.indSmeltSand2xEnergy = indSmeltSand2xEnergy;
		this.indSmeltSand2xAmount = indSmeltSand2xAmount;
		this.indSmeltSand2xSecondaryOutputChance = indSmeltSand2xSecondaryOutputChance;
		this.indSmeltSand3xEnergy = indSmeltSand3xEnergy;
		this.indSmeltSand3xAmount = indSmeltSand3xAmount;
		this.indSmeltSand3xSecondaryOutputChance = indSmeltSand3xSecondaryOutputChance;
		
		this.indSmeltRichSlag2xEnergy = indSmeltRichSlag2xEnergy;
		this.indSmeltRichSlag2xAmount = indSmeltRichSlag2xAmount;
		this.indSmeltRichSlag2xSecondaryOutputChance = indSmeltRichSlag2xSecondaryOutputChance;
		this.indSmeltRichSlag3xEnergy = indSmeltRichSlag3xEnergy;
		this.indSmeltRichSlag3xAmount = indSmeltRichSlag3xAmount;
		this.indSmeltRichSlag3xSecondaryOutputChance = indSmeltRichSlag3xSecondaryOutputChance;
		
	}

	//
	@Override
	public String getName() {
		return name;
	}

	/*
	  864, "crystalSlag"
	  865, "crystalSlagRich"
	  866, "crystalCinnabar"
	*/
	
	//
	public static void addIndSmeltSandRecipe(BlockData blockData, String material) {
		values()[blockData.ordinal()].addIndSmeltRecipe(blockData, material, "sand", blockData.getOreDictItemStack("sand", 1), new ItemStack(Item.getByNameOrId("thermalfoundation:material"), 1, 865));
	}
	
	//
	public static void addIndSmeltRichSlagRecipe(BlockData blockData, String material) {
		values()[blockData.ordinal()].addIndSmeltRecipe(blockData, material, "rich slag", new ItemStack(Item.getByNameOrId("thermalfoundation:material"), 1, 865), new ItemStack(Item.getByNameOrId("thermalfoundation:material"), 1, 864));
	}
	
	//
	public void addIndSmeltRecipe(BlockData blockData, String material, String processingItem, ItemStack primaryInput, ItemStack secondaryOutput) {
		
		int energy = 0;
		int amount = 0;
		int chance = 0;
		int multiplier = blockData.getRecipeMultiplier();
		
		switch (processingItem) {
			case "sand":
				switch (multiplier) {
					case 2:
						energy = (int) ((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputEnergyFactor : Config.inductionSmelterReducedOutputEnergyFactor) * indSmeltSand2xEnergy);
						amount = round((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputAmountFactor : Config.inductionSmelterReducedOutputAmountFactor) * indSmeltSand2xAmount);
						chance = indSmeltSand2xSecondaryOutputChance; break;
					case 3:
						energy = (int) ((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputEnergyFactor : Config.inductionSmelterReducedOutputEnergyFactor) * indSmeltSand3xEnergy);
						amount = round((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputAmountFactor : Config.inductionSmelterReducedOutputAmountFactor) * indSmeltSand3xAmount);
						chance = indSmeltSand3xSecondaryOutputChance;
				} break;
			case "rich slag":
				switch (multiplier) {
					case 2:
						energy = (int) ((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputEnergyFactor : Config.inductionSmelterReducedOutputEnergyFactor) * indSmeltRichSlag2xEnergy);
						amount = round((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputAmountFactor : Config.inductionSmelterReducedOutputAmountFactor) * indSmeltRichSlag2xAmount);
						chance = indSmeltRichSlag2xSecondaryOutputChance; break;
					case 3:
						energy = (int) ((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputEnergyFactor : Config.inductionSmelterReducedOutputEnergyFactor) * indSmeltRichSlag3xEnergy);
						amount = round((Config.inductionSmelterFullOutput ? Config.inductionSmelterFullOutputAmountFactor : Config.inductionSmelterReducedOutputAmountFactor) * indSmeltRichSlag3xAmount);
						chance = indSmeltRichSlag3xSecondaryOutputChance;
				}
		}
		
		Log.logRecipeMsg("induction smelter", blockData.getName(), blockData.getOreDictOutputName("smelt", material));
		
		ThermalExpansionHelper.addSmelterRecipe(energy, primaryInput, blockData.getModBlockItemStack(), blockData.getOreDictOutputItemStack("smelt", material, amount), secondaryOutput, chance);
	}
	
}

package org.icannt.netherendingores.integration.common.registry.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Log;

import cofh.api.util.ThermalExpansionHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import static java.lang.Math.*;

/**
 * Created by ICannt on 11/04/18.
 */

public enum TERecipeData implements IStringSerializable {

	
    NETHER_COAL_ORE ("nether_coal_ore", 3200, 5, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 3200, 5, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 3200, 5, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_GOLD_ORE ("nether_gold_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_IRON_ORE ("nether_iron_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 3200, 22, "netherrack", 25, 8000, 4, 1600, 2, 2400, 3),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 3200, 14, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    END_COAL_ORE ("end_coal_ore", 3200, 5, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_DIAMOND_ORE ("end_diamond_ore", 3200, 5, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_EMERALD_ORE ("end_emerald_ore", 3200, 5, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_GOLD_ORE ("end_gold_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_IRON_ORE ("end_iron_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_LAPIS_ORE ("end_lapis_ore", 3200, 22, "endstone", 25, 8000, 4, 1600, 2, 2400, 3),
    END_REDSTONE_ORE ("end_redstone_ore", 3200, 14, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_COPPER_ORE ("nether_copper_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_LEAD_ORE ("nether_lead_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_SILVER_ORE ("nether_silver_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_TIN_ORE ("nether_tin_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 6400, 4, "netherrack", 15, 16000, 4, 3200, 2, 4800, 3),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", 3200, 4, "netherrack", 15, 8000, 4, 1600, 2, 2400, 3),
    END_ALUMINUM_ORE ("end_aluminum_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_COPPER_ORE ("end_copper_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_IRIDIUM_ORE ("end_iridium_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_LEAD_ORE ("end_lead_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_MITHRIL_ORE ("end_mithril_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_NICKEL_ORE ("end_nickel_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_PLATINUM_ORE ("end_platinum_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_SILVER_ORE ("end_silver_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_TIN_ORE ("end_tin_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_OSMIUM_ORE ("end_osmium_ore", 6400, 4, "endstone", 15, 16000, 4, 3200, 2, 4800, 3),
    END_URANIUM_ORE ("end_uranium_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_YELLORITE_ORE ("end_yellorite_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_DILITHIUM_ORE ("end_dilithium_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    END_TRITANIUM_ORE ("end_tritanium_ore", 3200, 4, "endstone", 15, 8000, 4, 1600, 2, 2400, 3),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 1920, 7, "stone", 15, 4800, 4, 960, 2, 1440, 3),
    END_QUARTZ_ORE ("end_quartz_ore", 1920, 7, "endstone", 15, 4800, 4, 960, 2, 1440, 3),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 9600, 4, "stone", 15, 24000, 4, 4800, 2, 7200, 3),
    END_ARDITE_ORE ("end_ardite_ore", 9600, 4, "endstone", 15, 24000, 4, 4800, 2, 7200, 3),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 9600, 4, "stone", 15, 24000, 4, 4800, 2, 7200, 3),
    END_COBALT_ORE ("end_cobalt_ore", 9600, 4, "endstone", 15, 24000, 4, 4800, 2, 7200, 3);

	
	private String name;
	
	private int pulv2xEnergy;
	private int pulv2xAmount;
	private String pulv2xSecondaryOutputItem;
	private int pulv2xSecondaryOutputChance;	
	private int pulv3xEnergy;
	private int pulv3xAmount;
	
	private int redFurn2xEnergy;
	private int redFurn2xAmount;
	private int redFurn3xEnergy;
	private int redFurn3xAmount;
	
	
	TERecipeData(String name, int pulv2xEnergy, int pulv2xAmount, String pulv2xSecondaryOutputItem, int pulv2xSecondaryOutputChance,
			int pulv3xEnergy, int pulv3xAmount, int redFurn2xEnergy, int redFurn2xAmount, int redFurn3xEnergy, int redFurn3xAmount) {
		
		this.name = name;
		
		this.pulv2xEnergy = pulv2xEnergy;
		this.pulv2xAmount = pulv2xAmount;
		this.pulv2xSecondaryOutputItem = pulv2xSecondaryOutputItem;
		this.pulv2xSecondaryOutputChance = pulv2xSecondaryOutputChance;
		this.pulv3xEnergy = pulv3xEnergy;
		this.pulv3xAmount = pulv3xAmount;
		
		this.redFurn2xEnergy = redFurn2xEnergy;
		this.redFurn2xAmount = redFurn2xAmount;
		this.redFurn3xEnergy = redFurn3xEnergy;
		this.redFurn3xAmount = redFurn3xAmount;
		
	}

	//
	@Override
	public String getName() {
		return name;
	}

	//
	public int getPulvEnergy(int multiplier) {
		switch (multiplier) {
			case 2:	return pulv2xEnergy;
			case 3: return (int) ((Config.pulverizerFullOutput ? Config.pulverizerFullOutputEnergyFactor : Config.pulverizerReducedOutputEnergyFactor) * pulv3xEnergy);
		}
		return 0;
	}

	
	//
    public static int getPulvEnergy(BlockRecipeData blockData) {
        return values()[blockData.ordinal()].getPulvEnergy(blockData.getRecipeMultiplier());
    }
    
    //
	public int getPulvAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return pulv2xAmount;
			case 3:	return round((Config.pulverizerFullOutput ? Config.pulverizerFullOutputAmountFactor : Config.pulverizerReducedOutputAmountFactor) * pulv3xAmount);
		}
		return 0;
	}

	//
    public static int getPulvAmount(BlockRecipeData blockData) {
        return values()[blockData.ordinal()].getPulvAmount(blockData.getRecipeMultiplier());
    }
	
	//
    public static int getPulvSecondaryOutputChance(BlockRecipeData blockData) {
    	return values()[blockData.ordinal()].pulv2xSecondaryOutputChance;
    }

    //
	public int getRedFurnEnergy(int multiplier) {
		switch (multiplier) {
			case 2:	return (int) ((Config.redstoneFurnaceFullOutput ? Config.redstoneFurnaceFullOutputEnergyFactor : Config.redstoneFurnaceReducedOutputEnergyFactor) * redFurn2xEnergy);
			case 3:	return (int) ((Config.redstoneFurnaceFullOutput ? Config.redstoneFurnaceFullOutputEnergyFactor : Config.redstoneFurnaceReducedOutputEnergyFactor) * redFurn3xEnergy);
		}
		return 0;
	}
	
	//
    public static int getRedFurnEnergy(BlockRecipeData blockData) {
        return values()[blockData.ordinal()].getRedFurnEnergy(blockData.getRecipeMultiplier());
    }

    //
	public int getRedFurnAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return round((Config.redstoneFurnaceFullOutput ? Config.redstoneFurnaceFullOutputAmountFactor : Config.redstoneFurnaceReducedOutputAmountFactor) * redFurn2xAmount);
			case 3:	return round((Config.redstoneFurnaceFullOutput ? Config.redstoneFurnaceFullOutputAmountFactor : Config.redstoneFurnaceReducedOutputAmountFactor) * redFurn3xAmount);
		}
		return 0;
	}
	
	//
    public static int getRedFurnAmount(BlockRecipeData blockData) {
        return values()[blockData.ordinal()].getRedFurnAmount(blockData.getRecipeMultiplier());
    }
	
	//
	public static void addPulvRecipe(BlockRecipeData blockData, String material) {	
		switch (blockData.getRecipeMultiplier()) {
			case 2:	ThermalExpansionHelper.addPulverizerRecipe(getPulvEnergy(blockData), blockData.getModBlockItemStack(),
					getPulvPrimaryItemStack(blockData, material), getPulvSecondaryItemStack(blockData), getPulvSecondaryOutputChance(blockData)); break;
			case 3:	ThermalExpansionHelper.addPulverizerRecipe(getPulvEnergy(blockData), blockData.getModBlockItemStack(), getPulvPrimaryItemStack(blockData, material));
		}
	}
	
	//
	public static void addRedFurnRecipe(BlockRecipeData blockData, String material) {
		ThermalExpansionHelper.addFurnaceRecipe(getRedFurnEnergy(blockData), blockData.getModBlockItemStack(), getRedFurnItemStack(blockData, material));
	}
	
	//
	public static ItemStack getPulvPrimaryItemStack(BlockRecipeData blockData, String material) {
		Log.logRecipeMsg("pulverizer", blockData.getName(), blockData.getOreDictOutputName("crush", material));
		return blockData.getOreDictOutputItemStack("crush", material, getPulvAmount(blockData));
	}
	
	//
	public static ItemStack getPulvSecondaryItemStack(BlockRecipeData blockData) {
		return blockData.getOreDictItemStack(values()[blockData.ordinal()].pulv2xSecondaryOutputItem, 1);
	}
	
	//
	public static ItemStack getRedFurnItemStack(BlockRecipeData blockData, String material) {
		Log.logRecipeMsg("redstone furnace", blockData.getName(), blockData.getOreDictOutputName("smelt", material));
		return blockData.getOreDictOutputItemStack("smelt", material, getRedFurnAmount(blockData));
	}
	
}

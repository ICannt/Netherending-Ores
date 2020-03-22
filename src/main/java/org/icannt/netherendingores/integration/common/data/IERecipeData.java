package org.icannt.netherendingores.integration.common.data;

import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.lib.Log;

import blusunrize.immersiveengineering.api.crafting.ArcFurnaceRecipe;
import blusunrize.immersiveengineering.api.crafting.CrusherRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/03/19.
 */

public enum IERecipeData implements IStringSerializable {

	
    END_ALUMINUM_ORE ("end_aluminum_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_COPPER_ORE ("end_copper_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_IRIDIUM_ORE ("end_iridium_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_LEAD_ORE ("end_lead_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_MITHRIL_ORE ("end_mithril_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_NICKEL_ORE ("end_nickel_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_PLATINUM_ORE ("end_platinum_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_SILVER_ORE ("end_silver_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_TIN_ORE ("end_tin_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_OSMIUM_ORE ("end_osmium_ore", 9600, 4, "endstone", 15, 24000, 4, 3200, 2, 4800, 3),
    END_URANIUM_ORE ("end_uranium_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_YELLORITE_ORE ("end_yellorite_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_DILITHIUM_ORE ("end_dilithium_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_TRITANIUM_ORE ("end_tritanium_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_ZINC_ORE ("end_zinc_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_RUBY_ORE ("end_ruby_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_SAPPHIRE_ORE ("end_sapphire_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_PERIDOT_ORE ("end_peridot_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_ELECTROTINE_ORE ("end_electrotine_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_AMBROSIUM_ORE ("end_ambrosium_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_GRAVITITE_ORE ("end_gravitite_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_ZANITE_ORE ("end_zanite_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_ARKENIUM_ORE ("end_arkenium_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_ICESTONE_ORE ("end_icestone_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_COAL_ORE ("end_coal_ore", 4800, 5, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_DIAMOND_ORE ("end_diamond_ore", 4800, 5, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_EMERALD_ORE ("end_emerald_ore", 4800, 5, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_GOLD_ORE ("end_gold_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_IRON_ORE ("end_iron_ore", 4800, 4, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    END_LAPIS_ORE ("end_lapis_ore", 4800, 22, "endstone", 25, 12000, 4, 1600, 2, 2400, 3),
    END_REDSTONE_ORE ("end_redstone_ore", 4800, 14, "endstone", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_COPPER_ORE ("nether_copper_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_LEAD_ORE ("nether_lead_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_SILVER_ORE ("nether_silver_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_TIN_ORE ("nether_tin_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 9600, 4, "netherrack", 15, 24000, 4, 3200, 2, 4800, 3),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_ZINC_ORE ("nether_zinc_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_RUBY_ORE ("nether_ruby_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_SAPPHIRE_ORE ("nether_sapphire_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_PERIDOT_ORE ("nether_peridot_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_ELECTROTINE_ORE ("nether_electrotine_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_AMBROSIUM_ORE ("nether_ambrosium_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_GRAVITITE_ORE ("nether_gravitite_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_ZANITE_ORE ("nether_zanite_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_ARKENIUM_ORE ("nether_arkenium_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_ICESTONE_ORE ("nether_icestone_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_COAL_ORE ("nether_coal_ore", 4800, 5, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 4800, 5, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 4800, 5, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_GOLD_ORE ("nether_gold_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_IRON_ORE ("nether_iron_ore", 4800, 4, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 4800, 22, "netherrack", 25, 12000, 4, 1600, 2, 2400, 3),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 4800, 14, "netherrack", 15, 12000, 4, 1600, 2, 2400, 3),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 2880, 7, "stone", 15, 7200, 4, 960, 2, 1440, 3),
    END_QUARTZ_ORE ("end_quartz_ore", 2880, 7, "endstone", 15, 7200, 4, 960, 2, 1440, 3),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 14400, 4, "stone", 15, 36000, 4, 4800, 2, 7200, 3),
    END_ARDITE_ORE ("end_ardite_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 14400, 4, "stone", 15, 36000, 4, 4800, 2, 7200, 3),
    END_COBALT_ORE ("end_cobalt_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", 14400, 4, "endstone", 15, 36000, 4, 4800, 2, 7200, 3);

	
	private String name;
	
	private int crusher2xEnergy;
	private int crusher2xAmount;
	private String crusher2xSecondaryOutputItem;
	private int crusher2xSecondaryOutputChance;	
	private int crusher3xEnergy;
	private int crusher3xAmount;
	
	private int arcFurn2xEnergy;
	private int arcFurn2xAmount;
	private int arcFurn3xEnergy;
	private int arcFurn3xAmount;
	
	
	IERecipeData(String name, int crusher2xEnergy, int crusher2xAmount, String crusher2xSecondaryOutputItem, int crusher2xSecondaryOutputChance,
			int crusher3xEnergy, int crusher3xAmount, int arcFurn2xEnergy, int arcFurn2xAmount, int arcFurn3xEnergy, int arcFurn3xAmount) {
		
		this.name = name;
		
		this.crusher2xEnergy = crusher2xEnergy;
		this.crusher2xAmount = crusher2xAmount;
		this.crusher2xSecondaryOutputItem = crusher2xSecondaryOutputItem;
		this.crusher2xSecondaryOutputChance = crusher2xSecondaryOutputChance;
		this.crusher3xEnergy = crusher3xEnergy;
		this.crusher3xAmount = crusher3xAmount;
		
		this.arcFurn2xEnergy = arcFurn2xEnergy;
		this.arcFurn2xAmount = arcFurn2xAmount;
		this.arcFurn3xEnergy = arcFurn3xEnergy;
		this.arcFurn3xAmount = arcFurn3xAmount;
		
	}

	//
	@Override
	public String getName() {
		return name;
	}

	//
	public int getCrusherEnergy(int multiplier) {
		switch (multiplier) {
			case 2:	return crusher2xEnergy;
			case 3: return crusher3xEnergy;
		}
		return 0;
	}

	
	//
    public static int getCrusherEnergy(BlockData blockData) {
        return values()[blockData.ordinal()].getCrusherEnergy(blockData.getRecipeMultiplier());
    }
    
    //
	public int getCrusherAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return crusher2xAmount;
			case 3:	return crusher3xAmount;
		}
		return 0;
	}

	//
    public static int getCrusherAmount(BlockData blockData) {
        return values()[blockData.ordinal()].getCrusherAmount(blockData.getRecipeMultiplier());
    }
	
	//
    public static float getCrusherSecondaryOutputChance(BlockData blockData) {
    	return (float) (values()[blockData.ordinal()].crusher2xSecondaryOutputChance) / 100;
    }

    //
	public int getArcFurnEnergy(int multiplier) {
		switch (multiplier) {
			case 2:	return arcFurn2xEnergy;
			case 3:	return arcFurn3xEnergy;
		}
		return 0;
	}
	
	//
    public static int getArcFurnEnergy(BlockData blockData) {
        return values()[blockData.ordinal()].getArcFurnEnergy(blockData.getRecipeMultiplier());
    }

    //
	public int getArcFurnAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return arcFurn2xAmount;
			case 3:	return arcFurn3xAmount;
		}
		return 0;
	}
	
	//
    public static int getArcFurnAmount(BlockData blockData) {
        return values()[blockData.ordinal()].getArcFurnAmount(blockData.getRecipeMultiplier());
    }
	
	//
	public static void addCrusherRecipe(BlockData blockData, String material) {
		switch (blockData.getRecipeMultiplier()) {
			case 2: CrusherRecipe.timeModifier = 1.8f;
					CrusherRecipe.addRecipe(getCrusherPrimaryItemStack(blockData, material), blockData.getModBlockItemStack(), getCrusherEnergy(blockData)).addToSecondaryOutput(new Object[] {getCrusherSecondaryItemStack(blockData), getCrusherSecondaryOutputChance(blockData)}); break;
			case 3:	CrusherRecipe.timeModifier = 2.5f;
					CrusherRecipe.addRecipe(getCrusherPrimaryItemStack(blockData, material), blockData.getModBlockItemStack(), getCrusherEnergy(blockData));
		}
		CrusherRecipe.timeModifier = 1f;
	}
	
	//
	public static void addArcFurnRecipe(BlockData blockData, String material) {
		ArcFurnaceRecipe.addRecipe(getArcFurnItemStack(blockData, material), blockData.getModBlockItemStack(), new ItemStack(Item.getByNameOrId("IEContent.itemMaterial"), 1, 7), 200, 512).setSpecialRecipeType("Ores");		
	}
	
	//
	public static ItemStack getCrusherPrimaryItemStack(BlockData blockData, String material) {
		Log.logRecipeMsg("crusher", blockData.getName(), blockData.getOreDictOutputName("crush", material));
		return blockData.getOreDictOutputItemStack("crush", material, getCrusherAmount(blockData));
	}
	
	//
	public static ItemStack getCrusherSecondaryItemStack(BlockData blockData) {
		return blockData.getOreDictItemStack(values()[blockData.ordinal()].crusher2xSecondaryOutputItem, 1);
	}
	
	//
	public static ItemStack getArcFurnItemStack(BlockData blockData, String material) {
		Log.logRecipeMsg("arc furnace", blockData.getName(), blockData.getOreDictOutputName("smelt", material));
		return blockData.getOreDictOutputItemStack("smelt", material, getArcFurnAmount(blockData));
	}
	
}

package org.icannt.netherendingores.integration.common.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.compat.IC2RecipeInput;
import org.icannt.netherendingores.lib.Log;

import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 15/05/18.
 */

public enum IC2RecipeData implements IStringSerializable {

	
    END_ALUMINUM_ORE ("end_aluminum_ore", 4, 4),
    END_COPPER_ORE ("end_copper_ore", 4, 4),
    END_IRIDIUM_ORE ("end_iridium_ore", 4, 4),
    END_LEAD_ORE ("end_lead_ore", 4, 4),
    END_MITHRIL_ORE ("end_mithril_ore", 4, 4),
    END_NICKEL_ORE ("end_nickel_ore", 4, 4),
    END_PLATINUM_ORE ("end_platinum_ore", 4, 4),
    END_SILVER_ORE ("end_silver_ore", 4, 4),
    END_TIN_ORE ("end_tin_ore", 4, 4),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 4, 4),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 4, 4),
    END_OSMIUM_ORE ("end_osmium_ore", 4, 4),
    END_URANIUM_ORE ("end_uranium_ore", 4, 4),
    END_YELLORITE_ORE ("end_yellorite_ore", 4, 4),
    END_DILITHIUM_ORE ("end_dilithium_ore", 4, 4),
    END_TRITANIUM_ORE ("end_tritanium_ore", 4, 4),
    END_ZINC_ORE ("end_zinc_ore", 4, 4),
    END_RUBY_ORE ("end_ruby_ore", 4, 4),
    END_SAPPHIRE_ORE ("end_sapphire_ore", 4, 4),
    END_PERIDOT_ORE ("end_peridot_ore", 4, 4),
    END_ELECTROTINE_ORE ("end_electrotine_ore", 4, 4),
    END_AMBROSIUM_ORE ("end_ambrosium_ore", 4, 4),
    END_GRAVITITE_ORE ("end_gravitite_ore", 4, 4),
    END_ZANITE_ORE ("end_zanite_ore", 4, 4),
    END_ARKENIUM_ORE ("end_arkenium_ore", 4, 4),
    END_ICESTONE_ORE ("end_icestone_ore", 4, 4),
    END_COAL_ORE ("end_coal_ore", 5, 4),
    END_DIAMOND_ORE ("end_diamond_ore", 5, 4),
    END_EMERALD_ORE ("end_emerald_ore", 5, 4),
    END_GOLD_ORE ("end_gold_ore", 4, 4),
    END_IRON_ORE ("end_iron_ore", 4, 4),
    END_LAPIS_ORE ("end_lapis_ore", 22, 4),
    END_REDSTONE_ORE ("end_redstone_ore", 14, 4),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 4, 4),
    NETHER_COPPER_ORE ("nether_copper_ore", 4, 4),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 4, 4),
    NETHER_LEAD_ORE ("nether_lead_ore", 4, 4),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 4, 4),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 4, 4),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 4, 4),
    NETHER_SILVER_ORE ("nether_silver_ore", 4, 4),
    NETHER_TIN_ORE ("nether_tin_ore", 4, 4),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 4, 4),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 4, 4),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 4, 4),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 4, 4),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 4, 4),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", 4, 4),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", 4, 4),
    NETHER_ZINC_ORE ("nether_zinc_ore", 4, 4),
    NETHER_RUBY_ORE ("nether_ruby_ore", 4, 4),
    NETHER_SAPPHIRE_ORE ("nether_sapphire_ore", 4, 4),
    NETHER_PERIDOT_ORE ("nether_peridot_ore", 4, 4),
    NETHER_ELECTROTINE_ORE ("nether_electrotine_ore", 4, 4),
    NETHER_AMBROSIUM_ORE ("nether_ambrosium_ore", 4, 4),
    NETHER_GRAVITITE_ORE ("nether_gravitite_ore", 4, 4),
    NETHER_ZANITE_ORE ("nether_zanite_ore", 4, 4),
    NETHER_ARKENIUM_ORE ("nether_arkenium_ore", 4, 4),
    NETHER_ICESTONE_ORE ("nether_icestone_ore", 4, 4),
    NETHER_COAL_ORE ("nether_coal_ore", 5, 4),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 5, 4),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 5, 4),
    NETHER_GOLD_ORE ("nether_gold_ore", 4, 4),
    NETHER_IRON_ORE ("nether_iron_ore", 4, 4),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 22, 4),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 14, 4),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 7, 4),
    END_QUARTZ_ORE ("end_quartz_ore", 7, 4),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 4, 4),
    END_ARDITE_ORE ("end_ardite_ore", 4, 4),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 4, 4),
    END_COBALT_ORE ("end_cobalt_ore", 4, 4),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", 4, 4),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", 4, 4),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", 4, 4),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", 4, 4),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", 4, 4);

	
	private String name;
	
	private int mace2xAmount;
	private int mace3xAmount;
	
	
	IC2RecipeData(String name, int mace2xAmount, int mace3xAmount) {
		
		this.name = name;
		
		this.mace2xAmount = mace2xAmount;
		this.mace3xAmount = mace3xAmount;
		
	}

	//
	@Override
	public String getName() {
		return name;
	}
    
    //
	public int getMaceAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return mace2xAmount;
			case 3:	return mace3xAmount;
		}
		return 0;
	}
	
	//
    public static int getMaceAmount(BlockRecipeData blockData) {
        return values()[blockData.ordinal()].getMaceAmount(blockData.getRecipeMultiplier());
    }

	//
	public static void addMaceRecipe(BlockRecipeData blockData, String material) {
		Recipes.macerator.addRecipe(new IC2RecipeInput(blockData.getModBlockItemStack()), null, false, getMaceItemStack(blockData, blockData.getRecipeMultiplier(), material));
	}
	
    //
	public static ItemStack getMaceItemStack(BlockRecipeData blockData, int multiplier, String material) {
		String prefix = "crushed";
		if (multiplier > 0 && multiplier < 3 && OreDictionary.doesOreNameExist(blockData.getOreDictCustomItemName(prefix, material))) {
			Log.logRecipeMsg("macerator", blockData.getName(), blockData.getOreDictCustomItemName(prefix, material));
			return blockData.getOreDictCustomItemStack(prefix, material, getMaceAmount(blockData));
		}
		Log.logRecipeMsg("macerator", blockData.getName(), blockData.getOreDictOutputName("crush", material));
		return blockData.getOreDictOutputItemStack("crush", material, getMaceAmount(blockData));
	}
	
}

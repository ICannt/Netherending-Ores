package org.icannt.netherendingores.integration.common.registry.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.integration.common.registry.IC2RecipeInput;

import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 15/05/18.
 */

public enum IC2RecipeData implements IStringSerializable {

	
    NETHER_COAL_ORE ("nether_coal_ore", 5, 4, 2, 3),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 5, 4, 2, 3),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 5, 4, 2, 3),
    NETHER_GOLD_ORE ("nether_gold_ore", 4, 4, 2, 3),
    NETHER_IRON_ORE ("nether_iron_ore", 4, 4, 2, 3),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 22, 4, 8, 3),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 14, 4, 8, 3),
    END_COAL_ORE ("end_coal_ore", 5, 4, 2, 3),
    END_DIAMOND_ORE ("end_diamond_ore", 5, 4, 2, 3),
    END_EMERALD_ORE ("end_emerald_ore", 5, 4, 2, 3),
    END_GOLD_ORE ("end_gold_ore", 4, 4, 2, 3),
    END_IRON_ORE ("end_iron_ore", 4, 4, 2, 3),
    END_LAPIS_ORE ("end_lapis_ore", 22, 4, 8, 3),
    END_REDSTONE_ORE ("end_redstone_ore", 14, 4, 8, 3),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 4, 4, 2, 3),
    NETHER_COPPER_ORE ("nether_copper_ore", 4, 4, 2, 3),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 4, 4, 2, 3),
    NETHER_LEAD_ORE ("nether_lead_ore", 4, 4, 2, 3),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 4, 4, 2, 3),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 4, 4, 2, 3),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 4, 4, 2, 3),
    NETHER_SILVER_ORE ("nether_silver_ore", 4, 4, 2, 3),
    NETHER_TIN_ORE ("nether_tin_ore", 4, 4, 2, 3),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 4, 4, 2, 3),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 4, 4, 2, 3),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 4, 4, 2, 3),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 4, 4, 2, 3),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 4, 4, 2, 3),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", 4, 4, 2, 3),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", 4, 4, 2, 3),
    END_ALUMINUM_ORE ("end_aluminum_ore", 4, 4, 2, 3),
    END_COPPER_ORE ("end_copper_ore", 4, 4, 2, 3),
    END_IRIDIUM_ORE ("end_iridium_ore", 4, 4, 2, 3),
    END_LEAD_ORE ("end_lead_ore", 4, 4, 2, 3),
    END_MITHRIL_ORE ("end_mithril_ore", 4, 4, 2, 3),
    END_NICKEL_ORE ("end_nickel_ore", 4, 4, 2, 3),
    END_PLATINUM_ORE ("end_platinum_ore", 4, 4, 2, 3),
    END_SILVER_ORE ("end_silver_ore", 4, 4, 2, 3),
    END_TIN_ORE ("end_tin_ore", 4, 4, 2, 3),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 4, 4, 2, 3),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 4, 4, 2, 3),
    END_OSMIUM_ORE ("end_osmium_ore", 4, 4, 2, 3),
    END_URANIUM_ORE ("end_uranium_ore", 4, 4, 2, 3),
    END_YELLORITE_ORE ("end_yellorite_ore", 4, 4, 2, 3),
    END_DILITHIUM_ORE ("end_dilithium_ore", 4, 4, 2, 3),
    END_TRITANIUM_ORE ("end_tritanium_ore", 4, 4, 2, 3),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 7, 4, 2, 3),
    END_QUARTZ_ORE ("end_quartz_ore", 7, 4, 2, 3),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 4, 4, 2, 3),
    END_ARDITE_ORE ("end_ardite_ore", 4, 4, 2, 3),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 4, 4, 2, 3),
    END_COBALT_ORE ("end_cobalt_ore", 4, 4, 2, 3);

	
	private String name;
	
	private int mace2xAmount;
	private int mace3xAmount;
	
	private int elecFurn2xAmount;
	private int elecFurn3xAmount;
	
	
	IC2RecipeData(String name, int mace2xAmount, int mace3xAmount, int elecFurn2xAmount, int elecFurn3xAmount) {
		
		this.name = name;
		
		this.mace2xAmount = mace2xAmount;
		this.mace3xAmount = mace3xAmount;
		
		this.elecFurn2xAmount = elecFurn2xAmount;
		this.elecFurn3xAmount = elecFurn3xAmount;
		
	}

	
	@Override
	public String getName() {
		return name;
	}
    
    
	public int getMaceAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return mace2xAmount;
			case 3:	return mace3xAmount;
		}
		return 0;
	}
	
	
    public static int getMaceAmount(int index, int multiplier) {
        return values()[index].getMaceAmount(multiplier);
    }
	
	
	public static ItemStack getMaceItemStack(int index, int multiplier) {
		if (multiplier > 0 && multiplier < 3 && OreDictionary.doesOreNameExist(BlockRecipeData.getOreDictCustomItemName(index, "crushed"))) {
			return BlockRecipeData.getOreDictCustomItemStack(index, "crushed", getMaceAmount(index, multiplier));
		}		
		return BlockRecipeData.getOreDictCrushItemStack(index, getMaceAmount(index, multiplier));
	}
    
    
	public int getElecFurnAmount(int multiplier) {
		switch (multiplier) {
			case 2:	return elecFurn2xAmount;
			case 3:	return elecFurn3xAmount;
		}
		return 0;
	}
	
	
    public static int getElecFurnAmount(int index, int multiplier) {
        return values()[index].getElecFurnAmount(multiplier);
    }
	
	
	public static ItemStack getElecFurnItemStack(int index, int multiplier) {
		return BlockRecipeData.getOreDictSmeltItemStack(index, getElecFurnAmount(index, multiplier));
	}
	
	
	private static int getMultiplier(int index) {
		return BlockRecipeData.values()[index].getRecipeMultiplier();
	}
	
	
	public static void getMaceRecipe(int index) {
		int multiplier = getMultiplier(index);
		Recipes.macerator.addRecipe(new IC2RecipeInput(BlockRecipeData.getModBlockItemStack(index)), null, false, getMaceItemStack(index, multiplier));
	}
	
	
	public static void getElecFurnRecipe(int index) {
		int multiplier = getMultiplier(index);
		Recipes.furnace.addRecipe(BlockRecipeData.getModBlockItemStack(index), getElecFurnItemStack(index, multiplier), null, false);
	}
	
	
}

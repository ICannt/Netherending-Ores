package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.lib.Util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 * 
 * Vanilla recipes go there, mod device recipes have their own classes.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class RecipeRegistry {
		
	public static void registerRecipes() {

		Util.LOG.info("Registering Recipes");

		ResourceLocation groupName = new ResourceLocation(NetherendingOres.MOD_ID + ":ore_conversions");
		
		// Loop through all blocks in the mod
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
			// Loop through all entries for the specified OreDict name 
			for (ItemStack stack : OreDictionary.getOres(blockData.getOreDictName(1)))
			{
				// If the mod of the OreDict comparison item is not Netherending Ores then proceed
				if (!stack.getItem().getRegistryName().getResourceDomain().equals("netherendingores")) {
					// 1x Multiplier is just a crafting table conversion recipe and smelt to item.
					// 2x/3x Multipliers are smelted only.
					// TODO: Check Redstone is now outputting properly
		        	if (blockData.getRecipeMultiplier() == 1) {		        		
	        			GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, stack, blockData.getConversionIngredient());
	        			try {
	        				OreDictionary.getOres(blockData.getOreDictFurnaceItem(), false).get(0).getItem();
	        				GameRegistry.addSmelting(blockData.getItemStack(), blockData.getFurnaceOutput(), -1);
	        			} catch (Exception e1){
	        				Util.LOG.warn("Unable to register furnace item output for \"" + blockData.getName() + "\" item \"" + blockData.getOreDictFurnaceItem() + "\" not found.");
	        			}
		        	}
					if (blockData.getRecipeMultiplier() > 1) {
						GameRegistry.addSmelting(blockData.getItemStack(), new ItemStack(stack.getItem(), blockData.getRecipeMultiplier(), stack.getMetadata()), 0);
					}
					// We only need a single match, no point in adding multiple recipes for different OreDict item results, they often can't be selected. 
					break;
				}
	        }
		}
		
		Util.LOG.info("Registered Recipes");
		
	}
}

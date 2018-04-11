package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class RecipeRegistry {
		
	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering Recipes");

		ResourceLocation groupName = new ResourceLocation(NetherendingOres.MOD_ID + ":ore_conversions");
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
        	if (blockData.getRecipeMultiplier() == 1 && blockData.getItemOreDict() != "") {
				GameRegistry.addShapelessRecipe(blockData.getConversionResourceLocation(), groupName, new ItemStack(Block.getBlockFromName(blockData.getItemOreDict()), 1), blockData.getIngredient());
			}	
	        for (ItemStack stack : OreDictionary.getOres(blockData.getOreDictName(1)))
	        {
				if (blockData.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(blockData.getItemStack(), new ItemStack(stack.getItem(), blockData.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered Recipes");
		
	}
}

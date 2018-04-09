package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
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
		
		ResourceLocation locationName = new ResourceLocation(NetherendingOres.MOD_ID + ":unused"); // This is actually used, just can't create it blank
		ResourceLocation groupName = new ResourceLocation(NetherendingOres.MOD_ID + ":ore_conversions");
		Ingredient[] ingredient = new Ingredient[]{};
		
		for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
        	if (blockData.getRecipeMultiplier() == 1 && blockData.getItemOreDict() != "") {
        		locationName = new ResourceLocation(NetherendingOres.MOD_ID + ":" + blockData.getName() + "_to_" + Util.ColonUnder(blockData.getItemOreDict()));
        		ingredient = new Ingredient[]{Ingredient.fromStacks(new ItemStack(blockData.getBlock(), 1, blockData.getBlockMeta()))};
				GameRegistry.addShapelessRecipe(locationName, groupName, new ItemStack(Block.getBlockFromName(blockData.getItemOreDict()), 1), ingredient);
			}	
	        for (ItemStack stack : OreDictionary.getOres(Util.getOreDictName(blockData.getName(), 1)))
	        {
				if (blockData.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(blockData.getBlock(), 1, blockData.getBlockMeta()), new ItemStack(stack.getItem(), blockData.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered Recipes");
		
	}
}

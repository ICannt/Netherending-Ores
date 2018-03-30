package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Util;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
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
		
		// Vanilla Nether Ores
		for (EnumOreNetherVanillaType variant : EnumOreNetherVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
	        {
				if (variant.getRecipeMultiplier() == 1) {
					
				}	        	
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}

		// Modded Nether Ores 1
		for (EnumOreNetherModded1Type variant : EnumOreNetherModded1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
	        {
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		// Vanilla End Ores
		for (EnumOreEndVanillaType variant : EnumOreEndVanillaType.values()) {
	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
	        {
				if (variant.getRecipeMultiplier() == 1 && variant.getItemOreDict() != "") {

				}
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_VANILLA, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}		
		
		// Modded End Ores 1
		for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
	        {
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		// Other Ores
		for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
	        {
				if (variant.getRecipeMultiplier() == 1 && variant.getItemOreDict() != "") {
					NetherendingOres.LOGGER.info(variant.getName() + ": " + NetherendingOres.MOD_ID + Util.LowerUnder(variant.getExactOreDict()) + "_to_" + variant.getItemOreDict() + ", " + variant.getItemOreDict() + ", " + variant.getRecipeMultiplier());
					GameRegistry.addShapelessRecipe(new ResourceLocation(NetherendingOres.MOD_ID + ":" + Util.LowerUnder(variant.getExactOreDict()) + "_to_" + variant.getItemOreDict()), new ResourceLocation(NetherendingOres.MOD_ID + ":" + "ore_conversions"), 
							new ItemStack(Block.getBlockFromName(variant.getItemOreDict()), 1), new Ingredient[]{Ingredient.fromStacks(new ItemStack(Block.getBlockFromName(variant.getEnumName()), 1, variant.ordinal()))});
				}
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_OTHER_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered Recipes");
		
	}
}

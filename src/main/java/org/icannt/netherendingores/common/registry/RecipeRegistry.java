package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;

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
		
		// Vanilla Nether Ores - Furnace
		for (EnumOreNetherVanillaType variant : EnumOreNetherVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}

		// Modded Nether Ores 1 - Furnace
		for (EnumOreNetherModded1Type variant : EnumOreNetherModded1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}
		
		// Vanilla End Ores - Furnace
		for (EnumOreEndVanillaType variant : EnumOreEndVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_VANILLA, 1, variant.ordinal()), new ItemStack(stack.getItem(), 2, stack.getMetadata()), 0);
	        }
		}

		
		GameRegistry.addShapelessRecipe(new ResourceLocation("netherendingores:nether_to_mc_diamond_ore"), new ResourceLocation("netherendingores:ore_conversions"), new ItemStack(Blocks.DIAMOND_ORE, 1), new Ingredient[]{Ingredient.fromStacks(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, 1))});
		GameRegistry.addShapelessRecipe(new ResourceLocation("netherendingores:end_to_mc_diamond_ore"), new ResourceLocation("netherendingores:ore_conversions"), new ItemStack(Blocks.DIAMOND_ORE, 1), new Ingredient[]{Ingredient.fromStacks(new ItemStack(BlockRegistry.ORE_END_VANILLA, 1, 1))});
		
		
		// Modded End Ores 1 - Furnace
		for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
	        {
	        	NetherendingOres.LOGGER.info(variant.getName() + ": " + variant.getRecipeMultiplier());
				if (variant.getRecipeMultiplier() == 1) {
					
				}	        	
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered Recipes");
		
	}
}

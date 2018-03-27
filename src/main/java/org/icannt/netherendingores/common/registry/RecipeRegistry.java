package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;

import net.minecraft.item.ItemStack;
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

		// Modded End Ores 1 - Furnace
		for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
			NetherendingOres.LOGGER.info("*** HERE ***");
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	NetherendingOres.LOGGER.info(variant.getName() + ": " + variant.getRecipeMultiplier());
				if (variant.getRecipeMultiplier() > 1) {
					GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
				}
	        }
		}
		
		NetherendingOres.LOGGER.info("Registered Recipes");
		
	}	
}

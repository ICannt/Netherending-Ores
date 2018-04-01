package org.icannt.netherendingores.interoperability.common;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.Util;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;
import org.icannt.netherendingores.common.registry.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.shared.TinkerFluids;

/**
 * Created by ICannt on 20/08/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class TiCRecipeRegistry {
		
	public static void registerRecipes() {

		NetherendingOres.LOGGER.info("Registering Tinkers' Construct Recipes");
		
//		ResourceLocation locationName = new ResourceLocation(NetherendingOres.MOD_ID + ":unused"); // This is actually used, just can't create it blank
//		ResourceLocation groupName = new ResourceLocation(NetherendingOres.MOD_ID + ":ore_conversions");
//		Ingredient[] ingredient = new Ingredient[]{};

		
		TinkerRegistry.registerMelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, 4), TinkerFluids.iron, 576);
		
		
		
		// Vanilla Nether Ores
		for (EnumOreNetherVanillaType variant : EnumOreNetherVanillaType.values()) {
//	        for (ItemStack stack : OreDictionary.getOres(variant.getBlockOreDict()))
//	        {
//				if (variant.getRecipeMultiplier() > 1) {
//					GameRegistry.addSmelting(new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()), new ItemStack(stack.getItem(), variant.getRecipeMultiplier(), stack.getMetadata()), 0);
//				}
//	        }
		}

		// Modded Nether Ores 1
		for (EnumOreNetherModded1Type variant : EnumOreNetherModded1Type.values()) {			

		}
		
		// Vanilla End Ores
		for (EnumOreEndVanillaType variant : EnumOreEndVanillaType.values()) {

		}		
		
		// Modded End Ores 1
		for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {

		}
		
		// Other Ores
		for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {

		}
		
		NetherendingOres.LOGGER.info("Registered Tinkers' Construct Recipes");
		
	}
}

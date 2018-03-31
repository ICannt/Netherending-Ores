package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreNetherVanillaType;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 03/09/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class OreDictionaryRegistry {

	public static void registerDictionaryOres() {

		// Vanilla Nether Ores
		for (EnumOreNetherVanillaType variant : EnumOreNetherVanillaType.values()) {
			if (variant.getRecipeMultiplier() == 1) {
				OreDictionary.registerOre(variant.getBlockOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
			if (variant.getRecipeMultiplier() > 1 || variant.getRecipeMultiplier() == 0) {
				OreDictionary.registerOre(variant.getExactOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
		}

		// Modded Nether Ores 1
		for (EnumOreNetherModded1Type variant : EnumOreNetherModded1Type.values()) {			
			if (variant.getRecipeMultiplier() == 1) {
				OreDictionary.registerOre(variant.getBlockOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
			if (variant.getRecipeMultiplier() > 1 || variant.getRecipeMultiplier() == 0) {
				OreDictionary.registerOre(variant.getExactOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
		}
		
		// Vanilla End Ores
		for (EnumOreEndVanillaType variant : EnumOreEndVanillaType.values()) {
			if (variant.getRecipeMultiplier() == 1) {
				OreDictionary.registerOre(variant.getBlockOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
			if (variant.getRecipeMultiplier() > 1 || variant.getRecipeMultiplier() == 0) {
				OreDictionary.registerOre(variant.getExactOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
		}		
		
		// Modded End Ores 1
		for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
			if (variant.getRecipeMultiplier() == 1) {
				OreDictionary.registerOre(variant.getBlockOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
			if (variant.getRecipeMultiplier() > 1 || variant.getRecipeMultiplier() == 0) {
				OreDictionary.registerOre(variant.getExactOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
		}
		
		// Other Ores
		for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {
			if (variant.getRecipeMultiplier() == 1) {
				OreDictionary.registerOre(variant.getBlockOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
			if (variant.getRecipeMultiplier() > 1 || variant.getRecipeMultiplier() == 0) {
				OreDictionary.registerOre(variant.getExactOreDict(), new ItemStack(variant.getBlockRegistryName(), 1, variant.ordinal()));
			}
		}
	    
	}

}

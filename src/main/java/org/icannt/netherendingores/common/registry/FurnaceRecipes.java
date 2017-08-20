package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.common.block.metadata.EnumOreModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreVanillaType;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 */
public class FurnaceRecipes {
	
	public static void registerFurnaceRecipes() {
		
		// Vanilla Nether Ores - Furnace
		for (EnumOreVanillaType variant : EnumOreVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	stack.setCount(2);
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, variant.ordinal()), stack, 0);
	        }
		}

		// Modded Nether Ores 1 - Furnace
		for (EnumOreModded1Type variant : EnumOreModded1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	stack.setCount(2);
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_MODDED_1, 1, variant.ordinal()), stack, 0);
	        }
		}
		
		// Vanilla End Ores - Furnace
		for (EnumOreVanillaType variant : EnumOreVanillaType.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	stack.setCount(2);
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_VANILLA, 1, variant.ordinal()), stack, 0);
	        }
		}

		// Modded End Ores 1 - Furnace
		for (EnumOreModded1Type variant : EnumOreModded1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getFurnaceOreDict()))
	        {
	        	stack.setCount(2);
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()), stack, 0);
	        }
		}
		
		// Other Ores 1 - Furnace
		// This solution will likely change to just a crafting recipe, with ore dictionary aliases for oreQuartz
		for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {			
	        for (ItemStack stack : OreDictionary.getOres(variant.getRecipeOreDict()))
	        {
	        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_OTHER_1, 1, variant.ordinal()), stack, 0);
	        }
		}
        
	}
}

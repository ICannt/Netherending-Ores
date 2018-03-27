package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.metadata.EnumOreEndModded1Type;
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
		    
		// Modded End Ores 1
		for (EnumOreEndModded1Type variant : EnumOreEndModded1Type.values()) {
			NetherendingOres.LOGGER.info(variant.getName() + ": " + variant.getRecipeMultiplier());
			if (variant.getRecipeMultiplier() == 1) {
				OreDictionary.registerOre(variant.getExactOreDict(), new ItemStack(BlockRegistry.ORE_END_MODDED_1, 1, variant.ordinal()));
			}
		}
		
	    for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {
    		OreDictionary.registerOre(variant.getRecipeOreDict(), new ItemStack(BlockRegistry.ORE_OTHER_1, 1, variant.ordinal()));
	    }
	    
	}

}

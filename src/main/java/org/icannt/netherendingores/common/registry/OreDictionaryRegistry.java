package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 03/09/17.
 */
public class OreDictionaryRegistry {

	public static void registerDictionaryOres() {
	    for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {
	    	if (variant.getRecipeOreDict() == "oreQuartz") {
	    		OreDictionary.registerOre(variant.getRecipeOreDict(), new ItemStack(BlockRegistry.ORE_OTHER_1, 1, variant.ordinal()));
	    	}
	    }
	}

}

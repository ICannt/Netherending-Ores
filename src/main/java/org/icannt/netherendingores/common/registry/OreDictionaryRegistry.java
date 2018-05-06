package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Util;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 03/09/17.
 */

@GameRegistry.ObjectHolder(Info.MOD_ID)
public class OreDictionaryRegistry {
 
	public static void registerDictionaryOres() {
		
    	Util.LOG.debug("Registering Ore Dictionary Entries");
    	
		// Registration of Vanilla items that are not registered :(, purely a guess at what other mods might use
    	if (OreDictionary.doesOreNameExist("coal") == false) {
    		OreDictionary.registerOre("coal", new ItemStack(Items.COAL));
    	}
    	
    	// Registration of Mod items that are not registered, follows usual conventions
    	if (Loader.isModLoaded("appliedenergistics2") && OreDictionary.doesOreNameExist("crystalChargedCertusQuartz") == false) {
    		// TODO: See if we can get the item by unlocalized name, make it safer
    		ItemStack newStack = new ItemStack(Item.getByNameOrId("appliedenergistics2:material"), 1, 1);
    		if (!newStack.isEmpty()) {
    			OreDictionary.registerOre("crystalChargedCertusQuartz", newStack);
    			Util.LOG.trace("Ore Dictionary entry for \"crystalChargedCertusQuartz\" added for appliedenergistics2:material:1");
    		} else {
    			Util.LOG.warn("ItemStack for Charged Certus Quartz is not valid, is Applied Energistics 2 loaded properly?");
    		}
    	}
    	
    	for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (blockData.getRecipeMultiplier() > 0) {
        		OreDictionary.registerOre(blockData.getOreDictName(), new ItemStack(blockData.getBlock(), 1, blockData.getBlockMeta()));
        	}    		
    	}
		
    	Util.LOG.info("Registered Ore Dictionary Entries");
		
	}

}

package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Config;
import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

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
		
    	Log.debug("Registering Ore Dictionary Entries");
    	
    	// Registration of other mod items that are not registered by those mods, follows usual conventions
    	for (OreDictionaryOtherData oD : OreDictionaryOtherData.values()) {
    		if (oD.getEnabled()) {
		    	if (Loader.isModLoaded(oD.getModCodeName()) && OreDictionary.doesOreNameExist(oD.getName()) == false) {
		    		ItemStack stack = new ItemStack(Item.getByNameOrId(oD.getModCodeName() + ":" + oD.getModItemCodeName()), 1, oD.getMeta());
		    		if (!stack.isEmpty()) {
		    			OreDictionary.registerOre(oD.getName(), stack);
		    			Log.logOreDictSuccess(oD.getName(), Log.itemStackToName(stack));
		    		} else {
		    			Log.logOreDictFail(oD.getName(), Log.itemStackToName(stack));
		    		}
		    	}
    		}
		}
    	
    	// Register mod ore dictionary entries
    	for (BlockData blockData : BlockData.values()) {
       		OreDictionary.registerOre(blockData.getOreDictRegName(), blockData.getModBlockItemStack());  		
       		Log.logOreDictSuccess(blockData.getOreDictRegName(), blockData.getBlockLogInfo());       		
       		// Support additional alternate spellings of oredict names
       		for (String material : blockData.getItemAltOreDictSuffix()) {
       			OreDictionary.registerOre(blockData.getOreDictCustomRegName(material), blockData.getModBlockItemStack());
       			Log.logOreDictSuccess(blockData.getOreDictCustomRegName(material), blockData.getBlockLogInfo());
       		}
    	}
		
    	Log.info("Registered Ore Dictionary Entries");
		
	}
	
	public static void cacheOreDictionaryItems() {
		for (BlockData blockData : BlockData.values()) {
			if (blockData.getRecipeMultiplier() > 0 && blockData.getDropItems() && Config.dropItems) {
				blockData.setDropItemObject();
			}
		}
	}

}

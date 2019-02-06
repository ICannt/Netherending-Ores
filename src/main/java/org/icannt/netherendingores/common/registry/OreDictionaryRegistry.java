package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.Log;

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
		
    	Log.debug("Registering Ore Dictionary Entries");
    	
		// Registration of Vanilla items that are not registered :(, purely a guess at what other mods might use
    	if (OreDictionary.doesOreNameExist("coal") == false) {
    		OreDictionary.registerOre("coal", new ItemStack(Items.COAL));
    	}
    	
    	// Registration of other mod items that are not registered by those mods, follows usual conventions
    	for (OreDictionaryOtherData oD : OreDictionaryOtherData.values()) {
    		if (oD.getEnabled()) {
		    	if (Loader.isModLoaded(oD.getModCodeName()) && OreDictionary.doesOreNameExist(oD.getName()) == false) {
		    		ItemStack stack = new ItemStack(Item.getByNameOrId(oD.getModCodeName() + ":" + oD.getModItemCodeName()), 1, oD.getMeta());
		    		if (!stack.isEmpty()) {
		    			OreDictionary.registerOre(oD.getName(), stack);
		    			Log.logOreDictSuccess(oD.getModDescName(), oD.getModItemDescName());
		    		} else {
		    			Log.logOreDictFail(oD.getModDescName(), oD.getModItemDescName());
		    		}
		    	}
    		}
		}
    	
    	for (BlockRecipeData blockData : BlockRecipeData.values()) {
       		OreDictionary.registerOre(blockData.getOreDictRegName(), blockData.getModBlockItemStack());  		
       		Log.logOreDictSuccess(blockData.getOreDictRegName(), blockData.getBlockName());       		
       		// Support additional alternate spellings of oredict names
       		for (String material : blockData.getItemAltOreDictSuffix()) {
       			OreDictionary.registerOre(blockData.getOreDictCustomRegName(material), blockData.getModBlockItemStack());
       			Log.logOreDictSuccess(blockData.getOreDictCustomRegName(material), blockData.getBlockName());
       		}
    	}
		
    	Log.info("Registered Ore Dictionary Entries");
		
	}

}

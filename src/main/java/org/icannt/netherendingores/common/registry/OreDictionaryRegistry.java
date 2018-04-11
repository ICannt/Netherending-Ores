package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 03/09/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class OreDictionaryRegistry {
 
	public static void registerDictionaryOres() {
		
    	NetherendingOres.LOGGER.info("Registering Ore Dictionary Entries");
    	
		// Registration of Vanilla items that are not registered :(, purely a guess at what other mods might use
    	if (OreDictionary.doesOreNameExist("coal") == false) {
    		OreDictionary.registerOre("coal", new ItemStack(Items.COAL));
    	}
    	
    	// Registration of Mod items that are not registered, follows usual conventions
    	if (Loader.isModLoaded("appliedenergistics2")) {
	    	if (OreDictionary.doesOreNameExist("crystalChargedCertusQuartz") == false) {
	    		OreDictionary.registerOre("crystalChargedCertusQuartz", new ItemStack(Item.getByNameOrId("appliedenergistics2:material:1")));
	    	}
    	}
    	
    	for (BlockRecipeDataRegistry blockData : BlockRecipeDataRegistry.values()) {
        	if (blockData.getRecipeMultiplier() > 0) {
        		OreDictionary.registerOre(blockData.getOreDictName(), new ItemStack(blockData.getBlock(), 1, blockData.getBlockMeta()));
        	}    		
    	}
		
    	NetherendingOres.LOGGER.info("Registered Ore Dictionary Entries");
		
	}

}

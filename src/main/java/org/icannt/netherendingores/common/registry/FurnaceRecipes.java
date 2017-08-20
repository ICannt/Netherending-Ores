package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.common.block.metadata.EnumOreModded1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreVanillaType;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 20/08/17.
 */
public class FurnaceRecipes {
	public static void registerFurnaceRecipes() {
		
        for (ItemStack stack : OreDictionary.getOres("oreCoal"))
        {
        	stack.setCount(2);
        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_VANILLA, 1, EnumOreVanillaType.COAL_ORE.ordinal()), stack, 0);
        }
        for (ItemStack stack : OreDictionary.getOres("oreCopper"))
        {
        	stack.setCount(2);
        	GameRegistry.addSmelting(new ItemStack(BlockRegistry.ORE_NETHER_MODDED_1, 1, EnumOreModded1Type.COPPER_ORE.ordinal()), stack, 0);
        }
        
	}
}

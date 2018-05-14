package org.icannt.netherendingores.integration.common.registry.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by ICannt on 15/05/18.
 */

public interface TinkerRecipeMethods {
	
    /**
     * Add a Smeltery recipe.
     * @param stack - input ItemStack
     * @param fluid - input Fluid
     * @param amount - input Fluid milliBuckets
     */
	void registerMelting(ItemStack stack, Fluid fluid, int amount);
	
}

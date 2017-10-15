package org.icannt.netherendingores.client.creativetab;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.registry.BlockRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


/**
 * Created by ICannt on 17/08/17.
 */
public class TabNetherendingOres extends CreativeTabs {

    public static final TabNetherendingOres NETHERENDING_ORES_TAB = new TabNetherendingOres();

    public TabNetherendingOres() {
        super(NetherendingOres.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockRegistry.CREATIVE_TAB);
    }
}

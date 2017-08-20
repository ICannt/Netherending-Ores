package org.icannt.netherendingores.client.creativetab;

import org.icannt.netherendingores.NetherendingOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
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
        return new ItemStack(Blocks.NETHERRACK);
    }
}
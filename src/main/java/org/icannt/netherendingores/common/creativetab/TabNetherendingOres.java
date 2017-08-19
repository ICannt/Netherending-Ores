package org.icannt.netherendingores.common.creativetab;

import org.icannt.netherendingores.common.NetherendingOres;
//import org.icannt.netherendingores.common.init.ModItems;

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
    // Requires ItemStack now
    public ItemStack getTabIconItem() {
        //return ModItems.TOOL_FABRICATOR;
        return new ItemStack(Blocks.NETHERRACK);
    }
}
package org.icannt.netherendingores.common.block;

import org.icannt.netherendingores.client.creativetab.TabNetherendingOres;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;


/**
 * Created by ICannt on 17/08/17.
 */
public class BlockVariantBase extends Block {
	
    public BlockVariantBase(Material material, MapColor mapColor, String registry) {
        super(material, mapColor);
        setRegistryName(Info.MOD_ID, registry);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(TabNetherendingOres.NETHERENDING_ORES_TAB);
    }
    
}

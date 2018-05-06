package org.icannt.netherendingores.common.block;

import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ICannt on 11/10/17.
 */
public class BlockCreativeTab extends Block {

    public BlockCreativeTab() {
        super(Material.ROCK);
        setRegistryName(Info.MOD_ID, "creative_tab");
        setUnlocalizedName(getRegistryName().toString());
    }
    
    @SideOnly(Side.CLIENT)
    public void initItemBlockModels() {
  		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Item.getItemFromBlock(this).getRegistryName(), "inventory"));
    }

}

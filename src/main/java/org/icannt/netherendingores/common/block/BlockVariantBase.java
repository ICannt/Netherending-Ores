package org.icannt.netherendingores.common.block;

import java.util.Random;

import org.icannt.netherendingores.client.creativetab.TabNetherendingOres;
import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


/**
 * Created by ICannt on 17/08/17.
 */
public class BlockVariantBase extends Block {
	
    public BlockVariantBase(Material material, MapColor mapColor, String registry) {
        super(material, mapColor);
        setRegistryName(Info.MOD_ID, registry);
        setTranslationKey(getRegistryName().toString());
        setCreativeTab(TabNetherendingOres.NETHERENDING_ORES_TAB);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	
    	int ordinal = getOrdinal(state);

    	if (BlockRecipeData.values()[ordinal].getDropItems()) {
    		return BlockRecipeData.values()[ordinal].getItemDropped();
    	}
    	
    	return Item.getItemFromBlock(this);
    	
    }
    
    @Override
    public int damageDropped(IBlockState state) {
    	
    	int ordinal = getOrdinal(state);
    	
    	if (BlockRecipeData.values()[ordinal].getDropItems()) {
    		return BlockRecipeData.values()[ordinal].getDamageDropped();
    	}
    	
        return getMetaFromState(state);
    }
    
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
    	
    	int ordinal = getOrdinal(state);
    	
    	if (BlockRecipeData.values()[ordinal].getDropItems()) {
    		return BlockRecipeData.values()[ordinal].getQuantityDropped(fortune, random);
    	}
    	
    	return 1;
    	
    }
    
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    	
    	Random rand = world instanceof World ? ((World)world).rand : RANDOM;
    	
    	int ordinal = getOrdinal(state);
    	
    	if (BlockRecipeData.values()[ordinal].getDropItems()) {
    		return BlockRecipeData.values()[ordinal].getExpDrop(fortune, rand);
    	}
    	
    	return 0;
    	
    }
    
    public int getOrdinal(IBlockState state) {
    	return 0;
    }
    
}

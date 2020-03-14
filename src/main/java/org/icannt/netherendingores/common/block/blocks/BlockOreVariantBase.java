package org.icannt.netherendingores.common.block.blocks;

import java.util.Random;

import org.icannt.netherendingores.client.creativetab.TabNetherendingOres;
import org.icannt.netherendingores.common.registry.BlockData;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


/**
 * Created by ICannt on 17/08/17.
 */
public class BlockOreVariantBase extends Block {
	
    public BlockOreVariantBase(MapColor mapColor, String registry) {
    	
        super(Material.ROCK, mapColor);
        
        setRegistryName(Info.MOD_ID, registry);
        setTranslationKey(getRegistryName().toString());
        setCreativeTab(TabNetherendingOres.NETHERENDING_ORES_TAB);
        
    }
    
    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
    	
        return BlockData.values()[getOrd(state)].getLightValue();
        
    }
    
    @Override
    public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
   	
    	return BlockData.values()[getOrd(state)].getBlockHardness();
    	
    }

    
    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance(World world, BlockPos pos, Entity exploder, Explosion explosion) {
    	
    	return BlockData.values()[getOrd(world.getBlockState(pos))].getExplosionResistance();
    	
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	
    	if (BlockData.values()[getOrd(state)].getDropItems()) {
    		return BlockData.values()[getOrd(state)].getItemDropped();
    	}
    	
    	return Item.getItemFromBlock(this);
    	
    }
    
    @Override
    public int damageDropped(IBlockState state) {
    	
    	if (BlockData.values()[getOrd(state)].getDropItems()) {
    		return BlockData.values()[getOrd(state)].getDamageDropped();
    	}
    	
        return getMetaFromState(state);
    }
    
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
    	
    	if (BlockData.values()[getOrd(state)].getDropItems()) {
    		return BlockData.values()[getOrd(state)].getQuantityDropped(fortune, random);
    	}
    	
    	return 1;
    	
    }
    
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    	
    	Random rand = world instanceof World ? ((World)world).rand : RANDOM;
    	
    	if (BlockData.values()[getOrd(state)].getDropItems()) {
    		return BlockData.values()[getOrd(state)].getExpDrop(fortune, rand);
    	}
    	
    	return 0;
    	
    }
    
    public int getHarvestLevel(IBlockState state) {
    	
    	return BlockData.values()[getOrd(state)].getHarvestLevel();
    	
    }
    
    public int getOrd(IBlockState state) {
    	
    	return 0;
    	
    }
    
}

package org.icannt.netherendingores.common.block;

import java.util.Random;

import org.icannt.netherendingores.client.creativetab.TabNetherendingOres;
import org.icannt.netherendingores.common.block.data.BlockDataOreEndModded1;
import org.icannt.netherendingores.common.registry.BlockRecipeData;
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
public class BlockVariantBase extends Block {
	
    public BlockVariantBase(MapColor mapColor, String registry) {
    	
        super(Material.ROCK, mapColor);
        
        setRegistryName(Info.MOD_ID, registry);
        setTranslationKey(getRegistryName().toString());
        setCreativeTab(TabNetherendingOres.NETHERENDING_ORES_TAB);
        
        for (BlockRecipeData variant : BlockRecipeData.values()) {
        	this.setHarvestLevel("pickaxe", variant.getHarvestLevel(), variant.getModBlockState());
        }
        
    }

    
    @Override
    public int getMetaFromState(IBlockState state) {
    	
        return BlockRecipeData.values()[getOrd(state)].getBlockMeta();
        
    }
    
    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
    	
        return BlockRecipeData.values()[getOrd(state)].getLightValue();
        
    }
    
    @Override
    public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
   	
    	return BlockRecipeData.values()[getOrd(state)].getBlockHardness();
    	
    }

    
    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance(World world, BlockPos pos, Entity exploder, Explosion explosion) {
    	
    	return BlockRecipeData.values()[getOrd(world.getBlockState(pos))].getExplosionResistance();
    	
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	
    	if (BlockRecipeData.values()[getOrd(state)].getDropItems()) {
    		return BlockRecipeData.values()[getOrd(state)].getItemDropped();
    	}
    	
    	return Item.getItemFromBlock(this);
    	
    }
    
    @Override
    public int damageDropped(IBlockState state) {
    	
    	if (BlockRecipeData.values()[getOrd(state)].getDropItems()) {
    		return BlockRecipeData.values()[getOrd(state)].getDamageDropped();
    	}
    	
        return getMetaFromState(state);
    }
    
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
    	
    	if (BlockRecipeData.values()[getOrd(state)].getDropItems()) {
    		return BlockRecipeData.values()[getOrd(state)].getQuantityDropped(fortune, random);
    	}
    	
    	return 1;
    	
    }
    
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    	
    	Random rand = world instanceof World ? ((World)world).rand : RANDOM;
    	
    	if (BlockRecipeData.values()[getOrd(state)].getDropItems()) {
    		return BlockRecipeData.values()[getOrd(state)].getExpDrop(fortune, rand);
    	}
    	
    	return 0;
    	
    }
    
    public int getOrd(IBlockState state) {
    	return 0;
    }
    
}

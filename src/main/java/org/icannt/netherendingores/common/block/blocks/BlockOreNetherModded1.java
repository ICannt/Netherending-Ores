package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreNetherModded1;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Created by ICannt on 19/08/17.
 */
public class BlockOreNetherModded1 extends BlockOreVariantBase {

    private static final PropertyEnum<BlockDataOreNetherModded1> VARIANT = PropertyEnum.create("blocks", BlockDataOreNetherModded1.class);

    public BlockOreNetherModded1() {
    	
        super(MapColor.NETHERRACK, "ore_nether_modded_1");
        
        for (BlockDataOreNetherModded1 variant : BlockDataOreNetherModded1.values()) {
        	this.setHarvestLevel("pickaxe", super.getHarvestLevel(getStateFromMeta(variant.ordinal())), getStateFromMeta(variant.ordinal()));
        }
        
    }

    @Override
    protected BlockStateContainer createBlockState() {
    	
        return new BlockStateContainer(this, VARIANT);
        
    }   

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		
		for (BlockDataOreNetherModded1 type : BlockDataOreNetherModded1.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreNetherModded1.values()[meta]);
        
    }
	
	@Override
	public int getMetaFromState(IBlockState state) {
		
		return state.getValue(VARIANT).ordinal();
		
	}

    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreNetherModded1.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }
    
}

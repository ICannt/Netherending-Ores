package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreNetherModded2;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Created by ICannt on 28/01/19.
 */
public class BlockOreNetherModded2 extends BlockOreVariantBase {

    private static final PropertyEnum<BlockDataOreNetherModded2> VARIANT = PropertyEnum.create("blocks", BlockDataOreNetherModded2.class);

    public BlockOreNetherModded2() {
    	
        super(MapColor.NETHERRACK, "ore_nether_modded_2");
        
        for (BlockDataOreNetherModded2 variant : BlockDataOreNetherModded2.values()) {
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
		
		for (BlockDataOreNetherModded2 type : BlockDataOreNetherModded2.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreNetherModded2.values()[meta]);
        
    }
	
	@Override
	public int getMetaFromState(IBlockState state) {
		
		return state.getValue(VARIANT).ordinal();
		
	}

    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreNetherModded2.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }
    
}

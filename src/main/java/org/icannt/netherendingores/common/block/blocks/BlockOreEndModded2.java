package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreEndModded2;

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
public class BlockOreEndModded2 extends BlockOreVariantBase {

    private static final PropertyEnum<BlockDataOreEndModded2> VARIANT = PropertyEnum.create("blocks", BlockDataOreEndModded2.class);

    public BlockOreEndModded2() {
    	
        super(MapColor.SAND, "ore_end_modded_2");
        
        for (BlockDataOreEndModded2 variant : BlockDataOreEndModded2.values()) {
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
		
		for (BlockDataOreEndModded2 type : BlockDataOreEndModded2.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreEndModded2.values()[meta]);
        
    }

	@Override
	public int getMetaFromState(IBlockState state) {
		
		return state.getValue(VARIANT).ordinal();
		
	}
	
    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreEndModded2.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }

}

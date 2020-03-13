package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreEndModded1;

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
public class BlockOreEndModded1 extends BlockOreVariantBase {

    private static final PropertyEnum<BlockDataOreEndModded1> VARIANT = PropertyEnum.create("blocks", BlockDataOreEndModded1.class);

    public BlockOreEndModded1() {
    	
        super(MapColor.SAND, "ore_end_modded_1");
        
    }

    @Override
    protected BlockStateContainer createBlockState() {
    	
        return new BlockStateContainer(this, VARIANT);
        
    }   

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		
		for (BlockDataOreEndModded1 type : BlockDataOreEndModded1.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreEndModded1.values()[meta]);
        
    }

    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreEndModded1.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }

}

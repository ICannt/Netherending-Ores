package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreEndVanilla;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Created by ICannt on 17/08/17.
 */
public class BlockOreEndVanilla extends BlockOreVariantBase {

    private static final PropertyEnum<BlockDataOreEndVanilla> VARIANT = PropertyEnum.create("blocks", BlockDataOreEndVanilla.class);

    public BlockOreEndVanilla() {
    	
        super(MapColor.SAND, "ore_end_vanilla");
        
    }

    @Override
    protected BlockStateContainer createBlockState() {
    	
        return new BlockStateContainer(this, VARIANT);
        
    }   

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		
		for (BlockDataOreEndVanilla type : BlockDataOreEndVanilla.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreEndVanilla.values()[meta]);
        
    }

    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreEndVanilla.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }
    
}

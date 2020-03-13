package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreOther1;
import org.icannt.netherendingores.common.registry.BlockData;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * Created by ICannt on 17/08/17.
 */
public class BlockOreOther1 extends BlockOreVariantBase {

    private static final PropertyEnum<BlockDataOreOther1> VARIANT = PropertyEnum.create("blocks", BlockDataOreOther1.class);

    public BlockOreOther1() {
    	
        super(MapColor.STONE, "ore_other_1");
        
    }

    @Override
    protected BlockStateContainer createBlockState() {
    	
        return new BlockStateContainer(this, VARIANT);
        
    }   

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		
		for (BlockDataOreOther1 type : BlockDataOreOther1.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreOther1.values()[meta]);
        
    }

    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreOther1.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return BlockData.values()[getOrd(state)].getModMapColor();
    }
    
}

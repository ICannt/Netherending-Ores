package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.data.BlockDataOreNetherVanilla;

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
public class BlockOreNetherVanilla extends BlockOreVariantBase {
	
    private static final PropertyEnum<BlockDataOreNetherVanilla> VARIANT = PropertyEnum.create("blocks", BlockDataOreNetherVanilla.class);

    public BlockOreNetherVanilla() {
    	
        super(MapColor.NETHERRACK, "ore_nether_vanilla");
        
    }

    @Override
    protected BlockStateContainer createBlockState() {
    	
        return new BlockStateContainer(this, VARIANT);
        
    }   

	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		
		for (BlockDataOreNetherVanilla type : BlockDataOreNetherVanilla.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
		
    }

	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
		
        return getDefaultState().withProperty(VARIANT, BlockDataOreNetherVanilla.values()[meta]);
        
    }

    @Override
    public int getOrd(IBlockState state) {
    	
    	return BlockDataOreNetherVanilla.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    	
    }
    
}

package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.BlockVariantBase;
import org.icannt.netherendingores.common.block.data.BlockDataOreNetherVanilla;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ICannt on 17/08/17.
 */
public class BlockOreNetherVanilla extends BlockVariantBase {
	
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

package org.icannt.netherendingores.common.block.blocks;

import org.icannt.netherendingores.common.block.BlockVariantBase;
import org.icannt.netherendingores.common.block.data.BlockDataOreEndModded2;

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
 * Created by ICannt on 28/01/19.
 */
public class BlockOreEndModded2 extends BlockVariantBase {

    private static final PropertyEnum<BlockDataOreEndModded2> VARIANT = PropertyEnum.create("blocks", BlockDataOreEndModded2.class);

    public BlockOreEndModded2() {
        super(Material.ROCK, MapColor.GRAY, "ore_end_modded_2");
        for (BlockDataOreEndModded2 variant : BlockDataOreEndModded2.values()) {
        	this.setHarvestLevel("pickaxe", variant.getHarvestLevel(), getStateFromMeta(variant.ordinal()));
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
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state.getValue(VARIANT).getLight();
    }  

    @Override
    public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
        return state.getValue(VARIANT).getHardness();
    }

    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance(World world, BlockPos pos, Entity exploder, Explosion explosion) {
        return world.getBlockState(pos).getValue(VARIANT).getResistance() / 5F;
    }
    
    @Override
    public int getOrd(IBlockState state) {
    	return BlockDataOreEndModded2.values()[getMetaFromState(state)].getBlockRecipeDataOrdinal();
    }
    
    @SideOnly(Side.CLIENT)
    public void initItemBlockModels() {
    	for (BlockDataOreEndModded2 variant : BlockDataOreEndModded2.values()) {
    		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), variant.ordinal(), new ModelResourceLocation(Item.getItemFromBlock(this).getRegistryName(), "blocks=" + variant.getName()));
    	}
    }

}

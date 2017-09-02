package org.icannt.netherendingores.common.block.blocks;

import java.util.Map;

import org.icannt.netherendingores.common.block.BlockVariantBase;
import org.icannt.netherendingores.common.block.metadata.EnumOreOther1Type;
import org.icannt.netherendingores.common.block.metadata.EnumOreVanillaType;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
public class BlockOreOther1 extends BlockVariantBase {

    private static final PropertyEnum<EnumOreOther1Type> VARIANT = PropertyEnum.create("blocks", EnumOreOther1Type.class);

    public BlockOreOther1() {
        super(Material.ROCK, MapColor.GRAY, "ore_other_1");
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, VARIANT);
    }   
    
	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
	{
		for (EnumOreOther1Type type : EnumOreOther1Type.values()) {
			list.add(new ItemStack(this, 1, type.ordinal()));
		}
    }
    
	@SuppressWarnings("deprecation")
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(VARIANT, EnumOreOther1Type.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(VARIANT).ordinal();
    }
    
    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    public String getRecipeOreDict(IBlockState state) {
    	return state.getValue(VARIANT).getRecipeOreDict();
    }
    
    public String getFurnaceOreDict(IBlockState state) {
    	return state.getValue(VARIANT).getFurnaceOreDict();
    }
    
    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state.getValue(VARIANT).getLight();
    }

    @Override
    public int getHarvestLevel(IBlockState state) {
        return state.getValue(VARIANT).getHarvestLevel();
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
    
    @SideOnly(Side.CLIENT)
    public void initItemBlockModel(ItemBlock iB, Block bl) {
    	for (EnumOreOther1Type variant : EnumOreOther1Type.values()) {
    		System.out.println("Item Block: " + iB + " | " + "Variant Ordinal: " + variant.ordinal() + " | " + "Block: " + bl.getRegistryName() + " | " + "Variant Name: " + variant.getName());
    		ModelLoader.setCustomModelResourceLocation(iB, variant.ordinal(), new ModelResourceLocation(bl.getRegistryName(), "blocks=" + variant.getName()));
    	}
    }
    
}

package org.icannt.netherendingores.common.block.blocks;

import java.util.Random;

import org.icannt.netherendingores.common.entity.EntityNetherfish;
import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ICannt on 28/07/19.
 */
public class BlockMonsterNetherNetherfish extends Block {

    public BlockMonsterNetherNetherfish() {
        super(Material.ROCK, MapColor.NETHERRACK);
        setRegistryName(Info.MOD_ID, "block_nether_netherfish");
        setTranslationKey(getRegistryName().toString());
    }
    
	//					Stone	Monster		Netherrack	Monster		End Stone	Monster
	//Hardness			1.5		0.75		0.4			0.2			3			1.5
    //Blast				30		3.75		2			0.25		45			5.625

    @Override
    public float getBlockHardness(IBlockState state, World worldIn, BlockPos pos) {
        return 0.2F;
    }

    @Override
    public float getExplosionResistance(Entity exploder) {
        return 0.25F / 5F;
    }
    
    @Override
    public boolean isFireSource(World world, BlockPos blockPos, EnumFacing facing) {
        return facing == EnumFacing.UP;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(Blocks.NETHERRACK, 1, 0);
    }
    
    @SideOnly(Side.CLIENT)
    public void initItemBlockModels() {
  		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Item.getItemFromBlock(this).getRegistryName(), "inventory"));
    }
    
    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {

        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops")) {

            EntityNetherfish netherfish = new EntityNetherfish(worldIn);
            netherfish.setLocationAndAngles(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, 0.0F, 0.0F);
            worldIn.spawnEntity(netherfish);
            netherfish.spawnExplosionParticle();

        }

    }

}

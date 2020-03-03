package org.icannt.netherendingores.common.block;

import java.util.Random;

import org.icannt.netherendingores.lib.Info;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ICannt on 02/03/20.
 */
public class BlockEndEndermite extends Block {

    public BlockEndEndermite() {
        super(Material.ROCK, MapColor.SAND);
        setRegistryName(Info.MOD_ID, "block_endermite");
        setTranslationKey(getRegistryName().toString());
    }
    
    @Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
        if (entity instanceof EntityDragon)
        {
        	return false;
        }
        return true;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(Blocks.END_STONE, 1, 0);
    }
    
    @SideOnly(Side.CLIENT)
    public void initItemBlockModels() {
  		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Item.getItemFromBlock(this).getRegistryName(), "inventory"));
    }
    
    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {

        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops")) {

            EntityEndermite endermite = new EntityEndermite(worldIn);
            endermite.setLocationAndAngles(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, 0.0F, 0.0F);
            worldIn.spawnEntity(endermite);
            endermite.spawnExplosionParticle();

        }

    }

}

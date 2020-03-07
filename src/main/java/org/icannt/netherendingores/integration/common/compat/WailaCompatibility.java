package org.icannt.netherendingores.integration.common.compat;

import org.icannt.netherendingores.common.registry.BlockRegistry;
import org.icannt.netherendingores.lib.Config;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class WailaCompatibility implements IWailaDataProvider {

    public static final WailaCompatibility INSTANCE = new WailaCompatibility();

    public static void register(IWailaRegistrar registrar) {

        registrar.registerStackProvider(INSTANCE, BlockRegistry.BLOCK_NETHER_NETHERFISH.getClass());
        registrar.registerStackProvider(INSTANCE, BlockRegistry.BLOCK_END_ENDERMITE.getClass());

    }

    @Override
    public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {

        Block block = accessor.getBlock();

        if (block == BlockRegistry.BLOCK_NETHER_NETHERFISH && Config.netherfishWAILA) return new ItemStack(Blocks.NETHERRACK);
        if (block == BlockRegistry.BLOCK_END_ENDERMITE && Config.endermiteWAILA) return new ItemStack(Blocks.END_STONE);

        return ItemStack.EMPTY;

    }

}

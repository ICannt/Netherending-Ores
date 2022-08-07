package org.icannt.netherendingores;

import static org.icannt.netherendingores.NetherendingOres.MOD_ID;

import org.icannt.netherendingores.common.block.NeoOreBlocks;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);


    public static final CreativeModeTab TAB_NETHERENDING_ORES = new CreativeModeTab(MOD_ID + "_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(NETHERENDING_ORES_CREATIVE_TAB_BLOCK.get());
        }
    };

	public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.AIR);
	public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();

	public static final RegistryObject<Block> NETHERENDING_ORES_CREATIVE_TAB_BLOCK = BLOCKS.register("netherending_ores_creative_tab_block", () -> new Block(BLOCK_PROPERTIES));
	public static final RegistryObject<Item> NETHERENDING_ORES_CREATIVE_TAB_BLOCK_ITEM = fromBlock(NETHERENDING_ORES_CREATIVE_TAB_BLOCK);

	public static void init() {

		for (NeoOreBlocks ore : NeoOreBlocks.values()) {

	        final RegistryObject<Block> block = BLOCKS.register(ore.getName(), () -> new Block(ore.getBlockProperties()));
			final RegistryObject<Item> item = ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ore.getItemProperties()));

			final TagKey<Block> blockTag = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(MOD_ID, ore.getName()));
			final TagKey<Item> itemTag = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MOD_ID, ore.getName()));

	        ore.setBlock(block, blockTag);
	        ore.setItem(item, itemTag);

	    }

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

	    BLOCKS.register(bus);
        ITEMS.register(bus);

	}

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

}

package org.icannt.netherendingores.registry.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.registries.ForgeRegistries;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.Ores;
import org.icannt.netherendingores.common.block.Variant;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ItemRegistry {

    public static final ItemGroup GROUP = new ItemGroup(NetherendingOres.MOD_ID + "_item_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockRegistry.getOreVariant(Ores.DIAMOND, Variant.END).asItem());
        }

        // Sort Items in ItemGroup alphabetically
        @Override
        @ParametersAreNonnullByDefault
        public void fill(NonNullList<ItemStack> items) {
           List<Item> sortedItems = ForgeRegistries.ITEMS.getValues()
            .stream()
            .filter((item) -> Objects.requireNonNull(item.getRegistryName()).getNamespace().equals(NetherendingOres.MOD_ID))
            .sorted(Comparator.comparing(item -> item.getRegistryName().getPath()))
            .collect(Collectors.toList());

            for (Item item : sortedItems) {
                if (item != null) {
                    item.fillItemGroup(ItemGroup.SEARCH, items);
                }
            }
        }
    };

    private static final List<Item> ITEMS = new ArrayList<>();

    public static void setup() {

    }

    public static void add(Item item) {
        ITEMS.add(item);
    }

    public static List<Item> getItems() {
        return ITEMS;
    }
}

package org.icannt.netherendingores.datagen;

import java.util.List;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class NeoOreLootModifier extends LootModifier {

    private Item lootItem;

	protected NeoOreLootModifier(LootItemCondition[] conditionsIn, Item lootItem) {
		super(conditionsIn);
		this.lootItem = lootItem;
	}

	// doApply is run every time a block is dropped, so keep it speedy.
    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {

    	// The ItemStack list should only ever be empty if the item tag code failed to find a match.
    	// So players are not disappointed, drop the block instead, which is the default json item for the modifier.
    	// context.getParam(LootContextParams.BLOCK_STATE).getBlock().asItem() could be used instead, but if pack makers want to get creative...
    	if (generatedLoot.isEmpty()) {
    		generatedLoot.add(new ItemStack(lootItem, 1));
    	}

    	return generatedLoot;

    }

    public static class Serializer extends GlobalLootModifierSerializer<NeoOreLootModifier> {

    	// The read function is on world load and once only, so complex testing code should go here.
        @Override
        public NeoOreLootModifier read(ResourceLocation name, JsonObject obj, LootItemCondition[] conditionsIn) {
            Item lootItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(obj, "item")));
            return new NeoOreLootModifier(conditionsIn, lootItem);
        }

        // TODO: Write suitable datagen code
        @Override
        public JsonObject write(NeoOreLootModifier instance) {
        	return null;
        	/*
            JsonObject obj = makeConditions(instance.conditions);
            obj.addProperty(lootItemMember, instance.lootItem.getRegistryName().toString());
            return obj;
            */
        }

    }

}

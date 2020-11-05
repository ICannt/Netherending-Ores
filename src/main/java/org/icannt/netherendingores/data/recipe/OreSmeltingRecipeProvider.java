package org.icannt.netherendingores.data.recipe;

import com.google.gson.JsonObject;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.crafting.conditions.ItemExistsCondition;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;
import net.minecraftforge.registries.ForgeRegistries;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.*;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class OreSmeltingRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public OreSmeltingRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        for (Ores ore : Ores.values()) {
            for (Variant variant : ore.getVariants()) {
                BlockOre block = (BlockOre) BlockRegistry.getOreVariant(ore, variant);

                Ingredient ingredient;

                switch(ore.getOutputType()) {
                    case "item":
                        ingredient = Ingredient.fromItems(ForgeRegistries.ITEMS.getValue(new ResourceLocation(ore.getOutputEntry())).asItem());
                        break;
                    case "tag":
                        ingredient = Ingredient.fromTag(ItemTags.makeWrapperTag(ore.getOutputEntry()));
                        break;
                    default:
                        ingredient = Ingredient.EMPTY;
                }

                consumer.accept(new FinishedRecipe(
                        new ResourceLocation(NetherendingOres.MOD_ID, ore.getFullName(variant) + "_smelting"),
                        Ingredient.fromItems(block.asItem()),
                        ingredient,
                        2,
                        0.1f,
                        200
                ));
            }
        }
    }

    public static class FinishedRecipe implements IFinishedRecipe {

        private final ResourceLocation id;
        private final Ingredient input;
        private final Ingredient output;
        private final int multiplier;
        private final float experience;
        private final int cookTime;

        public FinishedRecipe(ResourceLocation id, Ingredient input, Ingredient output, int multiplier, float experience, int cookTime) {
            this.id = id;
            this.input = input;
            this.output = output;
            this.multiplier = multiplier;
            this.experience = experience;
            this.cookTime = cookTime;
        }

        @Override
        public void serialize(JsonObject json) {
            json.add("input", this.input.serialize());
            json.add("output", this.output.serialize());
            json.addProperty("multiplier", this.multiplier);
            json.addProperty("experience", this.experience);
            json.addProperty("cookTime", this.cookTime);
        }

        @Override
        public ResourceLocation getID() {
            return this.id;
        }

        @Override
        public IRecipeSerializer<?> getSerializer() {
            return OreSmeltingRecipe.SERIALIZER;
        }

        @Nullable
        @Override
        public JsonObject getAdvancementJson() {
            return null;
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementID() {
            return null;
        }
    }
}

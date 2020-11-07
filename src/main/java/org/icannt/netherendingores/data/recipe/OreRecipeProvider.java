package org.icannt.netherendingores.data.recipe;

import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.RecipeUnlockedTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.*;
import org.icannt.netherendingores.data.recipe.blasting.OreRecipeBlasting;
import org.icannt.netherendingores.data.recipe.smelting.OreRecipeSmelting;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class OreRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public OreRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        for (Ores ore : Ores.values()) {
            for (Variant variant : ore.getVariants()) {
                BlockOre block = (BlockOre) BlockRegistry.getOreVariant(ore, variant);

//                Ingredient output;
//
//                switch(ore.getOutputType()) {
//                    case "item":
//                        output = Ingredient.fromItems(ForgeRegistries.ITEMS.getValue(new ResourceLocation(ore.getOutputEntry())).asItem());
//                        break;
//                    case "tag":
//                        output = Ingredient.fromTag(ItemTags.makeWrapperTag(ore.getOutputEntry()));
//                        break;
//                    default:
//                        output = Ingredient.EMPTY;
//                }

                // Smelting
                consumer.accept(new FinishedRecipe(
                        OreRecipeSmelting.SERIALIZER,
                        new ResourceLocation(NetherendingOres.MOD_ID, ore.getFullName(variant) + "_smelting"),
                        Ingredient.fromItems(block.asItem()),
                        ore.getOutput().getIngredient(),
                        ore.getOutput().getMultiplier(),
                        0,
                        200
                ));

                // Blasting
                consumer.accept(new FinishedRecipe(
                        OreRecipeBlasting.SERIALIZER,
                        new ResourceLocation(NetherendingOres.MOD_ID, ore.getFullName(variant) + "_blasting"),
                        Ingredient.fromItems(block.asItem()),
                        ore.getOutput().getIngredient(),
                        ore.getOutput().getMultiplier(),
                        0,
                        100
                ));

            }
        }
    }

    public static class FinishedRecipe implements IFinishedRecipe {

        private final IRecipeSerializer<?> serializer;
        private final ResourceLocation id;
        private final Ingredient input;
        private final Ingredient output;
        private final int multiplier;
        private final float experience;
        private final int cookTime;

        public FinishedRecipe(IRecipeSerializer<?> serializer, ResourceLocation id, Ingredient input, Ingredient output, int multiplier, float experience, int cookTime) {
            this.serializer = serializer;
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
            return this.serializer;
        }

        @Nullable
        @Override
        public JsonObject getAdvancementJson() {
            Advancement.Builder builder = Advancement.Builder.builder()
                    .withParentId(new ResourceLocation("recipes/root"))
                    .withCriterion("has_ingredient", hasItem(this.input.getMatchingStacks()[0].getItem()))
                    .withCriterion("has_the_recipe", RecipeUnlockedTrigger.create(this.id))
                    .withRewards(AdvancementRewards.Builder.recipe(this.id))
                    .withRequirementsStrategy(IRequirementsStrategy.OR);
            return builder.serialize();
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementID() {
            return new ResourceLocation(id.getNamespace(), "recipes/" + id.getPath());
        }
    }
}

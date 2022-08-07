package org.icannt.netherendingores.datagen;

import java.util.function.Consumer;

import org.icannt.netherendingores.common.block.NeoOreBlocks;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.Ingredient;



public class NeoRecipes extends RecipeProvider {

	public NeoRecipes(DataGenerator generator) {
		super(generator);
	}

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {

    	for (NeoOreBlocks ore : NeoOreBlocks.values()) {

    		// This will need to be changed to reflect an actual raw ingot item or be tag based and fail gracefully
	        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ore.getItem()),
	        		Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/ironz"))).getItems()[0].getItem(), 1.0f, 100)
	        				.unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ore.getBlock()).build()))
	        				.group(ore.getSmeltingGroup())
	        				.save(finishedRecipeConsumer, ore.getName() + "_smelting");

    		// This will need to be changed to reflect an actual raw ingot item or be tag based and fail gracefully
	        // Also there will need to be a check to see if a blasting recipe is even valid
	        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ore.getItem()), ore.getItem(), 1.0f, 100)
	        				.unlockedBy("has_ore", inventoryTrigger(ItemPredicate.Builder.item().of(ore.getBlock()).build()))
	        				.group(ore.getSmeltingGroup())
	        				.save(finishedRecipeConsumer, ore.getName() + "_blasting");

    	}
    }
}

package org.icannt.netherendingores.data.recipe.blasting;

import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class OreRecipeBlasting extends AbstractCookingRecipe {

    public static Serializer SERIALIZER = new Serializer();

    private final ResourceLocation id;
    private final Ingredient input;
    private final Ingredient output;
    private final int multiplier;
    private final float experience;
    private final int cookTime;

    public OreRecipeBlasting(ResourceLocation id, Ingredient input, Ingredient output, int multiplier, float experience, int cookTime) {
        // Pass in ItemStack.EMPTY here as output to conform with AbstractCookingRecipe. Hacky?
        super(IRecipeType.BLASTING, id, "", input, new ItemStack(output.getMatchingStacks()[0].getItem(), multiplier), experience, cookTime);
        this.id = id;
        this.input = input;
        this.output = output;
        this.multiplier = multiplier;
        this.experience = experience;
        this.cookTime = cookTime;
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        //return new ItemStack(this.output.getMatchingStacks()[0].getItem(), this.multiplier);
        return this.result;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return NonNullList.from(this.input);
    }

    public float getExperience() {
        return this.experience;
    }

    @Override
    public ItemStack getRecipeOutput() {
        //return new ItemStack(this.output.getMatchingStacks()[0].getItem(), this.multiplier);
        return this.result;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return OreRecipeBlasting.SERIALIZER;
    }

    @Override
    public IRecipeType<?> getType() {
        return IRecipeType.BLASTING;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<OreRecipeBlasting> {

        @Override
        public OreRecipeBlasting read(ResourceLocation recipeId, JsonObject json) {
            Ingredient input = Ingredient.deserialize(JSONUtils.getJsonObject(json, "input"));
            Ingredient output = Ingredient.deserialize(JSONUtils.getJsonObject(json, "output"));
            int multiplier = JSONUtils.getInt(json, "multiplier");
            float experience = JSONUtils.getFloat(json, "experience");
            int cookTime = JSONUtils.getInt(json, "cookTime");

            return new OreRecipeBlasting(recipeId, input, output, multiplier, experience, cookTime);

        }

        @Nullable
        @Override
        public OreRecipeBlasting read(ResourceLocation recipeId, PacketBuffer buffer) {
            Ingredient input = Ingredient.read(buffer);
            Ingredient output = Ingredient.read(buffer);
            int multiplier = buffer.readVarInt();
            float experience = buffer.readFloat();
            int cookTime = buffer.readVarInt();

            return new OreRecipeBlasting(recipeId, input, output, multiplier, experience, cookTime);
        }

        @Override
        public void write(PacketBuffer buffer, OreRecipeBlasting recipe) {
            recipe.input.write(buffer);
            recipe.output.write(buffer);
            buffer.writeVarInt(recipe.multiplier);
            buffer.writeFloat(recipe.experience);
            buffer.writeVarInt(recipe.cookTime);
        }
    }
}

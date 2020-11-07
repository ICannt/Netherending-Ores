package org.icannt.netherendingores.common.block;

import com.google.gson.Gson;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import org.icannt.netherendingores.NetherendingOres;

import java.io.Serializable;
import java.util.Arrays;

public enum Ores {

    COAL("coal", new Variant[] {Variant.NETHER, Variant.END}, 0, 3F, 15F, new RecipeOutput(RecipeOutput.Type.ITEM, "minecraft:coal")),
    IRON("iron", new Variant[] {Variant.NETHER, Variant.END}, 1, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:ingots/iron")),
    GOLD("gold", new Variant[] {Variant.NETHER, Variant.END}, 2, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:ingots/gold")),
    LAPIS("lapis", new Variant[] {Variant.NETHER, Variant.END}, 1, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:gems/lapis", 6)),
    REDSTONE("redstone", new Variant[] {Variant.NETHER, Variant.END}, 1, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:dusts/redstone", 6)),
    DIAMOND("diamond", new Variant[] {Variant.NETHER, Variant.END}, 2, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:gems/diamond")),
    EMERALD("emerald", new Variant[] {Variant.NETHER, Variant.END}, 2, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:gems/emerald")),
    QUARTZ("quartz", new Variant[] {Variant.OVERWORLD, Variant.END}, 0, 3F, 15F, new RecipeOutput(RecipeOutput.Type.TAG, "forge:gems/quartz"));

    private final String name;
    private final Variant[] variants;

    private final int harvest;
    private final float hardness;
    private final float resistance;

    private final RecipeOutput output;

    Ores(String name, Variant[] variants, int harvest, float hardness, float resistance, RecipeOutput output) {
        this.name = name;
        this.variants = variants;
        this.harvest = harvest;
        this.hardness = hardness;
        this.resistance = resistance;
        this.output = output;
    }

    public String getName() {
        return name;
    }

    public ResourceLocation getResourceLocation(Variant variant) {
        return new ResourceLocation(NetherendingOres.MOD_ID, variant.getPrefix() + "_" + name + "_" + "ore");
    }

    public String getFullName(Variant variant) {
        return variant.getPrefix() + "_" + name + "_" + "ore";
    }

    public Variant[] getVariants() {
        return variants;
    }

    public boolean hasVariant(Variant variant) {
        return Arrays.asList(variants).contains(variant);
    }

    public int getHarvest() {
        return harvest;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public RecipeOutput getOutput() {
        return output;
    }

    public static class RecipeOutput {

        private final Type type;
        private final String entry;
        private final int multiplier;

        public RecipeOutput(Type type, String entry, int multiplier) {
            this.type = type;
            this.entry = entry;
            this.multiplier = multiplier;
        }

        public RecipeOutput(Type type, String entry) {
            this(type, entry, 2);
        }

        public Type getType() {
            return type;
        }

        public String getEntry() {
            return entry;
        }

        public int getMultiplier() {
            return multiplier;
        }

        public Ingredient getIngredient() {
            Ingredient output = Ingredient.EMPTY;

            switch (this.type) {
                case ITEM:
                    output = Ingredient.fromItems(ForgeRegistries.ITEMS.getValue(new ResourceLocation(this.entry)).asItem());
                    break;
                case TAG:
                    output = Ingredient.fromTag(ItemTags.makeWrapperTag(this.entry));
                    break;
            }

            return output;
        }

        public enum Type {
            ITEM("item"),
            TAG("tag");

            private String id;

            Type(String id) {
                this.id = id;
            }
        }
    }
}

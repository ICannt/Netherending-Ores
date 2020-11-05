package org.icannt.netherendingores.common.block;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import org.icannt.netherendingores.NetherendingOres;

import java.util.Arrays;

public enum Ores {

    COAL("coal", new Variant[] {Variant.NETHER, Variant.END}, 0, 3F, 15F, "item", "minecraft:coal"),
    IRON("iron", new Variant[] {Variant.NETHER, Variant.END}, 1, 3F, 15F, "tag", "forge:ingots/iron"),
    GOLD("gold", new Variant[] {Variant.NETHER, Variant.END}, 2, 3F, 15F, "tag", "forge:ingots/gold"),
    LAPIS("lapis", new Variant[] {Variant.NETHER, Variant.END}, 1, 3F, 15F, "tag", "forge:gems/lapis"),
    REDSTONE("redstone", new Variant[] {Variant.NETHER, Variant.END}, 1, 3F, 15F, "item", "minecraft:redstone"),
    DIAMOND("diamond", new Variant[] {Variant.NETHER, Variant.END}, 2, 3F, 15F, "tag", "forge:gems/diamond"),
    EMERALD("emerald", new Variant[] {Variant.NETHER, Variant.END}, 2, 3F, 15F, "tag", "forge:gems/emerald"),
    QUARTZ("quartz", new Variant[] {Variant.OVERWORLD, Variant.END}, 0, 3F, 15F, "tag", "forge:gems/quartz");

    public String getOutputType() {
        return outputType;
    }

    public String getOutputEntry() {
        return outputEntry;
    }

    private final String name;
    private final Variant[] variants;

    private final int harvest;
    private final float hardness;
    private final float resistance;
    
    private final String outputType;
    private final String outputEntry;

    Ores(String name, Variant[] variants, int harvest, float hardness, float resistance, String outputType, String outputEntry) {
        this.name = name;
        this.variants = variants;
        this.harvest = harvest;
        this.hardness = hardness;
        this.resistance = resistance;
        this.outputType = outputType;
        this.outputEntry = outputEntry;
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
}

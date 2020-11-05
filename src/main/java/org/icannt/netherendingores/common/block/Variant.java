package org.icannt.netherendingores.common.block;

import net.minecraft.block.material.MaterialColor;

public enum Variant {

    OVERWORLD("overworld", MaterialColor.STONE),
    NETHER("nether", MaterialColor.NETHERRACK),
    END("end", MaterialColor.SAND);

    private final String prefix;
    private final MaterialColor color;

    Variant(String prefixIn, MaterialColor colorIn) {
        this.prefix = prefixIn;
        this.color = colorIn;
    }

    public String getPrefix() {
        return prefix;
    }

    public MaterialColor getColor() {
        return color;
    }
}

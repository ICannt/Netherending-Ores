package org.icannt.netherendingores.common.block.data;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreNetherModded1 implements IStringSerializable {
	
	
    ALUMINUM_ORE ("aluminum_ore", -1),
    COPPER_ORE ("copper_ore", -1),
    IRIDIUM_ORE ("iridium_ore", -1),
    LEAD_ORE ("lead_ore", -1),
    MITHRIL_ORE ("mithril_ore", -1),
    NICKEL_ORE ("nickel_ore", -1),
    PLATINUM_ORE ("platinum_ore", -1),
    SILVER_ORE ("silver_ore", -1),
    TIN_ORE ("tin_ore", -1),
    CERTUS_QUARTZ_ORE ("certus_quartz_ore", -1),
    CHARGED_CERTUS_QUARTZ_ORE ("charged_certus_quartz_ore", -1),
    OSMIUM_ORE ("osmium_ore", -1),
    URANIUM_ORE ("uranium_ore", -1),
    YELLORITE_ORE ("yellorite_ore", -1),
    DILITHIUM_ORE ("dilithium_ore", -1),
    TRITANIUM_ORE ("tritanium_ore", -1);

	
    private String name;
    private int blockRecipeDataOrdinal;

    BlockDataOreNetherModded1(String name, int blockRecipeDataOrdinal) {

        this.name = name;
        this.blockRecipeDataOrdinal = blockRecipeDataOrdinal;
        
    }
    
    @Override
    public String getName() {
    	
        return name;
        
    }
    
    //
	public int getBlockRecipeDataOrdinal() {
		
		return blockRecipeDataOrdinal;
		
	}
    
    //
	public void setBlockRecipeDataOrdinal(int ordinal) {
		
		this.blockRecipeDataOrdinal = ordinal;
		
	}
    
}

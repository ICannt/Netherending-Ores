package org.icannt.netherendingores.common.block.data;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreOther1 implements IStringSerializable {
	
	
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", -1),
    END_QUARTZ_ORE ("end_quartz_ore", -1),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", -1),
    END_ARDITE_ORE ("end_ardite_ore", -1),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", -1),
    END_COBALT_ORE ("end_cobalt_ore", -1),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", -1),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", -1),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", -1),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", -1),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", -1);

	
    private String name;
    private int blockRecipeDataOrdinal;

    BlockDataOreOther1(String name, int blockRecipeDataOrdinal) {

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

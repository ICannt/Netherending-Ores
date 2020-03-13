package org.icannt.netherendingores.common.block.data;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 17/08/17.
 */
public enum BlockDataOreNetherVanilla implements IStringSerializable {
	
    COAL_ORE ("coal_ore", -1),
    DIAMOND_ORE ("diamond_ore", -1),
    EMERALD_ORE ("emerald_ore", -1),
    GOLD_ORE ("gold_ore", -1),
    IRON_ORE ("iron_ore", -1),
    LAPIS_ORE ("lapis_ore", -1),
    REDSTONE_ORE ("redstone_ore", -1);
	
	
    private String name;
    private int blockRecipeDataOrdinal;

    BlockDataOreNetherVanilla(String name, int blockRecipeDataOrdinal) {

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

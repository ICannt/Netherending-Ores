package org.icannt.netherendingores.common.block.data;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 28/01/19.
 */
public enum BlockDataOreNetherModded2 implements IStringSerializable {
	
	
    ZINC_ORE ("zinc_ore", -1),
    RUBY_ORE ("ruby_ore", -1),
    SAPPHIRE_ORE ("sapphire_ore", -1),
    PERIDOT_ORE ("peridot_ore", -1),
    ELECTROTINE_ORE ("electrotine_ore", -1),
    AMBROSIUM_ORE ("ambrosium_ore", -1),
    GRAVITITE_ORE ("gravitite_ore", -1),
    ZANITE_ORE ("zanite_ore", -1),
    ARKENIUM_ORE ("arkenium_ore", -1),
    ICESTONE_ORE ("icestone_ore", -1);


    private String name;
    private int blockRecipeDataOrdinal;

    BlockDataOreNetherModded2(String name, int blockRecipeDataOrdinal) {

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

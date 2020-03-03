package org.icannt.netherendingores.common.block.data;

import org.icannt.netherendingores.common.registry.BlockRecipeData;

public class CacheBlockRecipeDataOrdinals {

	public static void cacheOrdinals() {
				
    	for (BlockRecipeData blockData : BlockRecipeData.values()) {
    		switch (blockData.getBlockName()) {
    			 case "ore_end_modded_1": BlockDataOreEndModded1.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal()); break;
    			 case "ore_end_modded_2": BlockDataOreEndModded2.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal()); break;
    			 case "ore_end_vanilla": BlockDataOreEndVanilla.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal()); break;
    			 case "ore_nether_modded_1": BlockDataOreNetherModded1.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal()); break;
    			 case "ore_nether_modded_2": BlockDataOreNetherModded2.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal()); break;
    			 case "ore_nether_vanilla": BlockDataOreNetherVanilla.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal()); break;
    			 case "ore_other_1": BlockDataOreOther1.values()[blockData.getBlockMeta()].setBlockRecipeDataOrdinal(blockData.ordinal());
    		}
    	}
    	
	}

}

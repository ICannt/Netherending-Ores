package org.icannt.netherendingores.common.registry;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 04/02/19.
 */
public enum OreDictionaryOtherData implements IStringSerializable {
	
	
    COAL ("coal", "minecraft", "coal_ore", 0, "Minecraft", "Coal", " Improves mod compatibility.", false, true),
    GEM_AMBROSIUM_LEGACY ("gemAmbrosium", "aether_legacy", "ambrosium_shard", 0, "The Aether", "Ambrosium Shard (Legacy)", "", false, true),
    GEM_AMBROSIUM ("gemAmbrosium", "aether", "ambrosium_shard", 0, "Aether II", "Ambrosium Shard", "", false, true),
    GEM_ZANITE ("gemZanite", "aether", "zanite_gemstone", 0, "Aether II", "Zanite Gemstone", " Already registered for The Aether.", false, true),
    INGOT_ARKENIUM ("ingotArkenium", "aether", "arkenium", 0, "Aether II", "Arkenium Plate", " Aether II only item.", false, true),
    GEM_ICESTONE ("gemIcestone", "aether", "icestone", 0, "Aether II", "Icestone", " Aether II only item.", false, true),
    ORE_AMBROSIUM ("oreAmbrosium", "aether", "ambrosium_ore", 0, "Aether II", "Ambrosium Ore", " Already registered for The Aether.", false, true),
    ORE_GRAVITITE ("oreGravitite", "aether", "gravitite_ore", 0, "Aether II", "Gravitite Ore", " Already registered for The Aether.", false, true),
    ORE_ZANITE ("oreZanite", "aether", "zanite_ore", 0, "Aether II", "Zanite Ore", " Already registered for The Aether.", false, true),
    ORE_ARKENIUM ("oreArkenium", "aether", "arkenium_ore", 0, "Aether II", "Arkenium Ore", " Aether II only ore.", false, true),
    ORE_ICESTONE ("oreIcestone", "aether", "icestone_ore", 0, "Aether II", "Icestone Ore", " Aether II only ore.", false, true),
    ORE_DILITHIUM ("oreDilithium", "matteroverdrive", "dilithium_ore", 0, "Matter Overdrive: Legacy Edition", "Dilithium Ore", "", false, true),
    ORE_TRITANIUM ("oreTritanium", "matteroverdrive", "tritanium_ore", 0, "Matter Overdrive: Legacy Edition", "Tritanium Ore", "", false, true);

	
    private String name;
    private String modCodeName;
    private String modItemCodeName;
    private int meta;
    private String modDescName;
    private String modItemDescName;
    private String configExtraDesc;
    private boolean enabled;
    private boolean defaultSetting;

    OreDictionaryOtherData(String name, String modCodeName, String modItemCodeName, int meta, String modDescName, String modItemDescName, String configExtraDesc, boolean enabled, boolean defaultSetting) {

    	this.name = name;
    	this.modCodeName = modCodeName;
    	this.modItemCodeName = modItemCodeName;
    	this.meta = meta;
    	this.modDescName = modDescName;
    	this.modItemDescName = modItemDescName;
    	this.configExtraDesc = configExtraDesc;
    	this.enabled = enabled;
    	this.defaultSetting = defaultSetting;
        
    }
    
    @Override
    public String getName() {
        return name;
    }

    public String getModCodeName() {
        return modCodeName;
    }
    
    public String getModItemCodeName() {
        return modItemCodeName;
    }
    
    public int getMeta() {
        return meta;
    }
    
    public String getModDescName() {
        return modDescName;
    }

    public String getModItemDescName() {
        return modItemDescName;
    }
    
    public String getConfigExtraDesc() {
        return configExtraDesc;
    }

    public boolean getEnabled() {
    	return enabled;
    }
    
    public boolean setEnabled(boolean toggle) {
    	return this.enabled = toggle;
    }
    
    public boolean getDefaultSetting() {
    	return defaultSetting;
    }
    
}

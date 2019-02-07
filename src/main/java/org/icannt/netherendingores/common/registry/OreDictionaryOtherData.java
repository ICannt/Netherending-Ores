package org.icannt.netherendingores.common.registry;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ICannt on 04/02/19.
 */
public enum OreDictionaryOtherData implements IStringSerializable {
	
	
    CRYSTAL_CHARGED_CERTUS_QUARTZ ("crystalChargedCertusQuartz", "appliedenergistics2", "material", 1, "Applied Energistics 2", "Charged Certus Quartz", false, true),
    ORE_DILITHIUM ("oreDilithium", "matteroverdrive", "dilithium_ore", 0, "Matter Overdrive: Legacy Edition", "Dilithium Ore", false, false),
    ORE_TRITANIUM ("oreTritanium", "matteroverdrive", "tritanium_ore", 0, "Matter Overdrive: Legacy Edition", "Tritanium Ore", false, false);

	
    private String name;
    private String modCodeName;
    private String modItemCodeName;
    private int meta;
    private String modDescName;
    private String modItemDescName;
    private boolean enabled;
    private boolean defaultSetting;
    
    OreDictionaryOtherData(String name, String modCodeName, String modItemCodeName, int meta, String modDescName, String modItemDescName, boolean enabled, boolean defaultSetting) {

    	this.name = name;
    	this.modCodeName = modCodeName;
    	this.modItemCodeName = modItemCodeName;
    	this.meta = meta;
    	this.modDescName = modDescName;
    	this.modItemDescName = modItemDescName;
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

package org.icannt.netherendingores.lib;

/**
 * Created by ICannt on 06/05/18.
 */

public class Info {

    public static final String MOD_ID = "netherendingores";
    public static final String MOD_NAME = "Netherending Ores";
    
    public static final String VERSION = "1.12.2-1.4.2";
    public static final String MC_VERSIONS = "[1.12.2,1.13)";
    public static final String CFG_VERSION = "1.2.1";
    
    private static final String FORGE_VERSION = "14.23.5.2847";
    private static final String MANTLE_VERSION = "1.12-1.3.1";
    private static final String TIC_VERSION = "1.12.2-2.9.1";
    private static final String MEK_VERSION = "1.12.2-9.4.13.349";
    
    public static final String DEPENDENCIES = ""
			+"required-after:forge@["+FORGE_VERSION+",);"
			+"after:mantle@["+MANTLE_VERSION+",);"
			+"after:tconstruct@["+TIC_VERSION+",);"
			+"after:plustic;"
			+"after:appliedenergistics2;"
			+"after:mekanism@["+MEK_VERSION+",);"
			+"after:matteroverdrive;"
			+"after:bigreactors;"
			+"after:immersiveengineering;"
			+"after:waila;"
			+"after:wawla;"
			+"after:aether;"
			+"after:aether_legacy;"
			+"after:projectred-exploration;"
			;
    
    public static final String CLIENT_PROXY_CLASS = "org.icannt.netherendingores.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "org.icannt.netherendingores.proxy.ServerProxy";
    
    public static final String INTEGRATION_LOADER_CLASS = "org.icannt.netherendingores.integration.IntegrationLoader";
    
    public static final String TINKER_RECIPE_CLASS = "slimeknights.tconstruct.library.TinkerRegistry";
    
}

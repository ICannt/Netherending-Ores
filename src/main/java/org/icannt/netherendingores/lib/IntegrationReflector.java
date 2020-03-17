package org.icannt.netherendingores.lib;

import org.icannt.netherendingores.proxy.IntegrationProxy;

public class IntegrationReflector {

	public static IntegrationProxy integration = new IntegrationProxy();

	public IntegrationReflector() {
		
		try {
			Class<?> clazz = Class.forName("org.icannt.netherendingores.integration.IntegrationLoader");
			Object integrationClass = clazz.newInstance();
			integration = (IntegrationProxy) integrationClass;
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
		}
		
	}

}

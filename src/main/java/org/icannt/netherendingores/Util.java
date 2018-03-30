package org.icannt.netherendingores;

import com.google.common.base.CaseFormat;

public class Util {
	public static String LowerUnder(String input)
	{
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}
}

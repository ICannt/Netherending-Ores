package org.icannt.netherendingores.lib;

import org.apache.commons.lang3.text.WordUtils;

import com.google.common.base.CaseFormat;

/**
 * Created by ICannt on 28/05/18.
 */

public class StringUtil {

	//
	public static String lowerUnder(String input)
	{
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}

	//
	public static String colonUnder(String input)
	{
		return input.replace(":", "_");
	}

	//
	public static String spaceCapital(String input) {
		return WordUtils.capitalize(input.replace("_", " "));
	}

	//
	public static String upperCamel(String input)
	{
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, input);
	}

}

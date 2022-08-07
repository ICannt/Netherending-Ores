package org.icannt.netherendingores.lib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.icannt.netherendingores.NetherendingOres;

/**
 * Created by ICannt on -.
 */

public class NeoLog {

    public static final Logger NLOG = LogManager.getLogger(NetherendingOres.MOD_NAME);

	public static void always(String msg) {
		NLOG.always().log(msg);
	}

	public static void trace(String msg) {
		NLOG.trace(msg);
	}

	public static void debug(String msg) {
		NLOG.debug(msg);
	}

	public static void info(String msg) {
		NLOG.info(msg);
	}

	public static void warn(String msg) {
		NLOG.warn(msg);
	}

	public static void error(String msg) {
		NLOG.error(msg);
	}

	public static void error(String msg, Exception e1) {
		NLOG.error(msg, e1);
	}

	public static void fatal(String msg) {
		NLOG.fatal(msg);
	}

	public static void exception(String msg, Throwable t) {
		NLOG.error(msg, t);
	}

}
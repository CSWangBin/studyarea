package com.gzzy.studyarea.logs;

import java.io.IOException;

public class LogUtil {
	public static void initLogger() throws SecurityException, IOException {
		java.util.logging.LogManager.getLogManager().readConfiguration(
				Thread.currentThread().getContextClassLoader()
						.getResourceAsStream("jdk-log.properties"));

	}
}

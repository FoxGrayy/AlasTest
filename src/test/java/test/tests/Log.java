package test.tests;

import org.apache.logging.log4j.*;
import org.testng.ITestResult;

public class Log {

	// Initialize Log4j logs
	private static Logger log = LogManager.getLogger(Log.class.getName());

	public static void main(String[] srgs) {

		log.info("$$$$$$$$$$$$$$$$$$$$$    INFO    ");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		log.debug("debug");

	}

	/*public static void startTestCase(ITestResult result) {
		log.info("$$$$$$$$$$$$$$$$$$$$$     " + "START" + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		log.info(result.getMethod().getMethodName() + " Started ");
		log.info(result.getMethod().getDescription());

	}*/

	/*public static void endTestCase(ITestResult result) {
		log.info(result.getMethod().getMethodName() + " Finished ");
		log.info(result.getMethod().getDescription());
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

	}*/

	public static void info(String message) {

		log.info(message);

	}

	public static void warn(String message) {

		log.warn(message);

	}

	public static void error(String message) {

		log.error(message);

	}

	public static void fatal(String message) {

		log.fatal(message);

	}

	public static void debug(String message) {

		log.debug(message);

	}
}

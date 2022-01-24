package TestsLog;

import org.apache.logging.log4j.*;

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
	// This is to print log for the beginning of the test case, as we usually run so
	// many test cases as a test suite

	public static void startTestCase(String sTestCaseName) {

		log.info("$$$$$$$$$$$$$$$$$$$$$     " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

	}

	// This is to print log for the ending of the test case

	public static void endTestCase(String sTestCaseName) {

		log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

	}

	// Need to create these methods, so that they can be called

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

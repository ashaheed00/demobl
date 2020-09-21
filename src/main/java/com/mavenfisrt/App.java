package com.mavenfisrt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOG = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		String message = "Hello World!";

		LOG.debug(message + " wil be printed on Debug");
		LOG.info(message + " wil be printed on Info");
		LOG.warn(message + " wil be printed on Warn");
		LOG.error(message + " wil be printed on Error");
		LOG.fatal(message + " wil be printed on Fatal");
		LOG.info("Appending String: {}.", message);
<<<<<<< HEAD
		System.out.println("Hello World! good morning!");
=======
		System.out.println("Hello World! Good Morning Again!");
>>>>>>> e5f14b00743ecabf582303ec33a411e0e84d55ea
	}
}

//A Logger that is directly linked to the root LoggerConfig can be obtained as follows:
//
//Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
//Alternatively, and more simply:
//
//Logger logger = LogManager.getRootLogger();

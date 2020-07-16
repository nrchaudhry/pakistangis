package pakistanGIS.main;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Used to configure logging. This code could go anywhere really but this seems like a good place.
 * 
 * @author Nick Malleson
 * 
 */
abstract class PakistanGISLogging {
	// Make sure this is only initialised once
	private static boolean initialised = false;
	
	// Creates a file handler that outputs everything and add's it to the root logger.
	public static void init() {
		if (PakistanGISLogging.initialised) {
			return;
		}
		else {
			PakistanGISLogging.initialised = true;
		}
		
		try {

			// Get the logger for repast stuff to log everything
			Logger relogger = Logger.getLogger("pakistanGIS");
			relogger.setLevel(Level.ALL);
//			Logger logger = Logger.getLogger("pakistanGIS");
			
			// Also log info from other packages
//			Logger logger2 = Logger.getLogger("");

			// Create a file handler
			File logFile = new File("model_log.txt");
			if (logFile.exists())
				logFile.delete(); // Delete an old log file
			FileHandler fileHandler = new FileHandler(logFile.getAbsolutePath());
			fileHandler.setLevel(Level.ALL); // Write everything to the file
			fileHandler.setFormatter(new SimpleFormatter());

			// Add the handlers to the logger
			relogger.addHandler(fileHandler);
//			logger2.addHandler(fileHandler);

		} catch (Exception e) {
			System.err.println("Problem creating loggers, cannot continue (exit with -1).");
			System.exit(-1);
		}

	}
}

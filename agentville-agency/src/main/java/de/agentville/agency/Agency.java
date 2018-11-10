package de.agentville.agency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.agentville.agency.gui.AgencyGUI;
import de.agentville.agency.PropertiesManager;
import javafx.application.Application;

/**
 * Preloader:
 * https://docs.oracle.com/javase/8/docs/technotes/guides/deploy/preloaders.html
 */
public class Agency {
	
	// Define a static logger variable so that it references the
	 // Logger instance named "Agency".
	private static final Logger logger = LogManager.getLogger(Agency.class);	
	
    public static void main( String[] args ) {
    	
    	logger.trace("loading properties");
    	
    	PropertiesManager propertiesManager = new PropertiesManager();
    	
    	logger.trace("Entering application.");

    	AgencyGUI agencyfx = new AgencyGUI();
    	Application.launch(AgencyGUI.class, args);
		
    	logger.trace("Exiting application.");
    }
}


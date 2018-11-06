package de.agentville.agency;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import de.agentville.agency.gui.AgencyGUI;
import de.agentville.agency.gui.AgencyGUI;
import javafx.application.Application;

/**
 * 
 *
 */
public class Agency {
	
	// Define a static logger variable so that it references the
	 // Logger instance named "Agency".
	private static final Logger logger = LogManager.getLogger(Agency.class);	
	
    public static void main( String[] args ) {
    	
    	// Set up a simple configuration that logs on the console.
    	 logger.trace("Entering application.");
    	 boolean bar = true;
    	 if (!bar) {
    		 logger.error("false");
    	 } else {
    		 logger.error("true");
    	 }
    	 logger.trace("Exiting application.");

        System.out.println( "Hello World!" );
        
    	AgencyGUI agencyfx = new AgencyGUI();
    	Application.launch(AgencyGUI.class, args);

//    	AgencyGUI gui = new AgencyGUI();
//		gui.setBounds(10, 10, 800, 600);
//		gui.setLocationRelativeTo(null);
//		gui.setVisible(true);
		
    }
}


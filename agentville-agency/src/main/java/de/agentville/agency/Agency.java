package de.agentville.agency;

import de.agentville.agency.gui.AgencyFX;
import de.agentville.agency.gui.AgencyGUI;
import javafx.application.Application;

/**
 * Hello world!
 *
 */
public class Agency 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    	AgencyFX agencyfx = new AgencyFX();
    	Application.launch(AgencyFX.class, args);

    	AgencyGUI gui = new AgencyGUI();
		gui.setBounds(10, 10, 420, 680);
		gui.setLocationRelativeTo(null);
		gui.setVisible(true);
		
    }
}


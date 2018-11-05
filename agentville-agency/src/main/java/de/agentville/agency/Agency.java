package de.agentville.agency;

import de.agentville.agency.gui.AgencyGUI;

/**
 * Hello world!
 *
 */
public class Agency 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AgencyGUI gui = new AgencyGUI();
		gui.setBounds(10, 10, 420, 680);
//		gui.show();
		
//		gui.setSize(680, 575);
//		gui.setLocation(320, 160);
		gui.setVisible(true);
		
    }
}


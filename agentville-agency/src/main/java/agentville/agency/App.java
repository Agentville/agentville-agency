package agentville.agency;

import agentville.agency.gui.AppWindow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AppWindow gui = new AppWindow();
		gui.setBounds(10, 10, 420, 680);
//		gui.show();
		
//		gui.setSize(680, 575);
//		gui.setLocation(320, 160);
		gui.setVisible(true);
		
    }
}

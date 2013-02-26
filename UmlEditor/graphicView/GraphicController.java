package graphicView;

import java.awt.Dimension;
import javax.swing.*;


/**
 * GraphicController is the startup class and controller for 
 * the java swing version of our UML Editor.
 * It owns the graphical user interface.
 * @author Martin Z., David A., Travis R., Logan P. 
 */
public class GraphicController 
{
	private static GraphicController sharedApp;
	private GraphicUI ui;
	private JFrame theFrame;
	private static Dimension frameSize = new Dimension(500,500);
	
	/**
	 * Constructs the object, creating the model and view (with the
	 * frame and user interface)
	 */
    private GraphicController() 
    {
   	    //Set the look and feel (for Macs too).
		if (System.getProperty("mrj.version") != null) {
			System.setProperty("apple.laf.useScreenMenuBar","true");
		}
        JFrame.setDefaultLookAndFeelDecorated(true);

        theFrame = new JFrame("A J-Panel");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        theFrame.setPreferredSize(frameSize);

        ui = new GraphicUI(this, theFrame);
        
        theFrame.pack();
        theFrame.setVisible(true);
    }

    
    /**
     * Returns the graphical user interface
     * @return the graphcial user interface
     */
    public GraphicUI graphicalInterface ( ) {
    	return ui;
    }
    
    /**
     * creates (if necessary) and returns the singleton instance
     * @return the singleton shared instance
     */
    public static GraphicController sharedInstance() {
    	if (sharedApp == null) {
            sharedApp = new GraphicController();
    	}
    	return sharedApp;
    }
    
	/**
     * Creates the runnable job that runs the graphical interface
     * @param args are not used
     */
	public static void main(String[] args) {
         javax.swing.SwingUtilities.invokeLater(
        	new Runnable() {
            	public void run() {
            		sharedInstance();
            	}
        	}
        );
    }
}

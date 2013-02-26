package graphicView;  

import java.awt.event.*;
import javax.swing.*;


/**
 * GraphicUI is the swing implementation of the user interface.
 * It manages the menu and ClassBoxes
 * It listens for various events.
 * @author @author Martin Z., David A., Travis R., Logan P.  
 */

public class GraphicUI extends JPanel implements MouseListener, ActionListener, MouseMotionListener 
{
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private GraphicController controller; 
	private LayoutPanel layoutPanel; 
	
	private static final String newClassBoxItem = "Class Box";
	
	
	/*Constructor
	 * 
	 * 
	 */
	public GraphicUI(GraphicController aController, JFrame aFrame) 
	{
		frame = aFrame;
		controller = aController;
		layoutPanel = new LayoutPanel(frame); 
		createMenu(frame);
	}


	/**
	 * Creates all parts of the menu for the application.
	 * @param frame the enclosing frame for the interface
	 */
	private void createMenu(JFrame frame) {
		// create a menu bar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
				
		// create the File Item on the menu bar
		JMenu fileMenu = new JMenu("File"); 
		menuBar.add(fileMenu);
		
		// create the edit Item on the menu bar
		JMenu newMenu = new JMenu("New");
		menuBar.add(newMenu);
		
		// create the New Class box and listen for it 
		JMenuItem newClassBox = new JMenuItem(newClassBoxItem);
		newClassBox.addActionListener(this);
		newMenu.add(newClassBox);
	}
	
	
	/**
	 * Prints the message in the output field.
	 * @param theMessage message to be printed
	 */
	public void printMessage(String theMessage) 
	{
		
		System.out.print(theMessage + " \n");
	}
	
	
	public void mouseMoved(MouseEvent e)
	{
		printMessage("X coord: " + e.getX() + " Y coord: " + e.getY());
	}
	
	/**
	 * Handles the mouse entered event by printing a message.
	 * @param me the mouse event containing location and modifier keys
	 */
	public void mouseEntered(MouseEvent e) 
	{
		printMessage("Mouse entered");
	}

	/**
	 * Handles the mouse exited event by printing a message.
	 * @param me the mouse event containing location and modifier keys
	 */
	 public void mouseExited(MouseEvent e) 
	 {
		 printMessage("Mouse exited");
	 }

	 
	/**
	 * Handles the mouse click event by printing the number of clicks.
	 * @param me the mouse event containing location and modifier keys
	 */
	public void mouseClicked(MouseEvent me) 
	{
		printMessage("Mouse clicked (# of clicks: " + me.getClickCount() + ")");	
	}
	
	
	/**
	 * Handles the mouse down event by printing a message..
	 * @param me the mouse event containing location and modifier keys
	 */
	public void mousePressed(MouseEvent me) 
	{
		printMessage("MouseDown")	;
	}
	
	
	/**
	 * Handles the mouse up event by printing a message.
     * @param me the mouse event containing location and modifier keys
     */
	public void mouseReleased(MouseEvent me) 
	{
		printMessage("MouseUp");	
	}
	
	
	/**
	 * Perform actions depending which widget was selected.
	 * Determines which sort of widget was selected and bases action on its name.
	 * Currently has actions for the find word button and the open puzzle menu.
	 * @param se the selection event including the source of the event
	 */
	public void actionPerformed(ActionEvent se) 
	{
		String command = se.getActionCommand();
		if(command == newClassBoxItem)
		{	
			layoutPanel.createClassBox();  
			
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
}

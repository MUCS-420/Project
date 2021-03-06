package graphicView;  

import Controller.*;
import Model.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;


/**
 * GraphicUI is the swing implementation of the user interface.
 * It manages the menu and ClassBoxes
 * It listens for various events.
 * @author Martin Z., David A., Travis R., Logan P.  
 */

public class GraphicUI extends JPanel implements MouseListener, ActionListener, MouseMotionListener 
{
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private GraphicController controller; //Have not yet implemented this yet but we will in future iterations
	private LayoutPanel layoutPanel; 
	
	private static final String newClassBoxItem = "Class Box";
	
	
	/*Constructor
	 * 
	 * 
	 */
	public GraphicUI(GraphicController aController, JFrame aFrame) 
	{
		frame = aFrame;
		//controller = aController;
		layoutPanel = new LayoutPanel(frame); 
		createMenu(frame);
	}

	public void updateBoxes(Vector<ClassBox> classBoxes)
	{
		
	}
	
	// This Creates all parts of the menu for the application.
	private void createMenu(JFrame frame) 
	{
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
	
	
	// This prints out the message to the console. 
	public void printMessage(String theMessage) 
	{
		
		System.out.print(theMessage + " \n");
	}
	
	//This tells us when the mouse moved and gives us the coordinates
	public void mouseMoved(MouseEvent e)
	{
		printMessage("X coord: " + e.getX() + " Y coord: " + e.getY());
	}
	
	
	//Handles the mouse entered event by printing a message.
	public void mouseEntered(MouseEvent e) 
	{
		printMessage("Mouse entered");
	}

	 //Handles the mouse exited event by printing a message.
	 public void mouseExited(MouseEvent e) 
	 {
		 printMessage("Mouse exited");
	 }

	 

	//Handles the mouse click event by printing the number of clicks.
	public void mouseClicked(MouseEvent me) 
	{
		printMessage("Mouse clicked (# of clicks: " + me.getClickCount() + ")");	
	}
	
	

	//Handles the mouse down event by printing a message..
	public void mousePressed(MouseEvent me) 
	{
		printMessage("MouseDown")	;
	}
	
	

	//Handles the mouse up event by printing a message.
	public void mouseReleased(MouseEvent me) 
	{
		printMessage("MouseUp");	
	}
	
	

	//This function will tell us what menu button way pressed 
	public void actionPerformed(ActionEvent se) 
	{
		String command = se.getActionCommand();
		if(command == newClassBoxItem)
		{	
			layoutPanel.createClassBox(); 
		}
	}

	@Override
	//This method will be used to detect mouseDragged Events
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
}

package graphicView;
import Model.ClassBox;  
import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//import model.FileHandler;


/**
 * GraphicUI is the swing implementation of the user interface.
 * It manages the menu, puzzle picture, text fields, and button.
 * It listens for various events.
 * @author David Hutchens - modified from Beth Katz's SWT code  
 */

public class GraphicUI extends JPanel
		implements MouseListener, ActionListener, MouseMotionListener {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private GraphicController controller;
	//private JTextField inputField;
	private JTextArea theOutputMessage;
	private static int LetterSize = 20;
	private static int borderSize = 15;
	private static int MaxDrawingWidth = 10000;
	private static int MinDrawingWidth = 300;
	
	private static final String newClassBoxItem = "Class Box";
	
	
	/**
	 * Constructor for GraphicUI uses the single Display object
	 * which has a single Shell (window) inside (it could have more),
	 * and puts some things inside the shell
	 */
	public GraphicUI(GraphicController aController, JFrame aFrame) 
	{
		frame = aFrame;
		controller = aController;
	   	
		JLayeredPane mainPane = new JLayeredPane();

		frame.getContentPane().add(mainPane);
		
		JPanel layoutPanel = setupLayoutPanel(); 
		JPanel toolbarPanel = setupToolbarPanel(); 
		mainPane.add(layoutPanel);
		mainPane.add(toolbarPanel);

		
	   	createMenu(frame);
	   	layoutPanel.addMouseListener(this);
	   	layoutPanel.addMouseMotionListener(this);
	}
	
	
	private JPanel setupToolbarPanel()
	{
		JPanel toolbarPanel = new JPanel(); 
		
		return toolbarPanel; 
	}
	
	
	private JPanel setupLayoutPanel()
	{
		JPanel layoutFrame = new JPanel();
		layoutFrame.setLocation(256, 26);
		layoutFrame.setBounds(500,500,500,500);
		layoutFrame.setBackground(Color.GREEN);
		
		return layoutFrame;
	}
	
	
	/**
	 * Draws the painted portions when requested.
	 * @param Graphics gc the graphics context in which to draw 
	 */
	public void paintComponent(Graphics gc) 
	{ 
		
		if (isOpaque()) //paints background
		{ 
            gc.setColor(getBackground());
            gc.fillRect(0, 0, getWidth(), getHeight());
		}
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
	 * Creates the text items including places to enter text and labels.
	 * Labels cannot be changed by the user.
	 * Text can be changed by the user unless it's not editable.
	 * @param widgetPanel is the JPanel that will hold the text items.
	 */
	private void createTextItems(JPanel widgetPanel) {
		//widgetPanel.add(Box.createRigidArea(new Dimension(100,150)));
		
//		JPanel panel = new JPanel();
//		panel.setAlignmentX(CENTER_ALIGNMENT);
//		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
//		widgetPanel.add(panel);
		
//		JLabel inputLabel = new JLabel();
//		panel.add(inputLabel);
//		inputLabel.setText("Enter a word to find:");
//		inputLabel.setAlignmentX(RIGHT_ALIGNMENT);
		
		/*
		inputField = new JTextField();
		panel.add(inputField);
		inputField.setText("");
		inputField.setEditable(true);
		inputField.setMaximumSize(new Dimension(MaxDrawingWidth,30));
		inputField.addActionListener(this);
		*/
		
		//widgetPanel.add(Box.createRigidArea(new Dimension(100,50)));

	
//		theOutputMessage = new JTextArea();
//		JScrollPane scrollPane = new JScrollPane(theOutputMessage);
//		widgetPanel.add(scrollPane);
//		theOutputMessage.setEditable(false);
//		theOutputMessage.setText("Open a Puzzle to Start");
//		scrollPane.setMinimumSize(new Dimension(MinDrawingWidth,30));
//		scrollPane.setPreferredSize(new Dimension(MinDrawingWidth,100));
	}
	
	/**
	 * Creates the button to look up a word.
	 * @param widgetPanel is the JPanel that will hold the button.
	 */
	private void createButton(JPanel widgetPanel) 
	{
		/*
		JButton findButton = new JButton(findButtonText);
		findButton.addActionListener(this);
		widgetPanel.add(findButton);
		findButton.setAlignmentX(CENTER_ALIGNMENT);
		*/
	}
	
	/**
	 * Prints the message in the output field.
	 * @param theMessage message to be printed
	 */
	public void printMessage(String theMessage) 
	{
		//theOutputMessage.setText(theMessage);
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
		
		/*if (se.getSource() == inputField) {
			findWord();
		} else {
			String command = se.getActionCommand();
			if (command == findButtonText) {
				findWord();
			} else if (command == saveMenuText) {
				printMessage("That was a save puzzle request");
			} else {
				printMessage("Unknown action: " + command);
			}
		}
		*/
	}
	
	/**
	 * Opens a file dialog using the provided message and 
	 * obtains the full name of a file.
	 * @param message the prompt in the file dialog box
	 * @return full path name of the file name
	 */
	public String obtainFileName(String message) {
		String theFileName = null;
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
	           File file = fc.getSelectedFile();
	           try {
	        	   theFileName = file.getCanonicalPath();
	           } catch (Exception e) {
	        	   printMessage("Unable to determine file path.");
	        	   theFileName = null;
	           }
		}
  		return (theFileName);
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
}

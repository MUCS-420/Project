package Model;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 * This class will keep track of each individual class box 
 * that the user creates.
* @author Martin Z., David A., Travis R., Logan P.
*/

public class ClassBox implements MouseListener, ActionListener, MouseMotionListener
{
	private String classTitle; 
	private JPanel theBox;
	private boolean added; 
	//This is the constructor for the classBox. 
	public ClassBox() 
	{
		theBox = new JPanel();
		
		theBox.setLocation(256, 26);
		theBox.setPreferredSize(new Dimension(100,100));
		theBox.setBackground(Color.LIGHT_GRAY);
		theBox.setVisible(true);
	
		added = false; 
		
		theBox.addMouseListener(this);
	   	theBox.addMouseMotionListener(this); 
		//classTitle = name; 
	}

	//This returns the main JPanel
	public JPanel getPanel()
	{	
		return(this.theBox);
	}


	//This tells us when the mouse is clicked.
	//We aren't using this on the current iteration but will in future iterations. 
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	//This tells us when the mouse entered the class box.
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		System.out.print("Entered the class box " + this.classTitle +"\n");
	}

	//This tells us when the mouse exited the class box.
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		System.out.print("Exited the class box " + this.classTitle +"\n");
	}

	//This tells us when the mouse is pressed.
	//We aren't using this on the current iteration but will in future iterations.
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	//This tells us when the mouse is released.
	//We aren't using this on the current iteration but will in future iterations.
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//We aren't using this on the current iteration but will in future iterations.
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//We aren't using this on the current iteration but will in future iterations.
	public void mouseDragged(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//We aren't using this on the current iteration but will in future iterations.
	public void mouseMoved(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	
	
	 
}
package Model;
import java.awt.Color;
import java.awt.Graphics; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ClassBox implements MouseListener, ActionListener, MouseMotionListener
{
	private String classTitle; 
	private String classMethods;
	private JPanel theBox; 
	private int size; 
	

	public ClassBox() 
	{
		theBox = new JPanel();
		
		theBox.setLocation(256, 26);
		theBox.setBounds(500,500,500,500);
		theBox.setBackground(Color.BLUE);
		theBox.setVisible(true);
		 
		
		theBox.addMouseListener(this);
	   	theBox.addMouseMotionListener(this);
		//size = size_in; 
		//classTitle = title; 

	}
	
	public void hideBox()
	{
		this.theBox.setVisible(false);
	}
	
	public JPanel getPanel()
	{	
		return(this.theBox);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.print("Entered the class box \n");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.print("Exited the class box \n");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	 
}
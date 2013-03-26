package graphicView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.*;

import Model.ClassBox;

/**
 * Layout panel is the main area for drawing class boxes.
 * It has a vector that keeps track of all of the class boxes. 
 * It listens for various events.
 * @author Martin Z., David A., Travis R., Logan P.  
 */
public class LayoutPanel implements MouseListener, ActionListener, MouseMotionListener
{

	private JPanel layoutPanel; 
	//private JPanel toolbarPanel; Not for this iteration 
	private JFrame theFrame; 
	private Vector<ClassBox> classBoxVector; 

	public LayoutPanel(JFrame aFrame)
	{
		theFrame = aFrame;
		layoutPanel = setupLayoutPanel(); 
		//toolbarPanel = setupToolbarPanel(); 
		
		//thePanel.add(toolbarPanel);
		theFrame.getContentPane().add(layoutPanel, BorderLayout.CENTER); //add the panel to the JFrame
		
		classBoxVector = new Vector<ClassBox>();

		layoutPanel.addMouseListener(this);
	   	layoutPanel.addMouseMotionListener(this);
	   	
	}
	
	/*
	 * Unimplemented for this iteration. It's possible we may on subsequent iterations.
	private JPanel setupToolbarPanel()
	{
		JPanel toolbarPanel = new JPanel(); 
		
		return toolbarPanel; 
	}
	*/
	
	//This sets up and returns the main layout JPanel
	private JPanel setupLayoutPanel()
	{
		layoutPanel = new JPanel();
		//System.out.print(theFrame.getPreferredSize());
		layoutPanel.setPreferredSize(theFrame.getPreferredSize());
		layoutPanel.setBackground(Color.WHITE);
		
		return layoutPanel;
	}
	
	//This creates a class box and adds it to the classBox Vector
	public void createClassBox()
	{	
		//ClassBox theBox = new ClassBox(Integer.toString(this.classBoxVector.size() + 1));
		ClassBox theBox = new ClassBox();
		addToLayoutPanel(theBox);
		
		this.classBoxVector.add(theBox);
	}
	
	//This returns the vector of class boxes. 
	public Vector<ClassBox> getClassBoxes()
	{
		return this.classBoxVector; 	
	}
	
	//This displays the class box in the layoutpanel 
	private void addToLayoutPanel(ClassBox theBox)
	{
		this.layoutPanel.add(theBox.getPanel());
		this.layoutPanel.revalidate(); 
	}

	@Override
	//Not implemented in this iteration
	public void mouseClicked(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//Not implemented in this iteration
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.print("Entered the layoutPanel \n");
	}

	@Override
	//Not implemented in this iteration
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.print("Exited the layoutPanel \n");
		
	}

	@Override
	//Not implemented in this iteration
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//Not implemented in this iteration
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//Not implemented in this iteration
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//Not implemented in this iteration
	public void mouseDragged(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	//Not implemented in this iteration
	public void mouseMoved(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}

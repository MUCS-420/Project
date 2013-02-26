package consoleView;

import java.io.IOException;
//import model.FileHandler;



/*
 * Created on Mar 31, 2005
 * Modified January 24, 2006
 */

/**
 * @author Martin Z., David A., Travis R., Logan P.   
  * 
 */
public class ConsoleController 
{
	
    private ConsoleUI theUI;

	
    /**
     * Constructor for WordSearch class.
     * Prompts for and reads puzzle
     */
    public ConsoleController( ) throws IOException 
    {
    	theUI = new ConsoleUI( );
    	
   
    }
   
    /*
    public void run ( ) {
    	theUI.printPuzzle();
    	theUI.findWords();
    }
	*/
    
	public static void main(String[] args) {
        ConsoleController p = null;
        
        try {
            p = new ConsoleController();
        } catch( IOException e ) {
            System.out.println( "IO Error: " );
            e.printStackTrace( );
            return;
        }
        //p.run( );

   	}

}

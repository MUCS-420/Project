package consoleView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Created on January 23, 2006
 */

/**
 * @author 
 * The TextView class prints puzzles and answers in the console 
 */

public class ConsoleUI 
{



	private BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );

	/**
	 * Constructor for TextView class does nothing
	 */
	public ConsoleUI( )	
	{
	}

	


	/**
	 * prints a message to the console
	 */
	public void printMessage(String theMessage) {
		//System.out.println(theMessage);
	}

	/**
	 * reads a word from the user and returns it
	 */
	/*public String getWord( ) {
		String theWord;

		try {
			System.out.println("Enter word: ");
			theWord = in.readLine( );
			if (theWord == null || (theWord.length() == 1) && (theWord.charAt(0) == '!')) { 
				// workaround for Eclipse EOF
				throw new IOException( );
			}
		} catch (IOException e) {
			return "!";
		}
		return theWord;
	}
	*/

	/**
	 * obtains a file name from the user and returns it
	 */
	public String obtainFileName(String message) {
		String theName;

		try {
			System.out.println(message);
			theName = in.readLine( );
			if (theName.length() == 0) { 
				throw new IOException( );
			}
		} catch (IOException e) {
			return "";
		}
		return theName;
	}


}

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/*  using multiple exceptions in one method  */

/* NB: if you have an exception in the method definition in a class, when you 
 * call the method in the main method, you will an exception handler when calling the method    */
public class Test {

	public void run() throws IOException, ParseException { 
		// throw new IOException();
		
		throw new ParseException("Error in command", 2 );  
	} 
	
	public void input() throws IOException, FileNotFoundException {
		
		
	}
}

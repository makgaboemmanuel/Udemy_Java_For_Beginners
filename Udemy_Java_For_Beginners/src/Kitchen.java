
/*  difference between abstract class and interface: 
 *   a class can extend only one parent class but implement multiple interfaces
 *   you can have a default functionality in the abstract class that is common to all child classes but 
 *   every child class will implement each method in its own way 
 *   abstract classes are a great tool to use when you are starting a class hierarchy 
 *     */

public class Kitchen extends House {

	@Override
	public void whichRoom() {
		System.out.println("This is the Kitchen"); 
		
	}

	@Override
	public void doStuff() {
		System.out.println("Cook Food.");
	}

	@Override
	public void shutdown() {
		System.out.println("Lock the Kitchen");
		
	}

	
}

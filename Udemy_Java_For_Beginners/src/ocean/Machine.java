package ocean;

public class Machine implements Info { 
	/*	forces you to have all of the methods of the class being implemented	*/

	private int id = 7; 
	
	public void start() {
		System.out.println("Machine Started."); 
	}
	
	/* method from the Interface */
	// you can omit the keyword @Override, if you want 
	public void showInfo() {
		System.out.println("Machine id is: " + id); 
	}
}

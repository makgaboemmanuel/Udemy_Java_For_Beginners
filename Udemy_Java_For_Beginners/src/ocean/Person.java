package ocean;

public class Person implements Info { /*  a class can implement many interfaces separated by commas
 									   *  but a class can only extend one parent class                     
 									   */

	private String name; 
	
	public Person(String name) { 
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello there"); 
	}
	
	/* method from the Interface 
	 * */
	// you can also omit the keyword @Override
	public void showInfo() {
		System.out.println("My name is: " + name);
	}
}
			
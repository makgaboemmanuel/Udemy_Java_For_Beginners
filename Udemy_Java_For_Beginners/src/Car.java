
public class Car extends Machine { /*	 this means that class Car is a child of machine 
*  which means Car has all the methods of Machine super class 
*
*/

	/*	own class methods: 	*/
	public void wipeShield() {
		System.out.println("Wiping windshield"); 
	}
	
	/*	you can also overwrite methods from the parent class[NB: method header should be the same], i.e.	*/
	
	@Override /* this checks that the method signature exists in the parent class, if not, it throws an error 
	* provides a good enough check to verify the method exists in parent class 
	*/ 
	public void start() {
		System.out.println("Car started. ");
	}

	public void printTitle() {
		System.out.println("Your title is: " + title);  
	}
	/*  @Override
	public void stop() { 
		System.out.println("Car started. ");
	} */
}

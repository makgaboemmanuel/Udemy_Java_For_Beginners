
/*	access modifiers: 
 * 					  private 
 *  				  protected
 *  				  public */

/*	 you can have as many non-public classes in java		*/

public class Machine {

	private String name = "Machine Type 1"; 
	/* because this variable is private, it can only be accessed via methods from this class
	 * 
	 *  */ 
	protected String title = "Mister"; 
	/*  can accessed even by child classes that extend the parent class  */
	
	/* methods  */
	public void start() {
		System.out.println("Machine started. ");
	}
	
	public void stop() {
		System.out.println("Machine stopped. ");
	}
}

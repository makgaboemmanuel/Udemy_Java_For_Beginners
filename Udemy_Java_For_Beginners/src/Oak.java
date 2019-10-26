
public class Oak extends Plant {
		
	public Oak() {
		
		/* correct: work cause type is public */
		name = "Makgabo";
		/* error: won't work cause type is private */
		 //  type = "Emmanuel";
		
		/*	  protected can be accessed from child classes that extend the parent classes		
		 *    can also be accessed from classes in the same package 
		 * */
		
		
		this.size = "medium"; 
		
		/*	can be accessible because they are in the same package, Oak and Plant 	*/
		this.height = 99;
		
	}
}

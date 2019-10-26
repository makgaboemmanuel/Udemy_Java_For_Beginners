
/* 
 *  private --- only within the same class  
 *  public --- from anywhere
 *  protected --- same class, subclass, and same package
 *  no modifier --- same package only
 *  
 *  public, private and protected does not apply to classes, but applies to instance variables only  
 *  */

/*  you can only have one public class in a class
 *  you can have any number of classes without modifiers with the  
 *   
 *   */

public class Plant {
	/* bad practice because you should hide the instance variables from the public by encapsulating them  */
	public String name; 
	
	/*	good practice	*/
	private  String type; /* you can only access it via this class or via methods within the class  */
	
	/*	 protected: is not public but can be accessed from the main class and child classes 		*/
	protected String size ;
	
	/*	 no access modifier at all: i.e.		*/
	int height; /* this is package level accessibility */
	
	
	public Plant() {
		this.name = "Makgabo";
		this.type = "plant"; 
		
		this.size = "large"; 
		
		this.height = 96; 
	}
}

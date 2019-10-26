
/*   this is an example of an abstract class   */
public abstract class House { /*  when a class is abstract, you can not instantiate an object  */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
	/*   when you declare an abstract method, it must be over 
	 *   written and implemented in all classes that extend the parent class */
	
	public abstract void whichRoom();
	public abstract void doStuff();
	public abstract void shutdown(); /* the last 3 methods including this one work same as methods in the interface */
	
	/* you can reuse abstract methods as shown below */
	public void run() {
		whichRoom();
		doStuff();
		shutdown(); 
	}
}

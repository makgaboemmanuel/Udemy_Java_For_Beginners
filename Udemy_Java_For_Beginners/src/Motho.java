import java.io.Serializable;

public class Motho implements Serializable { /* video lesson 49: Serialization: Saving objects to files 
*  Serialization: turning a object into binary form / data 
*  DeSerialization: turning a binary data into and object  
*  Most Common Serialization, is Serializing to files 
*/

	/**
	 * this value is system generated
	 * dont chnage the value please 
	 */
	// private static final long serialVersionUID = 7031032321923127887L;
	private  int id; /* transient keyword prevents fields from being serialized, will return 0 for int, and empty string for string   */
	private String name; 
	/* static fields are not necessary to be serialized because they belong to the class not instances of a class, 
	 * all intances of the class will have the same value  */
	
	public Motho(int id, String name){
		this.id = id; 
		this.name = name; 
	}
	 
	/* this method is used when you call the sysout(object) so that the data can display in a proper way */
	@Override
	public String toString() {
		return "Person [id =" + id + ", name= " + name + "]";
	}
}

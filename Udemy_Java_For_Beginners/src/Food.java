
/*  video 46: inner classes - remember there can only be one public class in each file 
 *  in general, inner classes are used for grouping classes for a whatever reason or also encapsulation
 *  there is three cases for using inner classes  
 *  1. nested inner classes - when you want to access the instance variables of the enclosing class 
 *  2. static inner classes - they are not associated with the instances of the enclosing class 
 *  3. 
 *  
 * */

public class Food {
	private String name;
    static int weight = 985; /* remember static variables are the same for all the object of the same class  */
	class Cook{ /* this class will have access to the instance data of the surrounding class */
		public void consume() {
			System.out.println(name + " is a ready to eat, no need to cook.");
		}
	}
	
	public class OvenFried{ /*  because it is public, it can be accessed in the main class this class 
								will have access to the instance data of the surrounding class       */
		public void consume() {
			System.out.println(name + " should be oven cooked.");
		}
	}
	
	public static class HotCold{ /*  because it is public, it can be accessed in the main class this class 
		will only have access to the static instance data of the surrounding class       */
		public void theWeight() {
			 System.out.println("Weight of the food is: " + weight );
			}
		}
	
	public Food(String name) {
		// super(); : what does tehs super key word mean 
		this.name = name;
	}

	public void mealType() {
		System.out.println(name + " is for breakfast"); 
		/*  using inner classes */
		Cook cook = new Cook(); 
		cook.consume(); 
	}
	 
	
	
}

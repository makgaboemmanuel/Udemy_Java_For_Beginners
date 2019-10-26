
public class Field {
   private Plant plant = new Plant(); 
	
   public Field() {
	   System.out.println(plant.size); /*  size is protected, and Field is in the same package as Plant   */
   }
}

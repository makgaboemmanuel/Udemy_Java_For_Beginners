import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects.....");
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi) ; 
			Motho person = (Motho) os.readObject(); 
			Motho person1 = (Motho) os.readObject();
			
			/* please note: deserializing does not run a constructor  */
			/* deserializing the arrays */
			Motho [] mothoa = (Motho[])os.readObject();  
			
			/* deserializing the array list  */ 
			@SuppressWarnings("unchecked")
			ArrayList<Motho> amotho = (ArrayList<Motho>)os.readObject() ; /* this will read all objects from the file */
			
			/* iterating through the array object */
			for(Motho a: mothoa) {
				System.out.println(a); 
			}
			
			/* iterating through the array list object */
			System.out.println();
			System.out.println("Array list example");
			for(Motho a: amotho) {
				System.out.println(a); 
			}
			
			/*  closing the read object  */
			os.close(); 
			
			System.out.println(person);
			System.out.println(person1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

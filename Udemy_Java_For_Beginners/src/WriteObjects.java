import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/*  video 50: serializing arrays   */

public class WriteObjects { /* in java, you are allowed to have as many "main" methods as you want, 
							 you just to choose which is the starting one  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Writing Objects....");
		Motho mothom = new Motho(23, "Makgabo");
		Motho mothoe = new Motho(32, "Emmanuel");
		
		/* define the Motho object array */
		Motho [] mothop = { new Motho(56, "Maseru"), new Motho(36, "Lebone"), new Motho(21, "Kgomo") };
		/* using the arraylist */
		ArrayList<Motho> amotho = new ArrayList<>(Arrays.asList(mothop)); 
		
		/* printing objects */
		System.out.println(mothom);
		System.out.println(mothoe);
		for(Motho m: mothop) {
			System.out.println(m); 
		}

		/* Creating the write object */
		try(FileOutputStream fs = new FileOutputStream("people.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)){ /* automatically calls the fs.close() method */
			
			// ObjectOutputStream os = new ObjectOutputStream(fs); 
			os.writeObject(mothom); 
			os.writeObject(mothoe);
			
			/* serializing arrays */
			os.writeObject(mothop); 
			
			/* serializing arraylist */
			os.writeObject(amotho); 
			
			/* closing the write object: you wont need this if the line is in try with resources   */
			os.close(); 
			
		} catch (FileNotFoundException e) { 
			System.out.println("Can't create file");
			
		} catch (IOException e) {
			System.out.println("Can't write to the file");
			
		}
		
		
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/*  for all imports: right click empty space, select source, select Organize Imports 
 *  - shortcut: ctrl + shit + o  */
import java.util.Scanner;

import ocean.Fish;
import ocean.Info;
import ocean.SeaWeed;

/*  there are two types on exceptions in java: 
 *  ---- checked exceptions: this give you syntax error before you can run the job
 *  ---- runtime OR unchecked exceptions: this does not give you syntax error and you can run the job, but the 
 *   will get the error when running - for instance when you have multiple exceptions and in the try, one type of an 
 *   error is thrown and you put statement in the wrong catch 
 *   ----  another example is division by zero  
 * */

/*	 purposes of packages: to argonise code and enables you to find the files that you want quickly 
 *   the stop you from having conflict	between class names 
 *   package names: they are lower case and have no spaces 
 *   there is a convention to make package names unique as possible, so that when you distribute your code, the
 *   package names don't clash 
 *   this is done by reversing your company name website: i.e. com.caveofprogramming.oceangame - all lower case  
 *   
 *   */


/*		 advantage is to hide away implementation details from other classes and provide a API - 
 *       Application Programming Interface which is / are public - which are actually calles methods 
 * 	     reason for encapsulation is to avoid cross linkages, if variable names for classes in same package are the same
 *       there might be conflicts
 * 		*/


class Person {
	/*
	 * classes can contain
	 * 
	 * 1. Data : i.e. surname, name, age - also called instance variables or state
	 * 2. Subroutine : methods
	 * 
	 * 
	 */

	/* data / state / instance variables */
	private String name; 
	/*	by using the keyword "private", you ensuring that variables can only be accessed via the methods of the class
	 * this is also part of so called encapsulation 
	 * 	*/
	private int age;

	
	/*  a special kind of method that is run every time you create an instance of a class, doesn't have a return type 
	 *  to set default values of instant variables of a class 
	 * */
	public Person() { /*	you can call a constructor with another by using keyword this	*/
		this("Crescent", 36); /* constructor call must be first statement in a method block   */
		System.out.println("First constructor running");
		name = "Arnie";
		age = 36; 
		
	}
	
	public Person(String name, int age) {
	// 	this();
		System.out.println("Second constructor running");
		this.name = "Emmanuel";
		this.age = 25;
		
	}
	
	/* subroutine , method or behavior */
	void speak() {
		System.out.println("Good day " + name + ". How old are you? I am: " + age + " years old.");
	}

	/* void means a method isn't returning anything */
	void yearsLeftToRetiremant() {
		int yearlsLeft = 65 - age;

		System.out.println("Years left: " + yearlsLeft);
	}

	int yearsToRetiremant() {
		int yearlsLeft = 65 - age;

		return yearlsLeft;
	}

	/*
	 * encapsulation: protecting data so that other classes does not change the
	 * value / instance variables. encapsulation uses keywords such as: private and protected 
	 */

	/*	 getter methods	*/
	int getAge() { 
		return age;
	}
	
	String getName() { 
		return name;
	}
	
	/*	setter methods: 	*/
	public void setName(String name) {
		/* this keyword refers to the instance variable of the class. if you omit this keyword, then the method will
		 * refer to the closest variable which is the method's local variable   */
		this.name = name; 
	}
	
	/*		this keyword is used to avoid ambiguity because of scope of the variables		*/
	public void setAge(int age) {
		this.age = age;  
	}
	
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age); 
	}
	
	/* to string method */ 
	@Override 
	public String toString() {
		return "Person [age]: " + age + ", [name] " + name;
	}

	/* for comparing objects for the same class */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}


/*	another practice class	*/
class Robot{
	
	public void speak() {
		System.out.println("Dumela mogwera"); 		
	}
	
	/*	passing a parameter to a method: parameter - a variable that you pass into a method 	*/
	public void talk(String greet) {
		System.out.println(greet); 
	}
	
	/*	 passing more than one parameter 	*/
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " in direction " + direction);
	}
}

class Thing{
	
	public static int count; /*	 to calculate the number of class object created	*/ 
	public final static int LUCKRY_NUMBERS = 88; /*	this is a constant value in java	*/
	public String name; 
	public static String description; /* each object of the class does not get its own copy of the static variable
				* hence they are called class variables  
				*
				*/
	
	/*	 static method : NB - static methods can access static variables	
	 *   also, static methods can't access non static variables 
	 *   NB : static methods and static variables exists even before you create an instance of a class 
	 * */
	
	public int id; /*	 to give a unique id to each object  	*/
	/*	to test the static variable	*/
	public Thing() {
		count+=1; 
		id = count; 
	} 
	
	public void showName()
	{
		System.out.println( "Object id: " + id + ", " + description + ". The people I love very much");	//  
	}
	
	public static void saySome() {
		System.out.println( description + ". The people I love very much"); 
	}
	
	/*	instance methods can access static data	*/
	public void mindReader(  ) {
		System.out.println( name +  " -Try something amazing." ); 
	}
	
}

/*  toString method in java   */
class Frog{
	
	private int id; 
	private String name; 
	
	public Frog(int id, String name) {
		this.id = id;  
		this.name = name ; 
	}
	
	public String toString() {
		/*	efficient way: 	*/
		StringBuilder sb = new StringBuilder(); 
		sb.append("Dumela morena: "). append(name).append(", of age").append(id); 
		/*	inefficient cause it creates too many string objects	*/
		// return "Dumela morena: " + name + ", of age: " + id;
		return sb.toString() ; 
	}
}

/*  using generics : more advanced */

class Human{

	@Override
	public String toString() {
		return "I am a  Human.";
	}
	
	
	public void breath() {
		System.out.println("A human breathes.");
	}
}


class Male extends Human {

	@Override
	public String toString() {
		return "I am male.";
	}
	
	@Override
	public void breath() {
		System.out.println("A males breathes.");
	}
}

interface light{
	public void lswitch(); 
}

/*  try with resources : video 43 udemy */

class Temp implements AutoCloseable{ /*  autocloseable means the class must have a close method   */
	
	@Override 
	public void close() throws Exception {
		System.out.println("Closing."); 
	}
}


public class Application {

	public static void main(String[] args) /* throws IOException, ParseException */ {
		/* this exception can be put anywhere, at the class the 
						executes the file or the method that executes the file  */
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		int mynumber;

		mynumber = 88;

		System.out.printf("My number value is : %d",
				mynumber); /*
							 * printf is format specifier, take two arguments, 2nd varible is replaces %d
							 */
		System.out.println("");

		float volume = 65.71f;
		double area = 65.7;
		short age = 63;

		System.out.println(volume + " " + area + " " + age);

		/*
		 * datatypes in java int : 32 bit value short : 16 bit value long : 64 bit value
		 * double : precision or comma numbers float : short version of double, enforces
		 * to put f at the end of a value
		 * 
		 * 
		 */

		char achar = 'Y';
		byte abyte = 127;
		boolean abool = true; /* hold 8 bits of data : max value - 128 */

		/* all the above are called primitive types */

		/* non primitive data type */
		String lane = "";

		/*
		 * if and else if: if if executes to true, then else if will be ignored
		 */

		/* user input */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a text: ");

		String strInput = input.nextLine(); // example: input.nextInt()

		/* switch case statement example */

		switch (strInput) {

		case "Start":
			System.out.println("The Engine Started");
			break;

		case "Stop":
			System.out.println("The Engine Stopped");
			break;

		default:
			System.out.println("Command Not Recognised");
		}

		/*
		 * arrays : they are reference types, while single declaration of primitive
		 * types refers to value types
		 */

		int[] values; /* this is a reference types */

		values = new int[3]; /* the "new" keyword allocates memory to hold the variables */

		/*
		 * java gives all elements of an array default values : check the example below
		 */

		System.out.println("Value of 1st element is: " + values[0]);

		for (int i = 0; i < values.length; i++) {
			values[i] = (i + 1) * 10;
		}

		for (int g : values) {
			System.out.println(Integer.toString(g));
		}

		/* alternatively: */

		String[] chuncks = { "Looper", "Harry", "Henry", "Scooba", "Lallana", "Opera Mini" };

		/* multi dimensional arrays */

		int[][] table = { { 14, 36, 26 }, { 20, 3, 8, 81, 53 }, { 69, 52, 31 } };

		System.out.println(table[1][4]); /* doesn't allow string concatenation */

		/* iterating through the loop: */

		System.out.println("iterating through multi dimensional the loop"); /* grid format */

		for (int m = 0; m < table.length; m++) {
			for (int n = 0; n < table[m].length; n++) {
				System.out.print(table[m][n] + "\t");
			}

			System.out.println("");

		}

		Person person1 = new Person(); // creating a person object
		person1.setName( "Emmanuel");
		person1.setAge(32) ;
 
		System.out.println("My Name is: " + person1.getName() + ", and my age is: " + person1.getAge());

		person1.speak(); /* you can't use System.out.println cause the method doesn't return anything */

		person1.yearsLeftToRetiremant();
		
		/*		Robot class		*/
		Robot sam = new Robot(); 
		sam.speak(); 
		sam.talk("Gotla loka."); 
	
		/* Thing class usage */
		System.out.println("Value before any objects: " + Thing.count);
		Thing thing1 = new Thing(); 
		Thing thing2 = new Thing(); 
		Thing thing3 = new Thing(); 
		
		
		/*	 how to access and use static variables: 	*/ 
		Thing.description = "I am a human being with feelings. ";
		thing3.showName(); 
		
		/*		to count number of class variables created  	*/
		System.out.println("Value after objects created: " + Thing.count);
		thing1.name = "Manchester";
		thing1.mindReader(); 
				
		
		System.out.println( Thing.description);  
		
		/*	how you call a static method	*/
		Thing.saySome(); /*	you use the class name	*/
		
		/*	bit of maths library	*/
		System.out.println(Math.PI +  " - pie value"); 
		
		System.out.println("We are champions: " + Thing.LUCKRY_NUMBERS); 
		
		/*	 Strings In Java
		 *   Strings are emutable in java - this means, once you create a string object, it exists 
		 *   up until the end of the program.
		 *   When you append a string, you are not adding more data to the string. instead, you are creating 
		 *    a new string object. 
		 *   This approach uses a lot of memory in java, which slows down the program 
		 * 	  */
		
		/*		efficient way - StringBuilder	*/
		
		StringBuilder sb = new StringBuilder(""); /*	you can initiate it at the beginning	*/ 
		sb.append("My name is Emmanuel.");
		sb.append(" "); 
		sb.append("My surname is Mathekga."); 
		/*	 by using append, we are modifying the contents of the existing string builder variable 		*/
		
		System.out.println(sb.toString());  
		
		/* StringBuffer is thread safe than STringBuilder		*/
		StringBuffer sf = new StringBuffer();
		sf.append("Job Title: Business Intelligence - BI / ETL")
		.append(".  ").append("Company Name: African Bank Ltd" ); 
		System.out.println(sf.toString()); 
		
		/* \n :  add a new line
		 * \b : add a tab space
		 * */
		
		System.out.printf("My age is : %-10d;\tmy postal address is: %d\n",  5, 1685); /*	formatting an integer value*/
		/*		please take note: %-10d: - sign means left aligned,  10 means the total length of the value d that will be replaced	*/
		/* you can have as many values to replace as you want, make sure that that value to replaced matches supplied values
		 *  %d - for a number
		 *  %s - for string 
		 *  %6.2f - 6 means to total width,  .2 means to two decimal places, for floating  
		 * */
		
		/* the toString method in Java   */
		Frog frog1 = new Frog(33, "Emmanuel");
		System.out.println( frog1.toString()  );
		
		/*	inheritance : super class	*/ 
		Machine machine = new Machine(); 
		machine.start();
		machine.stop(); 
		
		/*	inheritance : sub class	*/
		Car car = new Car(); 
		car.start();
		car.wipeShield(); 
		car.printTitle(); 
		car.stop(); 		
		
		
		/* NB: some classes can be extended, some classes can not be extended.	
		 * i.e. 
		 * String class is a final class and can't be extended 	*/
		
		/*	 packages : 		*/
		Fish fish = new Fish(); 
		
		SeaWeed seaweed = new SeaWeed() ;
		
		/*	using interfaces	*/
		ocean.Person person = new ocean.Person("Emmanuel");  
		Machine mac1 = new Machine(); 
		
		
		/* using the interface class */
		Info info = new ocean.Machine(); 
		info.showInfo(); 
		
		Info info1 = person; 
		
		/*	using the private method	*/
		infoShow(info) ;
		infoShow(person) ;   
		
		/*  access modifiers: public, private, protected 		*/
		Plant plant = new Plant(); 
		System.out.println("Name of plant is: " + plant.name);
		
		/* using polymorphism */
		ocean.Plant plan1 = new ocean.Plant();
		ocean.Tree tree = new ocean.Tree(); 
		
		/* polymorphism brings this  */
		ocean.Plant plan2 = tree;  /* this is possible because tree is a child of plant */
		
		/*	 let us check vise versa		*/
		// ocean.Tree tree2 = plan1;  /* mismatch, can not convert from plant to tree */ 
		
		
		/*  let us see how and which methods will be implemented  */
		plan2.grow(); 
		
		/* method only existing in child class  */
		tree.shedLeaves(); 
		
		/* you can't do this, because of the type of the object or reference */
		//  plan2.shedLeaves(); 
		
		
		/*	 NB: you can out a child object wherever you expect a parent object 
		 * 
		 *  because a child gets a full copy of parent 		*/
		
		
		/*		to see maximum values of each data type		*/
		byte byteValue = Byte.MAX_VALUE; //  121;
		short shortValue = Short.MAX_VALUE; 
		int myInt = Integer.MAX_VALUE; 
		long myLong = Long.MAX_VALUE; 
		
		float myFloat =  Float.MAX_VALUE ; // 76347.5f;
		double myDouble = Double.MAX_VALUE; 
		
		System.out.println("Maximum Values: " + byteValue + ", " + shortValue + ", " 
							+ myInt + ", " + myLong + ", " + myFloat + ", " + myDouble );
		
		/*  casting int in Java			*/
		byte bvalue = 6; 
		int ivalue = 43253; 
		float mfloat = (float) 697452.32; 
		long lvalue = 523523;  
		
		ivalue = (int) lvalue; /*  actual casting: put the data type you are converting in brackets 
		  *  int to double doesn't require data type casting. you can also check for other data types 
		  *  that doesn't require data casting 
		  *
		  * if the value you are casting is larger than the data type you are casting into, you will strange values 
		  */
		
		/*	if the value you are casting is larger than the data type you are casting into, you will strange values 		*/
		System.out.println("Long To Integer: " + ((short)65235998) );
		
		String stringInt = "9865";
		int intString = Integer.valueOf( stringInt ); 
		
		/*  Upcasting: converting an object of parent class to a child class: the parent variable / object can 
		 *   only access methods shared by both classes but will return the value in the child class  
		 *  
		 *  Downcasting : casting a child object into data type of the parent class - this will not give a syntaxt error
		 *   , instead it will give runtime error    
		 *  */
		
		/*	Generics : Arraylist		
		 *  Latest Form of Generics
		 * */
		
		ArrayList<String> listString = new ArrayList<>(); 
		listString.add("Kgolathe Creche");
		listString.add("Monyoaneng Primary S.");
		listString.add("Mochedi High S.");
		listString.add("Makgoka Secondary S.");
		listString.add("Uni. Pretoria");
		listString.add("Uni. Limpopo");
		listString.add("Wits Uni.");
		listString.add("Tshwane Uni. of Tech");
		
		System.out.println("My schooling history: ");
		for(String e : listString) {
			System.out.println(e); 
		}
		
		for(int c = 0; c < listString.size(); c++) {
			System.out.println(listString.get(c)); 
		}
		
		/* executing the generics */
		ArrayList<Human> ahuman = new ArrayList<>(); 
		ahuman.add(new Human() );
		ahuman.add(new Human() );
		
		for(Human h : ahuman) {
			System.out.println(h);
		}
		
		ArrayList<Human> listMale = new ArrayList<>(); 
		listMale.add(new Male());
		listMale.add(new Male()); 
		
		for(Human h: listMale) {
			System.out.println(h);
		}
		
		/*	this is a wildcard method call	*/
		showList(listMale); 
		printList(listMale);
		
		/* anonymous classes 		*/
		Male newMale = new Male() {
			@Override
			public void breath() {
			System.out.println("A males breathes, through the nose.");
			}
		};
		
		/*  using anonymous classes  */
		newMale.breath(); 
		
		/* anonymous classes from an Interface		*/
		light mlight = new light() {
			
			@Override
			public void lswitch() {
				System.out.println("The light is on");
			}
		};
		
		/*	using or calling an object of the type of the interface object	*/
		mlight.lswitch(); 
		
		
		/*	  reading files using Scanner		*/
		/*	  default location for the class location:	
		 *    C:\Users\Mathekga M. Emmanuel\eclipse-workspace\Udemy_Java_For_Beginners\src   */
		// String fileName = "C:\\Users\\Mathekga M. Emmanuel\\Desktop\\Java 2020\\files\\myjobs.txt"; /*	this is an absolute path	*/
		String fileName = "myjobs.txt"; /*	this i by using the relative path, uses the project folder		*/ 
		/*	NB:always remember to use double backward slashes when referring to a file location in windows 	
		 *  or: use single forward slashes. it will work fine */
		File textFile = new File(fileName);
		Scanner in;
		try {
			in = new Scanner(textFile);
			/*	loop through the file	*/
			System.out.println("My Work History: ");System.out.println("");
			while(in.hasNext()) {
				String fline = in.nextLine(); 
				System.out.println(fline);		
			}
			
			/*	close the scanner or you will get an error	*/
			in.close(); 
			
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}  
		
				
		
		/*		exceptions are part of error handling mechanism in java, 
		 *      everything below the try statement after the error is encountered will be ignored 
		 *      and only the code within catch braces will be executed
		 *      you can also use the try catch statement which executes at the level of the code, not from class level 		*/ 
		
		/*  showing the use of multiple exceptions  - can put the exceptions at the level of the main method - 
		 * or use try catch phrase as shown in the succeeding code  */
		Test test = new Test(); 
		
		/*  the other way is to use the try catch phrase */
		try {
			// test.run();
		} 
		
		/* or you can us "Exception" in the catch phrase because all the other exceptions are derived from this parent class */
		catch ( Exception /* IOException | ParseException */ e1) { /* this is a pipe separating multiple exceptions  */
			System.out.println("Couldn't open the file: " + e1.toString() );  /* if there is an IO error then this catch block will not catch 
			*  the system will still throw an error
			*/ 
			
			// e1.printStackTrace();
		} // catch (ParseException e1) {
			
			// System.out.println("Couldn't parse command file: " + e1.toString() );  
			/* if there is an IO error then this catch block will not catch 
			*  the system will still throw an error
			*/ 
			
			// e1.printStackTrace(); 
		// } 
		
		/*  this is an example if multiple exceptions    */
		try {
			test.input();
		} catch (IOException e1) { /* IOException works because FileNotFound also belongs to IOException class  */
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		
		/*  this is an example of runtime OR unchecked exceptions
		 *  you can catch runtime exceptions like the code below or not, as long as you know your code is fool proof    */
		try {
			// int enumber = 33/0; /* i.e.  */
			String eString = null; 
			// int elength = eString.length() ; /* this will give you null pointer  */ 
			eString = "African bank Limited";
			// String allString = eString.substring( 0, eString.length() + 2) ;
			/* this will give you index out of bounds exception  */
		} catch (RuntimeException e) {
			System.out.println(e.toString()); 
		} 
 
		/* reading file using file object: found from java 6 going onwards
		 *  File object is a platfrom independent way of representing a file, that doesn't 
		 *  depend on a particular kind of path specification 
		 *  it doesnt çare whether it is back slashes or forward slashes - it just represents a file  */
		
		File ffile = new File("Lunar.txt"); 
		BufferedReader bread = null;
		try {
			FileReader fread = new FileReader(ffile);
			bread = new BufferedReader(fread); 
			
			String bline; 
			
			while( (bline = bread.readLine()) != null ) {				 
				System.out.println(bline);	
			}
			
			
		} catch (FileNotFoundException e1) {
			System.out.println( "File not found: " + ffile.toString() /* e1.toString() */); 
			
			// e1.printStackTrace(); : never print this to the user cause it will confuse them 
		} catch (IOException e1) {
			System.out.println("Unable to read file: " + ffile.toString()); 
		}  
		
		
		/* you have to close the buffer because if you don't, this might result memory leaks  */
		
		finally { /* NB: finally block will always be executed irrespective of what exception was throwns */
			
			try {
				bread.close();
			} catch (IOException e1) {
				System.out.println("Unable to close file");
			} catch(NullPointerException e2) {
				System.out.println("Filename wrong");
			}
			
		}
		
		/* continuation of try-with-resources */
		try( Temp ttemp = new Temp()){ /* his is the format of try with resources - followed by a statement brackets */
			/* no need to call the close method : it is automatically caught  */
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.toString()) ;
		}
		
		/* try {
			ttemp.close();
		} catch (Exception e1) {
			
			System.out.println(e1.toString()); 
		} */ 
		
		/* try-with-resources for opening a file */
		File withFile = new File("groom.txt");
		try( BufferedReader br = new BufferedReader( new FileReader(withFile) ) ){
			
		} catch (FileNotFoundException e1) {
			
			System.out.println("File not found: " + withFile.toString());
		} catch (IOException e1) {
			System.out.println("Unable to open file: " + withFile.toString());
		}
		
	   /* file writer  */
		File writefile = new File("writeFile.txt"); /* this only works for text files */
		
		try( BufferedWriter bwrite = new BufferedWriter(new FileWriter(writefile)) ){ 
			/* no need to close the file because the try-with-resources closes it for you  */
			bwrite.write("Good day sir"); bwrite.newLine();
			bwrite.write("Good day sir"); bwrite.newLine();
			bwrite.write("Good day sir"); bwrite.newLine();
			bwrite.write("Good day sir"); bwrite.newLine(); 
			bwrite.write("Good day sir"); bwrite.newLine(); 
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Unable to write to file: " +  e1.toString());  ;
		}
		
		/* .equals java method : video 44 - udemy java beginner */
		/* public Person(String name, int age) */
		Person personone = new Person("Ludah", 25); 
		Person persontwo = new Person("Ludah", 25);
		Person personthree = new Person("Ludah", 25);
		/* using the java equals method */
		System.out.println(personone.equals(persontwo)); 
		System.out.println(personone == persontwo ); 
		/* for non-primitive types == tells you whether two references to objects are pointing to the same object or not  
		 * for primitive types, it tells you if they have the same value 
		 * */
		
		personone = persontwo;
		/* this will execute to true since they are now pointing to the same object */
		System.out.println(personone == persontwo ); 
		
		/* this statement will execute to true because of the of the Override equals method in the class  */
		System.out.println(personone.equals(personthree) ); /* use .equals for all primitive types, it will work  */
		/* == checks two object are referencing to the same object   
		 * .equals - checks they are equal in terms of value  */
		
		/* the hashcode: is unique id's that are given to each object - it is the value returned 
		 * by the hash method in the class declaration  
		 * - hashcode is only used when you use hashSet or trees from java collections  */
		
		/* Implementation of inner classes  */
		Food food = new Food("Kellogs Cornflakes"); /* when you create an instance of the surrounding class, you do not 
													   automatically create an instance of inner classes, 
													   you have to do it in a separate line */
		food.mealType() ; 
		Food.OvenFried ovenfried = food.new OvenFried(); /* because this class is public  */
		ovenfried.consume();
		
		Food.HotCold hotcold =  new Food.HotCold(); 
		hotcold.theWeight(); 
		
		
		/*   testing the enums */
		Animal animal = Animal.CAT; 
		System.out.println( animal.CAT.name()  ); /* to get the value from the enum  */
		
		switch(animal) {
		case CAT:
			System.out.println("I am a: " + Animal.CAT +  ", and my name is: "+ animal.CAT.getName()); 
			break;
		case DOG:
			System.out.println("I am a: " + Animal.DOG +  ", and my name is: "+ animal.DOG.getName());
			break;
		case MOUSE:
			System.out.println("I am a: " + Animal.MOUSE +  ", and my name is: "+ animal.MOUSE.getName());
			break;
		default:
			break;
		
		}
		
		/* using Java Collections Framework : JCF */
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		/* you can't use primitive types, you have to use the corresponding non-primitive types */
		
		/* adding value to an arraylist */
		
		for(int i = 0; i <= 3; i++) {
			numbers.add((i+1)*2);  
		}
		
		/* removing items from the arraylist */
		
		numbers.remove(0) ; /*  the first item: this is very slow because all subsequent 
		                        items have to be moved up to fill the empty slots */
		
		numbers.remove(numbers.size() -1) ; /*  the last item */
		
		/* getting / reading values */
		for(int i : numbers) {
			System.out.println(i); 
		}
		
		/* NB: all the list objects implement the List interface */
		List<Integer> arrList = new ArrayList<>();  
		
		/* Discussion: ArrayList - manages arrays internally, stored like : [0][1][2][3][4] which makes it easier to access the elements at any point  */
		
		/* Discussion: LinkedList - consists of elements where each element has reference to the previous element 
		 * they are stored like : [0]->[1]->[2]->[3]->[4] which makes it difficult to iterate through  */
		
		
	    /* showing the difference between LinkedList and ArrayList */
		List<Integer> arint = new ArrayList<Integer>(); /* if you don't put the size, the default size is 10 */
		/* rule: if you want to add or remove items at the beginning or end, use an arraylist */
		List<Integer> linkList = new LinkedList<>(); 
		/* rule: if you want to add or remove items anywhere else such as the middle, use an arraylist */
		
		/* using the method */
		doTimings("ArrayList", arint); 
		doTimings("LinkedList", linkList);
		
		/*  java heap size memory */
		long heapSize = Runtime.getRuntime().totalMemory(); 
		System.out.println(heapSize + ": total Memory");
		
		long maxHeap = Runtime.getRuntime().maxMemory();
		System.out.println(maxHeap + ": total Memory");
		
		
		/* java hashmaps - video 55 udemy java for beginners  */
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
		
		/* adding elements to a Map */ 
		map.put(4, "Leina");
		map.put(3, "Monna");
		map.put(8, "Thari");
		map.put(5, "Kgarebe");
		map.put(6, "Tsoga");
		
		
		/* if you try to access a member of aket that doesn't exist, it will return a null 
		 * if you insert a key that already exists, it will overwrite the existing member */
		
		/* accessing the elements of  */
		System.out.println("Dealing with HashMaps.....");
		
		System.out.println(map.get(8));
		System.out.println();
		System.out.println("Iterating through the HashMaps ... ");
		
		/* iterating through the HashMap */
		for(Map.Entry<Integer, String> entry: map.entrySet()  ) {
			int key = entry.getKey();
			String value = entry.getValue(); 
			
			System.out.println(key + ": " + value);
		}
		
		/* if you don't have a toString method in class and you print an object of a class,
		 *  you get a hashcode after the class name and the @ sign */
		
		
		
	}
	
	/* to show the use of the List interface */
	private static void doTimings(String type, List<Integer> list ) {
	
		
		for(int i = 0; i < 1E5; i++) /* 1E5 : one time 10 exponent 5 */ {
			list.add(i); 
		}
		
		long start = System.currentTimeMillis(); 
		
		/*  adding items to the end of the list  */
		/*  adding items to the beginning of the list  */ 
		for(int i = 0; i < 1E5; i++) /* 1E5 : one time 10 exponent 5 */ {
			list.add(0, i); 
		}
		
		
		long end = System.currentTimeMillis(); 
		
		System.out.println("Time taken: " + (end - start) + " ms for type: " + type );
		
		
	}
	
	private static void infoShow(Info info) {
		info.showInfo(); 
	}

	/*	this is a wildcard method call : it has no specific data type for the parameter it receives 	*/
	public static void showList(ArrayList<?> alist) {
		for(Object value:  alist) {
			System.out.println(value + " : wildcard method");
		}		
	} 
	
	/*	this is a wildcard method call : it has no specific data type for the parameter it receives 	*/
	public static void printList(ArrayList<? extends Human> alist) { /* this wild cast uses upper casting so that only sub classes    
	*			and main class of type specified can be used 
	*
	*/
		for(Human value:  alist) {
			System.out.println(value + " : wildcard method");
			value.breath();   
		}		
	} 
}

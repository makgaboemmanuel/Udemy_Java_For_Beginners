/* enum stands for enumirated, which contains a set of values you can iterate through */


public enum Animal {
	CAT("Leon"), DOG("Jafta"), MOUSE("Maphuti");
	
	private String name; 
	
	 Animal(String name) { /* this is the constructor */
		this.name = name; 
	}
	 
	public String getName() {
		return name; 
	}
}

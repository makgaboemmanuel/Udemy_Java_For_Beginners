
public class Lounge extends House {

	@Override
	public void whichRoom() {
		System.out.println("This is the Lounge"); 
	}

	@Override
	public void doStuff() {
		System.out.println("Watch TV abd play music");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Lock the Lounge");
	}

}

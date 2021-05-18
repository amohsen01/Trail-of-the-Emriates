
public class Photographer extends Characters {

	public Photographer(String name, String conversation) {
			
	super("Alex", "I Took A Picture Of You At"
	+ " The Burj Khalifa Would You like to take it ?" ); // take the photo with the use of the Pickup method in Picture

	}

	@Override
	public void talk ()
	{
		System.out.println(conversation);
	}
	
}

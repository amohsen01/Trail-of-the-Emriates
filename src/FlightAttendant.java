
public class FlightAttendant extends Characters {

	public FlightAttendant(String name, String conversation) {
		
		super("Emma" , "Hello, I'm Emma Your Flight Attendant. Welcome To The Check In Area, Please Hand Me Your Passport So I Can Check You In ");
		
	}

	@Override
	public void talk ()
	{
		System.out.println(conversation);
	}
	
}

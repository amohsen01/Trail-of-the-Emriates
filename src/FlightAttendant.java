import java.util.Scanner;

public class FlightAttendant extends Characters {

	public FlightAttendant(String name, String conversation) {
		
		super("Emma" , "Hello, I'm Emma Your Flight Attendant. Welcome To"
				+ " The Check In Area, Please Hand Me Your Passport So I"
				+ " Can Check You In by Typing hand passport ");
		
	}
	public void checkin() {
	
	try (Scanner inp = new Scanner(System.in)) {
		String phrase = inp.nextLine();
		
		if(!phrase.contentEquals("hand passport"))
		{
			System.out.println("I Can Not Proceed With The Checkin "
			+ "Unless You Type The Phrase hand passport ");
			
			phrase = inp.nextLine();
		}
		else 
		{
			System.out.println("You Have Been Checked In Successfully, Have A Safe Flight! ");
		}
	}
	
		
	}
	@Override
	public void talk ()
	{
		System.out.println(conversation);
	}
	
}

import java.util.Scanner;

public class FlightAttendant extends Characters implements Observer{

	public FlightAttendant() {
		
		super("Emma" , "Hello, I'm Emma Your Flight Attendant. Welcome To"
				+ " The Check In Area, Please Hand Me Your Passport So I"
				+ " Can Check You In!");
		
	}
	public void checkin() {
	try (Scanner inp = new Scanner(System.in)) {
		String phrase = inp.nextLine();
		
		if(!phrase.contentEquals("hand passport"))
		{
			System.out.println("I Can Not Proceed With The Checkin "
			+ "Unless You Type The Phrase hand passport ");
			
			phrase = inp.nextLine();
			
			// --- plane check in procedure --//
			Passport p = new Passport();
			p.prepareToCheckout();
			
			PlaneTicket t = new PlaneTicket();
			t.prepareToCheckout();
		}
		else 
		{
			System.out.println("You Have Been Checked In Successfully, Have A Safe Flight! ");
		}
	}
	
	
//	Passport t1 = new Passport();
//	t1.prepareRecipe();
		
	}
	
	@Override
	public void talk ()
	{
		System.out.println(conversation);
	}
	
	boolean check = false;
	@Override
	public void update(Message m) {
		if(m.payload == "detected" && check == false)
		{
			System.out.println("You Have Been Checked In Successfully, Have A Safe Flight! ");
			check = true;
		}
		
	}
	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
	
}

import java.util.Scanner;

public class HotelLobbyist extends Characters  {

	public HotelLobbyist() {
		
		super("Jane", "Greetings, I Hope You Had A Good Stay. "
		+ "To Check You Out Please Type I want to checkout.");
	}
	
	
	public void checkout() {
	
	try (Scanner inp = new Scanner(System.in)) {
		String phrase = inp.nextLine();
		
		if(!phrase.contentEquals("I want to checkout"))
		{
			System.out.println("I Can Not Proceed With The Checkout "
			+ "Unless You Type The Phrase I want to checkout ");
			phrase = inp.nextLine();
		}
		else 
		{
			System.out.println("You Have Been Checked Out Successfully, You Can Catch A Taxi By"
					+ " The Gate To Take You To Your Next "
					+ "Destination, Stay Safe !");
		}
	}
	
		
	}

@Override
public void talk ()
{
	System.out.println(conversation);
}
}

import java.util.Scanner;

public class Transport  implements Observer
{
ZorahBeach ajman=new ZorahBeach(new Dallah());
SouqAlQadeem sharjah=new SouqAlQadeem(new Oud());
DubaiMall dubai=new DubaiMall(new Picture());
AbuDhabiAirport intl=new AbuDhabiAirport(new Dates());
Scanner s=new Scanner(System.in);
	
	public void StartTrip() {
		System.out.println(ajman.Description);
		System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
		String string=s.nextLine();
		if (string=="Y"||string=="y") {
			
		ajman.Explore();	
		
		/*
		 * 
		 * Add Here collectible pickup implementation 
		 * 
		 * for example   System.out.println("A person you found at the beach wants you to have his dallah do you accept it") //move phone add if statement for pickup
		 * */
		}
		
		
	}
	@Override
	public void update(Message m) {
		if (m.topic == "goto")
		{

			 if(m.payload == "Sharjah")
			{
				
			}
			else if(m.payload == "Dubai")
			{
				
			}
			else if(m.payload == "Abu Dhabi")
			{
				
			}
		}
	}

	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
	
}

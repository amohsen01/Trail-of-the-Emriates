import java.util.Scanner;

public class Transport  implements Observer
{
	ZorahBeach ajman = new ZorahBeach(new Dallah());
	SouqAlQadeem sharjah = new SouqAlQadeem(new Oud());
	DubaiMall dubai = new DubaiMall(new Picture());
	AbuDhabiAirport intl = new AbuDhabiAirport(new Dates());
	Scanner s = new Scanner(System.in);
	
	public void StartTrip() {
		System.out.println(ajman.Description);
		System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
		String string=s.nextLine();
		if (string=="Y"||string=="y") {
			ajman.Explore();
			ajman.descrp();
			System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		ajman.leaveLandmark();
		}
		
		
	}
	@Override
	public void update(Message m) {
		if (m.topic == "goto")
		{
			 if(m.payload == "Sharjah")
			{
				 System.out.println(sharjah.Description);
					System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
					String string=s.nextLine();
					if (string=="Y"||string=="y") {
						sharjah.Explore();
						sharjah.descrp();
						System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
						try 
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					sharjah.leaveLandmark();
					}
				}
			else if(m.payload == "Dubai")
			{
				System.out.println(dubai.Description);
				System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
				String string=s.nextLine();
				if (string=="Y"||string=="y") {
					dubai.Explore();
					dubai.descrp();
					System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
					try 
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				dubai.leaveLandmark();
			}}
			else if(m.payload == "Abu Dhabi")
			{
				System.out.println(intl.Description);
				System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
				String string=s.nextLine();
				if (string=="Y"||string=="y") {
					intl.Explore();
					intl.descrp();
					System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
					try 
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				intl.leaveLandmark();
				}
			}
			}
		}
	


	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
	
}

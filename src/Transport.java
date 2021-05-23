import java.util.Scanner;

public class Transport implements Observer
{
	ZorahBeach ajman;
	SouqAlQadeem sharjah;
	DubaiMall dubai;
	AbuDhabiAirport intl;
	Subject sub;

	Transport (Subject s,ZorahBeach ajman,SouqAlQadeem sharjah,DubaiMall dubai,AbuDhabiAirport intl)
	{
		this.sub=s;
		this.sub.registerObserver(this);	
		this.ajman = ajman;
		this.sharjah = sharjah;
		this.dubai = dubai;
		this.intl = intl;
	}

	Scanner s = new Scanner(System.in);
	
	public void StartTrip() 
	{		
		System.out.println(ajman.Description);
		System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
		String string=s.nextLine();
		if (string.contains("Y")||string.contains("y")) {
			ajman.Explore();
			
			System.out.print(ajman.descrp);
			System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
			ajman.check=false;
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ajman.leaveLandmark();
	}
	
	@Override
	public void update(Message m) {
		if (m.payload=="phone") { this.StartTrip(); }
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

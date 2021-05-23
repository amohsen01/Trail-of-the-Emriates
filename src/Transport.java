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
	Context state=new Context();
	Scanner s = new Scanner(System.in);
	Swiper swipe=new Swiper(state);
	public void StartTrip() 
	{		
		System.out.println(ajman.Description);
		System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
		String string=s.nextLine();
		if (string.contains("Y")||string.contains("y")) {
			ajman.Explore();
			
			System.out.print(ajman.descrp);
			System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You Have Successfully Added Dallah To Your Backpack."); 
			state.setHappy();
			swipe.talk();
			try {
				swipe.getInput();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ajman.check=false;
		}
		
		ajman.leaveLandmark();
		
	}
	
	@Override
	public void update(Message m) {
		if (m.payload=="phone") 
		{ 
			this.StartTrip();
		}
		
		if (m.topic == "goto")
		{
			 if(m.payload == "Sharjah")
			 {
				 try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 System.out.println(sharjah.Description);
				 System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
				 String string=s.nextLine();
				 if (string.contains("Y")||string.contains("y")) 
				 {
					 sharjah.Explore();
					 System.out.println(sharjah.descrp);
					 System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
					 sharjah.check = false;
					 try 
					 {
						 Thread.sleep(2000);
					 }
					 catch (InterruptedException e) 
					 {
						 e.printStackTrace();
					 }
				 }
				 System.out.println("You Have Successfully Added Oud To Your Back Pack");
				 sharjah.check = false;
				 state.setHappy();
				 Swiper swipe1=new Swiper(state);
					swipe1.talk();
					try {
						swipe1.getInput();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 sharjah.leaveLandmark();
			}
			
			 else if(m.payload == "Dubai")
			 {
				 try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 System.out.println(dubai.Description);
				 System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
				 String string=s.nextLine();
				
				 if (string.contains("Y")||string.contains("y")) 
				 {
					dubai.Explore();
					System.out.println(dubai.descrp);
					System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
					try 
					{
						Thread.sleep(2000);
					}
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					System.out.println("You Have Successfully Added The Photo At Burj Khalifa To Your Back Pack");
					dubai.check = false;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					state.setHappy();
					Swiper swipe2=new Swiper(state);
					swipe2.talk();
					try {
						swipe2.getInput();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					dubai.leaveLandmark();
				 }
			 }
			
			 else if(m.payload == "Abu Dhabi")
			 {
				 try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(intl.Description);
				System.out.println("Would you like to explore and maybe collect a souvenir to remember this place?");
				String string=s.nextLine();
				if (string.contains("Y")||string.contains("y")) {
					intl.Explore();
					//System.out.println(intl.descrp);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			if(m.payload == "Walking")
			{
				System.out.println("You Have Been Checked In Successfully, Have A Safe Flight!");
			}
				intl.leaveLandmark();
				}
				}
			 }
		System.exit(1);
		}
	
	


	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
	
}

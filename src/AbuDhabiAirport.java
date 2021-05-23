import java.util.Scanner;
public class AbuDhabiAirport extends Landmark {
FlightAttendant Emma=new FlightAttendant(this);
	static String description="\n          ______\r\n"
			+ "            _\\ _~-\\___\r\n"
			+ "    =  = ==(____AA____D\r\n"
			+ "                \\_____\\___________________,-~~~~~~~`-.._\r\n"
			+ "                /     o O o o o o O O o o o o o o O o  |\\_\r\n"
			+ "                `~-.__        ___..----..                  )\r\n"
			+ "                      `---~~\\___________/------------`````\r\n"
			+ "                      =  ===(_________D\n\nWelcome to Abu Dhabi International Airport ";
	AbuDhabiAirport(Collectible collectible) {
		super("Abu Dhabi International Airport", "Abu Dhabi", collectible,description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Explore() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.print("Welcome to Abu Dhabi Airport, You are now checking in your Luggage\n Did you pack in you bags?\n");
		String ans=s.next();
		if(ans.contains("y")||ans.contains("Y")){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("We need to check your luggage...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Everything seems fine!");	
		}
		System.out.println("Going through the Duty Free...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.descrp);
		System.out.println("Would you like to pick it up? (Rotate your phone to pick it up)");
		try 
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("You Have Successfully Added Dates To Your Back Pack");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Context state=new Context();
		state.setHappy();
		Swiper swipe=new Swiper(state);
		swipe.talk();
		try {
			swipe.getInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finding the gate...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Found Gate Waiting for Departure");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Walking towards the Attendant");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Message n = new Message(this, "Attendant", "Walking");
		publishMessage(n);
		Emma.talk();
	}

	@Override
	public String LookAround() {
		// TODO Auto-generated method stub
		return Description;
	}

	@Override
	public void leaveLandmark() {
		// TODO Auto-generated method stub
		Message m=new Message(this, "done","Abu Dhabi");
		publishMessage (m);
	}

}

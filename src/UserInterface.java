public class UserInterface extends ConcreteSubject implements Runnable{

	private static UserInterface inst = null;
	
	 private UserInterface(){
		Thread t = new Thread(this);
		t.start();
	}
	
	 public static UserInterface getInstance()
	    {
			if (inst == null)
	        	inst = new UserInterface();
	  
	        return inst;
	    }

	 
	
	@Override
	public void run() {

		System.out.println("\n"
				+ " _____ ____ ____ _ _       ____ _____   _____ _    _____   ______     _ ____ ____ _____ _________ \n"
				+ "/__ __/  __/  _ / / \\     /  _ /    /  /__ __/ \\ //  __/  /  __/ \\__// /  __/  _ /__ __/  __/ ___\\\n"
				+ "  / \\ |  \\/| / \\| | |     | / \\|  __\\    / \\ | |_||  \\    |  \\ | |\\/|| |  \\/| / \\| / \\ |  \\ |    \\\n"
				+ "  | | |    | |-|| | |_/\\  | \\_/| |       | | | | ||  /_   |  /_| |  || |    | |-|| | | |  /_\\___ |\n"
				+ "  \\_/ \\_/\\_\\_/ \\\\_\\____/  \\____\\_/       \\_/ \\_/ \\\\____\\  \\____\\_/  \\\\_\\_/\\_\\_/ \\| \\_/ \\____\\____/\n"
				+ "                                                                                                  \n"
				+ "\n"
				+ "                   ---- Created by Motasem, Ali, Shragah, and Yousef ----");
		
		System.out.println("\n\nFinishing a business trip in Ajman, you need to visit the landmarks in each Emirate within a specified amount of time to catch your flight.\n"
				+ "Your journey begins with a taxi ride! The game has collectibles that are available at each Emirate.\n"
				+ "Have your phone ready for certain interactions!\n\n");
		
		
		//TIMER STARTS
		Clock clk = Clock.getInstance();
		
		System.out.println("You're now at the hotel.. ");
		//---- Hotel Lobby --//
		HotelLobbyist lobbyist = new HotelLobbyist();
		lobbyist.talk();
		lobbyist.checkout();		
		

		//-- Locations --//
		AbuDhabiAirport airport = new AbuDhabiAirport(new Dates());
		SouqAlQadeem souq = new SouqAlQadeem(new Oud());
		DubaiMall mall = new DubaiMall(new Picture());
		// -- TCP -- //
		//Landmark [] array= {airport,souq,mall,beach};
		TCP client = new TCP ("192.168.0.125",57251);
		ZorahBeach beach = new ZorahBeach(new Dallah(client));
		Subject [] arr= {airport,souq,mall,beach,client};
		
		//---- Taxi Call --- //

		System.out.println("You're now on the road.. Wave your phone to call a taxi!");
		Taxi cab = new Taxi(arr);
		Transport transport = new Transport(cab,beach,souq,mall,airport);
		

} }


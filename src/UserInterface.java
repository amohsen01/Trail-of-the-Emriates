import java.util.Scanner;

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
		Scanner playerInput = new Scanner(System.in);  
		TCP client = new TCP("192.168.0.125", 55953);

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
				+ "You may choose to travel by taxi or walking.The game has collectibles that are be available at each Emirate that will add to your score.\n"
				+ "Have your phone ready for certain interactions!\n\n");
		
		
		//TIMER STARTS
		Clock clk = Clock.getInstance();
		
		//---- Hotel Lobby --//
		HotelLobbyist lobbyist = new HotelLobbyist();
		lobbyist.talk();
		lobbyist.checkout();
		
		//---- Taxi Call --- //
		
		

		//-- Locations --//
		AbuDhabiAirport airport = new AbuDhabiAirport(new Dates());
		SouqAlQadeem souq = new SouqAlQadeem(new Oud());
		DubaiMall mall = new DubaiMall(new Picture());
		ZorahBeach beach = new ZorahBeach(new Dallah());
		// -- TCP -- //
		//Landmark [] array= {airport,souq,mall,beach};
		Subject [] arr= {airport,souq,mall,beach,client};
		Taxi cab = new Taxi(arr);
		Transport transport = new Transport(cab);
		

} }


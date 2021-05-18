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
		
		
		while(true) {
			
			System.out.println("Are you ready to play? Type 1 to start and 2 to exit\n");
			int option = playerInput.nextInt();
			String input;
			while(option == 1 || option == 2) {
			switch (option) {
			
			//Game Start
			case 1:
				//TIMER STARTS
				Clock clk = Clock.getInstance();
				System.out.println("You're now in ajman! Pick a transportation method:");
				
				input = playerInput.next();

				
				break;
			case 2: 
				System.out.println("\nGoodbye!");
				System.exit(1); break;
			}
			
			}
			System.out.println("\nWrong input! Try again..");
		}
	}

}

 
public class ZorahBeach extends Landmark
{
	static String description="At a distance of 18 km from Ajman Bus Station, Al Zorah Beach is a public beach situated at Al Zorah locality of Ajman.\nIt is one of the popular beaches in Ajman. \nAl Zorah Beach is a pristine beach with clear waters and smooth white sand. It is a nice place to visit especially when you prefer a quiet place as it is less crowded.";

	ZorahBeach( Collectible collectible) 
	{
		super("Zorah Beach", "Ajman", collectible, description);
		
	}

	@Override
	public void Explore() 
	{
		System.out.println("\nYou have entered the Beach");
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("                ._-_,           ... ...              `  _  '\r\n"
				+ "              -=_* =-  ...  ... :.: : :             -  (_)  -\r\n"
				+ "              ,'/'`\\   :  `'  : ... : :,:  .::.\r\n"
				+ "             //        : :`': : : : : :.'  : :'       '   `\r\n"
				+ "____________//_________:.:__:.:_:.:_:.:``:_`:.:_____________________\r\n"
				+ "~ ____,----/ |_    ~                 ~~                 ~\r\n"
				+ "-'  ________   `-.__     ~                  ~                 _  _/`\r\n"
				+ "  ,',---\\\\--\\       `-.____        ~~~              ~   __,--'  c\"}\r\n"
				+ "  \\`-____\\\\__\\             `----.________________,-----'       ,(_).\r\n"
				+ "   `~~~~~~~~~'                                                  -\"-\r\n"
				+ "\r\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You see some people swimming on one side, and on the other side people are fishing...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("A kind stranger offered you a cup of tea and you had a nice conversation!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String LookAround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leaveLandmark() 
	{
		Message m=new Message(this, "done","Ajman");
		publishMessage(m);
	}

}

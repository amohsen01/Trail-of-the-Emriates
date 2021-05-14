
public class Ajman extends Landmark{

	Ajman(String name, String location, Collectible collectible, String Description) {
		super("Zorah Beach", "Ajman", collectible, Description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Explore() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the Beach");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You see some people swimming on one side, and on the other side people are fishing...");
		try {
			Thread.sleep(1000);
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
	public void leaveLandmark() {
		// TODO Auto-generated method stub
		
	}

}


public class Picture extends Collectible implements Observer{

	public Picture() {
		super("Picture at Burj Khalifa ", "The Photographer Took A Picture Of "
		+ "You At Burj Khalifa It Would Make An Amazing "
		+ "Memory For You To Keep ", "You Have Successfully Added The Photo At Burj Khalifa To Your Back Pack");
	}

	@Override
	public void descrp()
	{
	System.out.println(descrp);	
	}
	
	@Override
	public void pickUp() {
		
	System.out.println(pick);
	
	}

	@Override
	public void update(Message m) {
		if (m.topic == "movement")
		{
			System.out.println(pick);
		}
	}

	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
}

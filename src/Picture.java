
public class Picture extends Collectible {

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
}

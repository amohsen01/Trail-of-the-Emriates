public class Oud extends Collectible implements Observer
{
	public Oud() 
	{
			super("Oud", "The Oud Is An Arabic Instrument That Is Similar To The Guitar,"
					+ " You Can play Any Melody With It! ", "You Have Successfully Added Oud To Your Back Pack" );	
	}
	
	@Override
	public void descrp()
	{
		System.out.println(descrp);	
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
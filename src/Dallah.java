public class Dallah extends Collectible implements Observer 
{
	Subject s;
	
	public Dallah(Subject s) 
	{
		super("Dallah","The Dallah Is A Traditional Coffee Pot That Would Make "
			+ "An Amazing Souvenir To Add To Your Collection !\n", "You Have Successfully Added"
			+ " Dallah To Your Back Pack ");
		this.s=s;
		s.registerObserver(this);
	}

	public Dallah()
	{
		super("Dallah","The Dallah Is A Traditional Coffee Pot That Would Make "
			+ "An Amazing Souvenir To Add To Your Collection !\n", "You Have Successfully Added"
			+ " Dallah To Your Back Pack ");
	}

	@Override
	public void descrp()
	{
		System.out.println(descrp);
	}

	@Override
	public void update(Message m) 
	{
		
		if (m.payload == "movement"&&check==false )
		{
			System.out.println(pick);
			check=true;
		}
	}

	@Override
	public void update(String m) 
	{
		
	}
}

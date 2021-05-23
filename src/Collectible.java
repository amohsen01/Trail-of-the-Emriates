public abstract class Collectible
{
	String name;
	String descrp;
	String pick;
	boolean check = true;
	
	public Collectible (String name,String descrp,String pick) 
	{
		this.name=name;
		this.descrp=descrp;
		this.pick=pick;
	}

	public void descrp ()
	{
	
	}

public void pickUp ( ) {

}
public void check() {
	
	check=false;
}

}
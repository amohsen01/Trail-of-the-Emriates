
public class Oud extends Collectible {

public Oud() {
super("Oud", "The Oud Is An Arabic Instrument That Is Similar To The Guitar,"
		
+ " You Can play Any Melody With It! ", "You Have Successfully Added Oud To Your Back Pack" );
		
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
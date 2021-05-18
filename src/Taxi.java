
public class Taxi extends Collectible {
	
	public Taxi() {
	super("Taxi", " The Taxi Will Take You To Any Of The Following Locatinos In Order : Al Zorah Beach , Souq Al Qadeem ,"
	+ " Burj Khalifa , Abu Dhabi Airport. ",
	"To Call The Taxi To Pick You Up Wave With Your Phone And Say The Word Taxi ! ");
	
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


public class Dates extends Collectible {

	public Dates(String name, String descrp, String pick) {
super("Dates", "These Dates Are Freshly Picked And Would"
+ " Make A Great Snack, They're On Sale And Could Only Be Found In The Airport !" , 
"You Have Successfully Added Dates To Your Back Pack");

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


public class Dallah extends Collectible {

public Dallah() {
	
super("Dallah","The Dallah Is A Traditional Coffee Pot That Would Make "
+ "An Amazing Souvenir To Add To Your Collection !  + ", "You Have Successfully Added"
+ " Dallah To Your Back Pack ");

}


@Override
public void descrp() {
System.out.println(descrp);
}

@Override
public void pickUp() {
System.out.println(pick);
}

}

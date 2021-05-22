
public class Dallah extends Collectible implements Observer {

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

import java.util.ArrayList;

public abstract class Landmark extends Collectible implements Subject{

	String name;
	String location; // Dubai, ajman ...
	Collectible collectible;
	String Description;
	ArrayList observers=new ArrayList();
	
	public abstract void Explore();
	public abstract String LookAround();
	public abstract void leaveLandmark();
	Landmark(String name,String location, Collectible collectible, String Description){
		super(collectible.name,collectible.descrp,collectible.descrp);
		this.name=name;
		this.location=location;
		this.collectible=collectible;
		this.Description=Description;
		
	}
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}
	@Override
	public void publishMessage(Message m) {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
			Observer observe=(Observer)(observers.get(i));
			observe.update(m);
			
		}
	}



	@Override
	public void notifyObserver(String m) {

		for(int i=0;i<observers.size();i++) {
			Observer observe=(Observer)(observers.get(i));
			observe.update(m);
			
		}
	}
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
			if ((Observer)(observers.get(i))==o) {
				observers.remove(i);
			}
			
		}
	}

}

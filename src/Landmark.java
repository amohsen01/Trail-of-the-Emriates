
public abstract class Landmark implements Collectible {

	String name;
	String location; // Dubai, ajman ...
	Collectible collectible;
	String Description;
	
	public abstract void Explore();
	public abstract String LookAround();
	public abstract void leaveLandmark();
	Landmark(String name,String location, Collectible collectible, String Description){
		this.name=name;
		this.location=location;
		this.collectible=collectible;
		this.Description=Description;
		
	}
}

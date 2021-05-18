
public abstract class Characters {

	String name;
	String conversation;
	
	public Characters(String name, String conversation)
	{
		this.name = name;
		this.conversation = conversation;
	}

	public void talk ()
	{
		System.out.println(conversation);
	}
	
	
}
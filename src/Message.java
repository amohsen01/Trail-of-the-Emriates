
public class Message {

	
	
	String payload;
	String topic;
	Object o;
	String message="object: "+this+" payload: "+payload+" topic: "+topic;
	
	//Trouble shooting
	public String toString() {
		return message;
		
	}
	
	Message(Object j, String topic, String payload){
		this.o=j;
		this.topic=topic;
		this.payload=payload;
		
		
	}
	
}

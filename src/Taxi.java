import java.util.Scanner;

public class Taxi extends ConcreteSubject implements Runnable,Observer
{
	
	Subject s;

	Taxi(Subject s)
	{
	this.s=s;
		Thread start=new Thread(this);
		start.start();	
	}
	
	Taxi(Subject s[])
	{
		for (int i = 0; i <s.length; i++) {
			this.s=s[i];
			this.registerObserver(this);
		}
		Thread start=new Thread(this);
		start.start();	
	}
	
	@Override
	public void run() 
	{
		
		while(true);
	}

	public void update(Message m) 
	{
	//here we can implement the message system;
		if (m.topic=="done")
		{ 	Message message;
			switch(m.payload) 
			{
		
				case "Ajman": System.out.println("Hope you enjoyed Al Zorah Beach our next destination is Souq Al Qadeem ");
					message=new Message(this, "goto", "Sharjah");
					publishMessage(message);
					break;
				case "Sharjah": System.out.println("Hope you enjoyed the Souq Al Qadeem our next destination is the Dubai Mall");
				message=new Message(this, "goto", "Dubai");
				publishMessage(message);
					break;		
				case "Dubai": System.out.println("Hope you enjoyed the Dubai Mall our next destination is Abu Dhabi Airport  ");
				message=new Message(this, "goto", "AbuDhabi");
				publishMessage(message);
					break;
				case "Abu Dhabi":System.out.println("You have reached your destination, Hope you had a fun time in the Emirates!");

					break;
			}
		}
	
		if(m.topic=="phone")
		{
			if(m.payload == "wave")
			{
				System.out.println("You are now in the Taxi ");
			}
		}
	}

	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
}

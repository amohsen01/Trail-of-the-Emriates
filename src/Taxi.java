import java.util.Scanner;

public class Taxi extends ConcreteObserver implements Runnable
{
	
Subject s;

	Taxi(Subject s){
		super(s);
		Thread start=new Thread(this);
		start.start();
		
	}
	
	
	

@Override
public void run() {
	
}

public void update(Message m) {
	//here we can implement the message system;
	
	
	if (m.topic=="done"){
		switch(m.payload) {
		case "Ajman": System.out.println("Hope you enjoyed Al Zorah Beach our next destination is Souq Al Qadeem "); 
		case "Sharjah": System.out.println("Hope you enjoyed the Souq Al Qadeem our next destination is the Dubai Mall");
		case "Dubai": System.out.println("Hope you enjoyed the Dubai Mall our next destination is Abu Dhabi Airport  "); 
		case "Abu Dhabi":System.out.println("You have reached your final destination");
		
		}}
	if(m.topic=="phone")
	{
		if(m.payload == "wave")
		{
			System.out.println("You are now in the Taxi ");
	}
}
	
}}

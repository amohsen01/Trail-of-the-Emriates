public class ConcreteObserver implements Observer {

private Subject subject;
public ConcreteObserver(Subject subject)
{
	this.subject = subject;
	subject.registerObserver(this);
}

public ConcreteObserver(ConcreteSubject[] subjects)
{
	for(int i=0;i<subjects.length;i++) 
	{
		this.subject = subjects[i];
		subject.registerObserver(this);
	}
}

	
	public void update(Message M) {
		// TODO Auto-generated method stub
		
	}

	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
	
	

}

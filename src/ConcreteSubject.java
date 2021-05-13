import java.util.ArrayList;

public class ConcreteSubject implements Subject {
ArrayList observers=new ArrayList();

	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
			if ((Observer)(observers.get(i))==o) {
				observers.remove(i);
			}
			
		}
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

}

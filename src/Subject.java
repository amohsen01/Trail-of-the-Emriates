public interface Subject {


	public void notifyObserver(String m);
	public void publishMessage(Message m);
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	
	
	
	
}

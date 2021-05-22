public class Transport implements Observer
{

	@Override
	public void update(Message m) {
		if (m.topic == "done")
		{
			if (m.payload == "Ajman")
			{
				
			}
			else if(m.payload == "Sharjah")
			{
				
			}
			else if(m.payload == "Dubai")
			{
				
			}
			else if(m.payload == "Abu Dhabi")
			{
				
			}
		}
	}

	@Override
	public void update(String m) {
		// TODO Auto-generated method stub
		
	}
	
}

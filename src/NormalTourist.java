
public class NormalTourist implements State{

	@Override
	public void prev(Context context) {
		// TODO Auto-generated method stub
		context.setState(new SadTourist());
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		context.setState(new HappyTourist());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("My mood is normal. Maybe I needed to explore the city...");
	}

}

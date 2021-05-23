
public class HappyTourist implements State{

	@Override
	public void prev(Context context) {
		// TODO Auto-generated method stub
		context.setState(new NormalTourist());
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		System.out.print("I am ecstatic!!!");
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("I'm so happy that I have visited and explored the place!");
	}

}

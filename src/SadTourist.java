
public class SadTourist implements State {

	@Override
	public void prev(Context context) {
		// TODO Auto-generated method stub
		System.out.println("This is a bad experience...");
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		context.setState(new NormalTourist());;
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("This is a bad experience...");
	}

}

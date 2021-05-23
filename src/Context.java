


	public class Context {
		private State state = new NormalTourist();
		public void previousState() {
		state.prev(this);
		}
		public void nextState() {
		state.next(this);
		}
		public void printStatus() {
		state.printStatus();
		}
		public void setState(State state) {
		this.state = state;
		}
		public void setSad() {
			state=new SadTourist();
			state.printStatus();
		}
		public void setNormal() {
			state=new NormalTourist();
			state.printStatus();
		}
		public void setHappy() {
			state=new HappyTourist();
			state.printStatus();
		}
		}

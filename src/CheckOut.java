public abstract class CheckOut {

  CheckOut(){
	  
  }

final  void prepareToCheckout() {
	pullFromPocket();
	handIn();
	Check();
	Valid();
	
}

protected void Check() {
	System.out.println("-- Your documents are being checked --");
}
protected void Valid() {
	System.out.println("-- Documents are now validated --");
}

abstract void pullFromPocket();
abstract void handIn();

}

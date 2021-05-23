
public class DubaiMall extends Landmark {



	DubaiMall(Collectible collectible){
	super("Dubai Mall", "Dubai", collectible, "\nLocated in the heart of the prestigious Downtown Dubai is The Dubai Mall, the most-visited retail and entertainment destination, which welcomes more than 80 million visitors annually.\nThe Dubai Mall has over 1,300 retail outlets, including two anchor department stores – Galeries Lafayette and Bloomingdale’s – and over 200 food and beverage outlets.\r\nThe Dubai Mall offers an unparalleled retail variety combined with world-class dining, entertainment and leisure attractions. The Fashion Avenue, the precinct dedicated to over 150 new luxury shopping and dining experiences, positions The Dubai Mall as the fashion capital for the Middle East.\nAnother niche component is The Souk, an elegantly designed precinct featuring jewellery shops, accessory outlets, traditional Arab clothing brands, handicraft stores, cafés and restaurants.");

}

	@Override
	public void Explore() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the Mall");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("		_ _.-'`-._ _\r\n"
				+ "                ;.'________'.;\r\n"
				+ "     _________n.[____________].n_________\r\n"
				+ "    |\"\"_\"\"_\"\"_\"\"||==||==||==||\"\"_\"\"_\"\"_\"\"]\r\n"
				+ "    |\"\"\"\"\"\"\"\"\"\"\"||..||..||..||\"\"\"\"\"\"\"\"\"\"\"|\r\n"
				+ "    |LI LI LI LI||LI||LI||LI||LI LI LI LI|\r\n"
				+ "    |.. .. .. ..||..||..||..||.. .. .. ..|\r\n"
				+ "    |LI LI LI LI||LI||LI||LI||LI LI LI LI|\r\n"
				+ " ,,;;,;;;,;;;,;;;,;;;,;;;,;;;,;;,;;;,;;;,;;,,\r\n"
				+ ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nYou are looking through the shops.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You are looking at the Aquarium.");
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You are heading to the water front.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You are watching the show at the water fountain.");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String LookAround() {
		// TODO Auto-generated method stub
		return this.Description;
	}

	@Override
	public void leaveLandmark() {
		// TODO Auto-generated method stub
		Message m=new Message(this, "done","Dubai");
		publishMessage(m);
	}





}

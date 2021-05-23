import java.util.Scanner;

public class SouqAlQadeem extends Landmark{
static String Description= "Built on the foundations of one of the oldest and most vibrant souks in the region, this beautifully renovated souk specialises in regional designers and unique wares.\r"
		+ "Shop for stylish furniture and homewares, prayer beads, Arabic perfumes and oils, and high-quality clothing including bespoke kandoras and handcrafted abayas.\nRefuel at a speciality coffee house and enjoy delicious Emirati cuisine at Al Saroud Traditional Restaurant.";
	
SouqAlQadeem(Collectible collectible) {
		super("Souq Al Qadeem", "Sharjah", collectible, Description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Explore() {
		// TODO Auto-generated method stub
		System.out.println("\nIt is a great weather outdoors to be able to go around shopping outdoors!");
		System.out.println("You are walking around the local clothing store...");
		try
		{
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Going to the left you find the perfume stores, these walk ways smell so fragrant and nice!");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Walking further into the souq you find a couple of restaurants and you feel a bit hungry...Type yes to eat or No to not eat");
		Scanner s=new Scanner(System.in);
		String string=s.nextLine();
		if(string.contains("Y")||string.contains("y")) {
			System.out.println("\nYou are now being served Harees, and it looks delicious!");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You are now being served the main meal, Machboos, and it smells really nice");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You are now being served dessert, Luqaimat, and it looks so sweet");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("The Oud Is An Arabic Instrument That Is Similar To The Guitar,You Can play Any Melody With It! ");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Would you like to get an Oud?");
		if(string.contains("Y")||string.contains("y"))
		{
			System.out.println("You Have Successfully Added Oud To Your Back Pack");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		System.out.println("You now see the exit do you want to go through the souk again?");
		string=s.nextLine();
		if(string.contains("Y")||string.contains("y")) {
			this.Explore();
		}
		else this.leaveLandmark();}
	}
	@Override
	public String LookAround() {
		// TODO Auto-generated method stub
		return Description;
	}

	@Override
	public void leaveLandmark() {
		// TODO Auto-generated method stub
		Message m=new Message(this, "done", "Sharjah");
		publishMessage(m);
	}



}

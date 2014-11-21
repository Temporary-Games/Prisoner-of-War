package pow;

import java.io.FileNotFoundException;

public class Main {
	// rounds of game
	private int rounds = 0;

	public static void main(String[] args) {
		try {
			Event stuff = new Event();
		} catch (FileNotFoundException e) {
			System.out.println("You borked teh codez.");
			e.printStackTrace();
		}
		
		Inventory playerInv = new Inventory(0, 0, 0, 0, 0);
		playerInv.addItem(0);
		
	}

}

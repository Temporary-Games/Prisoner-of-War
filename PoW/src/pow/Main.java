package pow;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	// rounds of game

	public static void main(String[] args) {
		int rounds = 30;
		Inventory playerInv = new Inventory(0, 0, 0, 0, 0);
		for (int x = 0; x < rounds; x++) {
			try {
				Event stuff = new Event();
			} catch (FileNotFoundException e) {
				System.out.println("You borked teh codez.");
				e.printStackTrace();
			}
			Scanner scan = new Scanner(System.in);
			do{
			
				
				
			}while(!(scan.nextLine().equalsIgnoreCase("next")));

		}

	}
}

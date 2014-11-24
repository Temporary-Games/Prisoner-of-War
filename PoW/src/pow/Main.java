package pow;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	// rounds of game

	public static void main(String[] args) throws FileNotFoundException {
		int rounds = 30;
		int guardAgro = 0;
		int savedPrisoners = 0;
		Inventory playerInv = new Inventory(0, 0, 0, 0, 0);
		for (int currentRound = 0; currentRound < rounds; currentRound++) {
			Event stuff = new Event();
			Scanner scan = new Scanner(System.in);
			do {
				System.out.println("Round: " + currentRound);
				System.out.println(stuff.getTitle());
				guardAgro += stuff.getGuardAggression();
				System.out.println("Guard Agression: " + guardAgro);
				if (guardAgro >= 10) {
					guardAgro = 0;
					savedPrisoners--;
					System.out.println("A prisoner was killed by the guards.");
				}
				
				

			} while (!(scan.nextLine().equalsIgnoreCase("next")));

		}

	}
}

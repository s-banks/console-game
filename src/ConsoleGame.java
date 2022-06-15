import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;


public class ConsoleGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//Have user set their name
		System.out.println("What is your name, hero?");
		String playerName = String.valueOf(scanner.nextLine());
//Create player character with pre-made stats
		PlayerChar player = new PlayerChar(playerName, 9, 9, 16, 17, 18);
//create monster characters.
		//Goblins
		MonsterChar Goblin1 = new MonsterChar("Goblin", 1, 7, 7, 8);
		MonsterChar Goblin2 = new MonsterChar("Goblin", 1, 7, 7, 8);
		MonsterChar Goblin3 = new MonsterChar("Goblin", 1, 7, 7, 8);
		MonsterChar Goblin4 = new MonsterChar("Goblin", 1, 7, 7, 8);
		//Kobolds
		MonsterChar kobold1 = new MonsterChar("Kobold", 3, 6, 10, 9);
		MonsterChar kobold2 = new MonsterChar("Kobold", 3, 6, 10, 9);
		MonsterChar kobold3 = new MonsterChar("Kobold", 3, 6, 10, 9);
		MonsterChar kobold4 = new MonsterChar("Kobold", 3, 6, 10, 9);
		//Bullywugs
		MonsterChar bullywug1 = new MonsterChar("Bullywug", 5, 14, 19, 19);
		MonsterChar bullywug2 = new MonsterChar("Bullywug", 5, 14, 19, 19);
		MonsterChar bullywug3 = new MonsterChar("Bullywug", 5, 14, 19, 19);
		MonsterChar bullywug4 = new MonsterChar("Bullywug", 5, 14, 19, 19);
//Create items
		Items weakHealthPot = new Items("Weak Health Potion", 2, 0, 0, 0);
		Items healthPot = new Items("Health Potion", 4, 0, 0, 0);
		Items QualHealthPot = new Items("Quality Health Potion", 2, 0, 0, 0);
//Game intro text
		System.out.println("Welcome to the World of Sutal, " + player.getName() + "!");
		System.out.println("We have summoned you from your world to defeat the Demon Lord Varthos.");
		System.out.println("Press enter to continue.....");
		scanner.nextLine();
		clrScrn();
		System.out.println("We are giving you the magic sword Farenthal to aid you in your quest. In order to successfully defeat the Demon Lord, ");
		System.out.println("you will need to venture out the gates of our fair city, Errdonia, and fight monsters to grow in strength and power.");
		System.out.println("Press enter to continue.....");
		scanner.nextLine();
		clrScrn();
		System.out.println("There is more for you to know, but hey, this is just a demo! Get out there and fight stuff!");
		System.out.println("What do you wish to do? (L)eave town or (E)xit game?");
		String userChoice = scanner.next();
		if(userChoice.equalsIgnoreCase("e")) {
			exitGame();
		} else if(userChoice.equalsIgnoreCase("l")) {
			System.out.println("Leaving town somehow!");
		} else {
			System.out.println("Damn, you broke something");
		}



	}

//Random generator for dmg dealt. Random 1-3 dmg.
		public static void dmgGen() {
			// define the range
			int max = 3;
			int min = 1;
			int range = max - min + 1;
			// generate the random number
				int rand = (int)(Math.random() * range) + min;
				System.out.println(rand);
			}

//method to scroll blank lines to clear off old text
		public static void clrScrn() {
			for (int i = 0; i < 50; ++i)
				System.out.println();
		}

//method to manually exit program if user selects the option
		public static void exitGame() {
			System.out.println("Terminating game...cause you suck");
			System.exit(0);
		}






}


























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
		//Health pots
		Items weakHealthPot = new Items("Weak Health Potion", 2, 0, 0, 0);
		Items healthPot = new Items("Health Potion", 4, 0, 0, 0);
		Items QualHealthPot = new Items("Quality Health Potion", 6, 0, 0, 0);
		//Strength pot
		Items WeakStrPot = new Items("Weak Health Potion", 0, 1, 0, 0);
		//Constitution pot
		Items WeakConPot = new Items("Weak Health Potion", 0, 0, 1, 0);
		//Dexterity pot
		Items WeakDexPot = new Items("Weak Health Potion", 0, 0, 0, 1);
//Game intro text
		System.out.println("Welcome to the World of Sutal, " + player.getName() + "!");
		System.out.println("We have summoned you from your world to defeat the Demon Lord Varthos.");
		System.out.println("Press enter to continue.....");
		scanner.nextLine();
		clrScrn();
		System.out.println("We are giving you the magic sword Farenthal to aid you in your quest. In order to successfully defeat the Demon Lord, ");
		System.out.println("you will need to venture out the gates of our fair city, Caldonia, and fight monsters to grow in strength and power.");
		System.out.println("Press enter to continue.....");
		mvScrn();
		scanner.nextLine();
		clrScrn();
		System.out.println("There is more for you to know, but hey, this is just a demo! Get out there and fight stuff!");
		System.out.println("What do you wish to do? (L)eave town or (E)xit game?");
		mvScrn();
		String userChoice = scanner.next();
		if (userChoice.equalsIgnoreCase("e")) {
			exitGame();
		} else if (userChoice.equalsIgnoreCase("l")) {
			leaveTown();
		} else {
			userIsDumb();
		}


	}

	//Random generator for dmg dealt. Random 1-3 dmg.
	public static void dmgGen() {
		// define the range
		int max = 3;
		int min = 1;
		int range = max - min + 1;
		// generate the random number
		int rand = (int) (Math.random() * range) + min;
		System.out.println(rand);
	}

//method to scroll blank lines to clear off old text - 50 lines
	public static void clrScrn() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

//method to scroll blank lines to clear off old text - 7 lines
	public static void mvScrn() {
		for (int i = 0; i < 7; ++i)
			System.out.println();
	}

//method to manually exit program if user selects the option to quit
	public static void exitGame() {
		System.out.println("Terminating game...");
		System.exit(0);
	}

//
	private static void leaveTown() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You decide to leave the town and enter the grasslands outside the city");
		//would prompt for another selection of choices here, but for now will force an encounter
		System.out.println("Press enter to continue.....");
		mvScrn();
		smackStuff();
	}

//exit method for incorrect user selections
	private static void userIsDumb() {
		System.out.println("It seems simple instructions aren't your forte. Very well, exiting the game...");
		System.exit(64);
	}

	private static void smackStuff() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A nasty-smelling green creature carrying a club runs towards you.");
		System.out.println("Seems it is time to fight...");
		System.out.println("Press enter to continue.....");
		mvScrn();
		scanner.nextLine();
	}




}
























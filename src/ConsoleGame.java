import java.util.Scanner;

public class ConsoleGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your player name?");
		String playerName = String.valueOf(scanner.nextLine());
		System.out.println("How much HP?");
		Integer userHp = Integer.valueOf(scanner.nextLine());
		System.out.println("How much Str?");
		Integer userStr = Integer.valueOf(scanner.nextLine());
		System.out.println("How much Con?");
		Integer userCon = Integer.valueOf(scanner.nextLine());
		System.out.println("How much Dex?");
		Integer userDex = Integer.valueOf(scanner.nextLine());
		PlayerChar player = new PlayerChar(playerName, userHp, userStr, userCon, userDex);
		//player.setName("Tim");
		//player.setStr(2);
		System.out.println(player.getName());
		System.out.println(player.getHp());
		System.out.println(player.getStr());
		System.out.println(player.getCon());
		System.out.println(player.getdex());


	}


























}

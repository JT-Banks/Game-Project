import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Random rand = new Random();
		Player player = new Player(0, 0, 0, 0, 0, 0, 0);
		Skeleton skele = new Skeleton(" ", 0, 0, 0, 0, 0, 0, 0, 0);
		player.playerAttack();
		//Enemy enemies = new Enemy(attack, attack, attack, attack, attack, attack);
		//int enemyRemainingHealth = Enemy.getEnemyRemainingHealth();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my work in progress.\n\nThe goal of this game is to practice the structure of 'good' code.");
		System.out.println("\nCurrent version: Alpha (ver 1.0)");
		System.out.println("\nCurrently in testing phase, please type 'play' to run the game");
		System.out.println("\nIf you wish to see your stats, type 'stats' at any time");
		String answer = scan.nextLine();
		boolean running = false;
		if(answer.equalsIgnoreCase("play")) {
			running = true;
			GAME:
				while(running) {

					System.out.println("\nPlayer HP: " + player.getHp());
					System.out.println("Player Mana: " + player.getMana() + "\n");
					System.out.println(skele.getName() + "'s HP: " +  skele.getHp());
					System.out.println(skele.getName() + "'s Mana: " + skele.getMana());
					System.out.println("\n## Command menu ##");
					System.out.print("1. Attack");
					System.out.println("\t  4. Magic");
					System.out.print("2. Use items");
					System.out.println("\t  5. Defend");
					System.out.print("3. Scan enemy");
					System.out.println("\t  6. Run\n");
					String input = scan.nextLine();

					if(input.equals("stats")) {
						player.display();
					}
					if(input.equals("1")) {
						System.out.println("#### You attack for: " + player.playerAttack() + " damage ####");
					}
				}
			scan.close();
		}
		/*
		 * else {
		 *	//System.out.println("Wrong input, try again");
		 * //answer = scan.nextLine();
		}
		 */
	}
}

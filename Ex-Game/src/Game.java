import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		//Create array of entities
		Entity[] entity;
		entity = new Entity[2];
		entity[0] = new Player(0, 0, 0, 0, 0, 0, 0, 0);
		//Player player = new Player(0, 0, 0, 0, 0, 0, 0, 0);
		Skeleton skele = new Skeleton(" ", 0, 0, 0, 0, 0, 0, 0, 0);
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

					System.out.println("\nPlayer HP: " + entity[0].getHp());
					System.out.println("Player Mana: " + entity[0].getMana() + "\n");
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
						entity[0].display();
					}
					
					if(input.equals("1")) {
						System.out.println("#### You attack for: " + entity[0].playerAttack() + " damage ####");
						System.out.println(skele.damageDone(entity[0].attackPwr));
					}
					
					if(skele.getHp() == 0) {
						System.out.println("*** " + skele.getName() + " was defeated! ***");
						System.out.println("You claim " + entity[0].getExp() +" experience points!");
						
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

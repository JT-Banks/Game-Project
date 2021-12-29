package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import entities.Goblin;
import entities.ParentEntity;
import entities.Player;
import entities.Skeleton;

public class Game {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Create array of entities
		ArrayList<ParentEntity> entity = new ArrayList<ParentEntity>();
		Random rand = new Random();
		entity.add(new Player());
		entity.add(new Skeleton());
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my work in progress.\n\nThe goal of this game is to practice the structure of 'good' code.");
		System.out.println("\nCurrent version: Alpha (ver 0.1)");
		System.out.println("\nCurrently in testing phase, please type 'play' to run the game");
		System.out.println("\nIf you wish to see your stats, type 'stats' at any time");
		String answer = scan.nextLine();
		boolean running = false;
		if (answer.equalsIgnoreCase("play")) {
			running = true;
			GAME: while (running) {
				if (entity.size() > 1) {
					int enemyHealth = entity.get(1).getHp();
					int playerHealth = entity.get(0).getHp();
					System.out.println("\nPlayer HP: " + entity.get(0).getHp());
					System.out.println("Player Mana: " + entity.get(0).getMana() + "\n");
					System.out.println(entity.get(1).getName() + "'s HP: " + enemyHealth);
					System.out.println(entity.get(1).getName() + "'s Mana: " + entity.get(1).mp);
					System.out.println("\n## Command menu ##");
					System.out.print("1. Attack");
					System.out.println("\t  4. Magic");
					System.out.print("2. Use items");
					System.out.println("\t  5. Defend");
					System.out.print("3. Scan enemy");
					System.out.println("\t  6. Run\n");
					String input = scan.nextLine();

					if (input.equals("stats")) {
						entity.get(0).display();
						entity.get(1).display();
					}
					if (input.equals("1")) {
						System.out.println("#### You attack for: " + entity.get(0).playerAttack() + " damage ####");
						enemyHealth = entity.get(1).hp -= entity.get(0).playerAttack();
						playerHealth = entity.get(0).hp -= entity.get(1).enemyAttack();
						System.out.println("### You take " + entity.get(1).enemyAttack() + " damage!");
					} else {
						System.out.println("Wrong input, try again");
						answer = scan.nextLine();
					}
					if (entity.get(1).hp < 0) {
						System.out.println("*** " + entity.get(1).getName() + " was defeated! ***");
						System.out.println("You claim " + entity.get(0).getExp() + " experience points!");
						entity.remove(1);
					}
				} else {
					int high = 2;
					int low = 1;
					int enemyEncounter = rand.nextInt(high - low) + low;
					entity.add(new Goblin());
				}
			}
		}
		scan.close();
	}
}
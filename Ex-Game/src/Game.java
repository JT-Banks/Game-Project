import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		//Create array of entities
		ArrayList<Entity> entity = new ArrayList<Entity>();	
		entity.add(new Player(0, 0, 0, 0, 0, 0, 0, 0));
		entity.add(new Skeleton(" ", 0, 0, 0, 0, 0, 0, 0, 0));
		int enemyHealth = entity.get(1).getHp();
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
					
					if(!entity.contains(1)) {
						entity.add(new Skeleton(" ", 0, 0, 0, 0, 0, 0, 0, 0));
					}			
					System.out.println("\nPlayer HP: " + entity.get(0).getHp());
					System.out.println("Player Mana: " + entity.get(0).getMana() + "\n");
					System.out.println(entity.get(1).getName() + "'s HP: " +  enemyHealth);
					System.out.println(entity.get(1).getName() + "'s Mana: " + entity.get(1).mp);
					System.out.println("\n## Command menu ##");
					System.out.print("1. Attack");
					System.out.println("\t  4. Magic");
					System.out.print("2. Use items");
					System.out.println("\t  5. Defend");
					System.out.print("3. Scan enemy");
					System.out.println("\t  6. Run\n");
					String input = scan.nextLine();

					if(input.equals("stats")) {
						entity.get(1).display();
						entity.get(1).display();
					}
					
					if(input.equals("1")) {
						
						System.out.println("#### You attack for: " + entity.get(0).playerAttack() + " damage ####");
						enemyHealth = entity.get(1).hp -= entity.get(0).playerAttack();		
					}
					
					if(entity.get(1).hp < 0) {
						entity.remove(1);
						System.out.println("*** " + entity.get(1).getName() + " was defeated! ***");
						System.out.println("You claim " + entity.get(0).getExp() +" experience points!");				
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

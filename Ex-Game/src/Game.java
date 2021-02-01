import java.util.Random;
import java.util.Scanner;
public class Game extends Enemy{
	public Game(int hp, int mp, int str, int dex, int attack, int level) {
		
		super(hp, mp, str, dex, attack, level);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Random rand = new Random();
		Player player = new Player();
		Enemy enemies = new Enemy();
		String[] enemyArray = {Enemy.brittleSkeleton()};
		//int enemyRemainingHealth = Enemy.getEnemyRemainingHealth();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my work in progress.\nThe goal of this game is to practice the structure of 'good' code.");
		System.out.println("Current version: Alpha (ver 1.0)");
		/*
		System.out.println("For a summary of each class's playstyle, simply type: [name of class] info, otherwise type: no thanks");
		String info = scan.nextLine();
		if(info != null && info.equalsIgnoreCase("mage info"))
			System.out.println("[~Mage focuses on dealing damage primarily. It has poor physical defense, but very high magical defense."
					+ "\nMage's specializes in dealing a lot of damage, for a steep cost.\nBalancing damage, resources, and surviving is key.~]");
		else if(info.equalsIgnoreCase("no thanks"))			
		*/
		//System.out.println("Currently during Alpha, only mage is available. Please select 'Mage'");
		String answer = scan.nextLine();
		boolean running = false;
		if(answer.equalsIgnoreCase("play")) {
			running = true;
			GAME:
				while(running) {
					String enemy = enemyArray[rand.nextInt(enemyArray.length)];
					System.out.println("\n\t ### " +enemy+ " ###");

					//System.out.println("\nYour HP: " + mage.getHp() + "\n" );
					//System.out.println("Your Mana: \n" );
				//	System.out.println(enemy + "'s HP: " +  enemyRemainingHealth);
					System.out.println("\n## Command menu ##");
					System.out.print("1. Attack");
					System.out.println("\t  4. Magic");
					System.out.print("2. Use items");
					System.out.println("\t  5. Defend");
					System.out.print("3. Scan enemy");
					System.out.println("\t  6. Run\n");
					String input = scan.nextLine();

					if(input.equals("1")) {
						player.getStats();
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

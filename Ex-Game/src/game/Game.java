package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import actions.Defend;
import entities.Goblin;
import entities.ParentEntity;
import entities.Player;
import entities.Skeleton;

public class Game {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Create array of entities
		ArrayList<ParentEntity> entity = new ArrayList<ParentEntity>();
		Random rand = new Random();
		Defend defend = new Defend();
		entity.add(new Player());
		entity.add(new Skeleton());
		Scanner scan = new Scanner(System.in);
		System.out.println("\nCurrent version: Alpha (ver. 0.1)");
		System.out.println("\nCurrently in testing phase, please type 'play' to run the game");
		System.out.println("\nIf you wish to see your stats, type 'stats' at any time");
		String answer = scan.nextLine();
		boolean running = false;
		if (answer.equalsIgnoreCase("play")) {
			running = true;
			GAME: while (running) {
				if (entity.size() > 1) {
					String input = battleMenu(entity, scan);
					if (input.equals("stats")) {
						entity.get(0).display();
					}
					if(input.equals("1")) {
						attackOption(entity);
					} 
					if(input.equals("2")) {
						
					}
					//display should work for every enemy
					//TODO: add description per enemy class
					if(input.equals("3")) {
						entity.get(1).display();
					}
					//MVP for now, implement more later
					if(input.equals("4")) {
						spellMenu(entity, scan);
						 
					}
					//TODO: implement damage reduction to all damage types
					if(input.equals("5")) {
						int playerDefense = entity.get(0).getDefense();
						int damageDone = defend.defend(entity.get(1).enemyAttack(), playerDefense);
						System.out.println(defend.defend(damageDone, playerDefense));
						System.out.println("You take: " + damageDone + " damage!");
					}
					
					if(input.equals("6")) {
						
					}
					
					if (entity.get(1).hp < 0) {
						enemyDefeated(entity);
					}
				}
				
			else {
					Object[] enemies = {new Goblin(), new Skeleton()};
					Object enemy = enemies[rand.nextInt(enemies.length)];
					entity.add((ParentEntity) enemy);
				}
			}
		} else {
			System.out.println("Input incorrect, please type 'play'");
			answer = scan.nextLine();
		}
		scan.close();
	}

	private static void spellMenu(ArrayList<ParentEntity> entity, Scanner scan) {
		System.out.println("**************");
		System.out.println("**Magic Menu**");
		System.out.println("**************");
		System.out.println("1. Incinerate (Cost: 6 MP, Damage: 20(base) + your level. Modified by your intelligence stat)");
		int magicMenuInput = scan.nextInt(); 
		scan.nextLine(); //Consume next line after int input
		switch(magicMenuInput) {
			case 1: if(entity.get(0).mp >= 6) {
				entity.get(0).mp -= 6;
				incinerateSpell(entity);
				break;
			}
			else {
				System.out.println("You do not have enough mana to cast that!");
			}
			default: break;
		}
	}

	@SuppressWarnings("unused")
	private static void incinerateSpell(ArrayList<ParentEntity> entity) {
		int spellDamageDone = entity.get(0).getStarterSpell();
		int damageDone = entity.get(1).enemyAttack();
		int enemyHealth = entity.get(1).hp -= spellDamageDone;
		System.out.println("** You cast Incinerate for " + spellDamageDone + " damage **");
		int playerHealth = entity.get(0).hp -= damageDone;
		System.out.println("# - You take " + damageDone + " damage -#");
	}

	@SuppressWarnings("unused")
	private static String battleMenu(ArrayList<ParentEntity> entity, Scanner scan) {
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
		return input;
	}

	@SuppressWarnings("unused")
	private static void attackOption(ArrayList<ParentEntity> entity) {
		int playerAttackDmg = entity.get(0).playerAttack() - entity.get(1).defense;
		//System.out.println("This is the damage you would've dealt: " + playerAttackDmg);
		int enemyAttackDmg = entity.get(1).enemyAttack() - entity.get(0).defense;
		int enemyHealth = entity.get(1).hp -= playerAttackDmg;
		int playerHealth = entity.get(0).hp -= enemyAttackDmg;
		if(playerAttackDmg <= 0) {
			System.out.println("You deal no damage!");
		} else {
		System.out.println("# - You attack for " + playerAttackDmg + " damage - #");
		}
		if(enemyAttackDmg <= 0) {
			System.out.println("You take no damage!");
		} else {
		System.out.println("# - You take " + enemyAttackDmg + " damage - #");
		}
	}

	private static void enemyDefeated(ArrayList<ParentEntity> entity) {
		System.out.println("\n*** " + entity.get(1).getName() + " was defeated! ***");
		System.out.println("You claim " + entity.get(0).getExp() + " experience points!");
		entity.remove(1);
	}
}

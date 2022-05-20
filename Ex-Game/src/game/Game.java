package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import actions.Defend;
import actions.Spells;
import entities.Goblin;
import entities.ParentEntity;
import entities.Player;
import entities.Skeleton;
import menus.BattleMenu;
import menus.SpellMenu;

public class Game {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Create array of entities
		ArrayList<ParentEntity> entity = new ArrayList<ParentEntity>();
		Random rand = new Random();
		Defend defend = new Defend();
		Spells spells = new Spells();
		SpellMenu spellMenu = new SpellMenu();
		//BattleMenu battleMenu = new BattleMenu();
		entity.add(new Player());
		entity.add(new Skeleton());
		Scanner scan = new Scanner(System.in);
		System.out.println("\nCurrent version: Alpha (ver. 0.0.1)");
		System.out.println("\nCurrently in testing phase, please type 'play' to run the game");
		System.out.println("\nIf you wish to see your stats, type 'stats' at any time");
		String answer = scan.nextLine();
		boolean running = false;
		if (answer.equalsIgnoreCase("play")) {
			running = true;
			GAME: while (running) {
				if (entity.size() > 1) {
					//need input to toggle battle menu
					String input = BattleMenu.battleMenu(entity, scan);
					if (input.equals("stats")) {
						entity.get(0).display();
					}
					if(input.equals("1")) {
						BattleMenu.attackOption(entity);
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
						spellMenu.initializeSpellMenu(entity);
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
					
					if (entity.get(1).getHp() < 0) {
						BattleMenu.enemyDefeated(entity);
					}
				}
				
			else {
					Object[] enemies = {new Goblin(), new Skeleton()};
					Object enemy = enemies[rand.nextInt(enemies.length)];
					entity.add((ParentEntity) enemy);
				}
			}
		}
		else {
			System.out.println("Input incorrect, please type 'play'");
			scan.nextLine();
		}
		scan.close();
	}
}

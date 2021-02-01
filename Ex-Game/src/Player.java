import java.util.concurrent.ThreadLocalRandom;

public class Player extends Creature {
	
	public Player() {

		Creature.hp += 12;
		Creature.mp += 40;
		Creature.str -= 4;
		Creature.dex += 6;
		Creature.intell += 16;
		Creature.mnd += 10;
		Creature.lck += 1;
		Creature.attack -= 6;
		Creature.level = 1;
	}

	public static void statSheet() {

		System.out.println("==== Stats ====\nClass: Mage\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexiterity: " + dex 
				+ "\nIntelligence: " +intell + "\nMind: " + mnd + "\nLuck: " + lck);
	}

	public static int mageAttack() {
		Enemy enemies = new Enemy();
		int mageAttack = ThreadLocalRandom.current().nextInt(4, attack);
		System.out.println("\n### You attacked for: " + mageAttack + " damage! ###\n");
		int enemyRemainingHealth = enemies.getBrittleSkeletonHp() - mageAttack;
		System.out.println("Test: Enemy HP: " + enemyRemainingHealth);
		return mageAttack;
	}
	
//	public static int getEnemyHp(int value) {
//		int enemyRemainingHealth = 0;
//		enemyRemainingHealth = enemy.getEnemyHp() - value;
//		return enemyRemainingHealth;
//	}

	public void spells() {

	}

	public int getHp() {
		return Creature.hp;
	}

	public static int getAttack() {
		return Creature.attack;
	}
}
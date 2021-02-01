import java.util.concurrent.ThreadLocalRandom;

public class mage extends creature {
	
	static enemy enemies = new enemy();
	
	public mage() {

		creature.hp += 12;
		creature.mp += 40;
		creature.str -= 4;
		creature.dex += 6;
		creature.intell += 16;
		creature.mnd += 10;
		creature.lck += 1;
		creature.attack -= 6;
		creature.level = 1;
	}

	public static void statSheet() {

		System.out.println("==== Stats ====\nClass: Mage\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexiterity: " + dex 
				+ "\nIntelligence: " +intell + "\nMind: " + mnd + "\nLuck: " + lck);
	}

	public static int mageAttack() {
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
		return creature.hp;
	}

	public static int getAttack() {
		return creature.attack;
	}
}
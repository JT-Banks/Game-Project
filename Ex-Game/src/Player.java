import java.util.concurrent.ThreadLocalRandom;

public class Player extends Creature {
	
	Creature player = new Creature(184, 14, 25, 14, 15, 1);
	Enemy enemies = new Enemy();
	
	public Player(int hp, int mp, int str, int dex, int attack, int level) {
		super(hp, mp, str, dex, attack, level);
	}
	
	public void getStats() {

		System.out.println("==== Stats ====\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexiterity: " + dex + "\nLevel: " + level);
	}
/*
	public static int mageAttack() {
		int mageAttack = ThreadLocalRandom.current().nextInt(4, attack);
		System.out.println("\n### You attacked for: " + mageAttack + " damage! ###\n");
		int enemyRemainingHealth = enemies.getBrittleSkeletonHp() - mageAttack;
		System.out.println("Test: Enemy HP: " + enemyRemainingHealth);
		return mageAttack;
	}
	*/
//	public static int getEnemyHp(int value) {
//		int enemyRemainingHealth = 0;
//		enemyRemainingHealth = enemy.getEnemyHp() - value;
//		return enemyRemainingHealth;
//	}

	public void spells() {

	}
}

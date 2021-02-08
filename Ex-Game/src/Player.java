import java.util.concurrent.ThreadLocalRandom;

public class Player {

	private int hp;
	private int mp;
	private int str;
	private int dex;
	private int attack;
	private int defense;
	private int level;
	
	public Player(int hp, int mp, int str, int dex, int attack, int defense, int level) {
		
		this.hp = hp;
		this.mp = mp;
		this.str = str;
		this.dex = dex;
		this.attack = attack;
		this.defense = defense;
		this.level = level;
	}
	//need a way to implement stat call at any point during current game session
	//Should be able to display stats of current level
	public void getStats() {

		System.out.println("==== Stats ====\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexiterity: " + dex + "\nAttack: " + attack + "\nDefense: " + defense + "\nLevel: " + level);
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

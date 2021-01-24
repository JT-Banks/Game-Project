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

	public static int attack() {
		int enemyRemainingHealth = 0;
		creature.playerAttack(attack);
		System.out.println("You attacked for: " + attack + " damage!");
		//enemyRemainingHealth = enemies.getEnemyHp() - attack;
		//System.out.println("Test: Enemy HP: " + enemyRemainingHealth);
		return attack;
	}
	
	public int getEnemyHp(int x) {
		int enemyRemainingHealth = 0;
		enemyRemainingHealth = enemy.getEnemyHp() - x;
		return enemyRemainingHealth;
	}

	public void spells() {

	}

	public int getHp() {
		return creature.hp;
	}

	public static int getAttack() {
		return creature.attack;
	}
}
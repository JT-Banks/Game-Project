public class enemy extends creature {	
	
	public static String brittleSkeleton() {
		
		String enemy = "Brittle Skeleton";
		creature.hp += 5;
		creature.mp += 15;
		creature.str += 1;
		creature.dex += 2;
		creature.intell += 4;
		creature.mnd += 0;
		creature.lck += 3;		
		return enemy;
	}
	
	public static int getEnemyHp() {
		return creature.enemyHP;
	}
	
	public int enemyAttack() {
		return enemy.attack;
	}
	
	public static void damageTaken() {
		int playerHealthRemaining = 0;
		
	}
}
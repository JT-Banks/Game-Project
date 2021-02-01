
public class enemy extends creature {	
	//potentially store values in an array to randomly select value, then add hp of each enemy
	//such that 155 selected, Brittle Skeleton HP modifier could be + 5 hp, or * 1.86 etc...
	static int[] enemy_HP = {155, 144, 129};
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
	
	public static int getBrittleSkeletonHp() {
	//	int damageDone = enemy.hp - mage.getAttack();
		return enemy.hp;
	}
	
	public int enemyAttack() {
		return enemy.attack;
	}
	public static int getEnemyRemainingHealth() {
		
		return enemy.enemyHP - mage.getAttack();
	}
}

public class Enemy extends Creature {	
	//potentially store values in an array to randomly select value, then add hp of each enemy
	//such that 155 selected, Brittle Skeleton HP modifier could be + 5 hp, or * 1.86 etc...
	int[] enemy_HP = {155, 144, 129};
	public static String brittleSkeleton() {
		
		String enemy = "Brittle Skeleton";
		Creature.hp += 5;
		Creature.mp += 15;
		Creature.str += 1;
		Creature.dex += 2;
		Creature.intell += 4;
		Creature.mnd += 0;
		Creature.lck += 3;		
		return enemy;
	}
	
	public static int getBrittleSkeletonHp() {
	//	int damageDone = enemy.hp - mage.getAttack();
		return Enemy.hp;
	}
	
	public int enemyAttack() {
		return Enemy.attack;
	}
	public static int getEnemyRemainingHealth() {
		
		return Enemy.enemyHP - Player.getAttack();
	}
	@Override
	public void death() {
		
	}
}
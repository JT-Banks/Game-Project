import java.util.Random;

public class Enemy extends Creature {	 
	
	public Enemy(int hp, int mp, int str, int dex, int attack, int defense, int level) {
		
		super(hp, mp, str, dex, attack, defense, level);
	}
	//potentially store values in an array to randomly select value, then add hp of each enemy
	//such that 155 selected, Brittle Skeleton HP modifier could be + 5 hp, or * 1.86 etc...
	int[] enemy_HP = {155, 144, 129};
	Random rand = new Random();
	
	public static String brittleSkeleton() {
		Creature enemy = new Creature(214, 20, 15, 20, 10, 10, 1);
		String skeletonEnemy = "Brittle Skeleton";
		enemy.hp += 5;
		enemy.mp += 15;
		enemy.str += 1;
		enemy.dex += 2;		
		return skeletonEnemy;
	}
	
	public int[] getEnemy_HP() {
		return enemy_HP;
	}

	public void setEnemy_HP(int[] enemy_HP) {
		this.enemy_HP = enemy_HP;
	}
	@Override
	public void death() {
		
	}
}
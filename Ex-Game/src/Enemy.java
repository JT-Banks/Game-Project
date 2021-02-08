import java.util.Random;

public class Enemy  {	 
	
	
	//potentially store values in an array to randomly select value, then add hp of each enemy
	//such that 155 selected, Brittle Skeleton HP modifier could be + 5 hp, or * 1.86 etc...
	int[] enemy_HP = {155, 144, 129};
	Random rand = new Random();
	
	public static String brittleSkeleton() {
		String skeletonEnemy = "Brittle Skeleton";	
		return skeletonEnemy;
	}
	
	public int[] getEnemy_HP() {
		return enemy_HP;
	}

	public void setEnemy_HP(int[] enemy_HP) {
		this.enemy_HP = enemy_HP;
	}
	public void death() {
		
	}
}
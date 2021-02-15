import java.util.concurrent.ThreadLocalRandom;

public class Player extends Entity{


	public Player(int hp, int mp, int str, int dex, int attackPwr, int defense, int level) {
		
		this.hp = hp;
		this.mp = mp;
		this.str = str;
		this.dex = dex;
		this.attackPwr = attackPwr;
		this.defense = defense;
		this.level = level;

	}	
	//need a way to implement stat call at any point during current game session
	//Should be able to display stats of current level
	public void getStats() {
		
		System.out.println("==== Stats ====\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexiterity: " + dex + "\nAttack: " + attackPwr + "\nDefense: " + defense + "\nLevel: " + level);
	}
}

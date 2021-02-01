import java.util.concurrent.ThreadLocalRandom;

public class Creature {
	
    int hp = 150;
	int mp = 35;
	int str = 10;
	int dex = 10;
	int attack = 15;
	int level = 1;
	
    public Creature(int hp, int mp, int str, int dex, int attack, int defense, int level) {

		this.hp = hp;
		this.mp = mp;
		this.str = str;
		this.attack = attack;
		this.level = level;
		
	}


	
//	public static int playerAttack(int attackDmg) {
//		int damageDealt = ThreadLocalRandom.current().nextInt(7, attackDmg);
//		return damageDealt;
//	}
	
	public int defend(int dmgReduction) {
		int damageTaken = ThreadLocalRandom.current().nextInt(25, dmgReduction);
		return damageTaken;
	}
	
	public void death() {
		
	}
}
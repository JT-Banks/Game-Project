import java.util.concurrent.ThreadLocalRandom;

public class Skeleton extends Entity {

	private int friendly = 0;
	private String name;

	public Skeleton(String name, int hp, int mp, int str, int dex, int attackPwr, int defense, int level, int friendly) {

		this.name = "Brittle Skeleton";
		this.hp = 129;
		this.mp = 14;
		this.str = 10;
		this.dex = 8;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 25;
		this.level = 1;
		this.setFriendly(0);
	}

	public int skeletonAttack() {

		Attack attack = new Attack();
		int damageDealt = attack.dealDmg("physical", this.str, this.dex, this.attackPwr);
		return ThreadLocalRandom.current().nextInt(10, damageDealt);   
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int damageDone(int damageDone) {
		
		return damageDone;
	}

	public int getFriendly() {
		return friendly;
	}

	public void setFriendly(int friendly) {
		this.friendly = friendly;
	}
	
	@Override
	public void display() {
		System.out.println(name + "'s stats \nHealth - " + hp +  "\nMana - " + mp +"\nStrength - " + str + "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
	}
}

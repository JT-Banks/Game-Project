import java.util.concurrent.ThreadLocalRandom;

public class Goblin extends Entity {


	public Goblin(String name, int hp, int mp, int str, int dex, int attackPwr, int defense, int level, int friendly) {

		this.name = "Goblin Smasher";
		this.hp = 164;
		this.mp = 32;
		this.str = 14;
		this.dex = 11;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 29;
		this.level = 1;
		this.friendly = 0;
	}

	public int goblinAttack() {

		Attack attack = new Attack();
		int damageDealt = attack.dealDmg("physical", this.str, this.dex, this.attackPwr);
		return ThreadLocalRandom.current().nextInt(10, damageDealt);  
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int damageDone(int damageDone) {

		damageDone =  attackPwr - this.defense;
		return damageDone;
	}  
}

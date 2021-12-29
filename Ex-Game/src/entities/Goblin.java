package entities;
import java.util.concurrent.ThreadLocalRandom;

import actions.Attack;

public class Goblin extends ParentEntity {


	public Goblin() {

		this.name = "Goblin Smasher";
		this.hp = 16;
		this.mp = 32;
		this.str = 14;
		this.dex = 11;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 29;
		this.level = 1;
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
	public void display() {
		System.out.println("\n" + name + "'s stats \nHealth - " + hp + "\nMana - " + mp + "\nStrength - " + str
				+ "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
	}
  
}

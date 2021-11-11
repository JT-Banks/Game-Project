package entities;
import java.util.concurrent.ThreadLocalRandom;

import actions.Attack;

public class Skeleton extends ParentEntity {

	private String name;

	public Skeleton() {

		this.name = "Brittle Skeleton";
		this.hp = 129;
		this.mp = 14;
		this.str = 10;
		this.dex = 8;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 25;
		this.level = 1;
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
	public void display() {
		System.out.println("\n" + name + "'s stats \nHealth - " + hp + "\nMana - " + mp + "\nStrength - " + str
				+ "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
	}
}

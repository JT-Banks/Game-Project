package entities;
import java.util.concurrent.ThreadLocalRandom;

import actions.Attack;

public class Skeleton extends ParentEntity {

	private String name;
	Player player = new Player();
	public Skeleton() {

		this.name = "Brittle Skeleton";
		this.hp = ThreadLocalRandom.current().nextInt(114, 146);
		this.mp = 14;
		this.str = 10;
		this.dex = 8;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 25;
		/* How to calculate enemy level based on player level...
		 * Scenario: Player level(3), Skeleton level should be lowest 1, highest 5
		 * << 2 && >> 2 
		 */
		this.level = ThreadLocalRandom.current().nextInt(player.level, player.level+2);
	}

	public int skeletonAttack() {

		Attack attack = new Attack();
		int damageDealt = attack.dealDmg("physical", this.str, this.dex, this.attackPwr);
		return ThreadLocalRandom.current().nextInt(10, damageDealt);
	}
	//Take in arguments variable of fire damage, calculate dmg taken
	public int fireDamageTaken(int fireDamage) {
		fireDamage = (int) (fireDamage * 0.2);
		return fireDamage;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void display() {
		System.out.println("\n" + name + "'s stats \nHealth - " + hp + "\nMana - " + mp + "\nStrength - " + str
				+ "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
		//Specific enemy description 
		System.out.println("Enemy description: Often found in dark crypts and graveyards. They are the protectors of the dead, unable to have sentient thought."
						 + "\nAlthough physically strong, they are susceptible to fire");
	}
}

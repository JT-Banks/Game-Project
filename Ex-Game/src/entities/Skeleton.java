package entities;
import java.util.concurrent.ThreadLocalRandom;

import actions.Attack;

public class Skeleton extends ParentEntity {
	private String name;
	Player player = new Player();
	public Skeleton() {
		/*
		 * Can now adjust individual stats to properly mess with damage of enemies.
		 * For example: To adjust how much damage a skeleton does, simply need to adjust strength, nothing else.
		 */
		this.name = "Brittle Skeleton";
		this.setHp(ThreadLocalRandom.current().nextInt(114, 146));
		this.mp = 14;
		this.str = 16;
		this.dex = 8;
		this.setIntelligence(6);
		this.attackPwr = (int) (str * 1.14);
		this.defense = 20;
		/* How to calculate enemy level based on player level...
		 * Scenario: Player level(3), Skeleton level should be lowest 1, highest 5
		 * << 2 && >> 2 
		 */
		this.level = ThreadLocalRandom.current().nextInt(player.level, player.level + 2);
	}

	public int skeletonAttack() {		
		Attack attack = new Attack();
		int damageDealt = attack.enemyDmg("physical", this.str, this.attackPwr);
		return ThreadLocalRandom.current().nextInt(15, damageDealt);
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
		System.out.println("\n" + name + "'s stats \nHealth - " + getHp() + "\nMana - " + mp + "\nStrength - " + str
				          + "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
		//Specific enemy description 
		System.out.println("Enemy description: Often found in dark crypts and graveyards. They are the protectors of the dead, unable to have sentient thought."
						  + "\nAlthough physically strong, they are susceptible to fire");
	}
	
	@Override
	public double fireVulnerability() {	
		double elementalDamageAmplified = 0.25;
		return elementalDamageAmplified;		
	}
}

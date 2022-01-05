package entities;

import java.util.concurrent.ThreadLocalRandom;

import actions.Attack;
/*
 * This class serves as a blueprint for all entities within the game to inherit.
 * Methods are passed on, and overriden to be used accordingly per entity.
 * This class depicts what other entities are allowed to do...
 */
public abstract class ParentEntity {

	public String name;
	public int hp;
	public int mp;
	public int str;
	public int dex;
	public int intelligence;
	public int attackPwr;
	public int defense;
	public int level;
	public int friendly;
	public int experience;
	
	public int playerAttack() {
		int damageDealt = 0;
		return damageDealt;
	}
	//Generic attack method for all enemies, can be used from parent class
	public int enemyAttack() {

		Attack attack = new Attack();
		int enemyDamageDealt = attack.enemyDmg("physical", this.str, this.dex, this.attackPwr);
		return enemyDamageDealt;
	}
	
	public int defend() {
		int defend = (int) (defense * 0.25);
		return defend;
	}
	
	public void display() {
		System.out.println(name + "'s stats \nHealth - " + hp + "\nMana - " + mp + "\nStrength - " + str
						        + "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
	}
	
	public String getName() {
		return name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getMana() {
		return this.mp;
	}

	public int getAttack() {

		attackPwr = (int) (str * 1.14);
		return attackPwr;
	}

	public int getDefense() {
		return this.defense;
	}

	public int getLevel() {
		return this.level;
	}

	public boolean death(boolean death) {
		return true;
	}

	public int getExp() {
		int exp = experience + 25;
		return exp;
	}
	public int getStarterSpell() {
		return 0;
	}

}
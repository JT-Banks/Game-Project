package entities;

import actions.Attack;
/*
 * This class serves as a blueprint for all entities within the game to inherit.
 * Methods are passed on, and overridden to be used accordingly per entity.
 * This class depicts what other entities are allowed to do...
 */
public abstract class ParentEntity {
	/*
	 * Stats may be over-bloated, some aren't used. Dexterity for example.
	 */
	public String name;
	public int hp;
	public int mp;
	public int str;
	public int dex;
	public int intelligence;
	public int attackPwr;
	public int defense;
	public int experience;
	public int level;
	
	public int playerAttack() {
		return 0;
	}
	//Generic attack method for all enemies, can be used from parent class
	public int enemyAttack() {

		Attack attack = new Attack();
		int enemyDamageDealt = attack.enemyDmg("physical", this.str, this.attackPwr);
		return enemyDamageDealt;
	}
	
	public void display() {
		System.out.println(name + "'s stats \nHealth - " + getHp() + "\nMana - " + mp + "\nStrength - " + str
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

	public int getAttackPwr() {

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
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int setHp(int hp) {
		this.hp = hp;
		return hp;
	}
	public double fireVulnerability() {
		return 0;
	}

	public void itemHeal() {
		//use a specific item to heal
	}

}
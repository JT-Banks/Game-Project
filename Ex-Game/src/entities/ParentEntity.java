package entities;

import actions.Attack;

public class ParentEntity {

	public String name;
	public int hp;
	public int mp;
	public int str;
	public int dex;
	public int attackPwr;
	public int defense;
	public int level;
	public int friendly;
	public int experience;
	
	public int playerAttack() {

		//Player player = new Player(hp, mp, str, dex, attackPwr, defense, experience, level);
		Attack attack = new Attack();
		//double damageDealt = player.damageDone(str * .084);
		int damageDealt = attack.dealDmg("physical", this.str, this.dex, this.attackPwr);
		return damageDealt;
	}

	public int enemyAttack() {
		
		Attack attack = new Attack();
		int enemyDamageDealt = attack.enemyDmg("physical", this.str, this.dex, this.attackPwr);
		return enemyDamageDealt;
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

	public void display() {
		System.out.println(name + "'s stats \nHealth - " + hp + "\nMana - " + mp + "\nStrength - " + str
						      + "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
	}

	public boolean death(boolean death) {
		return true;
	}

	public int getExp() {
		int exp = experience + 25;
		return exp;
	}

}
package entities;

import java.util.concurrent.ThreadLocalRandom;

import actions.Attack;

public class ParentEntity {

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
	//Probably need to design something reuseable...and not do calculations here
	public int getStarterSpell() {
		double incinerateDamage = 20 + level * 0.6;
		int incinerate = ThreadLocalRandom.current().nextInt(15, (int) incinerateDamage);
		return incinerate;
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

}
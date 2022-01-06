package entities;

import actions.Attack;

public class Player extends ParentEntity {

	private int experience;

	public Player() {

		this.hp = 155;
		this.mp = 20;
		this.str = 18;
		this.dex = 16;
		this.intelligence = 14;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 11;
		this.setExperience(0);
		this.level = 1;
	}
	//need a way to implement stat call at any point during current game session
	//Should be able to display stats of current level
	@Override
	public void display() {
		System.out.println("== Your Stats ==\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexterity: " + dex
						 + "\nAttack: " + attackPwr + "\nDefense: " + defense + "\nLevel: " + level);
	}
	
	@Override
	public int playerAttack() {
		Attack attack = new Attack();
		int damageDealt = attack.dealDmg("physical", this.str, this.attackPwr);
		return damageDealt;
	}
	
	@Override
	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public int getStr() {
		return this.str;
	}

	public int getDex() {
		return this.dex;
	}

	@Override
	public int getAttack() {
		attackPwr = (int) (str * 1.14);
		return attackPwr;
	}

	@Override
	public int getDefense() {
		return this.defense;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	public String levelUp() {
		level += 1;
		hp = hp + 24;
		mp = mp + 6;
		str = str + 3;
		dex = dex + 2;
		attackPwr = attackPwr + 4;
		defense = defense + 3;
		return "You leveled up!";
	}
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}

package entities;

import actions.Attack;

public class Player extends ParentEntity {

	private int experience;

	public Player() {

		@SuppressWarnings("unused")
		Attack attackPower = new Attack();
		this.hp = 155;
		this.mp = 20;
		this.str = 22;
		this.dex = 17;
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
		attackPwr = (int) (str * 1.14);
		System.out.println("== Your Stats ==\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexterity: " + dex
				+ "\nAttack: " + attackPwr + "\nDefense: " + defense + "\nLevel: " + level);
	}
	
	@Override
	public int playerAttack() {
		Attack attack = new Attack();
		//double damageDealt = player.damageDone(str * .084);
		int damageDealt = attack.dealDmg("physical", this.str, this.dex, this.attackPwr);
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
		level = level + 1;
		hp = hp + 24;
		mp = mp + 9;
		str = str + 5;
		dex = dex + 3;
		attackPwr = attackPwr + 4;
		defense = defense + 7;
		return "You leveled up!";
	}

	public double damageDone(double d) {

		d = playerAttack() - this.defense;
		return d;
	}

	@Override
	public int defend() {
		int defend = (int) (this.defense * 2.5);
		return defend;
	}
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}

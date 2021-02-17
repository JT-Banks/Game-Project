
public class Entity {
	
	public String name;
    public int hp;
    public  int mp;
    public  int str;
    public  int dex;
    public  int attackPwr;
    public  int defense;
    public  int level;
    public int friendly;

    public static void interactions() {
        ///Interactions??
        //MENU???
        //ATTACK_MENU
    }

    public void collision() {
        //Collision type? Wall, spell, enemy attack etc
        //If collision is enemy attack/projectile subtract dmg from health
        //If collision is other do something else....
    }
    
    public int getHp() {
    	return this.hp;
    }
    
    public int getMana() {
    	return this.mp;
    }
    
    public int getDefense() {
    	return this.defense;
    }
    
    public int getLevel() {
    	return this.level;
    }
    
    public int damageDone(int damageDone) {
    	
    	damageDone = attackPwr - defense;
		return damageDone;
    }
    
    public void display() {
    	System.out.println(name + "'s stats \nHealth - " + hp +  "\nMana - " + mp +"\nStrength - " + str + "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
    }
    
}
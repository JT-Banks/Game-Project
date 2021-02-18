
public class Player extends Entity {

	public Player(int hp, int mp, int str, int dex, int attackPwr, int defense, int level) {
		
		@SuppressWarnings("unused")
		Attack attackPower = new Attack();
		this.hp = 155;
		this.mp = 20;
		this.str = 22;
		this.dex = 17;
		this.attackPwr = (int) (str * 1.14);
		this.defense = 11;
		this.level = 1;
	}	
	//need a way to implement stat call at any point during current game session
	//Should be able to display stats of current level
	@Override
	public void display() {
		
		attackPwr = (int) (str  * 1.14);
		System.out.println("==== Stats ====\nHP: " + hp + "\nMP: " + mp + "\nStrength: " + str + "\nDexterity: " + dex + "\nAttack: " + attackPwr + "\nDefense: " + defense + "\nLevel: " + level);
	}
	
	public int playerAttack() {
		
		Attack attack = new Attack();
        int damageDealt = attack.dealDmg("physical", this.str , this.dex, this.attackPwr);
        return damageDealt;
	}
	
	@Override
	public int getAttack() {
		
		attackPwr = (int) (str * 1.14);
		return attackPwr;
	}
}

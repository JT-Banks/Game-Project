import java.util.Random;

public class Attack extends Entity {

    public String element;

    public int dealDmg(String element, int str, int dex, int attackPwr) {
    	
    	Random rand = new Random();
    	int max = (int) (str + dex * 0.68);
    	int min = (int) (str + dex - 10);
        this.element = element;
        this.str = str;
        this.dex = dex;
        this.attackPwr = attackPwr;
        
        return rand.nextInt(max - min) - min;
    }
    
    public int getAttackPower() {
    	
    	int attackPower = (int) (this.str + this.dex * 0.68);
    	return attackPower;
    }
}

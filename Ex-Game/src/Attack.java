
import java.util.concurrent.ThreadLocalRandom;

public class Attack extends Entity {

    public String element;

    public int dealDmg(String element, int str, int dex, int attackPwr) {
    	
        this.element = element;
        this.str = str;
        this.dex = dex;
        this.attackPwr = attackPwr;
        
        return ThreadLocalRandom.current().nextInt(dex, str + dex);
    }
    
    public int getAttackPower() {
    	
    	int attackPower = (int) (this.str + this.dex * 0.68);
    	return attackPower;
    }
}

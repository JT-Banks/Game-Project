import java.util.concurrent.ThreadLocalRandom;

public class Attack extends Entity {

    public String element;

    public int dealDmg(String element, int str, int dex, int attackPwr) {
    	
        this.element = element;
        this.str = str;
        this.dex = dex;
        this.attackPwr = attackPwr;
        //Damage dealt should be: damageDealt = attackPwr * (100% -f(Defense))
        //Work on this later
        return ThreadLocalRandom.current().nextInt(dex, str + dex);
    }
    
    public int getAttackPower() {
    	//Need formula to calculate attack power for each entity
    	//Also need formula for damage reducation due to defense
    	int attackPower = (int) (this.str + this.dex * 0.68);
    	return attackPower;
    }
}

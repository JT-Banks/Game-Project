package actions;
import entities.ParentEntity;

public class Defend extends ParentEntity{

    public int defend(int incDmg, int defense) {
    	int damageAfterReduction = 0;
    	if(defense > incDmg) {
    		damageAfterReduction = 0;
    	} else {
    	 damageAfterReduction = (int) ((incDmg - defense) * 1.5);
    	}
        return damageAfterReduction;
    }
}

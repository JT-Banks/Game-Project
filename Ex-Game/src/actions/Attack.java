package actions;
import java.util.concurrent.ThreadLocalRandom;

import entities.ParentEntity;

public class Attack extends ParentEntity {

	public String element;

	public int dealDmg(String element, int str, int attackPwr) {
		//Damage dealt should be: damageDealt = attackPwr * (100% -f(Defense))
		attackPwr = (int) ((attackPwr * 1.5) + str);
		int damageDealt = attackPwr;
		return ThreadLocalRandom.current().nextInt(10, damageDealt);
	}
	
	public int enemyDmg(String element, int str, int attackPwr) {

		attackPwr = (int) (attackPwr * 1.4) + str;
		int damageDealt = attackPwr;
		//Damage dealt should be directly from attackPwr - defense
		return ThreadLocalRandom.current().nextInt(8, damageDealt);
	}

}

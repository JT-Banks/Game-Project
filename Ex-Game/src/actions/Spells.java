package actions;

import java.util.concurrent.ThreadLocalRandom;

import entities.Player;

public class Spells extends Player {

	@Override
	public int getStarterSpell() {
		int incinerateDamage = (int) (20 + level + (intelligence/2) * 0.6);
		int incinerate = ThreadLocalRandom.current().nextInt(16, (int) incinerateDamage);
		return incinerate;
	}
}

import java.util.concurrent.ThreadLocalRandom;

public class Skeleton extends Entity {
	
	private int friendly = 0;
    private String name;
    
	public Skeleton(String name, int hp, int mp, int str, int dex, int attackPwr, int defense, int level, int friendly) {

        this.name = "Brittle Skeleton";
        this.hp = 100;
        this.mp = 10;
        this.str = 10;
        this.dex = 8;
        this.attackPwr = (int) (str * 1.14);
        this.defense = 25;
        this.level = 1;
        this.friendly = 0;
    }

    public int skeletonAttack() {
        
        Attack attack = new Attack();
        int damageDealt = attack.dealDmg("physical", this.str, this.dex, this.attackPwr);
        return ThreadLocalRandom.current().nextInt(10, damageDealt);
        
    }
    
    public String getName() {
    	return this.name;
    }
    
    @Override
    public int damageDone(int damageDone) {
    	
    	damageDone =  attackPwr - this.defense;
    	return damageDone;
    }
    
}

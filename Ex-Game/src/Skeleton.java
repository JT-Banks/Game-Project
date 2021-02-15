import java.util.Random;

public class Skeleton extends Entity {
  //  public String name = generateName();
	private int friendly = 0;
    private String name;

	public Skeleton(String name,int hp, int mp, int str, int dex, int attackPwr, int defense, int level, int friendly) {

        this.name = "Brittle Skeleton";
        this.hp = 100;
        this.mp = 100;
        this.str = 10;
        this.dex = 1;
        this.attackPwr = attackPwr;
        this.defense = 100;
        this.level = level;
        this.friendly = friendly;
    }

    public String createName(){

        Random rand = new Random();
        int skeletonNumber = (int)(Math.round(Math.random() * (100 - 1) + 1));
        String intToString =  Integer.toString(skeletonNumber);
        String name = "Brittle Skeleton" + "intToString";
		return name;

    }

    public void skeletonAttack(){
        ////Does extra calcs/stuff
        ///Pass results to attack

        Attack attack = new Attack();
        attack.dealDmg("physical",1,1,100);

    }

}

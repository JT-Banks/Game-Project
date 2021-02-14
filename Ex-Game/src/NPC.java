public class NPC extends Entity {
    public int friendly = 0;

    public NPC(){



    }

    public NPC(int hp, int mp, int str, int dex, int attackPwr, int defense, int level, int friendly) {

        this.hp = hp;
        this.mp = mp;
        this.str = str;
        this.dex = dex;
        this.attackPwr = attackPwr;
        this.defense = defense;
        this.level = level;
        this.friendly = friendly;
    }

    public void aiRoutine(){



    }


}

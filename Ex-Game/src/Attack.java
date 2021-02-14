public class Attack extends Entity{

    public String element;
    public int otherStats;
    int accuracy = 1;

    public int dealDmg(String element, int str, int dex, int attackPwr){
        int Dmg;
        this.element = element;
        this.str = this.str;
        this.dex = this.dex;
        this.attackPwr = this.attackPwr;


        return (this.str * this.dex * this.attackPwr);



    }
}

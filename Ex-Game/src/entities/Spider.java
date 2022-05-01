package entities;

import java.util.concurrent.ThreadLocalRandom;

public class Spider extends ParentEntity {
    Player player = new Player();
//constructor to initialize the spider
    public Spider(){
        this.name = "Spider";
        this.hp = 100;
        this.mp = 21;
        this.str = 20;
        this.defense = 10;
        this.attackPwr = 10;
        this.dex = 10;
        this.intelligence = 10;
        this.level = ThreadLocalRandom.current().nextInt(player.level, player.level + 2);
    }
    public void attack(Player player){
        player.hp -= this.attackPwr;
    }
    //method to attack the player
    public void attack(Spider spider){
        spider.hp -= this.attackPwr;
    }
    //get name of the entity
    public String getName(){
        return this.name;
    }
    //display the stats of the entity
    @Override
    public void display() {
        System.out.println("\n" + name + "'s stats \nHealth - " + getHp() + "\nMana - " + mp + "\nStrength - " + str
                + "\nDexterity - " + dex + "\nDefense - " + defense + "\nLevel - " + level);
        //Specific enemy description
        System.out.println("Enemy description: ");
    }
}
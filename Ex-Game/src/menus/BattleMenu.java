package menus;

import entities.ParentEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleMenu {

    public static String battleMenu(ArrayList<ParentEntity> entity, Scanner scan) {
        int enemyHealth = entity.get(1).getHp();
        int playerHealth = entity.get(0).getHp();
        System.out.println("\nPlayer HP: " + entity.get(0).getHp());
        System.out.println("Player Mana: " + entity.get(0).getMana() + "\n");
        System.out.println(entity.get(1).getName() + "'s HP: " + enemyHealth);
        System.out.println(entity.get(1).getName() + "'s Mana: " + entity.get(1).mp);
        System.out.println("\n## Command menu ##");
        System.out.print("1. Attack");
        System.out.println("\t  4. Magic");
        System.out.print("2. Use items");
        System.out.println("\t  5. Defend");
        System.out.print("3. Scan enemy");
        System.out.println("\t  6. Run\n");
        String input = scan.nextLine();
        return input;
    }

    public static void attackOption(ArrayList<ParentEntity> entity) {
        int playerAttackDmg = entity.get(0).playerAttack() - entity.get(1).defense;
        //System.out.println("This is the damage you would've dealt: " + playerAttackDmg);
        int enemyAttackDmg = entity.get(1).enemyAttack() - entity.get(0).defense;
        int enemyHealth = entity.get(1).setHp(entity.get(1).getHp() - playerAttackDmg);
        int playerHealth = entity.get(0).setHp(entity.get(0).getHp() - enemyAttackDmg);
        if(playerAttackDmg <= 0) {
            System.out.println("You deal no damage!");
        } else {
            System.out.println("# -You attack for " + playerAttackDmg + " damage- #");
        }
        if(enemyAttackDmg <= 0) {
            System.out.println("You take no damage!");
        } else {
            System.out.println("# -You take " + enemyAttackDmg + " damage- #");
        }
    }

    public static void enemyDefeated(ArrayList<ParentEntity> entity) {
        System.out.println("\n*** " + entity.get(1).getName() + " was defeated! ***");
        System.out.println("You claim " + entity.get(0).getExp() + " experience points!");
        entity.remove(1);
    }
}
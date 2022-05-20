package menus;

import entities.ParentEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class SpellMenu  {

    private static void spellMenu(ArrayList<ParentEntity> entity, Scanner scan) {
        System.out.println("**************");
        System.out.println("**Magic Menu**");
        System.out.println("**************");
        System.out.println("1. Incinerate (Cost: 6 MP, Damage: 20(base) + your level. Modified by your intelligence stat)");
        int magicMenuInput = scan.nextInt();
        scan.nextLine(); //Consume next line after int input
        switch(magicMenuInput) {
            case 1: if(entity.get(0).mp >= 6) {
                entity.get(0).mp -= 6;
                incinerateSpell(entity);
                break;
            }
            else {
                System.out.println("You do not have enough mana to cast that!");
            }
            default: break;
        }
    }

    private static void incinerateSpell(ArrayList<ParentEntity> entity) {
        int spellDamageDone = entity.get(0).getStarterSpell();
        int damageDone = entity.get(1).enemyAttack();
        int enemyHealth;
        if(entity.get(1).getName().equalsIgnoreCase("Brittle Skeleton")) {
            System.out.println("~ *Elemental Weakness!* ~");
            enemyHealth = (int) (entity.get(1).setHp(entity.get(1).getHp() - spellDamageDone) * entity.get(1).fireVulnerability());
        } else {
            enemyHealth = entity.get(1).setHp(entity.get(1).getHp() - spellDamageDone);
        }
        System.out.println("* -You cast Incinerate for " + spellDamageDone + " damage- *");
        int playerHealth = entity.get(0).setHp(entity.get(0).getHp() - damageDone);
        System.out.println("# -You take " + damageDone + " damage- #");
    }
    public void initializeSpellMenu(ArrayList<ParentEntity> entity) {
        Scanner scan = new Scanner(System.in);
        spellMenu(entity, scan);
    }
}

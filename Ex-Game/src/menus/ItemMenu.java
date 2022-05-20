package menus;

import actions.UseItem;
import entities.ParentEntity;
import items.HealingItems;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemMenu {
    private static void itemMenu(ArrayList<ParentEntity> entities, Scanner scan) {
        HealingItems healingItems = new HealingItems();
        System.out.println("*********");
        System.out.println("Item Menu");
        System.out.println("*********");
        healingItems.displayHealingItems();
        System.out.println("To use an item, enter the item's number.");
        int itemMenuChoice = scan.nextInt();
        switch (itemMenuChoice) {
            case 1:
                //use a potion
                HealingItems.usePotion(entities, scan);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    //initialize the item menu
    public static void initializeItemMenu(ArrayList<ParentEntity> entities) {
        Scanner scan = new Scanner(System.in);
        itemMenu(entities, scan);
    }

}

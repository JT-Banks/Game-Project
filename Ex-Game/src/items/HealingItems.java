package items;

import actions.UseItem;
import entities.ParentEntity;
import menus.ItemMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HealingItems extends ItemMenu {
    //HashMap of potential healing items...because why not
    private HashMap<String, Integer> healingItems = new HashMap<>();
    //Constructor to initialize the healing items
    public  HealingItems() {
        healingItems.put("Potion", 10);
        healingItems.put("Hi-Potion", 25);
        healingItems.put("Mega-Potion", 50);
        healingItems.put("Ether", 10);
        healingItems.put("Hi-Ether", 25);
        healingItems.put("Mega-Ether", 50);;
    }

    public static void usePotion(ArrayList<ParentEntity> entities, Scanner scan) {
        for(ParentEntity entity : entities) {
                entity.setHp(entity.getHp() + 10);
                System.out.println(entity.getName() + " has recovered 10 HP!");
        }
    }

    //Use the class UseItem to use a healing item
    public void useItem(String item) {
        UseItem.useItem(item, healingItems);
    }

    //method to use a Potion
    public void usePotion() {
        UseItem.useItem("Potion", healingItems);
    }

    //method to display healing items
    public void displayHealingItems() {
        System.out.println("Healing Items:");
        for(String item : healingItems.keySet()) {
            System.out.println(item);
        }
    }
    //method to get the healing items
    public HashMap<String, Integer> getHealingItems() {
        return healingItems;
    }
}

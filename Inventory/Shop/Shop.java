package Inventory.Shop;

import Inventory.Item;
import Inventory.Armour.OgreArmour;
import Inventory.Consumable.HealthPotion;
import Inventory.Consumable.MagicCake;
import Inventory.Weapon.MagicSword;

public class Shop {
    
    public static final Item[] SHOP = {
        new OgreArmour("Basic Armour", 30, 15, "Basic"),
        new HealthPotion("Basic Health Potion", 15, 10, "Be healthy, be alive", 10, 30),
        new MagicCake("Basic Cake", 20, 15, "Wizard Powers", 30, 20, 20),
        new MagicSword("Basic Sword", 13, 30, 10),
        new MagicCake("Cooler Cake", 5, 40, "Makes you stronger, smarter, cooler", 56, 50, 50),
        new HealthPotion("Super Cool Health Potion", 10, 50, "Makes you super healthy", 80, 90),
        new MagicSword("Cool Sword", 10, 80, 90)
    };

    public void displayShop() {
        System.out.println("WELCOME TO THE SHOP, TRAVELER!");
        System.out.println();

        for (int i = 0; i < SHOP.length; i++) {
            Item item = SHOP[i];
            System.out.println((i + 1) + ". " + item.getName() + " (" + item.getGoldValue() + " gold," + item.getWeight() + ")");
        }
    }
}

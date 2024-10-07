package Inventory.Shop;

import java.util.Scanner;

import Inventory.Inventory;
import Inventory.Item;
import Inventory.Armour.OgreArmour;
import Inventory.Consumable.HealthPotion;
import Inventory.Consumable.MagicCake;
import Inventory.Weapon.MagicSword;
import Player.Player;

public class Shop {
    
    public static final Item[] SHOP = {
        new OgreArmour("Basic Armour", 30, 15, "Basic"),
        new HealthPotion("Basic Health Potion", 15, 10, "Be healthy, be alive", 10, 30),
        new MagicCake("Basic Cake", 20, 15, "Wizard Powers", 30, 20, 20),
        new MagicSword("Basic Sword", 13, 30, 10),
        new MagicCake("Cooler Cake", 5, 120, "Makes you stronger, smarter, cooler", 56, 50, 50),
        new HealthPotion("Super Cool Health Potion", 10, 200, "Makes you super healthy", 80, 90),
        new MagicSword("Cool Sword", 10, 500, 90)
    };

    public static void displayShop(Player player) {
        System.out.println("---------------------------");
        System.out.println("WELCOME TO THE SHOP, TRAVELER!");
        System.out.println();

        for (int i = 0; i < SHOP.length; i++) {
            Item item = SHOP[i];
            System.out.println((i + 1) + ". " + item.getName() + " (" + item.getGoldValue() + " gold, " + item.getWeight() + " g)");
        }

        System.out.println();
        buyItem(player);
    }

       // Player can browse items in player's price range
    // 

    // ideas: maybe create a shop and call the shop here - one for OP, another for SP
    // ideas: maybe enum?

    // ACTIONS:
    // choose number? Are you sure that you want to buy this one?
    // add item to players inventory to default items
    // reduce amount of money

    public static void buyItem(Player player) {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("CHOOSE ITEMS TO BUY");
        System.out.println("Press 0 to go back");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.out.println("Returning to the main menu...");
            return;
        }

        if (choice > 0 && choice <= SHOP.length) {
            Item itemToBuy = SHOP[choice - 1]; 

            // Item newItem = null;
            // if (itemToBuy instanceof OgreArmour) {
            //     newItem = new OgreArmour(itemToBuy.getName(), itemToBuy.getWeight(), itemToBuy.getGoldValue(), ((OgreArmour)itemToBuy).getArmourType());
            // } else if (itemToBuy instanceof HealthPotion) {
            //     newItem = new HealthPotion(itemToBuy.getName(), itemToBuy.getWeight(), itemToBuy.getGoldValue(), ((HealthPotion)itemToBuy).getEffect(), ((HealthPotion)itemToBuy).getDuration(), ((HealthPotion)itemToBuy).getRestoreAmount());
            // } else if (itemToBuy instanceof MagicCake) {
            //     newItem = new MagicCake(itemToBuy.getName(), itemToBuy.getWeight(), itemToBuy.getGoldValue(), ((MagicCake)itemToBuy).getEffect(), ((MagicCake)itemToBuy).getDuration(), ((MagicCake)itemToBuy).getRestoreHealthAmount(), ((MagicCake)itemToBuy).getRestoreManaAmount());
            // } else if (itemToBuy instanceof MagicSword) {
            //     newItem = new MagicSword(itemToBuy.getName(), itemToBuy.getWeight(), itemToBuy.getGoldValue(), ((MagicSword)itemToBuy).getDamage());
            // }


            if (player.getInventory().calculateTotalWeight() + itemToBuy.getWeight() <= 80) {
                if (player.getMoney() >= itemToBuy.getGoldValue()) {
                    player.getInventory().addItem(itemToBuy);
                    player.setMoney(player.getMoney() - itemToBuy.getGoldValue());
                    System.out.println("You have purchased " + itemToBuy.getName() + " for " + itemToBuy.getGoldValue() + " coins.");
                    System.out.println("You now have " + player.getMoney() + " coins.");
                } else {
                    System.out.println("You don't have enough gold to buy this item.");
                }
            } else {
                System.out.println("You can't carry this item. It's too heavy.");
            }
        } else {
            System.out.println("Invalid choice. Exiting shop...");
        }
    }

}

package Inventory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Inventory.Armour.OgreArmour;
import Inventory.Consumable.HealthPotion;
import Inventory.Consumable.MagicCake;
import Inventory.Customizable.CustomizableArmour;
import Inventory.Customizable.CustomizableConsumable;
import Inventory.Customizable.CustomizableWeapon;
import Inventory.Shop.Shop;
import Inventory.Weapon.MagicSword;
import Player.Player;

// personal inventory for each player
// consists of list of items 

// aggregation in relation to Item


public class Inventory {

    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }
    public List<Item> getItems() {
        return items;
    }

    // add default items when player gets created
    public void addItem(Item item) {
        items.add(item);
    }

    // Show all items in inventory
    public void displayInventory(Player player){
        System.out.println();
        System.out.println("HERE'S YOUR INVENTORY");
        System.out.println();
        System.out.println("0. Back to menu");
        System.out.println();
        List<Item> items = getItems();
        int i = 1;
        for(Item item : items) {
            System.out.println(i + ". " + item);
            i ++;
        }

        System.out.println();
        System.out.println("CHOOSE WISELY AND ENTER AN ITEM NUMBER");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.out.println("Returning to the main menu...");
            return;  
    
        } else if (choice > 0 && choice <= getItems().size()) {
            Item selectedItem = getItems().get(choice - 1);
            if (selectedItem instanceof MagicSword) {
                ((MagicSword) selectedItem).displayMagicSwordMenu(player);
            } else if (selectedItem instanceof MagicCake) {
                ((MagicCake) selectedItem).displayMagicCakeMenu(player);
            } else if (selectedItem instanceof HealthPotion) {
                ((HealthPotion) selectedItem).displayHealthPotionMenu(player);
            } else if (selectedItem instanceof OgreArmour) {
                ((OgreArmour) selectedItem).displayOgreArmourMenu(player);
            } else if (selectedItem instanceof CustomizableArmour) {
                ((CustomizableArmour) selectedItem).displayCustomizableArmourMenu(player);
            } else if (selectedItem instanceof CustomizableWeapon){
                ((CustomizableWeapon) selectedItem).displayCustomizableWeaponMenu(player);
            } else if (selectedItem instanceof CustomizableConsumable) {
                ((CustomizableConsumable) selectedItem).displayCustomizablePotionMenu(player);
            }
            else {
                System.out.println("Selected item is not interactable.");
            }
        } else {
            System.out.println("Exiting inventory ...");
        }
    }

    public void toShop(Player player){

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("WELCOME TO THE SHOP!");
            System.out.println("PLEASE CHOOSE IF YOU WANT TO BUY OR SELL");
            System.out.println();
            System.out.println("1. BUY");
            System.out.println("2. SELL");
            System.out.println("0. GO BACK TO MENU");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Shop.displayShop(player);
                        break;
                    case 2:
                        sellItem(player);
                        break;
                    case 0:
                        return;
                
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                choice = 0;
            } 
        } while (choice != 0);
        scanner.close();
    }


    public void sellItem(Player player) {
        System.out.println();
        System.out.println("CHOOSE ITEMS TO SELL");
        int i = 1;
        for(Item item : items) {
            System.out.println(i + ". " + item);
            i ++;
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= getItems().size()) {
            Item itemToSell = getItems().get(choice - 1);

            System.out.println("You have chosen to sell: " + itemToSell.getName());
            System.out.println("Are you sure? (yes/no)");
            System.out.println();
            String confirmation = scanner.next();

            if (confirmation.equalsIgnoreCase("yes")){
                player.setMoney(player.getMoney() + itemToSell.getGoldValue());
                items.remove(itemToSell);
                
                System.out.println("Item " + itemToSell.getName() + " has been sold for " + itemToSell.getGoldValue() + " gold coins.");
                System.out.println("Now you have " + player.getMoney() + " gold coins");
                System.out.println();
                System.out.println("Your updated inventory: ");
                displayInventory(player);

            } else {
                System.out.println("Sale canceled. Returning to inventory...");
            }
        } else {
            System.out.println("Invalid choice. Exiting inventory ...");
        }
    }


    // Advanced method for superPlayer -- create customisable item
    public void customisableItemConstructor(Player player){
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE WORKSHOP");
        System.out.println("What type of item would you like to create?");
        System.out.println();
        System.out.println("1. Weapon");
        System.out.println("2. Armor");
        System.out.println("3. Potion");
        System.out.println("0. Back to menu");
        System.out.println();

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0) {
            System.out.println("Returning to the main menu...");
            return;
        }

        System.out.println("Enter the name of the item:");
        String name = scanner.nextLine();

        int weight = 10;

        int goldValue = 30;

        // Weapon
        if (choice == 1) {
            System.out.println("Enter the damage of the weapon:");
            int damage = scanner.nextInt();
            scanner.nextLine(); 
            CustomizableWeapon customWeapon = new CustomizableWeapon(name, weight, goldValue, damage);
            System.out.println("Enter the type of your weapon: ");
            String weaponType = scanner.nextLine();
            customWeapon.setElementType(weaponType);
            customWeapon.customize();
            addItem(customWeapon);
            System.out.println("Custom weapon created: " + customWeapon);
        } else if ((choice == 2)){
            // Armour
            System.out.println("Enter the type of armour:");
            String armourType = scanner.nextLine();
            CustomizableArmour customArmour = new CustomizableArmour(name, weight, goldValue, armourType);
            System.out.println("Enter the color of armour:");
            String color = scanner.nextLine();
            customArmour.setColor(color);
            addItem(customArmour);
            System.out.println("Custom armour created: " + customArmour);
        } else if (choice == 3) {
            // Consumable
            System.out.println("Enter the effect of your potion:");
            String effect = scanner.nextLine();

            System.out.println("Enter the duration of your potion:");
            int duration = scanner.nextInt();
            scanner.nextLine(); 

            CustomizableConsumable customPotion = new CustomizableConsumable(name, weight, goldValue, effect, duration);
            System.out.println();
            System.out.println("To make potion more customizable, you need to fill it with three extra element of your preference");

            System.out.println("Enter the first element:");
            String firstElement = scanner.nextLine();
            customPotion.setFirstElement(firstElement);

            System.out.println("Enter the second element:");
            String secondElement = scanner.nextLine();
            customPotion.setSecondElement(secondElement);

            System.out.println("Enter the third element:");
            String thirdElement = scanner.nextLine();
            customPotion.setThirdElement(thirdElement);

            addItem(customPotion);
            System.out.println("Custom potion created: " + customPotion);

        } else {
            System.out.println("Invalid choice. Returning to menu...");
        }

    }

    public int calculateTotalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

}

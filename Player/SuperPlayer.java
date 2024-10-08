package Player;
import java.util.InputMismatchException;
import java.util.Scanner;

import Inventory.Inventory;
import Inventory.Armour.OgreArmour;
import Inventory.Consumable.HealthPotion;
import Inventory.Weapon.MagicSword;

public class SuperPlayer extends Player{


    public SuperPlayer(String name) {
        super(name);
        this.inventory = new Inventory();
        addDefaultItems();
    }

    @Override
    public void startGame() {
        greetingsSuper();
    }
    
    public void greetingsSuper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WOW WOW WOW! SUPERPLAYER IS DETECTED" );
        System.out.println();
        System.out.println("PLEASE ENTER YOUR REAL NAME");
        String realName = scanner.nextLine();

        System.out.println("HELLO, SUPERPLAYER " + realName.toUpperCase() + "!");
        System.out.println();
        System.out.println("YOU HAVE " + money + " COINS");
        System.out.println();
        System.out.println("LET THE GAME BEGIN!");
        superPlayerGame(this);
    }

    // GREETING FUNC FOR TESTING

    // public static void greetingsSuper() {
    //     System.out.println("Let the game begin!");
    // }

    protected void addDefaultItems() {
        // add different classes to items-array
        inventory.addItem(new HealthPotion("Super Duper Health Potion", 1, 50, "Healing", 35, 100));
        inventory.addItem(new OgreArmour("Superior Ogre Armour", 10, 150, "Heavy"));
        inventory.addItem(new MagicSword("Extremely Cool Magic Sword", 5, 80, 100));
    }

    @Override
    public Inventory getInventory() {
        return this.inventory;
    }

    public void superPlayerGame(Player player) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("CHOOSE WISELY:");
            System.out.println("1. INVENTORY");
            System.out.println("2. SHOP");
            System.out.println("3. WORKSHOP");
            System.out.println("4. QUIT");
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        inventory.displayInventory(player);
                        break;
                    case 2:
                        inventory.toShop(player);
                        break;
                    case 3:
                        inventory.customisableItemConstructor();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                choice = 0;
            }
        } while (choice != 4);

        scanner.close();
    }

    
}

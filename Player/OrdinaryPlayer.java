package Player;

import java.util.InputMismatchException;
import java.util.Scanner;

import Inventory.Inventory;
import Inventory.Armour.OgreArmour;
import Inventory.Consumable.HealthPotion;
import Inventory.Weapon.MagicSword;

public class OrdinaryPlayer extends Player {

    protected Inventory inventory;

    public OrdinaryPlayer(String name) {
        super(name);
        this.inventory = new Inventory();
        addDefaultItems();
    }

    @Override
    public void startGame() {
        greetingsOrdinary();
    }

    public void greetingsOrdinary() {
        System.out.println("Hello, player " + name);
        System.out.println("You have " + money + " pieces of gold");
        System.out.println("Let the game begin!");
        ordinaryPlayerGame();
    }

    protected void addDefaultItems() {
        inventory.addItem(new HealthPotion("Meh Potion", 8, 5, "Healing, but meh", 5, 20));
        inventory.addItem(new OgreArmour("Meh Armour", 40, 10, "Heavy and not very useful"));
        inventory.addItem(new MagicSword("Just A Sword", 15, 8, 20));
    }

    public void ordinaryPlayerGame() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("CHOOSE WISELY:");
            System.out.println("1. INVENTORY");
            System.out.println("2. SHOP");
            System.out.println("3. QUIT");
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        inventory.displayInventory();
                        break;
                    case 2:
                        inventory.shop();
                        break;
                    case 3:
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
        } while (choice != 3);

        scanner.close();
    }
}

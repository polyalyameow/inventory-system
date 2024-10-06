package Inventory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// personal inventory for each player
// consists of list of items 

// aggregation in relation to Item


public class Inventory {
    // TO CHECK! we dont need a constructor here - right?
    // QUESTION? how to create different default inventories for OP and SP 

    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    // add default items when player gets created
    public void addItem(Item item) {
        items.add(item);
    }

    // Show all items in inventory
    // Loop through array to show items
    // add "Back"-option to go back to meny

    public void displayInventory(){
        System.out.println();
        System.out.println("HERE'S YOUR INVENTORY");
        System.out.println();
        for(Item item : items) {
            System.out.println(item);
        }
    }

    public void shop(){

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("WELCOME TO THE SHOP!");
            System.out.println("PLEASE CHOOSE IF YOU WANT TO BUY OR SELL");
            System.out.println();
            System.out.println("1. BUY");
            System.out.println("2. SELL");
            System.out.println("3. GO BACK TO MENU");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        buyItem();
                        break;
                    case 2:
                        sellItem();
                        break;
                    case 3:
                        return;
                
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

    // Player can browse items in player's price range
    // 

    // ideas: maybe create a shop and call the shop here - one for OP, another for SP
    // ideas: maybe enum?

    // ACTIONS:
    // choose number? Are you sure that you want to buy this one?
    // add item to players inventory to default items
    // reduce amount of money

    public void buyItem() {
        System.out.println("Buying...");
    }

    // Player can sell item that player doesnt need
    // Player will get money 

    // ACTIONS:
    // display all items -- enums??
    // scanner for choice
    // are you sure? 
    // yes -- remove from array, money + Item.gold
    // no --- go back

    public void sellItem() {
        System.out.println("Selling...");
    }


    // Advanced method for superPlayer -- create customisable item
    public void customisableItemConstructor(){
        System.out.println("Workshop will be here...");
    }

}

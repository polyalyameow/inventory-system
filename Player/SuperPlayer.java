package Player;
import java.util.Scanner;

import Inventory.Inventory;

public class SuperPlayer extends Player{

    protected Inventory inventory;
    static int money = 500;
    // static int health = 100;

    public SuperPlayer(String name) {
        super(name);
        this.inventory = new Inventory();
        addDefaultItems();
    }
    
    // public static void greetingsSuper() {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("WOW WOW WOW! SUPERPLAYER IS DETECTED" );
    //     System.out.println();
    //     System.out.println("PLEASE ENTER YOUR REAL NAME");
    //     String realName = scanner.nextLine();

    //     System.out.println("HELLO, SUPERPLAYER " + realName.toUpperCase() + "!");
    //     System.out.println();
    //     System.out.println("YOU HAVE " + money + " PIECES OF GOLD");
    //     System.out.println();
    //     System.out.println("LET THE GAME BEGIN!");
    // }

    // GREETING FUNC FOR TESTING
    public static void greetingsSuper() {
        System.out.println("Let the game begin!");
    }

    protected void addDefaultItems() {
        // add different classes to items-array
        // inventory.addItem(new Item());
    }

    // public static void setHealth(int newHealth) {
    //     health = newHealth;
    // }

    // public static int getHealth() {
    //     return health;
    // }
    
}

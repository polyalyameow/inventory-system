package Player;

import Inventory.Inventory;

public class OrdinaryPlayer extends Player {

    protected Inventory inventory;
    static int money = 50;
    // private int health = 50;

    public OrdinaryPlayer(String name) {
        super(name);
        this.inventory = new Inventory();
        addDefaultItems();
        setHealth(50);
    }

    public static void greetingsOrdinary(String name) {
        System.out.println("Hello, player " + name);
        System.out.println("You have " + money + " pieces of gold");
        System.out.println("Let the game begin!");
    }

    protected void addDefaultItems() {
        // add different classes to items-array
        // inventory.addItem(new Item());
    }

    
}

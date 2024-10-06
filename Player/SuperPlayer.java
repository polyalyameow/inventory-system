package Player;
import java.util.Scanner;

import Inventory.Inventory;
import Inventory.Item;
import Inventory.Armour.OgreArmour;
import Inventory.Consumable.HealthPotion;
import Inventory.Weapon.MagicSword;

public class SuperPlayer extends Player{

    protected Inventory inventory;

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
        System.out.println("YOU HAVE " + money + " PIECES OF GOLD");
        System.out.println();
        System.out.println("LET THE GAME BEGIN!");
        superPlayerGame();
    }

    // GREETING FUNC FOR TESTING

    // public static void greetingsSuper() {
    //     System.out.println("Let the game begin!");
    // }

    protected void addDefaultItems() {
        // add different classes to items-array
        inventory.addItem(new HealthPotion("Super Duper Potion", 1, 50, "Healing", 35, 100));
        inventory.addItem(new OgreArmour("Superior Armour", 10, 150, "Heavy"));
        inventory.addItem(new MagicSword("Extremely Cool Sword", 5, 80, 100));
    }

    public void superPlayerGame() {
        inventory.displayInventory();
    }

    
}

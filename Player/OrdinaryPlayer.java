package Player;

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
        inventory.displayInventory();
    }
}

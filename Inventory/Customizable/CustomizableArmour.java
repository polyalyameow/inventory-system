package Inventory.Customizable;

import java.util.Scanner;

import Interfaces.Equippable;
import Inventory.Armour.Armour;
import Player.Player;

public class CustomizableArmour extends Armour implements Equippable {

    private String color;
    protected boolean isEquipped = false;

    public CustomizableArmour(String name, int weight, int goldValue, String armourType) {
        super(name, weight, goldValue, armourType);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void enchant(Player player) {
        System.out.println();
        System.out.println("Your Customizable Armour is getting enchanted");
        player.setHealth(player.getHealth() + 20);
        System.out.println();
        System.out.println("Health boost. Your health is: " + player.getHealth());
    }

    @Override
    public void equip(Player player) {
        if (!isEquipped) {
            System.out.println();
            System.out.println("Equipping your weapon!");
            player.setStrength(player.getStrength() + 20);
            isEquipped = true;
            System.out.println();
            System.out.println("Current strength: " + player.getStrength());
        } else {
            System.out.println();
            System.out.println("Your weapon is already equipped");
        }
    }

    @Override
    public void unEquip(Player player) {
        if (isEquipped) {
            System.out.println();
            System.out.println("Unequipping...");
            player.setStrength(player.getStrength() - 20);
            isEquipped = false;
        } else {
            System.out.println();
            System.out.println("You didn't have any equipment to begin with");
        }
    }

        public void displayCustomizableArmourMenu(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("THE CUSTOMIZABLE ARMOUR HAS BEEN SELECTED!");
        System.out.println("Choose an action:");
        System.out.println();
        System.out.println("1. Enchant Your Armour");
        System.out.println("2. Equip Your Armour");
        System.out.println("3. Unequip Your Armour");
        System.out.println("0. Back to inventory");

        int action = scanner.nextInt();

        switch (action) {
            case 1:
                enchant(player);
                break;
            case 2:
                equip(player);
                break;
            case 3:
                unEquip(player);
                break;
            case 0:
                System.out.println("Returning to inventory...");
                break;
            default:
                System.out.println("Invalid choice. Returning to inventory...");
        }
    }
    
}

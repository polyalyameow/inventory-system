package Inventory.Armour;

import java.util.Scanner;

import Interfaces.Equippable;
import Player.Player;

public class OgreArmour extends Armour implements Equippable {

    protected boolean isEquipped = false;

    public OgreArmour(String name, int weight, int goldValue, String armourType) {
        super(name, weight, goldValue, armourType);
    }

    @Override
    public void enchant(Player player) {
        System.out.println();
        System.out.println("Your OgreArmour is getting enchanted");
        player.setHealth(player.getHealth() + 20);
        System.out.println();
        System.out.println("Health boost. Your health is: " + player.getHealth());
       
    }

    @Override
    public void equip(Player player) {
        if (!isEquipped) {
            System.out.println();
            System.out.println("Equipping the OgreArmour!");
            player.setStrength(player.getStrength() + 20);
            isEquipped = true;
            System.out.println();
            System.out.println("Current strength: " + player.getStrength());
        } else {
            System.out.println();
            System.out.println("The OgreArmour is already equipped");
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

    public void displayOgreArmourMenu(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("THE OGRE ARMOUR HAS BEEN SELECTED!");
        System.out.println("Choose an action:");
        System.out.println();
        System.out.println("1. Enchant Ogre Armour");
        System.out.println("2. Equip Ogre Armour");
        System.out.println("3. UnEquip Ogre Armour");
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

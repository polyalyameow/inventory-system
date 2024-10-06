package Inventory.Armour;

import Interfaces.Equippable;
import Player.Player;

public class OgreArmour extends Armour implements Equippable {

    protected boolean isEquipped = false;

    public OgreArmour(String name, int weight, int goldValue, String armourType) {
        super(name, weight, goldValue, armourType);
    }

    @Override
    public void enchant(Player player) {
        System.out.println("Your OgreArmour is getting enchanted");
        player.setHealth(player.getHealth() + 20);
        System.out.println("Health boost. Your health is: " + player.getHealth());
       
    }

    @Override
    public void equip(Player player) {
        if (!isEquipped) {
            System.out.println("Equipping the OgreArmour!");
            player.setStrength(player.getStrength() + 20);
            isEquipped = true;
            System.out.println("Current strength: " + player.getStrength());
        } else {
            System.out.println("The OgreArmour is already equipped");
        }
    }

    @Override
    public void unEquip(Player player) {
        if (isEquipped) {
            System.out.println("Unequipping...");
            player.setStrength(player.getStrength() - 20);
            isEquipped = false;
        } else {
            System.out.println("You didn't have any equipment to begin with");
        }
    }
    
}

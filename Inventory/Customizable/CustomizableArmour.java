package Inventory.Customizable;

import Interfaces.Equippable;
import Inventory.Armour.Armour;
import Player.Player;

public class CustomizableArmour extends Armour implements Equippable {

    private String color;
    protected boolean isEquipped = false;

    public CustomizableArmour(String name, int weight, int goldValue, String armourType) {
        super(name, weight, goldValue, armourType);
        this.color = color;
        
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


    
}

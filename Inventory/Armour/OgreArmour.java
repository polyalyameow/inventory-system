package Inventory.Armour;

import Interfaces.Equippable;

public class OgreArmour extends Armour implements Equippable {

    protected int stamina;
    protected int strength;
    protected boolean isEquipped = false;

    public OgreArmour(String name, int weight, int goldValue, int defense, String armourType, int stamina, int strength) {
        super(name, weight, goldValue, defense, armourType);
        this.stamina = stamina;
        this.strength = strength;
    }

    @Override
    public void enchant() {
        System.out.println("Your OgreArmour is getting enchanted");
        this.stamina += 10;
        this.strength += 10;
    }

    @Override
    public void equip() {
        if (!isEquipped) {
            System.out.println("Equipping the OgreArmour!");
            this.setDefense(this.getDefense() + 20);
            isEquipped = true;
            System.out.println("Current defense: " + defense);
        } else {
            System.out.println("The OgreArmour is already equipped");
        }
    }

    @Override
    public void unEquip() {
        if (isEquipped) {
            System.out.println("Unequipping...");
            this.setDefense(this.getDefense() - 20);
            isEquipped = false;
        } else {
            System.out.println("You didn't have any equipment to begin with");
        }
    }
    
}

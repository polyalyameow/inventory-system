package Inventory.Armour;

import Inventory.Item;

public abstract class Armour extends Item {

    int defense;
    String armourType;
    
    public Armour(String name, int weight, int goldValue, int defense, String armourType) {
        super(name, weight, goldValue);
        this.defense = defense;
        this.armourType = armourType;
    }

    public abstract void enchant();

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }
}

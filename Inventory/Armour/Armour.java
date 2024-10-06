package Inventory.Armour;

import Inventory.Item;
import Player.Player;

public abstract class Armour extends Item {

    String armourType;
    
    public Armour(String name, int weight, int goldValue, String armourType) {
        super(name, weight, goldValue);
        this.armourType = armourType;
    }

    public abstract void enchant(Player player);

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }
}

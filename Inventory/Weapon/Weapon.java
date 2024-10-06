package Inventory.Weapon;

import Inventory.Item;
import Player.Player;

public abstract class Weapon extends Item {

    int damage;

    public Weapon(String name, int weight, int goldValue, int damage) {
        super(name, weight, goldValue);
        this.damage = damage;
    }

    public abstract void attack(Player player);

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}

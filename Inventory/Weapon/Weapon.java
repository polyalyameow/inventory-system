package Inventory.Weapon;

import Inventory.Item;

public abstract class Weapon extends Item {

    int damage;
    int durability;

    public Weapon(String name, int weight, int goldValue, int damage, int durability) {
        super(name, weight, goldValue);
        this.damage = damage;
        this.durability = durability;
    }

    public abstract void attack();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability){
        this.durability = durability;
    }
    
}

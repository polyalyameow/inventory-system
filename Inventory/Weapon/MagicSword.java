package Inventory.Weapon;

import Interfaces.Equippable;
import Interfaces.Usable;

public class MagicSword extends Weapon implements Equippable, Usable {

    private int mana;
    private int swingCount;
    private boolean isEquipped = false;

    public MagicSword(String name, int weight, int goldValue, int damage, int durability, int mana) {
        super(name, weight, goldValue, damage, durability);
        this.mana = mana;
        this.swingCount = 0;
    }

    private void castFireball() {
        if (mana >= 10) { 
            System.out.println("Shooting fireball!");
            mana -= 10;
        } else {
            System.out.println("Not enough mana to shoot fireball.");
        }
    }

    @Override
    public void attack() {
        swingCount++;
        if (swingCount % 3 == 0) {
            castFireball();
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void use() {
        System.out.println("You use the Magic Sword to attack!");
        attack();
    }

    @Override
    public void equip() {
        if (!isEquipped) {
            System.out.println("Equipping the Magic Sword!");
            isEquipped = true; // Set the equipped status to true
            this.setMana(this.getMana() + 5);
            System.out.println("Mana increased! Current mana: " + mana);
        } else {
            System.out.println("The Magic Sword is already equipped");
        }
    }

    @Override
    public void unEquip() {
        if (isEquipped) {
            System.out.println("Unequipping...");
            this.setMana(this.getMana() - 20);
            isEquipped = false;
        } else {
            System.out.println("You didn't have any equipment to begin with.");
        }
    }
    
}

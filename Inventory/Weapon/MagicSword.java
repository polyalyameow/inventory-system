package Inventory.Weapon;

import Interfaces.Equippable;
import Interfaces.Usable;
import Player.Player;


public class MagicSword extends Weapon implements Equippable, Usable {

    private int swingCount;
    private boolean isEquipped = false;

    public MagicSword(String name, int weight, int goldValue, int damage, int durability) {
        super(name, weight, goldValue, damage, durability);
        this.swingCount = 0;
    }

    private void castFireball(Player player) {
        if (player.getMana() >= 10) { 
            System.out.println("Shooting fireball!");
            player.setMana(player.getMana() - 10);
        } else {
            System.out.println("Not enough mana to shoot fireball.");
        }
    }

    public void attack(Player player) {
        swingCount++;
        if (swingCount % 3 == 0) {
            castFireball(player);
        }
    }

    @Override
    public void use(Player player) {
        attack(player);
    }

    @Override
    public void equip(Player player) {
        if (!isEquipped) {
            System.out.println("Equipping the Magic Sword!");
            isEquipped = true; 
            player.setMana(player.getMana() + 5);
            System.out.println("Mana increased! Current mana: " + player.getMana());
        } else {
            System.out.println("The Magic Sword is already equipped");
        }
    }

    @Override
    public void unEquip(Player player) {
        if (isEquipped) {
            System.out.println("Unequipping...");
            player.setMana(player.getMana() - 20);
            isEquipped = false;
        } else {
            System.out.println("You didn't have any equipment to begin with.");
        }
    }
    
}

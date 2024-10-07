package Inventory.Weapon;

import java.util.Scanner;

import Interfaces.Equippable;
import Interfaces.Usable;
import Player.Player;


public class MagicSword extends Weapon implements Equippable, Usable {

    private int swingCount;
    private boolean isEquipped = false;

    public MagicSword(String name, int weight, int goldValue, int damage) {
        super(name, weight, goldValue, damage);
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
            System.out.println("Casting Fireball!");
        }
    }

    @Override
    public void use(Player player) {
        attack(player);
        System.out.println("Attacking..");
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

    
    public void displayMagicSwordMenu(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("THE MAGIC SWORD HAS BEEN SELECTED!");
        System.out.println("Choose an action:");
        System.out.println();
        System.out.println("1. Use Magic Sword");
        System.out.println("2. Equip Magic Sword");
        System.out.println("3. UnEquip Magic Sword");
        System.out.println("0. Back to inventory");

        int action = scanner.nextInt();

        switch (action) {
            case 1:
                use(player);
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

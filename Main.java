import java.util.Scanner;

import Player.Player;


// -----------------------------------------------
// IMPORT FOR TESTS

// import Inventory.Armour.OgreArmour;
// import Inventory.Consumable.HealthPotion;
// import Inventory.Consumable.MagicCake;
// import Inventory.Weapon.MagicSword;
// import Player.OrdinaryPlayer;
// import Player.Player;
// import Player.SuperPlayer;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Stranger!");

        System.out.println("PLEASE ENTER YOUR NAME");
        String name = scanner.nextLine();
        Player newPlayer = Player.createPlayer(name);

        newPlayer.startGame();


        // ---- TEST CASES ---- //

        // Player player = new OrdinaryPlayer("Polly"); 
        // Player player = new SuperPlayer("MOTHERLODE");
        // System.out.println("Health: " + player.getHealth());
        // System.out.println("Mana: " + player.getMana());
        // System.out.println("Strength: " + player.getStrength());
        // System.out.println("Money: " + player.getMoney());

        // -------------------------------------------------------------------------
        
        // --- TEST CASES FOR OGREARMOUR ---- //

        // OgreArmour ogreArmour = new OgreArmour("Ogre Armour", 10, 150, "Heavy");

        // Test the equip method
        // Expected: increase by 20

        // System.out.println("\n--- Testing Equip ---");
        // System.out.println("Current strength: " + player.getStrength());
        // ogreArmour.equip(player);
        // System.out.println("Player's strength after equipping: " + player.getStrength());

        // Test the enchant method
        //Expected: increase by 20

        // System.out.println("\n--- Testing Enchant ---");
        // System.out.println("Current health: " + player.getHealth());
        // ogreArmour.enchant(player);
        // System.out.println("Player's health after enchanting: " + player.getHealth());

        // Test the unEquip method
        //Expected: decrease by 20

        // System.out.println("\n--- Testing UnEquip ---");
        // System.out.println("Current strength: " + player.getStrength());
        // ogreArmour.unEquip(player);
        // System.out.println("Player's strength after unequipping: " + player.getStrength());
       
       
        // -------------------------------------------------------------------------
        // --- TEST CASES FOR HEALTH POTION ---- //

        // HealthPotion potion = new HealthPotion("Small Health Potion", 1, 10, "Healing", 5, 100);

        // Expected increase by 20

        // System.out.println("Player's health before using potion: " + player.getHealth());
        // System.out.println("\n--- Using Health Potion ---");
        // potion.use(player); 

        // -------------------------------------------------------------------------
        // --- TEST CASES FOR MAGIC CAKE ---- //
        
        // MagicCake magicCake = new MagicCake("Magic Cake", 1, 10, "Restores health and mana", 5, 20, 15);
        // magicCake.use(player);
        
        // -------------------------------------------------------------------------
        // --- TEST CASES FOR MAGIC SWORD ---- //

        // MagicSword magicSword = new MagicSword("Magic Sword", 5, 50, 100);
        
        // Equip the MagicSword
        // magicSword.equip(player);
        
        // System.out.println("Mana after equipping Magic Sword: " + player.getMana());

        // System.out.println("Performing attacks...");
        // magicSword.attack(player);  
        // magicSword.attack(player);
        // magicSword.attack(player);  // should cast fireball

        // Mana after casting fireball
        // System.out.println("Mana after casting fireball: " + player.getMana());

        // Unequip the MagicSword
        // magicSword.unEquip(player);
        
        // Display mana after unequipping
        // System.out.println("Mana after unequipping Magic Sword: " + player.getMana());
        
        // -------------------------------------------------------------------------

    }
}
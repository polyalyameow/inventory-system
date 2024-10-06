import java.util.Scanner;

import Inventory.Armour.OgreArmour;
import Player.OrdinaryPlayer;
import Player.Player;
import Player.SuperPlayer;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Stranger! If you want to start your journey into the world of danger, press any key");

        // System.out.println("PLEASE ENTER YOUR NAME");
        // String name = scanner.nextLine();
        // Player newPlayer = new Player(name);


        // ---- TEST CASES ---- //

        // Player player = new OrdinaryPlayer("Polly"); 
        Player player = new SuperPlayer("MOTHERLODE");
        System.out.println("Health: " + player.getHealth());
        System.out.println("Mana: " + player.getMana());
        System.out.println("Strength: " + player.getStrength());
        System.out.println("Money: " + player.getMoney());

        // -------------------------------------------------------------------------
        
        // --- TEST CASES FOR OGREARMOUR ---- //
        OgreArmour ogreArmour = new OgreArmour("Ogre Armour", 10, 150, "Heavy");

        // Test the equip method
        // Expected: increase by 20
        System.out.println("\n--- Testing Equip ---");
        System.out.println("Current strength: " + player.getStrength());
        ogreArmour.equip(player);
        System.out.println("Player's strength after equipping: " + player.getStrength());

        // Test the enchant method
        //Expected: increase by 20
        System.out.println("\n--- Testing Enchant ---");
        System.out.println("Current health: " + player.getHealth());
        ogreArmour.enchant(player);
        System.out.println("Player's health after enchanting: " + player.getHealth());

        // Test the unEquip method
        //Expected: decrease by 20
        System.out.println("\n--- Testing UnEquip ---");
        System.out.println("Current strength: " + player.getStrength());
        ogreArmour.unEquip(player);
        System.out.println("Player's strength after unequipping: " + player.getStrength());  // Expected: decreased by 20
        // -------------------------------------------------------------------------

    }
}
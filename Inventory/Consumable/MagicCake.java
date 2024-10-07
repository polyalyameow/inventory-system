package Inventory.Consumable;

import java.util.Scanner;

import Player.Player;

public class MagicCake extends Consumable {

    private int restoreHealthAmount;
    private int restoreManaAmount;
    

    public MagicCake(String name, int weight, int goldValue, String effect, int duration, int restoreHealthAmount, int restoreManaAmount) {
        super(name, weight, goldValue, effect, duration);
        this.restoreHealthAmount = restoreHealthAmount;
        this.restoreManaAmount = restoreManaAmount;
    }

    @Override
    public void use(Player player) {
        System.out.println("Using a magic cake...");
        int currentHealth = player.getHealth();
        int currentMana = player.getMana();
        player.setHealth(currentHealth + restoreHealthAmount);
        player.setMana(currentMana + restoreManaAmount);
        System.out.println("Health after magic cake is " + player.getHealth());
        System.out.println("Mana after magic cake is " + player.getMana());
        removeBoostAfterDuration(player);
    }

    private void removeBoostAfterDuration(Player player) {
        System.out.println("Boost will be removed after " + getDuration() + " seconds...");
        
        try {
            Thread.sleep(getDuration() * 1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        player.setHealth(player.getHealth() - restoreHealthAmount);
        player.setMana(player.getMana() - restoreManaAmount);
        System.out.println("Boost removed. Player's health is now: " + player.getHealth());
        System.out.println("Mana is " + player.getMana());
    }

    public void displayMagicCakeMenu(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("THE MAGIC CAKE HAS BEEN SELECTED!");
        System.out.println("Choose an action:");
        System.out.println();
        System.out.println("1. Use Magic Cake");
        System.out.println("0. Back to inventory");

        int action = scanner.nextInt();

        switch (action) {
            case 1:
                use(player);
                break;
            case 0:
                System.out.println("Returning to inventory...");
                break;
            default:
                System.out.println("Invalid choice. Returning to inventory...");
        }
    }
    
    
}

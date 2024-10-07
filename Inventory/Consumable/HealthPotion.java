package Inventory.Consumable;

import java.util.Scanner;

import Player.Player;

public class HealthPotion extends Consumable {

    private int restoreAmount;

    public HealthPotion(String name, int weight, int goldValue, String effect, int duration, int restoreAmount) {
        super(name, weight, goldValue, effect, duration);
        this.restoreAmount = restoreAmount;
    }

    @Override
    public void use(Player player) {
        System.out.println("Using a health potion...");
        int currentHealth = player.getHealth();
        player.setHealth(currentHealth + restoreAmount);
        System.out.println("Health after potion: " + player.getHealth());
        removeHealthBoostAfterDuration(player);
    }

    private void removeHealthBoostAfterDuration(Player player) {
        System.out.println("Health boost will be removed after " + getDuration() + " seconds...");
        
        try {
            Thread.sleep(getDuration() * 1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        player.setHealth(player.getHealth() - restoreAmount);
        System.out.println("Health boost removed. Player's health is now: " + player.getHealth());
    }

    public void displayHealthPotionMenu(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("THE HEALTH POTION HAS BEEN SELECTED!");
        System.out.println("Choose an action:");
        System.out.println();
        System.out.println("1. Use Health Potion");
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

    public int getRestoreAmount() {
        return this.restoreAmount;
    } 
}

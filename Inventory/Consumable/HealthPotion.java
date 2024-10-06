package Inventory.Consumable;

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
    
}

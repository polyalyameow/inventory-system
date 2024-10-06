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
    }
    
}

package Inventory.Consumable;

import Player.OrdinaryPlayer;
import Player.Player;
import Player.SuperPlayer;

public class HealthPotion extends Consumable {

    private int restoreAmount;

    public HealthPotion(String name, int weight, int goldValue, String effect, int duration, int restoreAmount) {
        super(name, weight, goldValue, effect, duration);
        this.restoreAmount = restoreAmount;
    }

    @Override
    public void use() {
        System.out.println("Using a health potion...");
    }

    public void use(Player player) {
        int currentHealth = player.getHealth();
        player.setHealth(currentHealth + restoreAmount);
    }
    
}

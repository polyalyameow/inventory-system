package Inventory.Consumable;

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
    }
    
}

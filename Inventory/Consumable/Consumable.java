package Inventory.Consumable;

import Interfaces.Usable;
import Inventory.Item;

public abstract class Consumable extends Item implements Usable {

    private String effect;
    private int duration;

    public Consumable(String name, int weight, int goldValue, String effect, int duration) {
        super(name, weight, goldValue);
        this.effect = effect;
        this.duration = duration;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}

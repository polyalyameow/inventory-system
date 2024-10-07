package Inventory.Customizable;

import Inventory.Consumable.Consumable;
import Player.Player;

public class CustomizableConsumable extends Consumable {

    String firstElement;
    String secondElement;
    String thirdElement;

    public CustomizableConsumable(String name, int weight, int goldValue, String effect, int duration) {
        super(name, weight, goldValue, effect, duration);
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
    }

    @Override
    public void use(Player player) {
        System.out.println("You have used " + getName() + ". Effect: " + getEffect() + 
                           " for " + getDuration() + " seconds. Your health potion consists of " + firstElement + secondElement + thirdElement);
    }

        
    public String getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(String color) {
        this.firstElement = firstElement;
    }
    
    public String getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(String color) {
        this.secondElement = secondElement;
    }
    
    public String getThirdElement() {
        return thirdElement;
    }

    public void setThirdElement(String color) {
        this.thirdElement = thirdElement;
    }
    
}

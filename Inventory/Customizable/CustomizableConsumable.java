package Inventory.Customizable;

import java.util.Scanner;

import Inventory.Consumable.Consumable;
import Player.Player;

public class CustomizableConsumable extends Consumable {

    private String firstElement;
    private String secondElement;
    private String thirdElement;

    public CustomizableConsumable(String name, int weight, int goldValue, String effect, int duration) {
        super(name, weight, goldValue, effect, duration);
    }

    @Override
    public void use(Player player) {
        System.out.println("You have used " + getName() + ". Effect: " + getEffect() + 
                           " for " + getDuration() + " seconds. Your health potion consists of " + firstElement + ", " + secondElement + ", " + thirdElement);
    }

        
    public String getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(String firstElement) {
        this.firstElement = firstElement;
    }
    
    public String getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(String secondElement) {
        this.secondElement = secondElement;
    }
    
    public String getThirdElement() {
        return thirdElement;
    }

    public void setThirdElement(String thirdElement) {
        this.thirdElement = thirdElement;
    }
    
    public void displayCustomizablePotionMenu(Player player) {
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
}

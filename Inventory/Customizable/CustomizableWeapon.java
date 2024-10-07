package Inventory.Customizable;

import java.lang.annotation.ElementType;
import java.util.Scanner;

import Inventory.Weapon.Weapon;
import Player.Player;

public class CustomizableWeapon extends Weapon {

    private String elementType;

    public CustomizableWeapon(String name, int weight, int goldValue, int damage, String elementType) {
        super(name, weight, goldValue, damage);
        this.elementType = elementType;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public void customize() {
        System.out.println("Customize your weapon:");
        System.out.println("Choose an element type:");
        System.out.println("1. FIRE");
        System.out.println("2. WATER");
        System.out.println("3. EARTH");
        System.out.println("4. AIR");
        System.out.println("5. LIGHTNING");
        System.out.println("6. ICE");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                setElementType("FIRE");
                break;
            case 2:
                setElementType("WATER");
                break;
            case 3:
                setElementType("EARTH");
                break;
            case 4:
                setElementType("AIR");
                break;
            case 5:
                setElementType("LIGHTNING");
                break;
            case 6:
                setElementType("ICE");
                break;
            default:
                System.out.println("Invalid choice. No element type set.");
        }

        System.out.println("Your weapon is now customized with the element: " + getElementType());
    }


    @Override
    public void attack(Player player) {
        System.out.println("Player attacks with " + getName() + " (" + getElementType() + ") for " + getDamage() + " damage!");
        applyElementalEffects(player);
    }

    private void applyElementalEffects(Player player) {
        switch (getElementType()) {
            case "FIRE":
                System.out.println("The target is burned!");
                break;
            case "WATER":
                System.out.println("The target is soaked!");
                break;
            case "EARTH":
                System.out.println("The target is rooted!");
                break;
            case "AIR":
                System.out.println("The target is knocked back by the wind!!");
                break;
            case "LIGHTNING":
                System.out.println("The target is shocked!");
                break;
            case "ICE":
                System.out.println("The target is frozen!");
                break;
            default:
                System.out.println("No elemental effects applied.");
                break;
        }
    }
    
}

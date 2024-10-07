package Player;

import Inventory.Inventory;

public class Player {
    protected String name;
    protected int health; 
    protected int mana;
    protected int money;
    protected int strength;
    protected Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
        checkPlayer(name);

    }

    private void checkPlayer(String name) {
        if (name.equalsIgnoreCase("MOTHERLODE")) {
            this.health = 100;
            this.mana = 100;
            this.money = 500;
            this.strength = 300;
        } else {
            this.health = 50;
            this.mana = 50;
            this.money = 120; 
            this.strength = 80;
        }
    }

    public static Player createPlayer(String name) {
        if(name.equalsIgnoreCase("MOTHERLODE")){
            return new SuperPlayer(name);
        } else {
            return new OrdinaryPlayer(name);
        }
    }

    public void startGame() {
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getMana(){
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMoney(){
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}

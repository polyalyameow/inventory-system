package Player;

public class Player {
    private String name;
    protected int health; 
    protected int mana;
    protected int money;
    protected int strength;

    public Player(String name) {
        this.name = name;
        checkPlayer(name);
    }

    private void checkPlayer(String name) {
        if (name.equalsIgnoreCase("MOTHERLODE")) {
            SuperPlayer.greetingsSuper();
            this.health = 100;
            this.mana = 100;
            this.money = 500;
            this.strength = 300;
        } else {
            OrdinaryPlayer.greetingsOrdinary(name);
            this.health = 50;
            this.mana = 50;
            this.money = 120; 
            this.strength = 80;
        }
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
}

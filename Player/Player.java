package Player;

public class Player {
    private String name;
    protected int health; 

    public Player(String name) {
        this.name = name;
        // this.health = health;
        checkPlayer(name);
    }

    private void checkPlayer(String name) {
        if (name.equalsIgnoreCase("MOTHERLODE")) {
            SuperPlayer.greetingsSuper();
            this.health = 100;
        } else {
            OrdinaryPlayer.greetingsOrdinary(name);
            this.health = 50;
        }
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
}

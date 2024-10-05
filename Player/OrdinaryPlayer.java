package Player;

public class OrdinaryPlayer extends Player {

    static int money = 50;

    public OrdinaryPlayer(String name) {
        super(name);
    }

    public static void greetingsOrdinary(String name) {
        System.out.println("Hello, player " + name);
        System.out.println("You have " + money + " pieces of gold");
        System.out.println("Let the game begin!");
    }
    
}

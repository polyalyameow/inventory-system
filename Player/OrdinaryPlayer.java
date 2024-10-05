package Player;

public class OrdinaryPlayer extends Player {

    public OrdinaryPlayer(String name) {
        super(name);
    }

    public static void greetingsOrdinary(String name) {
        System.out.println("Hello, player " + name);
    }
    
}

package Player;

public class Player {
    String name;

    public Player(String name) {
        this.name = name;
        checkPlayer(name);
    }

    private void checkPlayer(String name) {
        if (name.equalsIgnoreCase("MOTHERLODE")) {
            SuperPlayer.greetingsSuper();
        } else {
            OrdinaryPlayer.greetingsOrdinary(name);
        }
    }
}

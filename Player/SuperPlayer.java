package Player;
import java.util.Scanner;

public class SuperPlayer extends Player{

    public SuperPlayer(String name) {
        super(name);
    }
    
    public static void greetingsSuper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WOW WOW WOW! SUPERPLAYER IS DETECTED" );
        System.out.println();
        System.out.println("PLEASE ENTER YOUR REAL NAME");
        String realName = scanner.nextLine();

        System.out.println("HELLO, SUPERPLAYER " + realName.toUpperCase() + "!");
    }
}

import java.util.Scanner;

import Player.Player;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Stranger! If you want to start your journey into the world of danger, press any key");

        // @TODO:
       // add while true, game continues
       // press esc -- exit loop

        System.out.println("PLEASE ENTER YOUR NAME");
        String name = scanner.nextLine();
        Player newPlayer = new Player(name);

    }
}
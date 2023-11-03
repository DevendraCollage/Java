
// todo: Another Dynamic Method Dispatch
import java.util.Scanner;

class Game {
    public void type() {
        System.out.println("Indoor & Outdoor!");
    }
}

class Cricket extends Game {
    public void type() {
        System.out.println("Cricket is Outdoor Game!");
    }
}

class Badminton extends Game {
    public void type() {
        System.out.println("Badminton is Indoor Game!");
    }
}

class Tennis extends Game {
    public void type() {
        System.out.println("Tennis is Outdoor Game!");
    }
}

class Chess extends Game {
    public void type() {
        System.out.println("Chess is Indoor Game!");
    }
}

public class AnotherDynamicMethodDispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        Cricket ck = new Cricket();
        Badminton b = new Badminton();
        Tennis t = new Tennis();
        Chess ch = new Chess();
        System.out.print("Enter The Game Name Here : ");
        String game = sc.nextLine();
        if (game.equals("cricket")) {
            g = ck;
        } else if (game.equals("badminton")) {
            g = b;
        } else if (game.equals("tennis")) {
            g = t;
        } else if (game.equals("chess")) {
            g = ch;
        } else {
            System.out.println("Wrong Choice!");
        }
        g.type();
        sc.close();
    }
}

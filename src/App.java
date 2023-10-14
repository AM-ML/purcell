import java.util.Scanner;

class Robot {
    public void speak(String x) {
        System.out.println("rob says: " + x);
        System.out.println("    < ------- >");
        System.out.println("     | o   o |");
        System.out.println("     |   ||  |");
        System.out.println("     | \\___/ |");
        System.out.println("      -------");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Robot rob = new Robot();
        Scanner scan = new Scanner(System.in);
        System.out.print("Talk to the robot: ");
        String resp = scan.nextLine();
        rob.speak(resp);
    }
}

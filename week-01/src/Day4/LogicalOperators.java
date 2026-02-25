package Day4;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       // Username must be between 4-12 characters.
       // Username must not contain spaces or underscores.

        String username;

        System.out.print("Enter your username: ");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores.");
        } else {
            System.out.println("Welcome " + username);
        }

       sc.close();
    }
}

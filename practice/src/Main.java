import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Invalid integer. Please enter a valid integer: ");
        }
        int i = input.nextInt();
        System.out.println(i);

    }

}
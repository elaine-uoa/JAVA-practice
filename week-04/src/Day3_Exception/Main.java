package Day3_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exception = an event that interrupts the normal flow of a program.
        // try{} catch{} finally{}

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        }
        catch(ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY 0!");
        }
        catch (Exception e) {
            // safety net
            System.out.println("Something went wrong!");
        }
        finally {
            sc.close();
            System.out.println("This always executes:)");
        }


    }
}

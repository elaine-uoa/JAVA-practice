package Day4;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attemps = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attemps++;

            if (guess < randomNumber) {
                System.out.println("TOO Low! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO High! Try again");
            }
            else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("You have won!");
                System.out.printf("You guessed %d times", attemps);
            }

        } while(guess != randomNumber);


        sc.close();
    }
}

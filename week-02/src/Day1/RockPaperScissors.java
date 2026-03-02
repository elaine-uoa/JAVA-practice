package Day1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // declare vars
        // get user choice
        // generate random choice for computer
        // compare the 2 choices to determine the result, then display it
        // show the score?
        // ask to play again?
        // goodbye

        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.println("************************************");
            System.out.println("Welcome to the Rock Paper Scissors!");
            System.out.println("************************************");

            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("scissors") &&
                    !playerChoice.equals("paper")) {
                System.out.println("Please enter a valid choice");
                continue;
            }

            computerChoice = choices[rand.nextInt(choices.length)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        sc.close();
    }
}

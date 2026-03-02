package Day1;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {
        // declare vars
        // welcome
        // play if balance > 0
        // user will enter bet amount, verify if bet > balance, verify if bet > 0
        // subtract bet from balance
        // spin now
        // print row
        // get payout
        // ask to play again?
        // exit

        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playagain;

        System.out.println("**************************");
        System.out.println(" Welcome to JAVA Slots! ");
        System.out.println("Symbols: 🍒 🍉 🍋 💰 🎈");
        System.out.println("**************************");

        while(balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place you bet amount: ");
            bet = sc.nextInt();
            sc.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient fund!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than zero!");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry you lost this round");
            }

            System.out.print("Do you want to play again? (Y/N):  ");
            playagain = sc.nextLine().toUpperCase();

            if (!playagain.equals("Y")) {
                break;
            }

        }

        System.out.println("Game over! Your final balance is $" + balance);

        sc.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉",  "🍋" , "💰" , "🎈"};
        String[] row = new String[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[rand.nextInt(0, symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {

        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "💰" -> bet * 10;
                case "🎈" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
}

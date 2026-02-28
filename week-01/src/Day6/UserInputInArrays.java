package Day6;

import java.util.Scanner;

public class UserInputInArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] foods;
        int numOfFoods;

        System.out.print("What # of food do you want?: ");
        numOfFoods = sc.nextInt();
        sc.nextLine();

        foods = new String[numOfFoods];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }

        System.out.println("What foods you've wanted: ");

        for (String food : foods) {
            System.out.println(food);
        }

        sc.close();
    }
}

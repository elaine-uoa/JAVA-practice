package Day7_Enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Enums = (Enumeration) A special kind of class that represents a fixed set of constants.
        //they improve code readability and are easy to maintain.
        //more efficient with switches when comparing Strings.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }

        sc.close();
    }
}

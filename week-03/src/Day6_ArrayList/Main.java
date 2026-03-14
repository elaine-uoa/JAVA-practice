package Day6_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Watermelon");
//
//       fruits.remove(1);
//     fruits.set(0, "Pineapple");
//
//     System.out.println(fruits.get(0));
//        System.out.println(fruits.size());
//        Collections.sort(fruits);
//
//        System.out.println(fruits);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the # of food you would like: ");
        int numOfFoods = sc.nextInt();
        sc.nextLine();

        ArrayList<String> foods = new ArrayList<>();

        for (int i = 1; i <= numOfFoods; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = sc.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        sc.close();
    }
}

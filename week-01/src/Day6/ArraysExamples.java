package Day6;

import java.util.Arrays;

public class ArraysExamples {

    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

//        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

//        Arrays.sort(fruits);
        Arrays.fill(fruits, fruits[2]);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }



    }
}

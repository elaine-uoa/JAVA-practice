package Day5_Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //generics = a concept where you can write a class, interface, or method that is compatible with
        //different data types.
        //          <T> type parameter (placeholder that gets replaced with a real type)
        //          <String> type argument (specifies the type)

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Watermelon");

//        Box<String> box = new Box<>();
//
//        box.setItem("banana");
//
//        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("apple", 0.50);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}

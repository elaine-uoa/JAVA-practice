package Day7_Hashmaps;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //hashmap = a data structure that stores key-value pairs
        //          keys are unique otherwise will be overwritten, but values can be duplicated.
        //          does not maintain any order, but is memory efficient.
        //          HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

//        map.remove("apple");
//        System.out.println(map.get("apple"));
//        System.out.println(map.containsKey(("apple")));
//        System.out.println(map.containsValue(1.0));
//        System.out.println(map.size());

        for(String key: map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

//        System.out.println(map);
    }
}

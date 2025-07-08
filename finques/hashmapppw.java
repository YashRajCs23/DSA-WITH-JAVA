package finques;

import java.util.*;

public class hashmapppw {
    
    // This is your HashMap method
    static void HashMapMethods() {
        //syntax
        Map<String, Integer> mp = new HashMap<>();

        // add elements
        mp.put("aakash", 20);
        mp.put("kaashvi", 25);
        mp.put("yash", 22);

        // getting value of key
        System.out.println(mp.get("aakash"));
        System.out.println(mp.get("yash"));

        // changing value of key
        mp.put("yash", 27);

        // removing a pair
        mp.remove("aakash");

        // checking if a key is in hashmap
        mp.containsKey("yash");

        // adding a new entry if new key does not exist
        mp.putIfAbsent("aakash", 21);
        mp.putIfAbsent("yash", 27);

        // get all keys
        System.out.println(mp.keySet());

        // get all values
        System.out.println(mp.values());

        // all entries
        System.out.println(mp.entrySet());

        // Iterate over the entries and print formatted output
        for (var e : mp.entrySet()) {
            System.out.printf("age of %s is %d \n", e.getKey(), e.getValue());
        }
    }

    // Main method: This is the entry point of the program
    public static void main(String[] args) {
        // Call the HashMap method
        HashMapMethods();
    }
}

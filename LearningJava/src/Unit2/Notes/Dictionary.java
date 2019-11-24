package Unit2.Notes;

import java.util.HashMap;
import java.util.Map;

public class Dictionary
{
    public static void main(String[] args)
    {
        // Initializing a Dictionary
        Map<String, String> myDictionary = new HashMap<>();

        // put() method
        myDictionary.put("123", "Harry");
        myDictionary.put("456", "Bob");
        myDictionary.put("021", "Fred");
        myDictionary.put("342", "Julia");
        myDictionary.put("290", "Peter");

        // Size
        int size = myDictionary.size();
        System.out.println("There are " + size + " elements in myDictionary");
        // or you can use print formatting: System.out.printf("The size of the HashMap is %d%n", size);

        // Removing
        System.out.println("Removing 123: Harry");
        myDictionary.remove("123");
        size = myDictionary.size();
        System.out.printf("The size of the HashMap is %d%n", size);

        // Looking up
        Boolean found = myDictionary.containsKey("456");
        System.out.println("Does myDictionary contain 456? " + found);
        if (found) {
            System.out.println("Value is " + myDictionary.get("456"));
        }

        // Duplication - this overwrites the previous entry
        myDictionary.put("342", "Julian");

        // Checking if key is present before adding
        String current = myDictionary.putIfAbsent("290", "Michael");
        if (current == null) {
            System.out.println("Added new entry for 290 Michael");
        }
        else {
            System.out.println("290 was already there with entry " + current);
        }

        current = myDictionary.putIfAbsent("999", "Charlie");
        if (current == null) {
            System.out.println("Added new entry for 999 Charlie");
        }
        else {
            System.out.println("999 was already there with entry " + current);
        }

        // Iterating
        for (Map.Entry<String, String> pair: myDictionary.entrySet()) {
            System.out.println(pair.getKey() + ": " +  pair.getValue());
        }

    }
}

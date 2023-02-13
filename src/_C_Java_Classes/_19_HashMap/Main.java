package _C_Java_Classes._19_HashMap;

import java.util.HashMap; // import the HashMap class

public class Main {

    public static void main(String[] args) {
/*
    Java HashMap
    ================

    In the 'ArrayList' chapter, you learned that Arrays store
    items as an ordered collection, and you have to access them
    with an index number (int type).

    A HashMap however, store items in "key/value" pairs, and you
    can access them by an index of another type (e.g. a String).

    One object is used as a key (index) to another object (value).

    HashMap can store key/value of the same type OR from mixed
    typed :
    - String keys and Integer values,
    - String keys and String values:

    Create a HashMap object called capitalCities that will store
    String keys and String values */

        HashMap<String, String> capitalCities = new HashMap<String, String>();

   /* Add Items
   ------------
    The HashMap class has many useful methods. For example, to add
    items use the 'put()' method: */

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println("------------------------");

    /* Access an Item
    -----------------
    To access a value in the HashMap, use the 'get()' method and
    refer to its key: */

        System.out.println(capitalCities.get("England"));
        System.out.println("------------------------");

    /* Remove an Item
    -------------------
    To remove an item use the 'remove()' method and refer to the key */
        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println("------------------------");

    /* Remove all items:
     -------------------
     use the 'clear()' method */
        capitalCities.clear();
        System.out.println(capitalCities);
        System.out.println("------------------------");

    /* HashMap Size
    ----------------
    To find out how many items there are, use the 'size()' method*/
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        System.out.println("capitalCities.size() = " + capitalCities.size());
        System.out.println("------------------------");

    /* Loop Through a HashMap
    -------------------------
    Loop through the items of a HashMap with a for-each loop.

    Note:
    - Use the 'keySet()' method if you only want the keys,
    - Use the values() method if you only want the values:*/

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.println("------------------------");

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        System.out.println("------------------------");

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
        System.out.println("------------------------");


    /* Other Types
    ---------------
    Keys and values in a HashMap are actually objects.
    In the examples above, we used objects of type "String".
    Remember that a String in Java is an object.
    To use other types, such as int, you must specify an
    equivalent wrapper class: Integer. For other primitive types,
    use: Boolean for boolean, Character for char, Double for double,
    etc...

    Create a HashMap object called people that will store String keys and Integer values:
    --------------------------------------------------------------------------------------*/

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
        System.out.println("------------------------");
    }
}

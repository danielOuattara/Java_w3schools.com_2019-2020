package _C_Java_Classes._20_HashSet;


import java.util.HashSet; // Import the HashSet class

public class Main {

    public static void main(String[] args) {
/*
    Java HashSet
    ================
    A HashSet is a collection of items where every item is unique.
    HashSet is found in the java.util package:
    Create a HashSet object called cars that will store strings: */

        HashSet<String> cars = new HashSet<String>();

    /* Add Items
    ------------
    The HashSet class has many useful methods. For example, to add
    items to it, use the 'add()' method : */

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("------------------------");


    /*
    Note: In the example above, even though BMW is added twice
    it only appears once in the set because every item in a set has
    to be unique.

    Check If an Item Exists
    ------------------------
    To check whether an item exists in a HashSet, use the 'contains()'
    method: */

        System.out.println("cars.contains(\"Mazda\") : " + cars.contains("Mazda"));
        System.out.println("cars.contains(\"Peugeot\") : " + cars.contains("Peugeot"));
        System.out.println("------------------------");

    /* Remove an Item
    ------------------
    To remove an item, use the remove() method: */

        cars.remove("Volvo");
        System.out.println(cars);
        System.out.println("------------------------");


    /* remove all items
    --------------------
    To remove all items, use the clear() method: */
        cars.clear();
        System.out.println("cars = " + cars);
        System.out.println("------------------------");

    /* HashSet Size
    ----------------
    To find out how many items there are, use the 'size' method:*/
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);
        cars.size();
        System.out.println("------------------------");

    /* Loop Through a HashSet
    --------------------------
    Loop through the items of an HashSet with a for-each loop: */

        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("------------------------");



    /* Other Types
    ----------------
    Items in an HashSet are actually objects. In the examples above,
    we created items (objects) of type "String". Remember that a
    String in Java is an object (not a primitive type).
    To use other types, such as int, you must specify an equivalent
    wrapper class: Integer. For other primitive types, use: Boolean
    for boolean, Character for char, Double for double, etc...

    Use a HashSet that stores Integer objects */

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was NOT found in the set.");
            }
        }
        System.out.println("------------------------");
    }
}




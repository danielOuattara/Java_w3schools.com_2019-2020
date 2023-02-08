package _03_Java_Classes._17_arrayList;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class Main {
    /*
        Java ArrayList
        ===============
        The ArrayList class is a resizable array, which can be found
        in the java.util package.

        The difference between a built-in array and an ArrayList in Java,
        is that the size of an array cannot be modified: if you want to
        add or remove elements to/from an array, you have to create a new
        one. While elements can be added and removed from an ArrayList
        whenever you want. The syntax is also slightly different:

        Create an ArrayList object called 'cars' that will store strings
        -----------------------------------------------------------------*/
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

    /* Add Items
    ------------
    The ArrayList class has many useful methods.
    For example, to add elements to the ArrayList use the 'add()' method */

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("------------------------");

    /* Access an Item
    -----------------
    To access an element in the ArrayList, use the 'get()'
    method and refer to the index number */

        System.out.println(cars.get(0));
        System.out.println(cars.get(3));
        System.out.println("------------------------");

    /* Remember: Array indexes start with 0: [0] is the
    first element. [1] is the second element, etc.

    Change an Item
    ---------------
    To modify an element, use the set() method and refer to
    the index number */

        System.out.println(cars.get(0));
        System.out.println(cars.get(3));
        cars.set(0, "Opel");
        cars.set(1, "Peugeot");
        System.out.println(cars);
        System.out.println("------------------------");


     /* Remove an Item
     -------------------

    To remove an element, use the remove() method and refer to the
    index number */

        cars.remove(0);
        System.out.println(cars);
        System.out.println("------------------------");

    /* To remove all the elements in the ArrayList,
    use the clear() method: */

        cars.clear();
        System.out.println("cars =  " + cars);
        System.out.println("cars has " + cars.size() + " items in it");
        System.out.println("------------------------");

    /* ArrayList Size
    ------------------
    To find out how many elements an ArrayList have, use the 'size'
    method */
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println("cars has " + cars.size() + " items in it");
        System.out.println("------------------------");

    /* Loop Through an ArrayList
    -----------------------------
    Loop through the elements of an ArrayList with a 'for loop',
    and use the size() method to specify how many times the loop
    should run: */

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("------------------------");

        /* You can also loop through an ArrayList with the for -each loop:*/

        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("------------------------");


        /* Other Types
        ---------------
        Elements in an ArrayList are actually objects. In the examples
        above, we created elements (objects) of type "String".
        Remember that a String in Java is an object (not a primitive type).
        To use other types, such as int, you must specify an equivalent
        wrapper class:Integer. For other primitive types, use:Boolean for boolean,
        Character for char, Double for double, etc...

        Create an ArrayList to store numbers (add elements of type Integer): */

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("------------------------");

       /* Sort an ArrayList
       --------------------
        Another useful class in the java.util package is the
        Collections class, which include the sort () method for
        sorting lists alphabetically or numerically:

        Sort an ArrayList of Strings */

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("------------------------");

        /* Sort an ArrayList of Integers */


        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}
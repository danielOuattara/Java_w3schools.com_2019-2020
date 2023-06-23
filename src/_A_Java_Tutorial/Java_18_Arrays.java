package _A_Java_Tutorial;

public class Java_18_Arrays {
    public static void main(String[] args) {


        /* Java Arrays
        ================
        Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets: */

        String[] cars1;


        /*
        We have now declared a variable that holds an array of strings.
        To insert values in it, we can use an array literal: place the
        values in a comma-separated list, inside curly braces: */

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};

        /* To create an array of integers, you could write: */

        int[] myNum = {10, 20, 30, 40};


        /* Access the Elements of an Array
        -----------------------------------
        You access an array element by referring to its index number.

        This statement accesses the value of the first element in cars: */

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars3[0]);  // Outputs Volvo

        /*
        Note: Array indexes start with 0: [0] is the first element.
        [1] is the second element, etc.

        Change an Array Element
        ------------------------
        To change the value of a specific element, refer to its index number: */

        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars4[0] = "Opel";
        System.out.println(cars4[0]);  // Now outputs Opel instead of Volvo


        /* Array Length
        -----------------
        To find out how many elements an array has, use the length property: */

        System.out.println(cars4.length);  // Outputs 4


        /* Loop Through an Array
        -------------------------
        You can loop through the array elements with the for loop, and use the
        length property to specify how many times the loop should run.

        The following example outputs all elements in the cars array: */

        String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars5.length; i++) {
            System.out.println(cars5[i]);
        }


        /*Loop Through an Array with For-Each
        --------------------------------------

        There is also a "for-each" loop, which is used exclusively to loop
        through elements in arrays:

        for (type variable : arrayName) {
        ...
        }

        The following example outputs all elements in the cars array, using
        a "for-each" loop: */

        String[] cars6 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String item : cars6) {
            System.out.println(item);
        }

        /*
        The example above can be read like this: for each String element,
        called item in cars, print out the value of item.

        If you compare the for loop and for-each loop, you will see that the
        for-each method is easier to write, it does not require a counter
        (using the length property), and it is more readable.


        Multidimensional Arrays
        -------------------------

        A multidimensional array is an array of arrays.

        To create a two-dimensional array, add each array within its own set
        of curly braces: */

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        /* myNumbers is now an array with two arrays as its elements.

        To access the elements of the myNumbers array, specify two indexes:
        one for the array, and one for the element inside that array.
        This example accesses the third element (2) in the second array
        (1) of myNumbers: */

        int[][] myNumbers_two = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers_two[1][2];  // 7
        int xx = myNumbers_two[0][1];  // 2
        System.out.println(x); // Outputs 7

        System.out.println("-------------------------------");
        /* We can also use a for loop inside another for loop to get the elements
        of a two-dimensional array (we still have to point to the two indexes): */

        int[][] myNumbers_three = {{1, 2, 3, 4}, {5, 6, 7}};

        for (int i = 0; i < myNumbers_three.length; ++i) {
            for (int j = 0; j < myNumbers_three[i].length; ++j) {
                System.out.println(myNumbers_three[i][j]);
            }
        }
        // -----------------------------------------------------
        System.out.println("-------------------------------");

        for (int[] item : myNumbers_three) {
            for (int value : item) {
                System.out.println(value);
            }
        }
    }
}

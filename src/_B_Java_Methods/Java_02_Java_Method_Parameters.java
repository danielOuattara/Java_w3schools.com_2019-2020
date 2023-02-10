package _B_Java_Methods;

public class Java_02_Java_Method_Parameters {

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod3(int x) {
        return 5 + x;
    }

    static int myMethod4(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        // If age is less than 18, print "access denied
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static void checkAge2(int age) {
        // If age is less than 18, print "access denied
        String access_OK = "Access granted - You are old enough!";
        String access_NO = "Access denied - You are not old enough!";
        String output = age > 18 ? access_OK : access_NO;
        System.out.println(output);
    }

    static void checkAge3(int age) {
        // If age is less than 18, print "access denied
        String output = age > 18 ?
                "Access granted - You are old enough!" : "Access denied - You are not old enough!";
        System.out.println(output);
    }

    public static void main(String[] args) {

        /* Parameters and Arguments
         =============================
        Information can be passed to methods as parameter. Parameters act as variables inside the method.
        Parameters are specified after the method name, inside the parentheses. You can add as many parameters
        as needed, just separate them with a comma.

        The following example has a method that takes a String called fname as parameter.
        When the method is called, we pass along a first name, which is used inside the method
        to print the full name: */

        myMethod("Liam");  // Liam Refsnes
        myMethod("Jenny");  // Jenny Refsnes
        myMethod("Anja");  // Anja Refsnes
        System.out.println("---------------------------------------");

       /*
       When a parameter is passed to the method, it is called an argument.
       So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

       Multiple Parameters
       --------------------
        You can have as many parameters as needed: */

        myMethod2("Liam", 5);  // Liam is 5
        myMethod2("Jenny", 8);  // Jenny is 8
        myMethod2("Anja", 31);  // Anja is 31
        System.out.println("---------------------------------------");

        /* Note that when you are working with multiple parameters, the method call must have the same number
        of arguments as there are parameters, and the arguments must be passed in the same order.

        Return Values
        --------------
        The void keyword, used in the examples above, indicates that the method should not return a value.
        If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
        instead of void, and use the return keyword inside the method: */

        System.out.println(myMethod3(3));  // Outputs 8 (5 + 3)
        System.out.println(myMethod4(5, 3));  // Outputs 8 (5 + 3)
        System.out.println("---------------------------------------");

        /* This example returns the sum of a method's two parameters:

        You can also store the result in a variable (recommended, as it is easier to read and maintain): */

        int z = myMethod4(5, 3);
        System.out.println(z);  // Outputs 8 (5 + 3)


        /* A Method with If...Else
         -------------------------

        It is common to use if...else statements inside methods: */

        // Create a checkAge() method with an integer variable called age

        checkAge(20); // Call the checkAge method and pass along an age of 20
        checkAge(17); // Call the checkAge method and pass along an age of 17

        checkAge2(20); // Call the checkAge method and pass along an age of 20
        checkAge2(17); // Call the checkAge method and pass along an age of 17

        checkAge3(20); // Call the checkAge method and pass along an age of 20
        checkAge3(17); // Call the checkAge method and pass along an age of 17

        // Outputs "Access granted - You are old enough!"
    }
}

package _01_Java_Tutorial;

public class Java_10_Strings {

    public static void main(String[] args) {

        /*Java strings
         -------------------
         Strings are used for storing text.
         A String variable contains a collection of characters surrounded by double quotes:*/

        String greetings = "Hello World of Java Coffee!";
        System.out.println(greetings);


        /*String length
        ----------------
        A String in Java is actually an object, which contain methods that can perform certain
        operations on strings. For example, the "length" of a string can be found with the length()
        method:*/

        int greetings_length = greetings.length();
        System.out.println("The length of 'greetings' is " + greetings_length + " characters");


        /*More String Methods
        ---------------------*/

        // toUpperCase()

        System.out.println(greetings.toUpperCase());


        // toLowerCase()
        System.out.println(greetings.toLowerCase());


        // Finding a char in a string

        System.out.println(greetings.indexOf("w"));
        System.out.println(greetings.indexOf("W"));
        System.out.println(greetings.indexOf("House"));
        System.out.println(greetings.indexOf("Java"));


        // String concatenation

        String firstName = "John" ;
        String lastName  = "Doe"  ;

        System.out.println(firstName +  " " + lastName);


        // String special characters usage

        String txt = " C\'est simple comme \\bonjour\\ \"trouves-tu ?\" ";
        System.out.println(txt);

        /*Six other escape sequences are valid in Java:
            Code 	Result
            ------------------------------
            \n 	    New Line
            \r 	    Carriage Return
            \t 	    Tab
            \b 	    Backspace
            \f 	    Form Feed
          */


        /*All String Methods: see document in folder */

    }
}

package _03_Java_Classes._22_wrapper_classes;

public class Main {
    public static void main(String[] args) {
        /*
        Java Wrapper Classes
        =====================

        Wrapper classes provide a way to use primitive data types
        as objects.
        The table below shows the primitive type and the equivalent
        wrapper class:

        Primitive Data Type 	Wrapper Class
        -------------------     -----------------
        byte 	                Byte
        short 	                Short
        int 	                Integer
        long 	                Long
        float 	                Float
        double 	                Double
        boolean 	            Boolean
        char 	                Character

        Sometimes you must use wrapper classes, for example when working
        with Collection objects, such as ArrayList, where primitive
        types cannot be used: the list can only store objects */

        // ArrayList<int> invalidNumbersArray = new ArrayList<int>(); // Invalid
        // ArrayList<Integer> validNumbersArray = new ArrayList<Integer>(); // Valid

        /* Creating Wrapper Objects
        --------------------------------
        To create a wrapper object, use the wrapper class instead of the
        primitive type. To get the value, you can just print the object: */

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println("------------------------");

        /*
        Since you're now working with objects, you can use certain methods
        to get information about the specific object.

        For example, the following methods are used to get the value
        associated with the corresponding wrapper object: intValue(),
        byteValue(), shortValue(), longValue(), floatValue(), doubleValue(),
        charValue(), booleanValue().

        This example will output the same result as the example above */

        Integer myInt2 = 5;
        Double myDouble2 = 5.99;
        Character myChar2 = 'A';
        System.out.println(myInt2.intValue());
        System.out.println(myDouble2.doubleValue());
        System.out.println(myChar2.charValue());

        System.out.println("------------------------");

        /*
        Another useful method is the toString() method, which is used
        to convert wrapper objects to strings.

        In the following example, we convert an Integer to a String,
        and use the length() method of the String class to output
        the length of the "string" */
        
        Integer myInt3 = 100;
        String myString3 = myInt3.toString();
        System.out.println(myString3.length());

    }
}

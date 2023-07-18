package _01_Java_Tutorial;

public class Java_07_Data_Types {

    public static void main(String[] args) {

/*      Java Data Types
        ------------------

        As explained in the previous chapter, a variable in Java must be a specified data type:*/

        System.out.println("Java Data Types");

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        /*
        1- Primitive data types: byte, short, int, long, float, double, boolean, char

        2- Non-primitive data types: String, Arrays, Classes

        Primitive Data Types
        ---------------------
        A primitive data type specifies the "size" and "type" of variable values,
        and it has no additional methods.

        Primitive Type | Size    |  Description
        -------------------------------------------------------------------------------------------------------
        byte 	         1 byte 	Stores whole numbers from -128 to 127
        short 	         2 bytes 	Stores whole numbers from -32,768 to 32,767
        int 	         4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long 	         8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float 	         4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double 	         8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean 	     1 bit 	    Stores true or false values
        char 	         2 bytes 	Stores a single character/letter or ASCII values


        Primitive number types are divided in two groups:
        ---------------------------------------------------

        Integer: whole numbers, positive or negative (such as 123 or -456)
                 (byte, short, int, long).

        Floating point: containing one or more decimals.
                        (float and double)

        NOTE: Even though there are many numeric types in Java, the most used are
               -> "int" (for whole numbers)
               -> "double" (for floating point numbers).
        */

        byte myNumByte = 100;
        System.out.println(myNumByte);

        short myNumShort = 5_000;
        System.out.println(myNumShort);

        int myNumInt = 100_000;
        System.out.println(myNumInt);

        long myNumLong = 15_000_000_000L;
        System.out.println(myNumLong);

        float myNumFloat = 5.75F;
        System.out.println(myNumFloat);

        double myNumDouble = 19.99D;
        System.out.println(myNumDouble);


        // Scientific Numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isSandTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isSandTasty);   // Outputs false

        char myGrade = 'B';
        System.out.println(myGrade);
        char a = 125, b = 64, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        /*
        Non-primitive data types:
        --------------------------
        Non-primitive data types are called "reference types" because they refer to objects.

        The main difference between "primitive" and "non-primitive" data types are:

           >  Non-primitive types are created by the programmer and is not defined by Java,
              except for String Primitive types are predefined (already defined).

           >  Non-primitive types can call methods while primitive types cannot.

           >  Non-primitive types can be "null"  while a primitive type has always a value.

           >  Non-primitive types starts with an uppercase letter.
              A primitive type starts with a lowercase letter.

           >  Non-primitive types have all the same size while the size of a primitive type
              depends on the data type

           Examples of non-primitive types are: Strings, Arrays, Classes, Interface, etc... */

        String greeting = "Hello World";
        System.out.println(greeting);

    }
}

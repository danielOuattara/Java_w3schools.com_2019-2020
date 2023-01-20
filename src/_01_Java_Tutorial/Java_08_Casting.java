package _01_Java_Tutorial;

public class Java_08_Casting {

    public static void main(String[] args) {

        System.out.println("Java Casting");

    /*
    Type casting is when you assign a value of one primitive data type to another primitive type.
    In Java, there are two types of casting

    > Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double                             */

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);      // 9
        System.out.println(myDouble);   // 9.0

    /*
    >  Narrowing Casting (manually) - converting a larger type to a smaller size type
       double -> float -> long -> int -> char -> short -> byte                     */

        double myDouble_2 = 3.143d;
        int    myInt_2 = (int) myDouble_2;  // 3

        System.out.println(myDouble_2);  // 3.143
        System.out.println(myInt_2);  // 3
    }
}

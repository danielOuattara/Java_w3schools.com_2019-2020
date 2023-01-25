package _02_Java_Methods;

public class Java_03_Java_Method_Overloading {

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }


    /*----------------------------------------------------------*/
    static int plusMethod(int x, int y) {
        return x + y;
    }

    /*----------------------------------------------------------*/
    static double plusMethod(double x, double y) {
        return x + y;
    }
    /*----------------------------------------------------------*/

    public static void main(String[] args) {

        /* Java Method Overloading
        ===========================

        Method Overloading
        -------------------
        With method overloading, multiple methods can have the same name with different parameters:

        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)

        Consider the following example, which has two methods that add numbers of different type
        (defined above)  */

        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        /* Instead of defining two methods that should do the same thing, it is better to overload one.
        In the example below, we overload the plusMethod method to work for both int and double: */

        int myNum3 = plusMethod(8, 5);
        double myNum4 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);


         /* Note: Multiple methods can have the same name as long as the number and/or type
                  of parameters are different. */
    }
}

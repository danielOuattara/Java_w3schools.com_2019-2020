package _01_Java_Tutorial;

public class Java_12_Booleans {

    public static void main(String[] args) {

        // Booleans values
        boolean isJavaFun = true;
        boolean isSandTasty = false;

        System.out.println(isJavaFun);  // true
        System.out.println(isSandTasty);  // false;

        System.out.println("----------");  // -----------------------

        // Booleans expression

        int x = 8;
        int y = 10;

        System.out.println(x > y);  // false
        System.out.println(x < y);  // true

        System.out.println("----------");  // ------------------------

        System.out.println(10 > 8);  // true
        System.out.println("----------");  // ------------------------

        System.out.println(x == y);  // false
        System.out.println(x != y);  // true

        /*
        The Boolean value of an expression is the basis for all Java comparisons and conditions.
        You will learn more about conditions in the next chapter.
*/

    }
}
package _B_Java_Methods;

public class Java_05_Java_Method_Recursion {
    //--------------------------------------------------------
    public static int sum(int k) {
        // Summing by recursion
        if (k > 0) {
            System.out.println(k);
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    //---------------------------------------------------------
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    //---------------------------------------------------------

    public static int factorial(int number) {
        if (number < 0) {
            return 0;
        }
        if (number == 1 || number == 0) {
            return 1;
        }
        System.out.println(number);
        return number * factorial(number - 1);
    }

    //---------------------------------------------------------
    public static int factorialWhile(int number) {

        while (number > 1) {
            System.out.println(number);
            return number * factorialWhile(number - 1);
        }
        return number;
    }

    //---------------------------------------------------------
    public static int factorialWhile(int end, int start) {

        while (end > start) {
            System.out.println(end);
            return end * factorialWhile(end - 1, start);
        }
        return end;
    }

    //---------------------------------------------------------

    public static void backwardCounter(int count) {
        if (count > 0) {
            System.out.println("Hi there ! " + count);
            count--;
            sayHi(count);
        } else {
            System.out.println("Done ! ");
        }
    }
    public static void sayHi(int count) {
        if (count > 0) {
            System.out.println("Hi there ! " + count);
            count--;
            sayHi(count);
        } else {
            System.out.println("Done ! ");
        }
    }

    public static void main(String[] args) {

        /* Java Recursion
        ----------------------
        Recursion is the technique of making a function call itself.
        This technique provides a way to break complicated problems
        down into simple problems which are easier to solve.

        Recursion may be a bit difficult to understand. The best way
        to figure out how it works is to experiment with it.

        Recursion Example:

        Adding two numbers together is easy to do, but adding a range
        of numbers is more complicated. In the following example,
        recursion is used to add a range of numbers together by breaking
        it down into the simple task of adding two numbers:

        Example: Use recursion to add all the numbers up to 9. */

        int result = sum(9);
        System.out.println(result);
        System.out.println("--------------------");

        /* Example Explained

        When the sum() function is called, it adds parameter k to the sum of all
        numbers smaller than k and returns the result. When k becomes 0,
        the function just returns 0. When running, the program follows these steps:
        10 + sum(9)
        10 + ( 9 + sum(8) )
        10 + ( 9 + ( 8 + sum(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

        Since the function does not call itself when k is 0, the program stops there
        and returns the result.

        Halting Condition
        ------------------
        Just as loops can run into the problem of infinite looping, recursive functions
        can run into the problem of infinite recursion. Infinite recursion is when
        the function never stops calling itself.
        Every recursive function should have a halting condition, which is the condition
        where the function stops calling itself. In the previous example, the halting
        condition is when the parameter k becomes 0.

        It is helpful to see a variety of different examples to better understand the concept.
        In this example, the function adds a range of numbers between a start and an end.
        The halting condition for this recursive function is when end is not greater than start:

        Example: Use recursion to add all the numbers between 5 and 10. */

        int result2 = sum(5, 10);
        System.out.println(result);
        System.out.println("--------------------");

        int factorial_5 = factorial(5);
        System.out.println(factorial_5);
        System.out.println("--------------------");

        int factorialWhile_5 = factorialWhile(7);
        System.out.println(factorialWhile_5);
        System.out.println("--------------------");

        int factorialWhile_7_2 = factorialWhile(7, 4);
        System.out.println(factorialWhile_7_2);
        System.out.println("--------------------");

        System.out.println("----------------------");
        sayHi(5);
    }
}

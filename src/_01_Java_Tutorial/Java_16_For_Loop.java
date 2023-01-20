package _01_Java_Tutorial;

public class Java_16_For_Loop {

    public static void main(String[] args) {

        /* Java For Loop
         =================

        When you know exactly how many times you want to loop through a block of code, use the for loop instead
        of a while loop:
        Syntax

        for (statement 1; statement 2; statement 3) {
        // code block to be executed
        }

        - Statement 1 is executed (one time) before the execution of the code block.
        - Statement 2 defines the condition for executing the code block.
        - Statement 3 is executed (every time) after the code block has been executed. */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*
        Example explained

        - Statement 1 sets a variable before the loop starts (int i = 0).
        - Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true,
          the loop will start over again, if it is false, the loop will end.
        - Statement 3 increases a value (i++) each time the code block in the loop has been executed.

          Another Example */


        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        /*

        For-Each Loop
        ---------------

        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        Syntax

        for (type variableName : arrayName) {
        // code block to be executed
        }

        The following example outputs all elements in the cars array, using a "for-each" loop: */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String item : cars) {
            System.out.println(item);
        }

        /* Note: Don't worry if you don't understand the example above.
           You will learn more about Arrays in the Java Arrays chapter.*/

    }
}

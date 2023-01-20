package _01_Java_Tutorial;

public class Java_17_Break_Continue {

    public static void main(String[] args) {

        /*Java Break and Continue
        ============================

        Java Break
        -----------
        You have already seen the break statement used in an earlier chapter of this tutorial.
        It was used to "jump out" of a switch statement.

        The break statement can also be used to jump out of a loop.

        This example stops the loop when i is equal to 4:   */

        for (int i = 0; i < 10; i++) {
          if (i == 4) {
            break;
          }
          System.out.println(i);
        }
          System.out.println("-------------------------------------------");

        /*

        Java Continue
        --------------
        The continue statement breaks one iteration (in the loop), if a specified condition occurs,
        and continues with the next iteration in the loop.

        This example skips the value of 4: */

        for (int i = 0; i < 10; i++) {
          if (i == 4) {
            continue;
          }
          System.out.println(i);
        }
        System.out.println("-------------------------------------------");

        /* Break and Continue in While Loop
         ----------------------------------
        You can also use break and continue in while loops: */

        int i = 0;
        while (i < 10) {
          System.out.println(i);
          i++;
          if (i == 4) {
            break;
          }
        }
        System.out.println("-------------------------------------------");


        // Continue Example

        int j = 0;
        while (j < 10) {
          if (j == 4) {
            j++;
            continue;
          }
          System.out.println(j);
          j++;
        }
        System.out.println("-------------------------------------------");

    }
}

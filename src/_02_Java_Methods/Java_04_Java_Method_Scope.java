package _02_Java_Methods;

public class Java_04_Java_Method_Scope {

    public static void main(String[] args) {

        /* Java Scope
        --------------
        In Java, variables are only accessible inside the region
        they are created in: this is called scope.

        Method Scope
        -------------
        Variables declared directly inside a method are available
        anywhere in the method following the line of code in which
        they were declared: */

        // System.out.println(x);  // Code here CANNOT use x
        int x = 100;
        System.out.println(x); // Code here can use x


       /* Block Scope
         ------------
        A block of code refers to all the code between curly braces {}.
        Variables declared inside blocks of code are only accessible by
        the code between the curly braces, which follows the line in
        which the variable was declared: */

        // Code here CANNOT use z

        // The block starts here
        {
            // System.out.println(z); // Code here CANNOT use z
            int z = 100;

            // Code here CAN use z
            System.out.println(z);

        }
        // The block ends here

        // Code here CANNOT use z

        /* A block of code may exist on its own, or it can belong to an if statement,
           while statement or for statement.
           In the case of for statements, variables declared in the statement itself
           are also available inside the block's scope.  */
    }
}

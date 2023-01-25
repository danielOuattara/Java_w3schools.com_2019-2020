package _03_Java_Classes;

public class Java_03_Class_Attributes {
    public static void main(String[] args) {

        /* Java Class Attributes
        ===========================
        In the previous chapter, we used the term "variable" for x in the example (as shown below).
        It is actually an 'attribute of the class'. Or you could say that class attributes are
        variables within a class:

        Example: Create a class called "Main" with two attributes x and y:

        //-------------------------------------------------------------------
        public class Main {
          int x = 5;
          int y = 3;
        }

        Another term for class attributes is 'fields'.

        Accessing Attributes
        ---------------------
        You can access class attributes by creating an object from the class, and then by using
        the dot syntax (.):

        The following example will create an object of the Main class, with the name myObj.
        We use the x attribute on the object to print its value:

        Example: Create an object called "myObj" and print the value of x:

        //-----------------------------------------------------------

        public class Main {
          int x = 5;

          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println(myObj.x);  // 5
          }
        }

        //------------------------------------------------------------


        Modify Attributes
        ------------------
        You can also modify attribute values:

        Example: Set the value of x to 40

        //-------------------------------------------
        public class Main {
          int x;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 40;
            System.out.println(myObj.x);
          }
        }

        //--------------------------------------------


        Or You can override an existing values:
        Example: Change the value of x to 25:

        //---------------------------------------------

        public class Main {
          int x = 10;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 25; // x is now 25
            System.out.println(myObj.x);  // 25
          }
        }

        //---------------------------------------------


        If you don't want the ability to override existing values, declare
        the attribute as 'final':

        //----------------------------------------------

        public class Main {
          final int x = 10;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 25; // will generate an error: cannot assign a value to a final variable
            System.out.println(myObj.x);
          }
        }


        The 'final' keyword is useful when you want a variable to always store the same value,
        like PI (3.14159...).

        The 'final keyword is called a "modifier". You will learn more about these in the Java
        Modifiers Chapter.


        Multiple Objects
        ------------------
        If you create multiple objects of one class, you can change the attribute values in one object,
        without affecting the attribute values in the other:

        Example: Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

        //----------------------------------------------

        public class Main {
          int x = 5;

          public static void main(String[] args) {
            Main myObj1 = new Main();  // Object 1
            Main myObj2 = new Main();  // Object 2
            myObj2.x = 25;
            System.out.println(myObj1.x);  // Outputs 5
            System.out.println(myObj2.x);  // Outputs 25
          }
        }

        //-----------------------------------------------


        Multiple Attributes
        --------------------

        You can specify as many attributes as you want:

        //------------------------------------------------

        public class Main {
          String firstName = "John";
          String lastName = "Doe";
          int age = 24;

          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
            System.out.println("Age: " + myObj.age);
          }
        }

        The next chapter will teach you how to create class methods and how to access
        them with objects.
        */
    }
}

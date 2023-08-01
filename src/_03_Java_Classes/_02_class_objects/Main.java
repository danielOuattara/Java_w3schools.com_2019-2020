package _03_Java_Classes._02_class_objects;

public class Main {

/*
        Java Classes/Objects
        ========================

        Java is an object-oriented programming language: everything
        in Java is associated with classes and objects, along with
        its attributes and methods.

        For example: in real life, a car is an object. The car has
        attributes, such as weight and color, and methods, such as
        drive and brake.

        A Class is like an object constructor, or a "blueprint" for
        creating objects.

        Create a Class
        ---------------
        To create a class, use the keyword class:
        Create a class named "Main" with a variable x:

        //-----------------------------------------

        public class Main {
          int x = 5;
        }

        //------------------------------------------

        Remember from the Java Syntax chapter that a class name
        should always start with an uppercase first letter, and
        that the name of the java file should match the class
        name.

        Create an Object
        -----------------
        In Java, an object is created from a class. We have already
        created the class named Main, so now we can use this class
        to create objects.

        To create an object from the Main class specify the class name,
        followed by the object name, and use the keyword new:

        Create an object called "myObj" and print the value of x:
        //-------------------------------------------------------------------

        public class Main {
          int x = 5;   // a class property

          public static void main(String[] args) {  // method
            Main myObj = new Main();
            System.out.println(myObj.x);
          }
        }
        //--------------------------------------------------------------------


        Multiple Objects
        -----------------
        You can create multiple objects from one class: create two objects
        from Main:
        //---------------------------------------------------------------------

        public class Main {
          int x = 5;  // a class property

          public static void main(String[] args) {  // method
            Main myObj1 = new Main();  // Object 1
            Main myObj2 = new Main();  // Object 2
            System.out.println(myObj1.x);
            System.out.println(myObj2.x);
          }
        }

        Using Multiple Classes
        -----------------------
        You can also create an object from a class and access it in
        another class. This is often used for better organization of
        classes:
        - one class has all the attributes and methods
        - another class holds the main() method (code to be executed).

        Remember that the name of the java file should match the class name.
        In this example, we have created two files in the same directory/folder:

            Main.java
            Second.java

        //-----------------------------------------------------------

        Main.java

        public class Main {
          int x = 5;
        }

        //------------------------------------------------------------

        Second.java

        class Second {
          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println(myObj.x);
          }
        }

        When both files have been compiled:
        C:\Users\Your Name>javac Main.java
        C:\Users\Your Name>javac Second.java

        Run the Second.java file:
        C:\Users\Your Name>java Second

        And the output will be:
        5

        You will learn much more about classes and objects in the
        next chapters. */

    int x = 5;

    public static void main(String[] args) {

        // creating a new object from class Java_02_Classes_Objects
        Main myObj1 = new Main();
        System.out.println(myObj1.x);

        // multiple objects from class

        Main myObj2 = new Main();
        Main myObj3 = new Main();

        System.out.println(myObj2.x);
        System.out.println(myObj3.x);
    }
}

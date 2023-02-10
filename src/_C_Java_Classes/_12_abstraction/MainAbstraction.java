package _C_Java_Classes._12_abstraction;

public class MainAbstraction {
    public static void main(String[] args) {

    /* Java Abstraction
    =====================

    Abstract Classes and Methods
    -----------------------------
    Data abstraction is the process of hiding certain details and showing
    only essential information to the user.

    Abstraction can be achieved with either abstract classes or interfaces
    which you will learn more about in the next chapter.

    The 'abstract' keyword is a non-access modifier, used for classes and
    methods:
     > Abstract class = a restricted class that cannot be used to create objects.
                        To access it, it must be inherited from another class.

     > Abstract method = can only be used in an abstract class, and it does not
                         have a body. The body is provided by the inherited subclass.

    NOTE: An abstract class can have both abstract and regular methods:

    //------------------------------------------------
    abstract class Animal {
      public abstract void animalSound();
      public void sleep() {
        System.out.println("Zzz");
      }
    }
    //-------------------------------------------------

    From the example above, it is not possible to create an object of the Animal class:

    // Animal myObj = new Animal(); // will generate an Error

    Accessing an abstract class
    ----------------------------
    To access the abstract class, it must be inherited from another class.
    Let's convert the Animal class we used in the Polymorphism chapter to
    an abstract class:

    Remember from the Inheritance chapter that we use the 'extends' keyword to inherit
    from a class.

    //---------------------------------------------------
    abstract class Animal {
      // Abstract method (does not have a body)
      public abstract void animalSound();

      // Regular method
      public void sleep() {
        System.out.println("Zzz");
      }
    }

    // Subclass (inherit from Animal)
    class Pig extends Animal {

      // The body of animalSound method is provided here
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }

    class Main {
      public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
      }
    }

    Why And When To Use Abstract Classes and Methods ?
    --------------------------------------------------
    To achieve security - hide certain details and only show the important
    details of an object.

    Note: Abstraction can also be achieved with Interfaces, which you will
          learn more about in the next chapter. */
    }
}

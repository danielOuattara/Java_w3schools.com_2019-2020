package _03_Java_Classes._07_encapsulation;

/*
    Java Encapsulation
    ===================

    Encapsulation
    --------------
    The meaning of 'Encapsulation' is to make sure that "sensitive" data is hidden from users.
    To achieve this, you must:
    1. declare variables/attributes as 'private'
    2. provide "public" 'get' and 'set' methods to access and update the value of a private variable

    Get and Set
    -----------
    You learned from the previous chapter that private variables can only be accessed within the
    same class; an outside class has no access to it. However, it is possible to access them if
    we provide public get and set methods.

    The 'get' method returns the variable value, and the 'set' method sets/updates the value.

    The Syntax for both is that they start with either 'get' or 'set', followed by the name of
    the variable, with the first letter in upper case: */


public class Main {
    private String name; // private = restricted access
    private int salary;

    // Getter
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

/*
    Example explained

    > The get methods returns the value of the variables name & salary.
    > The set methods takes a parameter (newName or salary) and assigns
      it to the name variable.

     The 'this' keyword is used to refer to the current object.

    Note however as the name variable is declared as private, we cannot
    access sit from outside this class:
    ---------------------------------------------------------
    public class Main {
      public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error
      }
    }
   ------------------------------------------------------------
    If the variable was declared as public, we would expect the following output:
    John

    However, as we try to access a private variable, we get an error:
    ------------------------
    MyClass.java:4: error: name has private access in Person
        myObj.name = "John";
             ^
    MyClass.java:5: error: name has private access in Person
        System.out.println(myObj.name);
                      ^
    2 errors
    ------------------------

    Instead, we use the getName() and setName() methods to access and update the variable:

    -----------------------------------------------------------------------
    public class Main {
      public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
      }
    }
    -------------------------------------------------------------------------

    // Outputs "John"

    Why Encapsulation ?
    ----------------------
    > Better control of class attributes and methods
    > Class attributes can be made:
      - read-only if you only use the get method,
      - write-only if you only use the set method
    > Flexible: the programmer can change one part of the code without affecting other parts
    > Increased security of data
*/
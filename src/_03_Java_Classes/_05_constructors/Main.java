package _03_Java_Classes._05_constructors;

public class Main {

    public static void main(String[] args) {
/*
        Java Constructors
        ======================
        A constructor in Java is a special function that is used to initialize
        objects. The constructor is called when a class is instantiated. It can
        be used to set initial values for object attributes:

        Create a constructor:
        //-------------------------------------------------
        public class Main {
            int x;  // Create a class attribute

            // Create a class constructor for the Main class
            public Main() {
                x = 5;  // Set the initial value for the class attribute x
            }

            public static void main(String[] args) {
                Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
                System.out.println(myObj.x); // Print the value of x: Outputs 5
            }
        }

        Notes: - The constructor name must match the class name, and it cannot
                 have a return type.

               - Also note that the constructor is called when the object is created.

               - All classes have constructors by default: if you do not create
                 a class constructor yourself, Java creates one for you.
                 However, then you are not able to set initial values for object attributes.


        Constructor Parameters
        -----------------------
        Constructors can also take parameters, which is used to initialize
        attributes.
        The following example adds an int y parameter to the constructor.
        Inside the constructor we set x to y (x=y).
        When we call the constructor, we pass a parameter to the constructor (5),
        which will set the value of x to 5:

        //-----------------------------------------------------
        public class Main {
            int x;

            public Main(int y) {
                x = y;
            }

            public static void main(String[] args) {
                Main myObj = new Main(5);
                System.out.println(myObj.x);
            }
        }
        //------------------------------------------------------// Outputs 5

        You can have as many parameters as you want:

        //------------------------------------------------------
        public class Main {
            int modelYear;
            String modelName;
            String brandName;

            public Main(int year, String name, String brand) {
                modelYear = year;
                modelName = name;
                brandName = brand;
            }

            public static void main(String[] args) {
                Main myCar = new Main(1969, "Mustang", "Ford");
                System.out.println(myCar.brandName + " " + myCar.modelYear + " " + myCar.modelName);
            }
        }

        //----------------------------------------------------
        // Outputs Ford 1969 Mustang

        */
    }
}

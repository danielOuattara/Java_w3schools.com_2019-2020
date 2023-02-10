package _C_Java_Classes._05_constructors.tests;

// public class Java_05_Constructors_Test_Zone {
//     int x;  // Create a class attribute
//
//     // Create a class constructor for the Main class
//     public Java_05_Constructors_Test_Zone() {
//         x = 5;  // Set the initial value for the class attribute x
//     }
//
//     public static void main(String[] args) {
//         Java_05_Constructors_Test_Zone myObj = new Java_05_Constructors_Test_Zone(); // Create an object of class Main (This will call the constructor)
//         System.out.println(myObj.x); // Print the value of x
//     }
// }

//------------------------------------------------------------------------
//public class Java_05_Constructors_Test_Zone {
//    int x;
//
//    public Java_05_Constructors_Test_Zone(int y) {
//        x = y;  // Set the initial value for the class attribute x
//    }
//
//    public static void main(String[] args) {
//        Java_05_Constructors_Test_Zone myObj = new Java_05_Constructors_Test_Zone(5);
//        System.out.println(myObj.x); // Print the value of x
//    }
//}

//------------------------------------------------------------------------

public class MainTest {
    int modelYear;
    String modelName;
    String brandName;

    public MainTest(int modelYear, String name, String brand) {
        this.modelYear = modelYear;
        modelName = name;
        brandName = brand;
    }

    public static void main(String[] args) {
        MainTest myCar = new MainTest(1969, "Mustang", "Ford");
        System.out.println("My car is a " + myCar.brandName + " " + myCar.modelName + " " + myCar.modelYear + " ");
    }
}




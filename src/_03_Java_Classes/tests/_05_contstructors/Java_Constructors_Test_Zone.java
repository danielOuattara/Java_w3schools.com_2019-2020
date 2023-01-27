package _03_Java_Classes.tests._05_contstructors;

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

public class Java_Constructors_Test_Zone {
    int modelYear;
    String modelName;
    String brandName;

    public Java_Constructors_Test_Zone(int modelYear, String name, String brand) {
        this.modelYear = modelYear;
        modelName = name;
        brandName = brand;
    }

    public static void main(String[] args) {
        Java_Constructors_Test_Zone myCar = new Java_Constructors_Test_Zone(1969, "Mustang", "Ford");
        System.out.println("My car is a " + myCar.brandName + " " + myCar.modelName + " " + myCar.modelYear + " ");
    }
}




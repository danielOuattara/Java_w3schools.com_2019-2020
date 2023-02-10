package _C_Java_Classes.tests;


/*CONSTRUCTOR TESTING
 * ------------------------*/
//public class MainTest {
//    int modelYear = 1980;
//    String modelName= "Apollo";
//    String brandName= "Berlin";
//
//    public static void main(String[] args) {
//        MainTest myCar = new MainTest();
//        myCar.brandName = "Peugeot";
//        System.out.println(myCar.brandName + " " + myCar.modelYear + " " + myCar.modelName);
//
//        MainTest myCar2 = new MainTest();
//        System.out.println(myCar2.brandName + " " + myCar2.modelYear + " " + myCar2.modelName);
//    }
//}

/*CONSTRUCTOR TESTING
 * ------------------------*/

//public class MainTest {
//    int modelYear;
//    String modelName;
//    String brandName;
//
//    public MainTest(int year, String name, String brand) {
//        modelYear = year;
//        modelName = name;
//        brandName = brand;
//    }
//
//    public static void main(String[] args) {
//        MainTest myCar = new MainTest(1969, "Mustang", "Ford");
//        System.out.println(myCar.brandName + " " + myCar.modelYear + " " + myCar.modelName);
//
//        MainTest myCar2 = new MainTest(1979, "Corvette", "Chevrolet");
//        System.out.println(myCar2.brandName + " " + myCar2.modelYear + " " + myCar2.modelName);
//    }
//}


public class MainTest {
    public static void main(String[] args) {
        ModifiersTest myObj = new ModifiersTest();
        myObj.sayHello();
    }
}


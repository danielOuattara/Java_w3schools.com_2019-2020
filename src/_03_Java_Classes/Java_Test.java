package _03_Java_Classes;



/*
public class Java_Test {
    int x = 12 ;
    public static void main(String[] args) {
        Java_Test myObj = new Java_Test();
        myObj.x = 5;
        System.out.println(myObj.x);

    }
}
*/


//------------------------------------------------------------------ 03
/*
public class Java_Test {
    String firstName = "John";
    String lastName = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Java_Test myObj = new Java_Test();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Age: " + myObj.age);
    }
}
*/

//-------------------------------------------------------------------- 04
public class Java_Test {
        static void myStaticMethod() {
            System.out.println("Static methods can be called without creating objects");
        }

        public void myPublicMethod() {
            System.out.println("Public methods must be called by creating objects");
        }

        public static void main(String[] args) {
            myStaticMethod(); // Call the static method
           // myPublicMethod(); // This would compile an error

            Java_Test myObj = new Java_Test(); // Create an object of Java_Test
            myObj.myPublicMethod(); // Call the public method on the object
        }
}


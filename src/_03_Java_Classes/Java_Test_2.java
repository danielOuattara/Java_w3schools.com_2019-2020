package _03_Java_Classes;

// 04
public class Java_Test_2 {

        public static void main(String[] args) {
            Java_Test.myStaticMethod(); // Call the static method
           // myPublicMethod(); // This would compile an error

            Java_Test myObj_One = new Java_Test(); // Create an object of Java_Tes
            myObj_One.myPublicMethod(); // Call the public method on the object

        }
}


package _03_Java_Classes._02_class_objects;

public class Java_02_Second {
    public static void main(String[] args) {

        Java_02_Main myObj = new Java_02_Main();
        System.out.println(myObj.x);

        /*
            In this code, I call the class 'Java_02_Main' and use it to create
            an object 'myObj' here in Java_02_Second class.
            The class 'Java_02_Main' is public, so I can access it to create object
            everywhere I need to.
        */
    }
}

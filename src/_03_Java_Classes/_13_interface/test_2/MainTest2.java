package _03_Java_Classes._13_interface.test_2;

interface FirstInterface {
    void myFirstMethod();
}

interface SecondInterface {
    void mySecondMethod();
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void whoIAm() {
        System.out.println("I am " + this.name + " I have " + this.age + " y.o");
    }
}

class DemoClass extends Animal implements FirstInterface, SecondInterface {

    public DemoClass(String name, int age) {
        super(name, age);
    }

    public void myFirstMethod() {
        System.out.println("Some text ...");
    }

    public void mySecondMethod() {
        System.out.println("My other text ...");
    }

}

public class MainTest2 {
    public static void main(String[] args) {
        DemoClass chaise = new DemoClass("Chaise", 6);
        chaise.myFirstMethod();
        chaise.mySecondMethod();
        chaise.whoIAm();

    }
}

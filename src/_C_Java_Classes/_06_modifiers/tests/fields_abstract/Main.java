package _C_Java_Classes._06_modifiers.tests.fields_abstract;

// abstract class
abstract class Main {
    public String fname = "John";
    public int age = 24;

    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
        System.out.println(this.fname);
        System.out.println(this.age);
    }

    public void main(String[] args) {
        System.out.println(this.age);
    }


}

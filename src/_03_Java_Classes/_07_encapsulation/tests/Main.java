package _03_Java_Classes._07_encapsulation.tests;

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
//        myObj.name = "John";  // error
//        myObj.salary = 39000;  // error
//        System.out.println(myObj.name); // error

        System.out.println(myObj.getName());
        System.out.println(myObj.getSalary());

        myObj.setName("John"); // Set the value of the name
        myObj.setSalary(59_000); // Set the value of the salary

        System.out.println(myObj.getName());
        System.out.println(myObj.getSalary());
    }
}

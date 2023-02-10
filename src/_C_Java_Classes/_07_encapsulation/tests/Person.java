package _C_Java_Classes._07_encapsulation.tests;

public class Person {
    private String name = "enter a secret name"; // private = restricted access
    private int salary = 30_000;
    // Getter
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println(myObj.name);

        myObj.name = "John";
        System.out.println(myObj.name);
    }
}
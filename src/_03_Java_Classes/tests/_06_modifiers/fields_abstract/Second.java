package _03_Java_Classes.tests._06_modifiers.fields_abstract;

class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method

        System.out.println("-----------------------------------");

        Teacher teacher_one = new Teacher();

        teacher_one.age = 40;
        teacher_one.graduationYear = 2011;
        teacher_one.fname = "Daniel";

        System.out.println(teacher_one.fname);
        System.out.println(teacher_one.age);
        System.out.println(teacher_one.graduationYear);
        teacher_one.study();
    }
}

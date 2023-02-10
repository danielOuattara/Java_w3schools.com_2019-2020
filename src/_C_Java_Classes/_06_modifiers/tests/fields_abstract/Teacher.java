package _C_Java_Classes._06_modifiers.tests.fields_abstract;

class Teacher extends Main {
    public int graduationYear = 2011;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Teaching all day long");
    }

    public static void main(String[] args) {
        Teacher teacher_one = new Teacher();

        teacher_one.age = 40;
        teacher_one.fname = "Daniel";

        System.out.println(teacher_one.fname);
        System.out.println(teacher_one.age);
        System.out.println(teacher_one.graduationYear);
        teacher_one.study();
    }
}

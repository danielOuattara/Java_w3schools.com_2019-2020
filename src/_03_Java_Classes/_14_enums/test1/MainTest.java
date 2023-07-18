package _03_Java_Classes._14_enums.test1;


enum Levels {
    LOW,
    MEDIUM,
    HIGH
}

public class MainTest {
    public static void main(String[] args) {
        Levels medium = Levels.MEDIUM;
        System.out.println("The chosen level is " + medium);
    }

}

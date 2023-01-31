package _03_Java_Classes._14_enums.test2;


public class MainTest {
    enum Levels {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Levels level2 = Levels.HIGH;
        System.out.println("The chosen level is " + level2);
    }

}

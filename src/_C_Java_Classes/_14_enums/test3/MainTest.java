package _C_Java_Classes._14_enums.test3;


public class MainTest {
    enum Levels {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Levels level2 = Levels.HIGH;
        System.out.println("The chosen level is " + level2);

        Levels myVar = Levels.LOW;
        //-------------------------------------------------

        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        //-------------------------------------------------

        for (Levels item : Levels.values()) {
            System.out.println(item);
        }
    }

}

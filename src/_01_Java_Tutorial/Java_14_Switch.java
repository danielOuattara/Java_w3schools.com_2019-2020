package _01_Java_Tutorial;

public class Java_14_Switch {

    public static void main(String[] args) {

        // Switch
        // ------

        int day= 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");

                // The default keyword specifies some code to run if there is no case match:
                // Note that if the default statement is used as the last statement
                // in a switch block, it does not need a break.

        }
    }
}

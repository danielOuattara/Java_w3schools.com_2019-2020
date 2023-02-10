package _A_Java_Tutorial;

public class Java_13_If_Else {

    public static void main(String[] args) {

        // The 'if' statement
        //--------------------

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 18;
        int y = 20;
        if( x < y) {
            System.out.println( x + " is smaller than" +  y);
        }
        System.out.println("----------");


        // The 'else' statement
        //----------------------

        int time = 20;

        if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        if (time < 18) System.out.println("Good day");
        else System.out.println("Good evening");

        System.out.println("----------");


        // The 'else if' statement
        // -------------------------

        int hours = 12;

        if (hours < 10) {
            System.out.println("Good morning !");
        } else if( hours < 20) {
            System.out.println("Good Day !");
        } else {
            System.out.println("Good evening !");
        }
        System.out.println("-----------");


        // Short Hand If...Else (Ternary Operator)
        // ----------------------------------------

        String result = hours > 18 ? "Good Evening !" : "Good Day !" ;
        System.out.println(result);

    }
}

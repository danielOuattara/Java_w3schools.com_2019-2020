package _03_Java_Classes._16_date_time;

/*  Java Date and Time
    ===================

    Java Dates
    ------------
    Java does not have a built-in Date class, but we can import
    the java.time package to work with the date and time API.
    The package includes many date and time classes.

    Class 	            Description
    --------            ------------
    LocalDate 	        Represents a date (year, month, day (yyyy-MM-dd))
    ---------------------------------------------------------------------------------
    LocalTime 	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    ---------------------------------------------------------------------------------
    LocalDateTime 	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    ---------------------------------------------------------------------------------
    DateTimeFormatter 	Formatter for displaying and parsing date-time objects
    ---------------------------------------------------------------------------------

    Display Current Date
    ---------------------
    To display the current date, import the java.time.LocalDate class,
    and use its 'now()' method: */

//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println(LocalDate.of(1983, 11, 15));
//        System.out.println(LocalDate.ofYearDay(1983, 255));
//
//        LocalDate myObj = LocalDate.now(); // Create a date object
//        System.out.println(myObj); // Display the current date
//        System.out.println(LocalDate.MAX);
//        System.out.println(LocalDate.MIN);
//        System.out.println(LocalDate.EPOCH);
//        System.out.println(LocalDate.now().getDayOfYear());
//
//        System.out.println("myObj = " + myObj);
//    }
//}

    /*

    Display Current Time
    ---------------------
    To display the current time (hour, minute, second, and nanoseconds),
    import the java.time.LocalTime class, and use its now() method: */

//import java.time.LocalTime; // import the LocalTime class
//
//public class Main {
//    public static void main(String[] args) {
//        LocalTime myObj = LocalTime.now();
//        System.out.println(myObj);
//    }
//}

     /*

    Display Current Date and Time
    ------------------------------
    To display the current date and time,import the
    java.time.LocalDateTime class and use its now() method */

//import java.time.LocalDateTime; // import the LocalDateTime class
//
//public class Main {
//    public static void main(String[] args) {
//        LocalDateTime myObj = LocalDateTime.now();
//        System.out.println(myObj);
//    }
//}

   /* The output
    will be:  2023-01-30T10:21:36.950865

    Formatting Date and Time
    -------------------------
    The "T" in the example above is used to separate the date
    from the time. You can use the DateTimeFormatter class with
    the of 'Pattern()' method in the same package to format or
    parse date-time objects.

    The following example will remove both the "T" and nanoseconds
    from the date-time */

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}

     /* The output will be:  Before Formatting:2023-01-30T10:21:36.951929
                             After Formatting:30-01-2023 10:21:36

        The ofPattern() method accepts all sorts of values,if you want to display
        the date and time in a different format.

        VALUE           Example
        ----------      --------------
        yyyy-MM-dd      "1988-09-29"
        dd/MM/yyyy      "29/09/1988"
        dd-MMM-yyyy     "29-Sep-1988"
        E,MMM dd yyyy   "Thu, Sep 29 1988"

        */
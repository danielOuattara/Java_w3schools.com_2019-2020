package _A_Java_Tutorial;

public class Java_04_Syntax {
    public static void main(String[] args) {
        /*

        Java Syntax
        ==============

        Above example explained
        ------------------------
        Every line of code that runs in Java must be inside a class.
        A class name should always start with an uppercase first letter.
        In our example, we named the class Main.

        Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

        The name of the java file must match the class name.
        When saving the file, save it using the class name and add ".java" to the end
        of the filename. To run the example above on your computer, make sure that
        Java is properly installed.

        The main Method
        -----------------
        The main() method is required, and you will see it in every Java program:

        public static void main(String[] args)

        Any code inside the main() method will be executed. Don't worry about
        the keywords before and after main. You will get to know them bit by bit
        while reading this tutorial.

        For now, just remember that every Java program has a class name which must
        match the filename, and that every program must contain the main() method.

        System.out.println()
        --------------------

        Inside the main() method, we can use the println() method to print a line
        of text to the screen:

        public static void main(String[] args) {
          System.out.println("Hello World");
        }


        Note:

        The curly braces {} marks the beginning and the end of a block of code.

        System is a built-in Java class that contains useful members, such as out,
        which is short for "output". The println() method, short for "print line",
        is used to print a value to the screen (or a file).

        Don't worry too much about System, out and println(). Just know that you
        need them together to print stuff to the screen.

        You should also note that each code statement must end with a semicolon (;)
         */
        System.out.println("Hello Java Again !");

    }
}

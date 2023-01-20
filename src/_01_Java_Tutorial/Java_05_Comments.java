package _01_Java_Tutorial;

public class Java_05_Comments {
    public static void main(String[] args) {

        String message = """
                Java Comments
                ----------------                          
                Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent 
                execution when testing alternative code.
                
                Single-line Comments
                ----------------------                
                Single-line comments start with two forward slashes (//).
                                
                Any text between // and the end of the line is ignored by Java (will not be executed).
                                
                This example uses a single-line comment before a line of code:
                
                // This is a comment
                System.out.println("Hello World");

                This example uses a single-line comment at the end of a line of code:
                System.out.println("Hello World"); // This is a comment
                                
                Java Multi-line Comments
                -------------------------                
                Multi-line comments start with /* and ends with */.
                                
                Any text between /* and */ will be ignored by Java.
                                
                This example uses a multi-line comment (a comment block) to explain the code:
                Example
                                
                /* The code below will print the words Hello World
                to the screen, and it is amazing */
                System.out.println("Hello World");
                                
                Single or multi-line comments ?
                -------------------------------                                
                It is up to you which you want to use. Normally, we use // for short comments, and /* */ for longer.
                                
                """;
    }
}

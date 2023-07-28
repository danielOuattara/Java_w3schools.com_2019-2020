package _04_Java_File_Handling._02_create_write_files;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class Main {
    public static void main(String[] args) {
/*
        Java : Create and Write To Files
        ===============================

        Create a File
        --------------
        To create a file in Java, you can use the "createNewFile()" method
        from the java.io.File class utility.
        This method returns a boolean value: true if the file was successfully
        created, and false if the file already exists.

        Note:  The "createNewFile()" method is enclosed in a try...catch block.
        -----  This is necessary because it throws an IOException if an error
               occurs; like the file cannot be created for some reason */

        try {
            File myObj = new File("src/_04_Java_File_Handling/_02_create_write_files/filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

 /*
        The output will be:
        File created: filename.txt

        To create a file in a specific directory (requires permission), specify the path
        of the file and use double backslashes to escape the "\" character (for Windows).
        On Mac and Linux you can just write the path, like: /Users/name/filename.txt

        File myObj = new File("C:\\Users\\MyName\\filename.txt"); (Windows)

        Write To a File
        ----------------
        In the following example, we use the FileWriter class together with its write() method
        to write some text to the file we created in the example above.

        Note: When you are done writing to the file, you should close it with the close() method: */

        try {
            FileWriter myWriter = new FileWriter("filename_test.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //-----------------------------------------------

        try {
            FileWriter myWriter = new FileWriter("src/_04_Java_File_Handling/filename2.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
         /*
         The output will be: Successfully wrote to the file.
         To read the file above, go to the Java Read Files chapter. */
    }
}

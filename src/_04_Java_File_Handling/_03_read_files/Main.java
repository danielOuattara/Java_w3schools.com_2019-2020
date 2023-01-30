package _04_Java_File_Handling._03_read_files;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) {
/*
        Java Read Files
        ==================

        Read a File
        ------------
        In the previous chapter, you learned how to create and write to a file.
        In the following example, we use the Scanner class to read the contents
        of the text file we created in the previous chapter:*/

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("--------------------------------------");

        try {
            File myObj = new File("src/_04_Java_File_Handling/filename2.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("---------------------------------------");

        /* The output will be: Files in Java might be tricky, but it is fun enough!


        Get File Information
        ---------------------
        To get more information about a file, use any of the File methods: */

        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("path: " + myObj.getPath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

        System.out.println("-----------------------------------------");

        File myFile = new File("src/_04_Java_File_Handling/filename2.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("path: " + myFile.getPath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable " + myFile.canRead());
            System.out.println("File size in bytes " + myFile.length());
        } else {
            System.out.println("The file does not exist.");
        }

 /*

        Note: There are many available classes in the Java API that can be used
              to read and write files in Java:
              - FileReader
              - BufferedReader
              - Files
              - Scanner
              - FileInputStream
              - FileWriter
              - BufferedWriter
              - FileOutputStream
              - etc...

               Which one to use depends on the Java version you're working with
               and whether you need to read bytes or characters, and the size
               of the file/lines etc.

                Tip: To delete a file, read our Java Delete Files chapter.*/
    }
}

package _04_Java_File_Handling;

import java.io.File;

public class Java_01_Java_Files {
    public static void main(String[] args) {
    /*

    Java Files
    ============

    File handling is an important part of any application.
    Java has several methods for creating, reading, updating, and deleting files.

    Java File Handling
    ---------------------
    The File class from the java.io package, allows us to work with files.
    To use the File class, create an object of the class, and specify the
    filename or directory name: */

        File myObj = new File("filename.txt"); // Specify the filename

    /*

    Note: If you don't know what a package is, read our Java Packages Tutorial.

    The File class has many useful methods for creating and getting information
    about files, for example:

    Method 	            Type 	                        Description
    -------------------------------------------------------------------
    canRead() 	        Boolean 	Tests whether the file is readable or not
    canWrite() 	        Boolean 	Tests whether the file is writable or not
    createNewFile()     Boolean 	Creates an empty file
    delete() 	        Boolean 	Deletes a file
    exists() 	        Boolean 	Tests whether the file exists
    getName() 	        String 	    Returns the name of the file
    getAbsolutePath() 	String 	    Returns the absolute pathname of the file
    length() 	        Long 	    Returns the size of the file in bytes
    list() 	            String[] 	Returns an array of the files in the directory
    mkdir() 	        Boolean 	Creates a directory

    You will learn how to create, write, read and delete files in the next chapters:    */
    }
}

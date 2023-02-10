package _D_Java_File_Handling._04_delete_files;

import java.io.File;  // Import the File class

public class Main {
    public static void main(String[] args) {

/*      Java Delete Files
        ==================

        Delete a File
        --------------
        To delete a file in Java, use the delete() method: */

        File fileOne = new File("filename.txt");
        if (fileOne.delete()) {
            System.out.println("Deleted the file: " + fileOne.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

        /*    You can also delete a folder. However, it must be empty: */

        File folderOne = new File("delete-folder-test");
        if (folderOne.delete()) {
            System.out.println("Deleted the folder: " + folderOne.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }

}

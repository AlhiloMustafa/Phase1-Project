package com.Mustafa;

import java.io.*;
import java.util.TreeSet;

public class OtherOptions extends MainMenu {


    static void addfile() {
        try {
            // Add file not a case sensitive
            scanner.nextLine();// Clean scanner cash .
            System.out.println("Please enter the source file's path to add (Example:'C:/hcl/learning/test.txt'):");
            String resourcePath = scanner.nextLine();// Get the path to copy from .
            File f = new File(resourcePath);
            String filename = f.getName(); // Extract the file name.
            int indexOfDot = filename.lastIndexOf("."); // Get the dot index
            String fileType = filename.substring(indexOfDot).toLowerCase();// Lowercase the file type
            String fname = filename.substring(0, indexOfDot);//Extract the file name

            FileInputStream fis = new FileInputStream(resourcePath);
            FileOutputStream fos = new FileOutputStream(path + "/" + fname + fileType); // Add the file name and its type to the root path.

            byte[] arrayBytes = new byte[fis.available()];
            fis.read(arrayBytes);
            fos.write(arrayBytes);

            System.out.println("The file' " + filename + " ' successfully added to your main directory. ");

        } catch (FileNotFoundException | StringIndexOutOfBoundsException e) {
            System.out.println("Sorry Could not find a file or the path !");

        } catch (IOException e) {
            System.out.println("fail please try again");
        }
        MainMenu mm = new MainMenu();
        mm.mainMenuOptions();

    }
    // Delete a file case sensitive.
    static void deleteFile() {
        boolean flag = false;

        scanner.nextLine();// Clean scanner cash .
        System.out.println("Please Enter a file name to delete Example (Test.txt):");
        String fileToDelete = scanner.nextLine();// Get the file name form the user to delete  .
        File f = new File(path + "/" + fileToDelete);
        boolean result = f.exists();// Check if the file exist.
        if (result) {
            TreeSet<String> setOfFiles = new TreeSet();
            File[] files = new File(path).listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().equals(fileToDelete)) { //Case sensitivity file name it should be exactly same to delete.
                        boolean delResult = f.delete();
                        if (delResult) {
                            flag = true;
                            System.out.println("File name ' " + fileToDelete + " ' has been deleted successfully");
                            break;
                        }

                    }
                }
            }
            if (!flag) {
                System.out.println("File not found!.");
            }

        } else {
            System.out.println("File not found!.");
        }
    }
    // Search for a file case sensitive :
    static void searchFile() {
        boolean flag = false;
        scanner.nextLine();// Clean scanner cash .
        System.out.println("Please Enter a file name to search for Example (Test.txt):");
        String fileToSearch = scanner.nextLine();// Get file name to search for .
        File f = new File(path + "/" + fileToSearch);
        boolean result = f.exists();// Check if the file exist.

        if (result) { // If the file exists then check the case sensitivity
            TreeSet<String> setOfFiles = new TreeSet();
            File[] files = new File(path).listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().equals(fileToSearch)) { //Case sensitivity it should be exactly same to print the founded file.
                        flag = true;
                        System.out.println("File name ' " + fileToSearch + " ' has been found successfully");
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println("File not found! .");
            }

        } else {
            System.out.println("File not found! .");
        }

    }


}

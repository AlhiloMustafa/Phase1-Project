package com.Mustafa;

import java.io.*;
import java.lang.reflect.Array;

public class OtherOptions extends MainMenu  {



    static void addfile() {
        try {
            scanner.nextLine();// Clean scanner cash .
            System.out.println("Please add the source file's path to add (Example:'C:/hcl/learning/test.txt'):");
            String resourcePath = scanner.nextLine();// Get the path to copy from .
            File f = new File(resourcePath);
            String filename = f.getName(); // Extract the file name.
            // Read the git the file streams
            FileInputStream fis = new FileInputStream(resourcePath);
            FileOutputStream fos = new FileOutputStream(path +"/"+ filename);
            System.out.println(path +"/"+ filename);

            byte[] arrayBytes = new byte[fis.available()];
            fis.read(arrayBytes);
            fos.write(arrayBytes);

            System.out.println("The file' " + filename + " ' successfully added to your main directory. ");

        } catch (FileNotFoundException e) {
            System.out.println("Sorry Could not file a file or the path !");


        } catch (IOException e) {
            System.out.println("Input out put problem");
        }
        MainMenu mm = new MainMenu();
        mm.mainMenuOptions();

    }

    ;

    static void deleteFile() {

        scanner.nextLine();// Clean scanner cash .
        System.out.println("Please Enter a file name to delete Example (Test.txt):");
        String fileToDelete = scanner.nextLine();// Get the path to copy from .
        File f=new File(path+"/"+fileToDelete);
        boolean result=f.delete();
        if (result){
            System.out.println("File name ' "+fileToDelete+" ' has been deleted successfully");
        }else {
            System.out.println("Fail! please make sure the file name entered correctly");
        }

    }

    ;

    static void searchFile() {

        scanner.nextLine();// Clean scanner cash .
        System.out.println("Please Enter a file name to search for Example (Test.txt):");
        String fileToDelete = scanner.nextLine();// Get the path to copy from .
        File f=new File(path+"/"+fileToDelete);
        boolean result=f.exists();
        if (result){
            System.out.println("File name ' "+fileToDelete+" ' has been found successfully");
        }else {
            System.out.println("Fail! please make sure the file name entered correctly");
        }

    }

    ;

    public void backToMainMenu() {
    }

    ;




}

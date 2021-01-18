package com.Mustafa;


import java.io.File;
import java.util.*;

public class MainMenu implements InteMainMenu {
    static Scanner scanner = new Scanner(System.in);
    int userChose;
    static String path = "C:/Root"; // The path of the main directory

    // Welcome page
    public void welcomePage() {
        String welcomePage = "** Welcome to LockedMe.com ** \n Developer: Mustafa Alhilo " +
                "\n Contacts : Mustafa.alhilo@hcl.com ";
        System.out.println(welcomePage);
    }

    // Run Main Menu
    @Override
    public void mainMenuOptions() {
        // Get the user input to chose one of the option below:
        try {
            String mainMinString = "\n ** Main Menu ** " + "\n" + "1-Return All Files." + "\n" + "2-Other Options." + "\n"
                    + "3-Close the Application(Exit).\n Please chose one of the above:";
            System.out.println(mainMinString);
            this.userChose = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Sorry, Your input must be 1,2, or 3.");
        }

        switch (userChose) {
            case 1:
                returnAllFiles();
                break;
            case 2:
                otherOptions();
                break;
            case 3:
                closeApp();
                break;
            default:
                scanner.nextLine();
        }
        scanner.nextLine();
        mainMenuOptions();
    }
    // Return all files method:
    @Override
    public void returnAllFiles() {
        try {

            TreeSet<String> setOfFiles = new TreeSet();
            File[] files = new File(path).listFiles();

            for (File file : files) {
                if (file.isFile()) {
                    setOfFiles.add(file.getName());
                }
            }

            for (String fileName : setOfFiles) {
                System.out.println(fileName);
            }

        } catch (NullPointerException e) {
            System.out.println("Please make sure the path of your directory is correct. ");
            mainMenuOptions();
        }
    }
    // Other options menu:
    @Override
    public void otherOptions() {

        try {
            String OtherOpString = " ** OTHER OPTIONS ** " + "\n" + "1-Add a file. " + "\n" + "2-Delete a file."
                    + "\n" + "3-Search for a file" + "\n" + "4-Back to the Main Menu";
            System.out.println(OtherOpString);
            this.userChose = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Sorry, Your input must be 1,2,3, or 4.");
            scanner.nextLine();
            otherOptions();
        }
        // Get the user input and switch to on of the methods(add , delete, search, or back to the main menu)
        switch (userChose) {
            // Call add file method
            case 1:
                OtherOptions.addfile();
                break;
            // Call delete file method
            case 2:
                OtherOptions.deleteFile();
                break;
            // Call search for a file method
            case 3:
                OtherOptions.searchFile();
                break;
            // Return to the main method
            case 4:
                mainMenuOptions();
            default:
                // Call the other option method
                scanner.nextLine();
                otherOptions();
        }
        mainMenuOptions();
    }

    @Override
    public void closeApp() {
        System.out.println("Goodbye, Thanks for using LockedMe.com  ");
        System.exit(0);
    }

}

package com.Mustafa;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class MainMenu implements InteMainMenu {
    static Scanner scanner = new Scanner(System.in);
    int userChose;
    static String path = "C:/Users/musal/directory"; // The path of the main directory

    @Override
    public void mainMenuOptions() {

        try {
            String mainMinString = "\n ** Main Menu ** " + "\n" + "1-Return All Files." + "\n" + "2-Other Options." + "\n" + "3-Close the Application(Exit).";
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
        mainMenuOptions();

    }


    @Override
    public void returnAllFiles() {
        // I need to check for number (it does not sort the numbers correctly cz they are strings now )

        try {

            TreeSet<String> setOfFiles = new TreeSet();
            File[] files = new File(this.path).listFiles();


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

    @Override
    public void otherOptions() {

        try {
            String OtherOpString = " ** OTHER OPTIONS ** " + "\n" + "1-Add a file. " + "\n" + "2-Delete a file." + "\n" + "3-Search for a file" + "\n" + "4-Back to the Main Menu";
            System.out.println(OtherOpString);
            this.userChose = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Sorry, Your input must be 1,2,3, or 4.");
        }

        switch (userChose) {
            case 1:
                OtherOptions.addfile();
                break;
            case 2:
                OtherOptions.deleteFile();
                break;
            case 3:
                OtherOptions.searchFile();
                break;
            case 4:
                mainMenuOptions();
            default:

                scanner.nextLine();
                otherOptions();
        }


    }

    @Override
    public void closeApp() {
        System.out.println("Goodbye, Thanks for using phase1 application.  ");
        System.exit(0);

    }

//    InterCreateDirectory mainDirectory= ()->{
//
//    };


}

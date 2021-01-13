package com.Mustafa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu implements InteMainMenu  {
    Scanner scanner = new Scanner(System.in);
    int userChose;

    @Override
    public void mainMenuOptions() {

            try {
                String mainMinString=" ** Main Menu ** "+"\n"+"1-Return All Files."+"\n"+"2-Other Options."+"\n"+"3-Close the Application(Exit).";
                System.out.println(mainMinString);
                this.userChose=scanner.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Sorry, Your input must be 1,2, or 3.");
            }


        switch (userChose){
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
                mainMenuOptions();
        }

    }


    @Override
    public ArrayList returnAllFiles() {
        System.out.println("we do not have files yet");
        return null;
    }

    @Override
    public void otherOptions() {


        try {
            String OtherOpString=" ** OTHER OPTIONS ** "+"\n"+"1-Add a file. "+"\n"+"2-Delete a file."+"\n"+"3-Search for a file"+"\n"+"4-Back to the Main Menu";
            System.out.println(OtherOpString);
            this.userChose=scanner.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Sorry, Your input must be 1,2,3, or 4.");
        }

        switch (userChose){
            case 1:
                System.out.println("call add file class");

                break;
            case 2:
                System.out.println("call delete file class");
                break;
            case 3:
                System.out.println("call search for file class");
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

    InterCreateDirectory mainDirectory= ()->{

    };



}

package com.Mustafa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateDicectory implements InterCreateDirectory {
    Scanner scanner =new Scanner(System.in);
    String path;
    String mainPath;

    @Override
    public void createDirectory() {
        setMainPth();
        System.out.println("Enter the name of the desired a directory: ");
        this.mainPath=this.path+scanner.nextLine();


    }

    public String setMainPth() {
        try {
            System.out.println("Please enter the path to create a main directory:");
            this.path = scanner.nextLine();

        }catch (InputMismatchException e){
            System.out.println("Sorry, Your should enter a correct path. ");
        }
        return path;

    }
}

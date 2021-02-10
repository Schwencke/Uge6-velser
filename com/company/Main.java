package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Dialog dialog= new English();
        Sprog sprog = new Sprog();


       // dialog = sprog.SkiftSprog(dialog.changeLanguage());
        System.out.println("**Velkommen til oversætteren**");
        while (!   getString(dialog.quit() ).equalsIgnoreCase("q") )  {


            if(getString("Do you wanne change the language ? " + "Y/N").equalsIgnoreCase("y")) {

                dialog = sprog.SkiftSprog(getString("Choose the language: " + dialog.contryCodes()));
            }
            System.out.println(dialog.displayLanguage() + " " + dialog.getLanguage());
        }
        System.out.println("Farvel, Ha det, Addio, Goodbye");
    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s);

        return scanner.nextLine();

    }
}

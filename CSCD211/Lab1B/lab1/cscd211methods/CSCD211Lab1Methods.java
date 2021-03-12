package lab1.cscd211methods;

// *************************************************************************************
//
// Name:        Hunter T.
// Date:        January 29, 2021
// Class:       CSCD 211
// Description: The methods class for the Lab.
//
// *************************************************************************************

import java.util.*;

import lab1.cscd211classes.*;
import lab1.cscd211enums.*;

/** The methods class for the Lab. */
public class CSCD211Lab1Methods {
    /**
     * The convertColor method converts a string to a color. This method is called from
     * various other methods.
     *
     * @param color  String representing the color.
     * @return Color The color object obtained from the String. If no color matches then
     *               and IllegalArgumentException is thrown. This method must convert
     *               the color generically.
     *
     * @throws IllegalArgumentException If the String is null.
     */
    public static Color convertColor(final String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color is null or empty");
        }

        return Color.valueOf(color.toUpperCase().trim());
    }

    /**
     * The displayAll method displays all Person objects that contain a specific color.
     *
     * @param toFind  Representing the color to find.
     * @param myPeeps Representing the Person array.
     *
     * @throws IllegalArgumentException If the array is null.
     */
    public static void displayAll(final Color toFind, final Person[] myPeeps) {
        if (myPeeps == null) {
            throw new IllegalArgumentException("myPeeps is null");
        }

        for (Person p: myPeeps) {
            if (p.getColor().equals(toFind)) {
                System.out.println(p + "\n");
            }
        }
    }

    /**
     * The fillArray method creates an array of type person. Reads the information from
     * the file, creates a person and places the person object into the array. The array
     * is returned.
     *
     * @param fin       Representing the Scanner object to the file.
     * @param total     Representing the total items that will be in the array.
     * @return Person[] A filled array of containing Person objects.
     *
     * @throws IllegalArgumentException If the Scanner object is null.
     * @throws IllegalArgumentException If total is less than or equal to 0.
     */
    public static Person[] fillArray(final Scanner fin, final int total) {
        String fn, ln, color;
        Person[] newArray = new Person[total];

        if (fin == null || total <= 0) {
            throw new IllegalArgumentException("fin is null and/or total <= 0");
        }

        for (int x = 0; x < total; x++) {
            fn    = fin.nextLine();
            ln    = fin.nextLine();
            color = fin.nextLine();

            newArray[x] = new Person(fn, ln, convertColor(color));
        }

        return newArray;
    }

    /**
     * The menu method. Valid menu choices are:
     * 1. Print the Array to the screen
     * 2. Display all people that contain a certain color
     * 3. Sort the array by Color
     * 4. Sort the array by the 'natural order'
     * 5. Quit
     * You must ensure the value entered is within range You must ensure the input
     * buffer is left empty.
     *
     * @param kb   Representing the Scanner object to the keyboard.
     * @return int Representing the menu choice.
     *
     * @throws IllegalArgumentException If the Scanner object is null.
     */
    public static int menu(Scanner kb) {
        int choice = 0;

        if (kb == null) {
            throw new IllegalArgumentException("kb is null");
        }

        System.out.println("Please choose from the following:");
        System.out.println("1. Print the Array to the screen");
        System.out.println("2. Display all people that contain a certain color");
        System.out.println("3. Sort the array by Color");
        System.out.println("4. Sort the array by the 'natural order'");
        System.out.println("5. Quit");

        while (choice < 1 || choice > 5) {
            // Catches any input that is not an integer.
            try {
                System.out.print("Enter integer choice --> ");
                choice = Integer.parseInt(kb.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input: Enter an integer corresponding to"
                                   + " your choice");
                continue;
            }

            // Catches input that is out of the option range.
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid input: Enter an integer "
                                   + "corresponding to your choice");
            }
        }

        System.out.println();
        return choice;
    }

    /**
     * The print array method prints the individual person to the screen and then a
     * carriage return between people.
     *
     * @param myPeeps Representing the filled array of type Person.
     *
     * @throws IllegalArgumentException If the array is null.
     */
    public static void printArray(final Person[] myPeeps) {
        if (myPeeps == null) {
            throw new IllegalArgumentException("myPeeps is null");
        }

        // foreach loop.
        for (Person p: myPeeps) {
            System.out.println(p + "\n");
        }
    }

    /**
     * The readColor method reads a string from the keyboard and then converts it to a
     * color by calling the private method convertColor
     *
     * @param kb     Representing the Scanner object.
     * @return Color Representing the Color enumerated type.
     *
     * @throws IllegalArgumentException If the Scanner object is null.
     */
    public static Color readColor(final Scanner kb) {
        String c;

        if (kb == null) {
            throw new IllegalArgumentException("kb is null");
        }

        // Catches empty input that would result in an IllegalArgumentException
        // being thrown.
        while (true) {
            System.out.print("Please enter a color: ");
            c = kb.nextLine();
            if (c == null || c.isEmpty()) {
                System.out.println("Invalid input: This field cannot be left blank");
            } else {
                break;
            }
        }

        return convertColor(c);
    }
}

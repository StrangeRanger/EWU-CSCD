import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        /* ****************************************************************** /*
         * Task 1)
         * Write a Java program that displays the following table:
         *      a   a^2  a^3
         *      1	1    1
         *      2	4    8
         *      3	9    27
         *      4	16   64
        /* ****************************************************************** */
        System.out.println("**********************\n* Performing Task 1! *\n" +
                "**********************");
        System.out.println("a  a^2  a^3\n1  1    1\n2  4    8\n3  9    27\n4  16   64");


        /* ****************************************************************** /*
         * Task 2)
         * Write a Java program that displays the perimeter and the area
         * of a rectangle with a width of 4.5 and a height of 8.0.
         *
         * (Recall: perimeter = the sum of the lengths of all four sides.)
        /* ****************************************************************** */
        double width = 4.5, height = 8.0;

        System.out.println("\n\n**********************\n* Performing Task 2! *\n" +
                "**********************");
        // Displays the set width and height
        System.out.println("Width: " + width + "\nHeight: " + height + "\n");
        // Displays the calculated perimeter
        System.out.println("Perimeter = " + (2 * (width + height)));


        /* ****************************************************************** /*
         * Task 3)
         * Celsius to Fahrenheit conversion: write a Java program
         * that reads a Celsius degree (a floating point of type double) from
         * the console, converts it to degrees Fahrenheit (also as type double),
         * and displays the result.
         *
         * Show the output of your code for the following five values of degree
         * Celsius: 0, 18, 36, -12.5, -40
        /* ****************************************************************** */
        // Creates a Scanner object
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n\n**********************\n* Performing Task 3! *\n" +
                "**********************");
        System.out.println("You'll be asked 5 times enter a temperature in " +
                "degrees celsius.\n");

        System.out.print("Enter a temperature in degrees Celsius: ");
        double celsius = userInput.nextDouble();
        // A. Displays Temperature in Fahrenheit
        System.out.println(celsius + "°C = " + ((celsius * (9.0/5.0)) + 32.0) + "°F");

        System.out.print("Enter a temperature in degrees Celsius: ");
        celsius = userInput.nextDouble();
        System.out.println(celsius + "°C = " + ((celsius * (9.0/5.0)) + 32.0) + "°F"); // A.

        System.out.print("Enter a temperature in degrees Celsius: ");
        celsius = userInput.nextDouble();
        System.out.println(celsius + "°C = " + ((celsius * (9.0/5.0)) + 32.0) + "°F"); // A.

        System.out.print("Enter a temperature in degrees Celsius: ");
        celsius = userInput.nextDouble();
        System.out.println(celsius + "°C = " + ((celsius * (9.0/5.0)) + 32.0) + "°F"); // A.

        System.out.print("Enter a temperature in degrees Celsius: ");
        celsius = userInput.nextDouble();
        System.out.println(celsius + "°C = " + ((celsius * (9.0/5.0)) + 32.0) + "°F"); // A.


        /* ****************************************************************** /*
         * Task 4)
         * Write a Java program that, given the radius and the height,
         * computes the volume of a cylinder. The formula for volume of a
         * cylinder is
         *
         * Volume = Area * Height  where  Area = radius * radius * pi
        /* ****************************************************************** */
        // 'userInput' has already been declared in Task 3
        // 'height' has already been declared in Task 2
        double radius, area, volume;
        final double pi = 3.14159;

        System.out.println("\n\n**********************\n* Performing Task 4! *\n" +
                "**********************");
        System.out.println("You'll be asked to provide a height and radius for " +
                "an imaginary cylinder.\n");

        System.out.print("Enter a radius: ");
        radius = userInput.nextDouble();
        System.out.print("Enter a height: ");
        height = userInput.nextDouble();
        area = radius * radius * pi;
        volume = area * height;

        System.out.println("\nArea = " + area + " Squared\nVolume = " + volume + " Cubbed");


        /* ****************************************************************** /*
         * Task 5)
         * Assume you’ve just had dinner at a restaurant in a state
         * with no sales tax (ever been to Delaware?). Write a Java program that
         * takes as its input from the user i) the total $ amount billed for the
         * dinner and ii) the desired tip %, a value between 10% and 25%; and
         * then calculates the total after the tip, and displays that total on
         * the screen. The $ amount should be of type double and have two decimal
         * places (that stand for cents). Submit five sample runs showing the
         * totals for different combinations of the pre-tip dollar amount and
         * the tip percentage.
         *
         * Student Note: Used this website in reference to the DecimalFormat.
         * Since we are working with money, I decided it'd be a good idea to take
         * advantage of this opportunity to learn how to modify the number of
         * decimal places of a floating point number.
         * Site: https://farenda.com/java/java-format-double-2-decimal-places/
        /* ****************************************************************** */
        // 'userInput' has already been declared in Task 3
        float totalCost, tipPercent, totalCostAfterTip;
        // Using DecimalFormat to format output with two decimal points
        DecimalFormat dF = new DecimalFormat("#.##");

        System.out.println("\n\n**********************\n* Performing Task 5! *\n" +
                "**********************");
        System.out.println("You'll be asked to input a set of values.\n");

        System.out.print("Enter the total cost billed for dinner: ");
        totalCost = userInput.nextFloat();
        System.out.print("\n**Enter the percentage as a decimal point (i.e. 20% " +
                "as .20)**\nEnter the amount (between 10% and 25%) to be tipped: ");
        tipPercent = userInput.nextFloat();
        totalCostAfterTip = totalCost + (totalCost * tipPercent);
        System.out.print("\nThe total amount spent after the tip: " + dF.format(totalCostAfterTip));
    }
}

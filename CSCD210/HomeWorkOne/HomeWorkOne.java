import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        /*--[ Task 1 ]*****************************************************************/

        System.out.println("**********************\n* Performing Task 1! *\n"
                           + "**********************");
        System.out.println("a  a^2  a^3\n1  1    1\n2  4    8\n3  9    27\n4  16   64");

        /*--[ Task 2 ]*****************************************************************/

        double width = 4.5, height = 8.0;

        System.out.println("\n\n**********************\n* Performing Task 2! *\n"
                           + "**********************");
        // Displays the set width and height.
        System.out.println("Width: " + width + "\nHeight: " + height + "\n");
        // Displays the calculated perimeter.
        System.out.println("Perimeter = " + (2 * (width + height)));

        /*--[ Task 3 ]*****************************************************************/

        // Creates a Scanner object.
        Scanner userInputThree = new Scanner(System.in);

        System.out.println("\n\n**********************\n* Performing Task 3! *\n"
                           + "**********************");
        System.out.println("You'll be asked 5 times enter a temperature in "
                           + "degrees celsius.\n");

        for (var i = 0; i < 5; i++) {
            System.out.print("Enter a temperature in degrees Celsius: ");
            double celsius = userInputThree.nextDouble();
            // Displays Temperature in Fahrenheit.
            System.out.println(celsius + "°C = " + ((celsius * (9.0 / 5.0)) + 32.0)
                               + "°F");
        }

        /*--[ Task 4 ]*****************************************************************/

        Scanner      userInputFour = new Scanner(System.in);
        // 'height' has already been declared in Task 2.
        double       radius, area, volume;
        final double pi = 3.14159;

        System.out.println("\n\n**********************\n* Performing Task 4! *\n"
                           + "**********************");
        System.out.println("You'll be asked to provide a height and radius for "
                           + "an imaginary cylinder.\n");

        System.out.print("Enter a radius: ");
        radius = userInputFour.nextDouble();
        System.out.print("Enter a height: ");
        height = userInputFour.nextDouble();
        area   = radius * radius * pi;
        volume = area * height;

        System.out.println("\nArea = " + area + " Squared\nVolume = " + volume
                           + " Cubed");

        /*--[ Task 5 ]*****************************************************************/

        Scanner       userInputFive = new Scanner(System.in);
        // Using DecimalFormat to format output with two decimal points.
        DecimalFormat dF            = new DecimalFormat("#.##");
        float         totalCost, tipPercent, totalCostAfterTip;

        System.out.println("\n\n**********************\n* Performing Task 5! *\n"
                           + "**********************");
        System.out.println("You'll be asked to input a set of values.\n");

        System.out.print("Enter the total cost billed for dinner: ");
        totalCost = userInputFive.nextFloat();
        System.out.print(
                "\n**Enter the percentage as a decimal point (i.e. 20% "
                + "as .20)**\nEnter the amount (between 10% and 25%) to be tipped: ");
        tipPercent        = userInputFive.nextFloat();
        totalCostAfterTip = totalCost + (totalCost * tipPercent);
        System.out.print("\nThe total amount spent after the tip: "
                         + dF.format(totalCostAfterTip));
    }
}

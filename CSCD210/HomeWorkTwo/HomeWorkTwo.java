import java.util.Random;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        /* [ Task 1 ]**************************************************************** */

        Scanner userInput = new Scanner(System.in);
        double  imperialWeight, imperialHeight, weight, height, userBMI;

        System.out.println("**********************\n* Performing Task 1! *\n"
                           + "**********************");
        System.out.println("For a total of time times, you'll be asked to enter"
                           + "both your weight (pounds) and height (inches)\n");

        for (var i = 0; i < 5; i++) {
            System.out.print("Enter your weight in pounds: ");
            imperialWeight = userInput.nextDouble();
            // Converts pounds to kilograms.
            weight = imperialWeight / 2.205;
            System.out.print("Enter your height in inches: ");
            imperialHeight = userInput.nextDouble();
            // Converts inches to meters.
            height = imperialHeight / 39.37;
            // Calculates BMI.
            userBMI = weight / (height * height);
            System.out.println("BMI: " + userBMI + "\n");
        }

        /* [ Task 2 ]**************************************************************** */

        Scanner userInputTwo = new Scanner(System.in);
        String  integer;

        System.out.println("\n\n**********************\n* Performing Task 2! *\n"
                           + "**********************");
        System.out.println("For a total of 5 times, you'll be asked to enter an"
                           + "integer\n");

        for (var i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            integer = userInputTwo.nextLine();
            if (integer.charAt(0) == integer.charAt(integer.length() - 1)) {
                System.out.println(integer + " IS a palindrome\n");
            } else {
                System.out.println(integer + " is NOT a palindrome\n");
            }
        }

        /* [ Task 3 ]**************************************************************** */

        Scanner userInputThree = new Scanner(System.in);
        Random  randomInt      = new Random();
        int     userChoice, computerChoice;

        System.out.println("\n\n**********************\n* Performing Task 3! *\n"
                           + "**********************");
        System.out.println(
                "For a total of 5 times, you'll be asked to choose"
                + "rock, paper, or scissors in number formed (use key below)");
        System.out.println("Key: 0 = Rock\n1 = Scissors\n2 = Paper\n");

        for (var i = 0; i < 5; i++) {
            System.out.print("Enter your choice of rock, paper, scissors: ");
            userChoice     = userInputThree.nextInt();
            computerChoice = randomInt.nextInt(4);
            System.out.println("Computer choice: " + computerChoice);
            if (userChoice == computerChoice) {
                System.out.println("Tie!\n");
            } else if ((userChoice == 0 && computerChoice == 1)
                       || (userChoice == 1 && computerChoice == 2)
                       || (userChoice == 2 && computerChoice == 0)) {
                System.out.println("User won!\n");
            } else {
                System.out.println("Computer won!\n");
            }
        }

        /* [ Task 4 ]**************************************************************** */

        Scanner userInputFour = new Scanner(System.in);
        int     userInt;

        System.out.println("\n\n**********************\n* Performing Task 4! *\n"
                           + "**********************");
        System.out.println("For a total of 5 times, you'll be asked to enter"
                           + "an integer\n");

        for (var i = 0; i < 5; i++) {
            System.out.print("Enter your an integer: ");
            userInt = userInputFour.nextInt();

            System.out.println(userInt + " is divisible by 6 and 7: "
                               + ((userInt % 6 == 0 && userInt % 7 == 0) ? "True"
                                                                         : "False"));
            System.out.println(userInt + " is divisible by 6 or 7: "
                               + ((userInt % 6 == 0 || userInt % 7 == 0) ? "True"
                                                                         : "False"));
            System.out.println(userInt + " is divisible by 6 or 7, but not both: "
                               + ((userInt % 6 == 0 ^ userInt % 7 == 0) ? "True\n"
                                                                        : "False\n"));
        }

        /* [ Task 5 ]**************************************************************** */

        char    userHex;
        Scanner userInputFive = new Scanner(System.in);

        System.out.println("\n\n**********************\n* Performing Task 5! *\n"
                           + "**********************");
        System.out.println("For a total of 5 times, you'll be asked to enter"
                           + "a single-digit, hexadecimal number\n");

        for (var i = 0; i < 5; i++) {
            System.out.print("Enter a single-digit hexadecimal number: ");
            userHex = userInputFive.next().charAt(0);
            if (Character.isLowerCase(userHex)) {
                userHex = Character.toUpperCase(userHex);
            }
            if (userHex == '0') {
                System.out.println("0000");
            } else if (userHex == '1') {
                System.out.println("Hexadecimal equivalent: 0001\n");
            } else if (userHex == '2') {
                System.out.println("Hexadecimal equivalent: 0010\n");
            } else if (userHex == '3') {
                System.out.println("Hexadecimal equivalent: 0011\n");
            } else if (userHex == '4') {
                System.out.println("Hexadecimal equivalent: 0101\n");
            } else if (userHex == '5') {
                System.out.println("Hexadecimal equivalent: 0000\n");
            } else if (userHex == '6') {
                System.out.println("Hexadecimal equivalent: 0110\n");
            } else if (userHex == '7') {
                System.out.println("Hexadecimal equivalent: 0111\n");
            } else if (userHex == '8') {
                System.out.println("Hexadecimal equivalent: 1000\n");
            } else if (userHex == '9') {
                System.out.println("Hexadecimal equivalent: 1001\n");
            } else if (userHex == 'A') {
                System.out.println("Hexadecimal equivalent: 1010\n");
            } else if (userHex == 'B') {
                System.out.println("Hexadecimal equivalent: 1011\n");
            } else if (userHex == 'C') {
                System.out.println("Hexadecimal equivalent: 1100\n");
            } else if (userHex == 'D') {
                System.out.println("Hexadecimal equivalent: 1101\n");
            } else if (userHex == 'E') {
                System.out.println("Hexadecimal equivalent: 1110\n");
            } else if (userHex == 'F') {
                System.out.println("Hexadecimal equivalent: 1111\n");
            } else {
                System.out.println("You entered an invalid hexadecimal number\n");
            }
        }
    }
}

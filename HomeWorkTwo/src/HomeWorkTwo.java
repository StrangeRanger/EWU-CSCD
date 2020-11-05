import java.util.Scanner;
import java.util.Random;

public class HomeWorkTwo {
    public static void main(String[] args) {
        /* ****************************************************************** /*
         * Task 1)
         * Body Mass Index (BMI) is calculated by taking your weight in
         * kilograms and dividing it by the square of your height in meters.
         * (So, if you are 6’0’’, that’s about 1.83 meters.) Write a Java
         * program that prompts the user to enter a weight in lbs. and height
         * in inches, and then (after appropriately converting the units)
         * displays the BMI. Consider 1 pound to be equal to 0.45359 kilos and
         * 1 inch to be equal to 0.0254 meters. Include the output of your code
         * for five combinations of (weight, height) in (pounds, inches).
        /* ******************************************************************* */
        double imperialWeight, imperialHeight, weight, height, userBMI;
        Scanner userInput = new Scanner(System.in);

        System.out.println("**********************\n* Performing Task 1! *\n" +
                "**********************");
        System.out.println("For a total of time times, you'll be asked to enter" +
                "both your weight (pounds) and height (inches)\n");

        // FIRST ATTEMPT
        System.out.print("Enter your weight in pounds: ");
        imperialWeight = userInput.nextDouble();
        // Converts pounds to kilograms
        weight = imperialWeight/2.205;
        System.out.print("Enter your height in inches: ");
        imperialHeight = userInput.nextDouble();
        // Converts inches to meters
        height = imperialHeight/39.37;
        // Calculates BMI
        userBMI = weight/(height * height);
        System.out.println("BMI: " + userBMI + "\n");

        // SECOND ATTEMPT
        System.out.print("Enter your weight in pounds: ");
        imperialWeight = userInput.nextDouble();
        // Converts pounds to kilograms
        weight = imperialWeight/2.205;
        System.out.print("Enter your height in inches: ");
        imperialHeight = userInput.nextDouble();
        // Converts inches to meters
        height = imperialHeight/39.37;
        // Calculates BMI
        userBMI = weight/(height * height);
        System.out.println("BMI: " + userBMI + "\n");

        // THIRD ATTEMPT
        System.out.print("Enter your weight in pounds: ");
        imperialWeight = userInput.nextDouble();
        // Converts pounds to kilograms
        weight = imperialWeight/2.205;
        System.out.print("Enter your height in inches: ");
        imperialHeight = userInput.nextDouble();
        // Converts inches to meters
        height = imperialHeight/39.37;
        // Calculates BMI
        userBMI = weight/(height * height);
        System.out.println("BMI: " + userBMI + "\n");

        // FOURTH ATTEMPT
        System.out.print("Enter your weight in pounds: ");
        imperialWeight = userInput.nextDouble();
        // Converts pounds to kilograms
        weight = imperialWeight/2.205;
        System.out.print("Enter your height in inches: ");
        imperialHeight = userInput.nextDouble();
        // Converts inches to meters
        height = imperialHeight/39.37;
        // Calculates BMI
        userBMI = weight/(height * height);
        System.out.println("BMI: " + userBMI + "\n");

        // FIFTH ATTEMPT
        System.out.print("Enter your weight in pounds: ");
        imperialWeight = userInput.nextDouble();
        // Converts pounds to kilograms
        weight = imperialWeight/2.205;
        System.out.print("Enter your height in inches: ");
        imperialHeight = userInput.nextDouble();
        // Converts inches to meters
        height = imperialHeight/39.37;
        // Calculates BMI
        userBMI = weight/(height * height);
        System.out.println("BMI: " + userBMI + "\n");


        /* ****************************************************************** /*
         * Task 2)
         * A palindrome integer is one that “reads the same” from left to right
         * and from right to left. So, for instance: 121, 12321 and 757 are all
         * palindrome integers. Write a Java program that prompts a user to
         * enter a 3-digit positive integer and determines whether it is a
         * palindrome. Include the output of testing your code on the following
         * input values: 171, 173, 747, 905 and 007.
        /* ****************************************************************** */
        // I had to create a new Scanner objected, else for some reason, the
        //  first userInput would be skipped over (so I created a new scanner
        //  object each new task)
        Scanner userInputTwo = new Scanner(System.in);
        String integer;

        System.out.println("\n\n**********************\n* Performing Task 2! *\n" +
                "**********************");
        System.out.println("For a total of 5 times, you'll be asked to enter an" +
                "integer\n");

        // FIRST ATTEMPT
        System.out.print("Enter an integer: "); integer = userInputTwo.nextLine();
        if (integer.charAt(0) == integer.charAt(integer.length() - 1)) {
            System.out.println(integer + " IS a palindrome\n");
        } else {
            System.out.println(integer + " is NOT a palindrome\n");
        }

        // SECOND ATTEMPT
        System.out.print("Enter an integer: "); integer = userInputTwo.nextLine();
        if (integer.charAt(0) == integer.charAt(integer.length() - 1)) {
            System.out.println(integer + " IS a palindrome\n");
        } else {
            System.out.println(integer + " is NOT a palindrome\n");
        }

        // THIRD ATTEMPT
        System.out.print("Enter an integer: "); integer = userInputTwo.nextLine();
        if (integer.charAt(0) == integer.charAt(integer.length() - 1)) {
            System.out.println(integer + " IS a palindrome\n");
        } else {
            System.out.println(integer + " is NOT a palindrome\n");
        }

        // FOURTH ATTEMPT
        System.out.print("Enter an integer: "); integer = userInputTwo.nextLine();
        if (integer.charAt(0) == integer.charAt(integer.length() - 1)) {
            System.out.println(integer + " IS a palindrome\n");
        } else {
            System.out.println(integer + " is NOT a palindrome\n");
        }

        // FIRTH ATTEMPT
        System.out.print("Enter an integer: "); integer = userInputTwo.nextLine();
        if (integer.charAt(0) == integer.charAt(integer.length() - 1)) {
            System.out.println(integer + " IS a palindrome\n");
        } else {
            System.out.println(integer + " is NOT a palindrome\n");
        }


        /* ****************************************************************** /*
         * Task 3)
         * Write a Java program that plays the kids’ game rock-paper-scissors
         * (RPS). Assume scissors win vs. paper, paper wins vs. rock and rock
         * wins vs. scissors. The program randomly generates an int among values
         * {0, 1, 2} representing rock, scissors, and paper, respectively. The
         * program prompts the user to enter a value 0, 1 or 2 and then displays
         * a message on who has won, based on the RPS game rules above. Should
         * both the user and the program pick the same choice, the game is tied
         * (i.e., nobody won).
         *
         * Show the output of your game for five different choices of play
         * (computer, user) where each of computer and user is one of 0, 1 or
         * 2. (For example, (0, 1) means computer played rock and user played
         * scissors, so the user would win in that scenario.)
        /* ****************************************************************** */
        int userChoice, computerChoice;
        Scanner userInputThree = new Scanner(System.in);
        Random randomInt = new Random();

        System.out.println("\n\n**********************\n* Performing Task 3! *\n" +
                "**********************");
        System.out.println("For a total of 5 times, you'll be asked to choose" +
                "rock, paper, or scissors in number formed (use key below)");
        System.out.println("Key: 0 = Rock\n1 = Scissors\n2 = Paper\n");

        // FIRST ATTEMPT
        System.out.print("Enter your choice of rock, paper, scissors: ");
        userChoice = userInputThree.nextInt();
        computerChoice = randomInt.nextInt(4);
        System.out.println("Computer choice: " + computerChoice);
        if (userChoice == computerChoice) {
            System.out.println("Tie!\n");
        }
        else if ((userChoice == 0 && computerChoice == 1) || (userChoice == 1 &&
                computerChoice == 2) || (userChoice == 2 && computerChoice == 0)) {
            System.out.println("User won!\n");
        }
        else {
            System.out.println("Computer won!\n");
        }

        // SECOND ATTEMPT
        System.out.print("Enter your choice of rock, paper, scissors: ");
        userChoice = userInputThree.nextInt();
        computerChoice = randomInt.nextInt(4);
        System.out.println("Computer choice: " + computerChoice);
        if (userChoice == computerChoice) {
            System.out.println("Tie!\n");
        }
        else if ((userChoice == 0 && computerChoice == 1) || (userChoice == 1 &&
                computerChoice == 2) || (userChoice == 2 && computerChoice == 0)) {
            System.out.println("User won!\n");
        }
        else {
            System.out.println("Computer won!\n");
        }

        // THIRD ATTEMPT
        System.out.print("Enter your choice of rock, paper, scissors: ");
        userChoice = userInputThree.nextInt();
        computerChoice = randomInt.nextInt(4);
        System.out.println("Computer choice: " + computerChoice);
        if (userChoice == computerChoice) {
            System.out.println("Tie!\n");
        }
        else if ((userChoice == 0 && computerChoice == 1) || (userChoice == 1 &&
                computerChoice == 2) || (userChoice == 2 && computerChoice == 0)) {
            System.out.println("User won!\n");
        }
        else {
            System.out.println("Computer won!\n");
        }

        // FOURTH ATTEMPT
        System.out.print("Enter your choice of rock, paper, scissors: ");
        userChoice = userInputThree.nextInt();
        computerChoice = randomInt.nextInt(4);
        System.out.println("Computer choice: " + computerChoice);
        if (userChoice == computerChoice) {
            System.out.println("Tie!\n");
        }
        else if ((userChoice == 0 && computerChoice == 1) || (userChoice == 1 &&
                computerChoice == 2) || (userChoice == 2 && computerChoice == 0)) {
            System.out.println("User won!\n");
        }
        else {
            System.out.println("Computer won!\n");
        }

        // FIFTH ATTEMPT
        System.out.print("Enter your choice of rock, paper, scissors: ");
        userChoice = userInputThree.nextInt();
        computerChoice = randomInt.nextInt(4);
        System.out.println("Computer choice: " + computerChoice);
        if (userChoice == computerChoice) {
            System.out.println("Tie!\n");
        }
        else if ((userChoice == 0 && computerChoice == 1) || (userChoice == 1 &&
                computerChoice == 2) || (userChoice == 2 && computerChoice == 0)) {
            System.out.println("User won!\n");
        }
        else {
            System.out.println("Computer won!\n");
        }


        /* ****************************************************************** /*
         * Task 4)
         * Write a Java program that prompts the user to enter a non-negative
         * integer and then determines whether that integer is divisible by i)
         * 6 and 7, ii) 6 or 7 (one or both), and iii) by exactly one of 6 and
         * 7, but not both. Test run your program on the following input values,
         * and show the output in each case: 7, 18, 23, 42, 50.
        /* ****************************************************************** */
        int userInt;
        Scanner userInputFour = new Scanner(System.in);

        System.out.println("\n\n**********************\n* Performing Task 4! *\n" +
                "**********************");
        System.out.println("For a total of 5 times, you'll be asked to enter" +
                "an integer\n");

        // FIRST ATTEMPT
        System.out.print("Enter your an integer: "); userInt = userInputFour.nextInt();
        System.out.println(userInt + " is divisible by 6 and 7: " + ((userInt % 6 == 0 &&
                userInt % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7: " + ((userInt % 6 == 0 || userInt
                % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7, but not both: " + ((userInt % 6 ==
                0 ^ userInt % 7 == 0) ? "True\n" : "False\n"));

        // SECOND ATTEMPT
        System.out.print("Enter your an integer: "); userInt = userInputFour.nextInt();
        System.out.println(userInt + " is divisible by 6 and 7: " + ((userInt % 6 == 0 &&
                userInt % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7: " + ((userInt % 6 == 0 || userInt
                % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7, but not both: " + ((userInt % 6 ==
                0 ^ userInt % 7 == 0) ? "True\n" : "False\n"));

        // THIRD ATTEMPT
        System.out.print("Enter your an integer: "); userInt = userInputFour.nextInt();
        System.out.println(userInt + " is divisible by 6 and 7: " + ((userInt % 6 == 0 &&
                userInt % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7: " + ((userInt % 6 == 0 || userInt
                % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7, but not both: " + ((userInt % 6 ==
                0 ^ userInt % 7 == 0) ? "True\n" : "False\n"));

        // FOURTH ATTEMPT
        System.out.print("Enter your an integer: "); userInt = userInputFour.nextInt();
        System.out.println(userInt + " is divisible by 6 and 7: " + ((userInt % 6 == 0 &&
                userInt % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7: " + ((userInt % 6 == 0 || userInt
                % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7, but not both: " + ((userInt % 6 ==
                0 ^ userInt % 7 == 0) ? "True\n" : "False\n"));

        // FIFTH ATTEMPT
        System.out.print("Enter your an integer: "); userInt = userInputFour.nextInt();
        System.out.println(userInt + " is divisible by 6 and 7: " + ((userInt % 6 == 0 &&
                userInt % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7: " + ((userInt % 6 == 0 || userInt
                % 7 == 0) ? "True" : "False"));
        System.out.println(userInt + " is divisible by 6 or 7, but not both: " + ((userInt % 6 ==
                0 ^ userInt % 7 == 0) ? "True\n" : "False\n"));


        /* ****************************************************************** /*
         * Task 5)
         * Write a Java program that prompts the user to enter a hexadecimal
         * number (single-digit, i.e., one of 0, 1, ..., 9, A, B, C, D, E, F),
         * converts it to a 4-digit binary number, and displays that binary
         * value. For example, hex 7 is 0111 in binary and hex A is 1010 in
         * binary. Hex digits that are represented as English letters can be
         * either uppercase or lowercase (so, either ‘A’ or ‘a’ would stand for
         * (decimal) 10). For an incorrect input (anything that’s not a valid
         * hexadecimal digit), your program should notify the user that the
         * input was not valid. Make sure to use the char datatype.
         *
         * Show the output of your code for the following input values:
         * 9, f, 3, G, x
        /* ****************************************************************** */
        char userHex;
        Scanner userInputFive = new Scanner(System.in);

        System.out.println("\n\n**********************\n* Performing Task 5! *\n" +
                "**********************");
        System.out.println("For a total of 5 times, you'll be asked to enter" +
                "a single-digit, hexadecimal number\n");

        // FIRST ATTEMPT
        System.out.print("Enter a single-digit hexadecimal number: ");
        userHex = userInputFive.next().charAt(0);
        if (Character.isLowerCase(userHex)) { userHex = Character.toUpperCase(userHex); }
        if (userHex == '0') { System.out.println("0000"); }
        else if (userHex == '1') { System.out.println("Hexadecimal equivalent: 0001\n"); }
        else if (userHex == '2') { System.out.println("Hexadecimal equivalent: 0010\n"); }
        else if (userHex == '3') { System.out.println("Hexadecimal equivalent: 0011\n"); }
        else if (userHex == '4') { System.out.println("Hexadecimal equivalent: 0101\n"); }
        else if (userHex == '5') { System.out.println("Hexadecimal equivalent: 0000\n"); }
        else if (userHex == '6') { System.out.println("Hexadecimal equivalent: 0110\n"); }
        else if (userHex == '7') { System.out.println("Hexadecimal equivalent: 0111\n"); }
        else if (userHex == '8') { System.out.println("Hexadecimal equivalent: 1000\n"); }
        else if (userHex == '9') { System.out.println("Hexadecimal equivalent: 1001\n"); }
        else if (userHex == 'A') { System.out.println("Hexadecimal equivalent: 1010\n"); }
        else if (userHex == 'B') { System.out.println("Hexadecimal equivalent: 1011\n"); }
        else if (userHex == 'C') { System.out.println("Hexadecimal equivalent: 1100\n"); }
        else if (userHex == 'D') { System.out.println("Hexadecimal equivalent: 1101\n"); }
        else if (userHex == 'E') { System.out.println("Hexadecimal equivalent: 1110\n"); }
        else if (userHex == 'F') { System.out.println("Hexadecimal equivalent: 1111\n"); }
        else { System.out.println("You entered an invalid hexadecimal number\n"); }

        // SECOND ATTEMPT
        System.out.print("Enter a single-digit hexadecimal number: ");
        userHex = userInputFive.next().charAt(0);
        if (Character.isLowerCase(userHex)) { userHex = Character.toUpperCase(userHex); }
        if (userHex == '0') { System.out.println("0000"); }
        else if (userHex == '1') { System.out.println("Hexadecimal equivalent: 0001\n"); }
        else if (userHex == '2') { System.out.println("Hexadecimal equivalent: 0010\n"); }
        else if (userHex == '3') { System.out.println("Hexadecimal equivalent: 0011\n"); }
        else if (userHex == '4') { System.out.println("Hexadecimal equivalent: 0101\n"); }
        else if (userHex == '5') { System.out.println("Hexadecimal equivalent: 0000\n"); }
        else if (userHex == '6') { System.out.println("Hexadecimal equivalent: 0110\n"); }
        else if (userHex == '7') { System.out.println("Hexadecimal equivalent: 0111\n"); }
        else if (userHex == '8') { System.out.println("Hexadecimal equivalent: 1000\n"); }
        else if (userHex == '9') { System.out.println("Hexadecimal equivalent: 1001\n"); }
        else if (userHex == 'A') { System.out.println("Hexadecimal equivalent: 1010\n"); }
        else if (userHex == 'B') { System.out.println("Hexadecimal equivalent: 1011\n"); }
        else if (userHex == 'C') { System.out.println("Hexadecimal equivalent: 1100\n"); }
        else if (userHex == 'D') { System.out.println("Hexadecimal equivalent: 1101\n"); }
        else if (userHex == 'E') { System.out.println("Hexadecimal equivalent: 1110\n"); }
        else if (userHex == 'F') { System.out.println("Hexadecimal equivalent: 1111\n"); }
        else { System.out.println("You entered an invalid hexadecimal number\n"); }

        // THIRD ATTEMPT
        System.out.print("Enter a single-digit hexadecimal number: ");
        userHex = userInputFive.next().charAt(0);
        if (Character.isLowerCase(userHex)) { userHex = Character.toUpperCase(userHex); }
        if (userHex == '0') { System.out.println("0000"); }
        else if (userHex == '1') { System.out.println("Hexadecimal equivalent: 0001\n"); }
        else if (userHex == '2') { System.out.println("Hexadecimal equivalent: 0010\n"); }
        else if (userHex == '3') { System.out.println("Hexadecimal equivalent: 0011\n"); }
        else if (userHex == '4') { System.out.println("Hexadecimal equivalent: 0101\n"); }
        else if (userHex == '5') { System.out.println("Hexadecimal equivalent: 0000\n"); }
        else if (userHex == '6') { System.out.println("Hexadecimal equivalent: 0110\n"); }
        else if (userHex == '7') { System.out.println("Hexadecimal equivalent: 0111\n"); }
        else if (userHex == '8') { System.out.println("Hexadecimal equivalent: 1000\n"); }
        else if (userHex == '9') { System.out.println("Hexadecimal equivalent: 1001\n"); }
        else if (userHex == 'A') { System.out.println("Hexadecimal equivalent: 1010\n"); }
        else if (userHex == 'B') { System.out.println("Hexadecimal equivalent: 1011\n"); }
        else if (userHex == 'C') { System.out.println("Hexadecimal equivalent: 1100\n"); }
        else if (userHex == 'D') { System.out.println("Hexadecimal equivalent: 1101\n"); }
        else if (userHex == 'E') { System.out.println("Hexadecimal equivalent: 1110\n"); }
        else if (userHex == 'F') { System.out.println("Hexadecimal equivalent: 1111\n"); }
        else { System.out.println("You entered an invalid hexadecimal number\n"); }

        // FOURTH ATTEMPT
        System.out.print("Enter a single-digit hexadecimal number: ");
        userHex = userInputFive.next().charAt(0);
        if (Character.isLowerCase(userHex)) { userHex = Character.toUpperCase(userHex); }
        if (userHex == '0') { System.out.println("0000"); }
        else if (userHex == '1') { System.out.println("Hexadecimal equivalent: 0001\n"); }
        else if (userHex == '2') { System.out.println("Hexadecimal equivalent: 0010\n"); }
        else if (userHex == '3') { System.out.println("Hexadecimal equivalent: 0011\n"); }
        else if (userHex == '4') { System.out.println("Hexadecimal equivalent: 0101\n"); }
        else if (userHex == '5') { System.out.println("Hexadecimal equivalent: 0000\n"); }
        else if (userHex == '6') { System.out.println("Hexadecimal equivalent: 0110\n"); }
        else if (userHex == '7') { System.out.println("Hexadecimal equivalent: 0111\n"); }
        else if (userHex == '8') { System.out.println("Hexadecimal equivalent: 1000\n"); }
        else if (userHex == '9') { System.out.println("Hexadecimal equivalent: 1001\n"); }
        else if (userHex == 'A') { System.out.println("Hexadecimal equivalent: 1010\n"); }
        else if (userHex == 'B') { System.out.println("Hexadecimal equivalent: 1011\n"); }
        else if (userHex == 'C') { System.out.println("Hexadecimal equivalent: 1100\n"); }
        else if (userHex == 'D') { System.out.println("Hexadecimal equivalent: 1101\n"); }
        else if (userHex == 'E') { System.out.println("Hexadecimal equivalent: 1110\n"); }
        else if (userHex == 'F') { System.out.println("Hexadecimal equivalent: 1111\n"); }
        else { System.out.println("You entered an invalid hexadecimal number\n"); }

        // FIFTH ATTEMPT
        System.out.print("Enter a single-digit hexadecimal number: ");
        userHex = userInputFive.next().charAt(0);
        if (Character.isLowerCase(userHex)) { userHex = Character.toUpperCase(userHex); }
        if (userHex == '0') { System.out.println("0000"); }
        else if (userHex == '1') { System.out.println("Hexadecimal equivalent: 0001\n"); }
        else if (userHex == '2') { System.out.println("Hexadecimal equivalent: 0010\n"); }
        else if (userHex == '3') { System.out.println("Hexadecimal equivalent: 0011\n"); }
        else if (userHex == '4') { System.out.println("Hexadecimal equivalent: 0101\n"); }
        else if (userHex == '5') { System.out.println("Hexadecimal equivalent: 0000\n"); }
        else if (userHex == '6') { System.out.println("Hexadecimal equivalent: 0110\n"); }
        else if (userHex == '7') { System.out.println("Hexadecimal equivalent: 0111\n"); }
        else if (userHex == '8') { System.out.println("Hexadecimal equivalent: 1000\n"); }
        else if (userHex == '9') { System.out.println("Hexadecimal equivalent: 1001\n"); }
        else if (userHex == 'A') { System.out.println("Hexadecimal equivalent: 1010\n"); }
        else if (userHex == 'B') { System.out.println("Hexadecimal equivalent: 1011\n"); }
        else if (userHex == 'C') { System.out.println("Hexadecimal equivalent: 1100\n"); }
        else if (userHex == 'D') { System.out.println("Hexadecimal equivalent: 1101\n"); }
        else if (userHex == 'E') { System.out.println("Hexadecimal equivalent: 1110\n"); }
        else if (userHex == 'F') { System.out.println("Hexadecimal equivalent: 1111\n"); }
        else { System.out.println("You entered an invalid hexadecimal number\n"); }
    }
}
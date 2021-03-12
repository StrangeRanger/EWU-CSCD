import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        /* ********************************************************************
         [ Module Wide Variables ]
         ******************************************************************** */
        String RED    = "\033[1;31m";  // String color becomes red
        String DEFCLR = "\033[0m";     // String color gets reset

        /* ********************************************************************
         [ Task 1 ]
         ******************************************************************** */
        Scanner userInput = new Scanner(System.in);
        Random  randomInt = new Random();
        int     userChoice, computerChoice, userScore = 0, computerScore = 0;
        // Dictates the number of wins required for the game to stop
        int scoreToWin = 3;

        System.out.println("\n\n**********************\n* Performing Task 1! *\n"
                           + "**********************");
        System.out.println(
                "You'll be asked to choose rock, paper, or scissors "
                + "in number formed (use key below), until the first player wins 3"
                + " games.");
        System.out.println("Key: 0 = Rock\n     1 = Scissors\n     2 = Paper\n");

        while (userScore < scoreToWin && computerScore < scoreToWin) {
            System.out.print("Enter your choice of rock, paper, scissors: ");
            userChoice     = userInput.nextInt();
            computerChoice = randomInt.nextInt(4);
            System.out.println("Computer choice: " + computerChoice);

            if (userChoice >= 3 || userChoice < 0) {  // Prevents input of >= 3 and < 0
                System.out.printf("%sInvalid input: Enter a number between 0 "
                                          + "and 2%s\n",
                                  RED, DEFCLR);
            } else if (userChoice == computerChoice) {
                System.out.println("Tie!\n");
            } else if ((userChoice == 0 && computerChoice == 1) ||
                       (userChoice == 1 && computerChoice == 2) ||
                       (userChoice == 2 && computerChoice == 0)) {
                System.out.println("User won!\n");
                userScore += 1;
            } else {
                System.out.println("Computer won!\n");
                computerScore += 1;
            }
        }

        System.out.println("\nChampion: " +
                           ((userScore > computerScore) ? "User\n" : "Computer\n"));
        // Adds extra line between next task
        System.out.println("");

        /* ********************************************************************
         [ Task 2]
         ******************************************************************** */
        Scanner userInputTwo = new Scanner(System.in);
        int     sum;

        System.out.println("\n\n**********************\n* Performing Task 2! *\n"
                           + "**********************");
        System.out.println(
                "You'll be asked 5 times to enter 1 to 20 different integers "
                + "(of any negative or positive value, except 0). You will enter "
                + "a single integer per prompt, and can enter a 0 to stop the program"
                +
                " from prompting your input.\nNote: Only whole numbers are accepted\n");

        for (var i = 0; i < 5; i++) {
            int numOfInput = 0;
            sum            = 0;

            System.out.printf("*** Sample run %d ***\n", i + 1);

            while (numOfInput < 20) {
                System.out.printf("Enter integer %d out of 20: ", numOfInput + 1);
                int tempVar = userInputTwo.nextInt();

                if (tempVar == 0) {
                    break;
                } else {
                    sum += tempVar;
                    numOfInput += 1;
                }
            }

            System.out.printf("Sum: %d\nAverage: %f\n\n", sum,
                              ((double) sum / (double) numOfInput));
        }

        // Adds extra line between next task
        System.out.println("");

        /* ********************************************************************
         [ Task 3 ]
         ******************************************************************** */
        Scanner userInputThree = new Scanner(System.in);
        String  hex;
        int     validHex = 0;
        boolean invalidHex;

        System.out.println("\n\n**********************\n* Performing Task 3! *\n"
                           + "**********************");

        while (validHex < 5) {
            invalidHex = false;

            System.out.print("Enter a hexadecimal number: ");
            hex = userInputThree.nextLine();

            if (hex.length() >= 1 && hex.length() <= 5) {
                // Checks if input is valid hexadecimal then converts to decimal
                for (var index = 0; index < hex.length(); index++) {
                    char hexIndex = hex.charAt(index);

                    if (Character.isLowerCase(hexIndex)) {
                        hexIndex = Character.toUpperCase(hexIndex);
                    }
                    if (hexIndex != '0' && hexIndex != '1' && hexIndex != '2' &&
                        hexIndex != '3' && hexIndex != '4' && hexIndex != '5' &&
                        hexIndex != '6' && hexIndex != '7' && hexIndex != '8' &&
                        hexIndex != '9' && hexIndex != 'A' && hexIndex != 'B' &&
                        hexIndex != 'C' && hexIndex != 'D' && hexIndex != 'E' &&
                        hexIndex != 'F' && hexIndex != 'G') {
                        invalidHex = true;
                        System.out.printf("%sInvalid hexadecimal: Enter a valid"
                                                  + " hexadecimal number%s\n",
                                          RED, DEFCLR);
                        break;
                    }
                }

                if (! invalidHex) {
                    validHex++;
                    System.out.println("Hexadecimal in decimal form: " +
                                       Integer.parseInt(hex, 16));
                    System.out.println("");
                }
            } else {
                System.out.printf("%sInvalid input: Enter a total of 1 "
                                          + "to 5 valid hexadecimal numbers%s\n",
                                  RED, DEFCLR);
            }
        }

        /* ********************************************************************
         [ Task 4 ]
         ******************************************************************** */
        String fiveAndSix = "", onlyFiveOrSix = "";
        int    fiveAndSixLineCount = 1, onlyFiveOrSixLineCount = 1;

        System.out.println("\n\n**********************\n* Performing Task 4! *\n"
                           + "**********************");

        for (var integerCount = 100; integerCount <= 1000; integerCount++) {
            if (integerCount % 5 == 0 && integerCount % 6 == 0) {
                if (fiveAndSixLineCount % 10 == 0) {
                    fiveAndSix += (integerCount + "\n");
                } else {
                    fiveAndSix += (integerCount + " ");
                }

                fiveAndSixLineCount += 1;
            } else if (integerCount % 5 == 0 || integerCount % 6 == 0) {
                if (onlyFiveOrSixLineCount % 10 == 0) {
                    onlyFiveOrSix += (integerCount + "\n");
                } else {
                    onlyFiveOrSix += (integerCount + " ");
                }

                onlyFiveOrSixLineCount += 1;
            }
        }

        System.out.println("Integers between 100 and 1,000 that are divisible "
                           + "by both 5 and 6:\n" + fiveAndSix);
        System.out.println("\nIntegers between 100 and 1,000 that are divisible "
                           + "by either 5 or 6, but not both:\n" + onlyFiveOrSix);

        /* ********************************************************************
         [ Task 5 ]
         ******************************************************************** */
        Scanner userInputFive = new Scanner(System.in);
        int     normalNumber;

        System.out.println("\n\n**********************\n* Performing Task 5! *\n"
                           + "**********************");

        for (int i = 0; i < 5; i++) {
            System.out.printf("*** Sample run %d ***\n", i + 1);
            while (true) {
                try {
                    System.out.print("Enter an integer: ");
                    normalNumber = Integer.parseInt(userInputFive.nextLine());

                    if (normalNumber < 0) {
                        System.out.printf("%sInvalid input: Negative numbers are"
                                                  + " not accepted input%s\n",
                                          RED, DEFCLR);
                        continue;
                    }
                } catch (Exception e) {
                    System.out.printf(
                            "%sError: An exception occurred\nMake sure "
                                    +
                                    "your input has no more than 10 digits and consists "
                                    + "of only numbers%s\n",
                            RED, DEFCLR);
                    continue;
                }
                break;
            }
            reverse(normalNumber);
        }

        // Adds extra line between next task
        System.out.println("");
        System.out.println(
                "In response to: (State briefly how your program treats "
                + "trailing 0’s, such as in input 10000.)\nI have no idea what you "
                + "mean. It is treated exactly the same as any of the other numbers. "
                + "It's shifted to it's needed location.");
    }

    public static void reverse(int number) {
        String reverseNumber = "";
        char   digit;
        // Convert number to a String because it's easier to reverse the given
        // input if variable is a string
        String numberString = Integer.toString(number);

        for (int index = 0; index < numberString.length(); index++) {
            digit = numberString.charAt(numberString.length() - (index + 1));
            reverseNumber += digit;
        }

        System.out.println(reverseNumber + "\n");
    }
}

import java.lang.module.FindException;
import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        /* [ Task 1 ]**************************************************************** */

        Scanner userInput = new Scanner(System.in);
        int     year;
        String  month;

        System.out.println("**********************\n* Performing Task 1! *\n"
                           + "**********************");
        System.out.println("Possible years: 1900-2100\nPossible months: Jan, "
                           + "Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("*** Sample run %d ***\n", i + 1);

            while (true) {
                System.out.print("Enter a year: ");
                // Reading the complete line for the integer and converting it to an
                // integer.
                year = Integer.parseInt(userInput.nextLine());

                if (year < 1900 || year > 2100) {
                    // Output is printed in red.
                    System.out.printf("%sInvalid year: Enter a year between 1900 "
                                              + "and 2100%s\n",
                                      "\033[1;31m", "\033[0m");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter a month: ");
                month = userInput.nextLine().toLowerCase();
                switch (month) {
                    case "jan":
                        System.out.println("There are 31 days in January of " + year +
                                           "\n");
                        break;
                    case "feb":
                        int day;

                        // Detects if it's a leap year
                        // Source:
                        // https://www.programiz.com/java-programming/examples/leap-year
                        if (year % 4 == 0) {
                            if (year % 100 == 0) {
                                if (year % 400 == 0) {
                                    day = 29;
                                } else {
                                    day = 28;
                                }
                            } else {
                                day = 29;
                            }
                        } else {
                            day = 28;
                        }

                        System.out.println("There are " + day + " days in February " +
                                           year + "\n");
                        break;
                    case "mar":
                        System.out.println("There are 31 days in March of " + year +
                                           "\n");
                        break;
                    case "apr":
                        System.out.println("There are 30 days in April of " + year +
                                           "\n");
                        break;
                    case "may":
                        System.out.println("There are 31 days in May of " + year +
                                           "\n");
                        break;
                    case "jun":
                        System.out.println("There are 30 days in June of " + year +
                                           "\n");
                        break;
                    case "jul":
                        System.out.println("There are 31 days in July of " + year +
                                           "\n");
                        break;
                    case "aug":
                        System.out.println("There are 31 days in August of " + year +
                                           "\n");
                        break;
                    case "sep":
                        System.out.println("There are 30 days in September of " + year +
                                           "\n");
                        break;
                    case "oct":
                        System.out.println("There are 31 days in October of " + year +
                                           "\n");
                        break;
                    case "nov":
                        System.out.println("There are 30 days in November of " + year +
                                           "\n");
                        break;
                    case "dec":
                        System.out.println("There are 31 days in December of " + year +
                                           "\n");
                        break;
                    default:
                        // Output is printed in red.
                        System.out.printf(
                                "%sInvalid month: Enter one of the possible "
                                        + "months displayed in the list above%s\n",
                                "\033[1;31m", "\033[0m");
                        continue;
                }
                break;
            }
        }

        // Adds extra line between next task.
        System.out.println();

        /* [ Task 2 ]**************************************************************** */

        Scanner userInputTwo = new Scanner(System.in);
        String  city1, city2, city3, temp;

        System.out.println("**********************\n* Performing Task 2! *\n"
                           + "**********************");

        for (int i = 0; i < 5; i++) {
            System.out.printf("*** Sample run %d ***\n", i + 1);
            System.out.print("Enter first city: ");
            city1 = userInputTwo.nextLine();
            System.out.print("Enter second city: ");
            city2 = userInputTwo.nextLine();
            System.out.print("Enter third city: ");
            city3 = userInputTwo.nextLine();

            // Ignores case, because a different ascii number would be used, for
            // example, 'S' and 's', making it possible for inaccurate output to occur.
            if ((city2.compareToIgnoreCase(city1) < 0) &&
                (city2.compareToIgnoreCase(city3) < 0)) {
                temp  = city1;
                city1 = city2;
                city2 = temp;
            } else if ((city3.compareToIgnoreCase(city1) < 0) &&
                       (city3.compareToIgnoreCase(city2) < 0)) {
                temp  = city1;
                city1 = city3;
                city3 = temp;
            }
            if (city3.compareToIgnoreCase(city2) < 0) {
                temp  = city2;
                city2 = city3;
                city3 = temp;
            }

            System.out.printf("Cities in ascending order: %s < %s < %s\n\n", city1,
                              city2, city3);
        }

        // Adds extra line between next task.
        System.out.println("");

        /* [ Task 3 ]**************************************************************** */

        int numberOfPrime = 0;
        System.out.println("**********************\n* Performing Task 3! *\n"
                           + "**********************");

        for (int number = 2; number < 1000; number++) {
            boolean isPrime = true;
            // Identifies prime numbers.
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                numberOfPrime++;

                // Prints a new line after 8 numbers are printed to a line.
                if (numberOfPrime % 8 == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }

        // Adds extra line between next task.
        System.out.println();

        /* [ Task 4 ]**************************************************************** */

        Scanner userInputFour = new Scanner(System.in);
        String  string, stringLowerCase;
        int     vowel, consonant;
        char    letter;

        System.out.println("**********************\n* Performing Task 4! *\n"
                           + "**********************");
        System.out.println("Note: 'y' will not be counted as a vowel\n");

        for (int i = 0; i < 5; i++) {
            vowel     = 0;
            consonant = 0;

            System.out.printf("*** Sample run %d ***\n", i + 1);
            System.out.print("Enter a string: ");
            string          = userInputFour.nextLine();
            stringLowerCase = string.toLowerCase();

            for (int index = 0; index < string.length(); index++) {
                letter = stringLowerCase.charAt(index);

                // Didn't include y because I feel like that would have made things
                // more complicated (that of which I usually do to myself).
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||
                    letter == 'u') {
                    vowel++;
                } else if (letter == 'b' || letter == 'c' || letter == 'd' ||
                           letter == 'f' || letter == 'g' || letter == 'h' ||
                           letter == 'j' || letter == 'k' || letter == 'l' ||
                           letter == 'm' || letter == 'n' || letter == 'p' ||
                           letter == 'q' || letter == 'r' || letter == 's' ||
                           letter == 't' || letter == 'v' || letter == 'w' ||
                           letter == 'x' || letter == 'y' || letter == 'z') {
                    consonant++;
                }
            }

            System.out.printf("Vowels: %d\nConsonants: %d\n\n", vowel, consonant);
        }

        // Adds extra line between next task.
        System.out.println();

        /* [ Task 5 ]**************************************************************** */

        Scanner userInputFive = new Scanner(System.in);
        String  normalString, reverseString;
        // 'letter' is already declared.

        System.out.println("**********************\n* Performing Task 5! *\n"
                           + "**********************");

        for (int i = 0; i < 5; i++) {
            reverseString = "";

            System.out.printf("*** Sample run %d ***\n", i + 1);
            System.out.print("Enter a string: ");
            normalString = userInputFive.nextLine();

            for (int index = 0; index < normalString.length(); index++) {
                letter = normalString.charAt(normalString.length() - (index + 1));
                reverseString = reverseString + letter;
            }

            System.out.println("String in reverse: " + reverseString + "\n");
        }
    }
}

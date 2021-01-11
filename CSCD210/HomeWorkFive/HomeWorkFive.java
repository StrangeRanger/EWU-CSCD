import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HomeWorkFive{
    public static void main(String[] args) {
        /* ********************************************************************
         [ Module Wide Variables ]
         ******************************************************************** */
        String RED = "\033[1;31m";  // String color becomes red
        String DEFCLR = "\033[0m";  // String color gets reset


        /* ********************************************************************
         [ Task 1 ]
         ******************************************************************** */
        /**
         * I am too tired and exhausted after working on the final for about 3
         * days straight. I'm fine with taking the Lose on this task.
         */
        System.out.println("**********************\n* Performing Task 1! *\n" +
                "**********************");
        System.out.println("I am too tired and exhausted after working on the " +
                "final for about 3 days straight. I'm fine with taking the " +
                "Lose on this task.\n");



        /* ********************************************************************
         [ Task 2 ]
         ******************************************************************** */
        Scanner userInputTwo = new Scanner(System.in);
        int nByN;

        System.out.println("**********************\n* Performing Task 2! *\n" +
                "**********************");

        for (var i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Enter an integer: ");
                    nByN = Integer.parseInt(userInputTwo.nextLine());

                    if (nByN < 1 || nByN > 20) {
                        System.out.printf("%sInvalid input: Enter an integer " +
                                "between 1 and 20%s\n", RED, DEFCLR);
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.printf("%sInvalid input: Enter an integer " +
                            "between 1 and 20%s\n", RED, DEFCLR);
                }
            }
            printMatrix(nByN);
        }


        /* ********************************************************************
         [ Task 3 ]
         ******************************************************************** */
        /**
         * I am too tired and exhausted after working on the final for about 3
         * days straight. I'm fine with taking the Lose on this task.
         */
        System.out.println("**********************\n* Performing Task 3! *\n" +
                "**********************");
        System.out.println("I am too tired and exhausted after working on the " +
                "final for about 3 days straight. I'm fine with taking the " +
                "Lose on this task.\n");


        /* ********************************************************************
         [ Task 4 ]
         ******************************************************************** */
        Random randInt = new Random();
        // Each index represents it's corresponding number/place value
        int[] zeroToNineCounter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int randNum;

        System.out.println("**********************\n* Performing Task 4! *\n" +
                "**********************");

        for (var i = 0; i < 100; i++) {
            randNum = randInt.nextInt(10);
            zeroToNineCounter[randNum] += 1;
        }

        for (var i = 0; i < 10; i++) {
            System.out.printf("There are %d %ds\n", zeroToNineCounter[i], i);
        }

        System.out.println("");


        /* ********************************************************************
         [ Task 5 ]
         ******************************************************************** */
        /**
         * I am too tired and exhausted after working on the final for about 3
         * days straight. I'm fine with taking the Lose on this task.
         */
        System.out.println("**********************\n* Performing Task 5! *\n" +
                "**********************");
        System.out.println("I am too tired and exhausted after working on the " +
                "final for about 3 days straight. I'm fine with taking the " +
                "Lose on this task.");
    }

    // Used in Task 2
    public static void printMatrix(int n) {
        Random randInt = new Random();
        StringBuilder outPut = new StringBuilder();
        int randNum;

        for (var column = 0; column < n; column++) {
            for (var row = 0; row < n; row++) {
                randNum = randInt.nextInt(3);

                if ((row + 1) % n == 0) {
                    outPut.append(randNum).append("\n");
                } else {
                    outPut.append(randNum).append(" ");
                }
            }
        }
        System.out.println(outPut);
    }
}
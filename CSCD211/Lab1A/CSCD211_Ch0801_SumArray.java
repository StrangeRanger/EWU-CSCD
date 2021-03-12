// *************************************************************************************
//
// Name:         Hunter T.
// Date:         January 12, 2021
// Class:        CSCD 211
// Descriptions: Takes the given input and finds the sum of each row of numbers.
//
// *************************************************************************************

import java.util.Scanner;

public class CSCD211_Ch0801_SumArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[][] m      = new double[3][4];

        System.out.println("Enter " + m.length + " rows and " + m[0].length
                           + " columns: ");

        // Updates 'm' based on input.
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = userInput.nextInt();
            }
        }

        // Displays the sum of each row.
        for (int i = 0; i < m.length; i++) {
            System.out.print("\nSum of the elements at column " + (i + 1) + " is "
                             + sumColumn(m, i));
        }
    }

    /**
     * Finds the sum from a given row.
     *
     * @param m           The array containing the user input.
     * @param columnIndex Which column to find the sum of.
     * @return double     The sum of a given row.
     */
    public static double sumColumn(double[][] m, int columnIndex) {
        double total = 0;
        for (int column = 0; column < m[columnIndex].length; column++) {
            total += m[columnIndex][column];
        }
        return total;
    }
}

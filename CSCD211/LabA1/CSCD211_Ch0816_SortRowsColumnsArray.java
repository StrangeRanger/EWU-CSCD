/******************************************************************************
 *
 * Name:         Hunter T.
 * Date:         January 12, 2021
 * Class:        CSCD 211
 * Descriptions:
 * Notes:        This program only works with an array with a row of 2 and a
 *               column of x.
 *
 ******************************************************************************/

import java.util.Arrays;

public class CSCD211_Ch0816_SortRowsColumnsArray {
    public static void main(String[] args) {
        int[][] myArray = {{2,4},{1,7},{1,2},{1,1},{4,5},{4,2},{4,1},{5,4}};

        sort(myArray);
    }

    public static void sort(int[][] m) {
        /**
         * lsdjf
         *
         * Parameters
         * ----------
         *  m : int[][]
         *      Given array
         *
         *  Returns
         *  -------
         *  None
         */
        int maxZero = maxNumber(m, 0);

        for (int i = 0; i <= maxZero; i++) {
            int[] tmpArray;
            // Once a match between i and m[j][0] has been found, the necessary
            // indexes are swapped, then the last for loop is broken to reset the
            // program at the next 'indexLocation'
            for (int indexLocation = 0; indexLocation < m.length; indexLocation++) {
                for (int j = 0; j < m.length; j++) {
                    if (m[j][0] == i) {
                        tmpArray = m[indexLocation];
                        m[indexLocation] = m[j];
                        m[j] = tmpArray;
                        break;
                    }
                }
            }
        }
        /*for (int i = 0; i < m.length; i++) {
            int currentMin = m[i][0];
            for (int j = i; j < m.length; j++) {
                if (currentMin > m[j][0] || currentMin == m[j][0] && m[currentMin][1] > m[j][1]) {
                    System.out.println(Arrays.deepToString(m));
                }
            }
        }*/

        System.out.println(Arrays.deepToString(m));
    }

    public static int maxNumber(int[][] customArray, int indexNumber) {
        /**
         * Returns the greatest number in a given array at index int[i][0]
         *
         * Parameters
         * ----------
         * customArray : int[][]
         *     A single array with a set of values
         *
         * Returns
         * -------
         * max : int
         */
        int[] myArrayFirstColumn = new int[customArray.length];
        int max = 0;

        for (int i = 0; i < customArray.length; i++) {
            myArrayFirstColumn[i] = customArray[i][indexNumber];
        }

        for (int i = 0; i < myArrayFirstColumn.length; i++) {
            if (myArrayFirstColumn[i] > max) {
                max = myArrayFirstColumn[i];
            }
        }

        return max;
    }
}

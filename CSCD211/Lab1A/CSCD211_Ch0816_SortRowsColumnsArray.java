// *************************************************************************************
//
// Name:         Hunter T.
// Date:         January 12, 2021
// Class:        CSCD 211
// Descriptions: Takes a given array and performs a primary and secondary sort.
// Notes:        This program only works with an array with a row of 2 and a column of
//               x.
//
// *************************************************************************************

import java.util.Arrays;

public class CSCD211_Ch0816_SortRowsColumnsArray {
    public static void main(String[] args) {
        int[][] myArray = {
                {4, 5},
                {2, 4},
                {1, 7},
                {1, 2},
                {1, 1},
                {5, 2},
                {4, 2},
                {4, 1},
                {5, 4},
        };

        sort(myArray);
    }

    /**
     * Does a primary and secondary sort on a given array.
     *
     * @param m Given array.
     */
    public static void sort(int[][] m) {
        for (int primaryIndex = 0; primaryIndex < m.length; primaryIndex++) {
            int minZero = m[primaryIndex][0];
            int minOne  = m[primaryIndex][1];
            // 'minIndex' represents the index at m[j][] that will swap places
            // with the data at index m[primaryIndex][].
            int minIndex = 0;
            int[] tmpInt;

            // Identifies the minimum number at index m[j][0]
            for (int j = primaryIndex; j < m.length; j++) {
                if (minZero > m[j][0]) {
                    minZero  = m[j][0];
                    minIndex = j;
                }
            }

            // Identifies the minimum number at index m[minZero][1].
            for (int j = primaryIndex; j < m.length; j++) {
                if (m[j][0] == minZero) {
                    if (minOne > m[j][1]) {
                        minOne   = m[j][1];
                        minIndex = j;
                    }
                }
            }

            // Is zero if the index already where it belongs.
            if (minIndex != 0) {
                tmpInt          = m[primaryIndex];
                m[primaryIndex] = m[minIndex];
                m[minIndex]     = tmpInt;
            }

            // Uncomment code below for help debugging
            /*System.out.println("Primary index at m[X][]: " + primaryIndex
                               + "\nMinimum index at m[X][0]: " + minZero + "\nMinimum "
                               + "index at m[X][1]: " + minOne
                               + "\nSwap index at m[X][]: " + minIndex);
            System.out.println(Arrays.deepToString(m));
            System.out.println("");*/
        }

        System.out.println(Arrays.deepToString(m));
    }
}

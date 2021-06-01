// *************************************************************************************
//
// Name:         Hunter T.
// Date:         January 12, 2021
// Class:        CSCD 211
// Descriptions: Takes the number of hours worked by a set a of employees during the
//               single week, then lists the employees from the greatest number of hours
//               worked, to least number of hours worked.
// Notes:        Compared to the 'SortStudentsArray' program, I did this one a bit
//               different. To make a long explanation short, I didn't modify the array
//               directly, rather just read the data in 'totalHoursWorked' and so on and
//               so forth...
//
// *************************************************************************************

public class CSCD211_Ch0804_WeeklyHoursArray {
    public static void main(String[] args) {
        int[][] hoursWorked = {
                {2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9},
        };
        // Stores the accumulative hours worked by each employee.
        int[] totalHoursWorked = new int[hoursWorked.length];

        // Calculates the total hours worked by each employee, then stores the total in
        // 'totalHoursWorked'.
        for (int i = 0; i < hoursWorked.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < hoursWorked[i].length; j++) {
                totalHours += hoursWorked[i][j];
            }
            totalHoursWorked[i] = totalHours;
        }

        // Lists employees from most amount of hours worked to least hours worked.
        for (int totalHours = maxNumber(totalHoursWorked); totalHours >= 0;
             totalHours--) {
            for (int employee = 0; employee < totalHoursWorked.length; employee++) {
                if (totalHoursWorked[employee] == totalHours) {
                    System.out.println("Employee " + employee + "'s total "
                                       + "hours worked is " + totalHours);
                }
            }
        }
    }

    /**
     * Returns the greatest number in the given array.
     *
     * @param customArray A single array with a set of values.
     * @return int        The greatest number in the given array.
     */
    public static int maxNumber(int[] customArray) {
        int max = 0;
        for (int i = 0; i < customArray.length; i++) {
            if (customArray[i] > max) { max = customArray[i]; }
        }
        return max;
    }
}

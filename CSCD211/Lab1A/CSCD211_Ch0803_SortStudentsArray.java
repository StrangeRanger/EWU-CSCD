// *************************************************************************************
//
// Name:         Hunter T.
// Date:         January 12, 2021
// Class:        CSCD 211
// Descriptions: Calculates the number of correct answer for each student, then lists
//               the students from least number of correct answers to greatest number of
//               correct answers.
//
// *************************************************************************************

public class CSCD211_Ch0803_SortStudentsArray {
    public static void main(String[] args) {
        // Students' answers to the questions.
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };
        // Stores each student's total correct answers.
        int[] totalCorrectAnswers = new int[answers.length];
        // Array representing current index locations of all data inside
        // 'totalCorrectAnswers'.
        int[] indexList           = new int[answers.length];
        // Key to the questions.
        char[] keys               = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Generates array for 'indexList'.
        for (int i = 0; i < answers.length; i++) { indexList[i] = i; }

        // Grades answers.
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    // Adds the correct number of answers to 'totalCorrectAnswers'.
                    totalCorrectAnswers[i]++;
                }
            }
        }

        // Note: I would have placed this in a method, but it's not easily possible to
        // return two variables.
        for (int i = 0; i < totalCorrectAnswers.length; i++) {
            int minInt      = totalCorrectAnswers[i];
            int minIntIndex = i;
            for (int j = i; j < totalCorrectAnswers.length; j++) {
                if (minInt > totalCorrectAnswers[j]) {
                    minInt      = totalCorrectAnswers[j];
                    minIntIndex = j;
                }
            }

            // Sorts 'totalCorrectAnswers'.
            int tmpInt                       = totalCorrectAnswers[i];
            totalCorrectAnswers[i]           = totalCorrectAnswers[minIntIndex];
            totalCorrectAnswers[minIntIndex] = tmpInt;

            // Sorts 'indexList' to match up with 'totalCorrectAnswers'.
            tmpInt                 = indexList[i];
            indexList[i]           = indexList[minIntIndex];
            indexList[minIntIndex] = tmpInt;
        }

        // Prints out results.
        for (int i = 0; i < totalCorrectAnswers.length; i++) {
            System.out.println("Student " + indexList[i] + "'s correct "
                               + "count is " + totalCorrectAnswers[i]);
        }
    }
}

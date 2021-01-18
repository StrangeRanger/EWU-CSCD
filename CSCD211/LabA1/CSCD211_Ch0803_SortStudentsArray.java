/******************************************************************************
 *
 * Name:         Hunter T.
 * Date:         January 12, 2021
 * Class:        CSCD 211
 * Descriptions: Calculates the number of correct answer for each student, then
 *               lists the students from least number of correct answers to
 *               greatest number of correct answers.
 *
 ******************************************************************************/


public class CSCD211_Ch0803_SortStudentsArray {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        // Stores each student's total correct answers
        int[] totalCorrectAnswers = new int[answers.length];
        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    // Adds the correct number of answers to
                    // 'totalCorrectAnswers'
                    totalCorrectAnswers[i]++;
                }
            }
        }

        // Lists the students from least number of correct answers, to greatest
        // number of correct answers
        for (int correct = 0; correct <= totalCorrectAnswers.length; correct++) {
            for (int student = 0; student < totalCorrectAnswers.length; student++) {
                if (totalCorrectAnswers[student] == correct) {
                    System.out.println("Student " + student + "'s correct " +
                            "count is " + correct);
                }
            }
        }
    }
}

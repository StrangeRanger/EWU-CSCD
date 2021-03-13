#include <ctype.h>
#include <stdio.h>
#define MAXROWS 100
#define NUM_ALPHABETS 26

int main() {
    int  count, i, j;
    char sentence[MAXROWS];
    char alphabets[]
            = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
               'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int frequency[NUM_ALPHABETS];

    // Step 1: Write a function that reads a sentence from the keyboard (2 pts)
    printf("Enter a sentence of your choosing:\n");
    fgets(sentence, sizeof(sentence), stdin);

    // Step 2: Find out the frequency of the alphabets  in the sentence, ignore
    // uppercase or lowercase in the sentence (4 pts)
    for (i = 0; i < NUM_ALPHABETS; i++) {
        count = 0;
        // '\0' being NULL char
        for (j = 0; sentence[j] != '\0'; j++) {
            /*
             * PLEASE HELP ME UNDERSTAND
             *
             * If I use the commented for statement instead of the one above,
             * there are times where the frequency and histogram display false
             * output. Say I ran the program 5 times, and every time it was run,
             * I ALWAYS AND ONLY entered the letter, being 't'. There are times where
             * the frequency and histogram output display information that indicates
             * more letters where entered, than that single letter 't'. Why?
             */
            // for (j = 0; j < sizeof(sentence)/sizeof(sentence[0]); j++) {
            if (alphabets[i] == toupper(sentence[j])) {
                count++;
            }
        }
        frequency[i] = count;
    }

    // Step 3: Print the histogram as shown in the screenshot (4 pts)
    printf("Alphabets            Frequency            Histogram\n");
    for (i = 0; i < NUM_ALPHABETS; i++) {
        printf("    %c                    %d                 ", alphabets[i],
               frequency[i]);
        for (j = 0; j < frequency[i]; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

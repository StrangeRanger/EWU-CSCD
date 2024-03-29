#include <ctype.h>
#include <stdio.h>

#define MAXROWS       100
#define NUM_ALPHABETS 26

int main() {
    int  count, i, j;
    int  frequency[NUM_ALPHABETS];
    char sentence[MAXROWS];
    char alphabets[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    // Step 1: Write a function that reads a sentence from the keyboard (2 pts)
    printf("Enter a sentence of your choosing:\n");
    fgets(sentence, sizeof(sentence), stdin);

    // Step 2: Find out the frequency of the alphabets in the sentence, ignore
    //         uppercase or lowercase in the sentence (4 pts)
    for (i = 0; i < NUM_ALPHABETS; i++) {
        count = 0;
        for (j = 0; sentence[j] != '\0'; j++) {
            if (toupper(sentence[j]) == alphabets[i]) {
                count += 1;
            }
        }
        frequency[i] = count;
    }

    // Step 3: Print the histogram as shown in the screenshot (4 pts)
    printf("Alphabets          Frequency              Histogram\n");
    for (i = 0; i < NUM_ALPHABETS; i++) {
        printf("    %c                %d                      ", alphabets[i],
               frequency[i]);
        for (j = 0; j < frequency[i]; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

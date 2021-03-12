#include <ctype.h>
#include <stdio.h>
#define MAXSIZE 100

int main() {
    char ch;
    int  i;
    char sentence[MAXSIZE];
    int  alphabetsCount = 0;

    printf("Type a sentence: ");
    fgets(sentence, sizeof(sentence), stdin);

    printf("Type a character that you'd like to find the number of occurrences"
           " in a sentence: ");
    scanf(" %c", &ch);

    for (i = 0; sentence[i] != '\n'; i++)
        if (sentence[i] == toupper(ch) || sentence[i] == tolower(ch)) {
            alphabetsCount++;
        }
    printf("Character '%c' has a frequency of %d\n", ch, alphabetsCount);
}

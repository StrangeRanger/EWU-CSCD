#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void printString(char *s[], int count);
void swap(char **s, char **t);
void sortString(char *s[], int count);

int main() {
    char buff[BUFSIZ];
    int  count;
    // 's' is a pointer to a char pointer, initially 's' is allocated storage for one
    // char pointer
    char **s = malloc(sizeof(char *));

    printf("Here is the list of unsorted names:\n\n");

    // Keep on reading unlimited number of names until EOF (Ctrl + D) is reached
    for (count = 0; fgets(buff, sizeof(buff), stdin); count++) {
        // Step 1: Allocate sufficient storage for s[count] to store the content in buff
        // plus one byte for '\0'
        s[count] = malloc(strlen(buff) + 1);
        // Step 2: Copy the contents of 'buff' to 's[count]'
        strcpy(s[count], buff);
        // Step 3: resize the array of pointers pointed to by 's' to increase its size
        // for the next pointer
        s = realloc(s, sizeof(char *) * (count + 2));
    }
    // EOF reached. Now count the number of strings read

    // Display number of strings
    printf("\nCount is %d\n\n", count);

    // Now sort string using sortString function
    // Step 4: Implement sortString function for the above-mentioned function
    // declaration sortString(s, count);
    sortString(s, count);
    // Step 5: Print the list of sorted names.
    printString(s, count);
    // Step 6: Free the allocated memory.
    free(s);
    return 0;
}

void printString(char *s[], int count) {
    int i;
    for (i = 0; i < count; i++) {
        printf("%s", s[i]);
    }
    printf("\n");
}

void swap(char **s, char **t) {
    char *tmp;
    tmp = *s;
    *s  = *t;
    *t  = tmp;
}

void sortString(char *s[], int count) {
    int i, j;
    for (i = 0; i < count - 1; i++) {
        for (j = 0; j < count - 1; j++) {
            if (strcmp(s[j], s[j + 1]) > 0) {
                swap(&s[j], &s[j + 1]);
            }
        }
    }
}

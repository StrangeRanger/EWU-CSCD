#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int countString(const char *fileName, char *str) {
    int  word_count = 0;
    char buff[100];

    // insert your code here!
    FILE *file;
    file = fopen(fileName, "r");

    if (file == NULL) {
        perror("Error opening 'poem.txt' ");
        exit(1);
    }

    while (fscanf(file, "%s", buff) != -1) {
        // Convert buff to lowercase
        for (int i = 0; i < strlen(buff); i++) {
            buff[i] = tolower(buff[i]);
        }
        // Convert str to lowercase
        for (int i = 0; i < strlen(str); i++) {
            str[i] = tolower(str[i]);
        }

        if (strstr(buff, str)) {
            word_count += 1;
        }
    }

    return word_count;
}

int countEmptyLines(const char *fileName) {
    int  emptyLine = 0;
    char buff[100];

    // Insert your code here!
    FILE *file;
    if ((file = fopen(fileName, "r")) == NULL) {
        perror("Error opening 'poem.txt' ");
        exit(1);
    }

    while (fgets(buff, sizeof(buff), file) != NULL) {
        for (int i = 0; i < strlen(buff); i++) {
            // I couldn't figure out any other way than this way
            if (strlen(buff) <= 1) {
                emptyLine++;
            }
        }
    }

    return emptyLine;
}

int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("Incorrect Parameters.\n");
        exit(0);
    }

    int word_count = countString(argv[1], argv[2]);
    int empty_line = countEmptyLines(argv[1]);

    printf("The string \"%s\" occurs %d times in File \"%s\".\n", argv[2], word_count,
           argv[1]);
    printf("File \"%s\" has %d empty lines.\n", argv[1], empty_line);

    return 0;
}

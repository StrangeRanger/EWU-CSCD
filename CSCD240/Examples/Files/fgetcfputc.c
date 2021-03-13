#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
    FILE *f1, *f2;
    int   c;

    if (argc != 3) {
        printf("Incorrect parameters: Usage Progname <Source> <Destination>");
        exit(0);
    }
    f1 = fopen(argv[1], "r");
    f2 = fopen(argv[2], "w");

    if ((f1 == NULL) || (f2 == NULL)) {
        perror("Cannot open  files ...");
        exit(EXIT_FAILURE);
    }
    do {
        c = fgetc(f1);
        if (islower(c))
            c = toupper(c);
        else if (isupper(c))
            c = tolower(c);
        else if (c == ' ')
            c = '_';

    } while (c != EOF && fputc(c, f2) != EOF);

    fclose(f1);
    fclose(f2);
    return 0;
}
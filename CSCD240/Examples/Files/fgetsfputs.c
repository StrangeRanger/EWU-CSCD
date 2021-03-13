#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
    FILE *f1, *f2;
    char  array[256];
    if (argc != 3) {
        printf("Error: Usage Copy <pathlist 1> <pathlist 2>\n");
        exit(0);
    }
    printf("Copying '%s' to '%s' ...\n", argv[1], argv[2]);
    f1 = fopen(argv[1], "r");
    f2 = fopen(argv[2], "w");

    if ((f1 == NULL) || (f2 == NULL))
        exit(0);
    while ((fgets(array, sizeof(array), f1)) != NULL)
        fputs(array, f2);

    fclose(f1);
    fclose(f2);
    return 0;
}

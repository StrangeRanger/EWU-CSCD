#include <stdio.h>

int main(void) {
    FILE *f1;
    f1 = fopen("joe.txt", "r");

    if (f1 == NULL) {
        perror("Canot open file for reading:");
        return 0;
    }
    fclose(f1);

    return 0;
}

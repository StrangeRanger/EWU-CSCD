#include <stdio.h>
int main() {
    FILE *ptr;
    if ((ptr = fopen("abc.txt", "r")) == NULL) {
        perror("Error opening 'abc.txt' ");
        return 0;
    }
    char buf[100];

    while (fscanf(ptr, "%s", buf) == 1)
        printf("%s\n", buf);

    fclose(ptr);
    return 0;
}

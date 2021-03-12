#include <stdio.h>
#include <stdlib.h>

int main() {
    int*   p1;
    double average;
    double sum = 0.0;
    int    i   = 0, j, data;
    p1         = malloc(sizeof(int));

    while (scanf("%d", &data) == 1) {
        p1[i] = data;

        sum += p1[i];
        i++;
        average = sum / i;
        printf("The average value is: %f\n", average);
        p1 = realloc(p1, sizeof(int) * (i + 1));
    }

    return 0;
}

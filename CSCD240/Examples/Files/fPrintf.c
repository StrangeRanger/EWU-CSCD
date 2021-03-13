#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE*  f1;
    double degree = 30;

    if ((f1 = fopen("sine.dat", "w")) == NULL) {
        exit(EXIT_FAILURE);
    }

    fprintf(f1, "Sine of %f radians = %f\n", degree, sin(degree * M_PI / 180));
    fclose(f1);

    return 0;
}

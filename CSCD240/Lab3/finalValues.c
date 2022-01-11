#include <stdio.h>

int main() {
    int    a    = 3;
    int    b    = 4;
    double c    = ++a + b++;
    size_t size = sizeof(c / a);

    printf("Value of a: %d\n", a);
    printf("Value of b: %d\n", b);
    printf("Value of c: %lf\n", c);
    printf("Value of size: %lu\n", size);
}

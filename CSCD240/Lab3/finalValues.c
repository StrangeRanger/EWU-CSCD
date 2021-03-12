#include <stdio.h>

int main() {
    int    a    = 3;
    int    b    = 4;
    double c    = ++a + b++;
    size_t size = sizeof(c / a);

    printf("Size of a: %d\n", a);
    printf("Size of b: %d\n", b);
    printf("Size of c: %lf\n", c);
    printf("Size of size: %zu\n", size);
}
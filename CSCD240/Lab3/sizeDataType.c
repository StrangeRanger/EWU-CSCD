#include <stdio.h>

int main() {
    short       shortVar;
    int         intVar;
    char        charVar;
    double      doubleVar;
    long        longVar;
    long double longDoubleVar;

    printf("Size of data type short: %lu\n", sizeof(shortVar));
    printf("Size of data type int: %lu\n", sizeof(intVar));
    printf("Size of data type char: %lu\n", sizeof(charVar));
    printf("Size of data type double: %lu\n", sizeof(doubleVar));
    printf("Size of data type long: %lu\n", sizeof(longVar));
    printf("Size of data type long double: %lu\n", sizeof(longDoubleVar));

    printf("%d\n", sizeof(short) < sizeof(int));
    printf("%d\n", sizeof(char) < sizeof(short));
    printf("%d\n", sizeof(long) > sizeof(int));
    printf("%d\n", sizeof(long double) > sizeof(double));
}
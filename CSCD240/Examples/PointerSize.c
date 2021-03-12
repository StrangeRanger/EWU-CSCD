#include <stdio.h>

int main() {
    int  v = 3;
    int* p = &v;

    double* q;
    char*   r;
    float*  s;

    printf("Size of integer pointer 'p' is: %zu\n", sizeof(int*));
    printf("Size of double pointer 'q' is: %zu\n", sizeof(double*));
    printf("Size of float pointer 's' is: %zu\n", sizeof(float*));
    printf("Size of char pointer 'r' is: %zu\n", sizeof(char*));

    printf("Size of integer pointer 'p' is: %zu\n", sizeof(p));
    printf("Size of double pointer 'q' is: %zu\n", sizeof(q));
    printf("Size of float pointer 's' is: %zu\n", sizeof(s));
    printf("Size of char pointer 'r' is: %zu\n", sizeof(r));

    printf("Scalar value of an int pointer 'p' is: %zu\n", sizeof(*p));
    printf("Scalar value of an int pointer 'p' is: %zu\n", sizeof(int));
    printf("Scalar value of an int pointer 'p' is: %zu\n", sizeof(v));

    printf("Scalar value of a double pointer 'q' is: %zu\n", sizeof(*q));
    printf("Scalar value of a double pointer 'q' is: %zu\n", sizeof(double));

    printf("Scalar value of a float pointer 's' is: %zu\n", sizeof(*s));
    printf("Scalar value of a float pointer 's' is: %zu\n", sizeof(float));

    printf("Scalar value of a char pointer 'r' is: %zu\n", sizeof(*r));
    printf("Scalar value of a char pointer 'r' is: %zu\n", sizeof(char));

    return 0;
}

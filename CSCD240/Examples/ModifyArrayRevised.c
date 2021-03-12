#include <stdio.h>

#define SIZE 5

void modifyArray(int[], int);
void modifyElement(int *);

int main() {
    int  a[SIZE] = {0, 1, 2, 3, 4};
    int  i;
    int *p = NULL;

    printf("The values of elements in the original array are:\n");
    for (i = 0; i < SIZE; i++) {
        printf(" %d", a[i]);
    }
    printf("\n");

    printf("Passing an entire array, the original values will be modified.\n");

    modifyArray(a, SIZE);

    printf("The values in the modified array are:\n");
    for (i = 0; i < SIZE; i++) {
        printf(" %d", a[i]);
    }

    printf("\n");
    printf("Passing an array element by reference: a[3]\n");
    modifyElement(&a[3]);

    printf("The values in the modified array are:\n");
    for (i = 0; i < SIZE; i++) {
        printf(" %d", a[i]);
    }
    printf("\n");

    return 0;
}

void modifyArray(int b[], int size) {
    int j;

    for (j = 0; j < size; j++) {
        b[j] *= 2;
    }
}

void modifyElement(int *element) {
    *element *= 2;
}

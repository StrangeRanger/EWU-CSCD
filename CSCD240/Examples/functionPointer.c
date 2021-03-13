#include <stdio.h>

#define SIZE 10

void sort(int[], const int, int (*)(int, int));
int  ascending(int, int);
int  descending(int, int);
void swap(int *element1Ptr, int *element2Ptr);

int main() {
    int order, counter;

    int a[SIZE] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};

    printf("Enter 1 to sort in ascecnding order, \n"
           "Enter 2 to sort in descending order: ");

    scanf("%d", &order);
    printf("\n Data items in original order\n");

    for (counter = 0; counter < SIZE; counter++) {
        printf("%5d", a[counter]);
    }

    if (order == 1) {
        sort(a, SIZE, ascending);
        printf("\nData items in ascending order\n");
    } else {
        sort(a, SIZE, descending);
        printf("\nData items in descending order\n");
    }

    for (counter = 0; counter < SIZE; counter++)
        printf("%5d", a[counter]);

    printf("\n");

    return 0;
}

void sort(int array[], const int size, int (*compare)(int, int)) {
    int pass, count;
    for (pass = 1; pass < size; pass++)
        for (count = 0; count < size - 1; count++)
            if ((*compare)(array[count], array[count + 1]))
                swap(&array[count], &array[count + 1]);
}
void swap(int *element1Ptr, int *element2Ptr) {
    int temp;
    temp         = *element1Ptr;
    *element1Ptr = *element2Ptr;
    *element2Ptr = temp;
}
int ascending(int a, int b) {
    return b < a;
}
int descending(int a, int b) {
    return b > a;
}

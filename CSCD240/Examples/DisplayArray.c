#include <stdio.h>

void display_array_normal(int p1[][3][4][5]) {
    int i, j, k, l;

    for (i = 0; i < 2; i++)
        for (j = 0; j < 3; j++)
            for (k = 0; k < 4; k++)
                for (l = 0; l < 5; l++) {
                    printf("%d ", p1[i][j][k][l]);
                }
    putchar('\n');
    putchar('\n');
}

void display_array_using_pointer_2_array(int (*ptr)[3][4][5]) {
    int(*ptrOne)[4][5];
    int(*ptrTwo)[5];
    int *ptrThree;

    int i, j, k, l;

    for (i = 0; i < 2; i++) {
        ptrOne = *ptr++;
        for (j = 0; j < 3; j++) {
            ptrTwo = *ptrOne++;
            for (k = 0; k < 4; k++) {
                ptrThree = *ptrTwo++;
                for (l = 0; l < 5; l++) {
                    printf("%d ", *ptrThree++);
                }
            }
        }
    }

    putchar('\n');
    putchar('\n');
}

int main() {
    int i, j, k, l;

    int num = 0;

    int z[2][3][4][5];

    for (i = 0; i < 2; i++)
        for (j = 0; j < 3; j++)
            for (k = 0; k < 4; k++)
                for (l = 0; l < 5; l++) {
                    z[i][j][k][l] = num++;
                }
    printf("\n");
    printf("\n");

    int(*ptr)[3][4][5] = z;

    printf("Printing array elements using the normal array notation ....\n");
    display_array_normal(z);
    printf("Printing array elements using the pointer to an array notation ......\n");
    display_array_using_pointer_2_array(ptr);

    return 0;
}

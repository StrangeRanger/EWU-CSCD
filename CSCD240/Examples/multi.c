#include <stdio.h>
#define ROWS 5
#define COLS 10
int main() {
    int row, col;

    char multi[5][10] = {{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'},
                         {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'},
                         {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
                         {'9', '8', '7', '6', '5', '4', '3', '2', '1', '0'},
                         {'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'}};
    printf("Using array notation:\n");
    for (row = 0; row < ROWS; row++) {
        for (col = 0; col < COLS; col++) {
            printf("%c ", multi[row][col]);
        }
        printf("\n");
    }
    printf("Using the pointer notation:\n");
    for (row = 0; row < ROWS; row++) {
        for (col = 0; col < COLS; col++) {
            printf("%c ", *(*(multi + row) + col));
        }
        printf("\n");
    }
    return 0;
}

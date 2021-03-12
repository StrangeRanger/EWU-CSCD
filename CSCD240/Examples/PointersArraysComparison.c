#include <stdio.h>
void function(int array[]);

int main(void) {
    int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    printf("size = %zu\n", sizeof(x));
    printf("x[4] = %d\n", x[4]);
    //    x = x+1;
    //   printf("x[4] = %d\n", x[4]);

    function(x);

    return 0;
}

void function(int array[]) {
    printf("size = %zu\n", sizeof(array));
    printf("x[4] = %d\n", array[4]);
    array = array + 1;
    printf("x[4] = %d\n", array[4]);
}

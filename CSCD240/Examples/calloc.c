#include <stdio.h>
#include <stdlib.h>
int main() {
    int  i;
    int *ptr = malloc(sizeof(int) * 10);  // allocates 10 ints!

    for (i = 0; i < 10; i++) {
        ptr[i] = i;
        printf("ptr[%d] is %d\n", i, ptr[i]);
    }

    free(ptr);

    return 0;
}

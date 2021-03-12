#include <stdio.h>

int fun();

int main() {
    printf("%d ", fun());  // prints 1
    printf("%d ", fun());  // prints 2

    return 0;
}

int fun() {
    static int count = 0;
    count++;
    return count;
}
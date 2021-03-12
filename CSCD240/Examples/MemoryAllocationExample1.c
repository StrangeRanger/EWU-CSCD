#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int iSize;  // Allocated in BSS, set to 0 at main startup

char *f(void) {
    int   i = 10;  // Allocated on stack at the start of function f
    char *p;       // Allocated on stack at the start of function f
    iSize = 8;
    p     = (char *) malloc(iSize);  // 8 bytes allocated on heap when malloc is called
    return p;                        // The memory space reserved by malloc which is
}  // pointed to by ‘p’, is available outside of function f(),

int main() {
    char *str = f();  // str points to the same memory pointed by p allocated onto heap
    strcpy(str, "Hello");
    printf("Now  'str' 's value is: %s\n", str);
    free(str);  // returns the memory to the operating system
    return 0;
}

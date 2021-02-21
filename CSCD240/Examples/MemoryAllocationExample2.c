#include <stdio.h>
#include <stdlib.h>

char *f(){
     char *p1 = malloc(3);
     p1[0] = 'a';
     p1[1] = 'b';
     p1[2] = 'c';

    char *p2 = malloc(1);
    // do something
    free(p2);
    return p1;
}
int main(){
   char *cPtr = f();
   // Now, cptr also points to the chunk of memory represented by the black box on heap
   printf("%c %c %c\n", cPtr[0], cPtr[1], cPtr[2]); //prints out 'a'
   free(cPtr);
   return 0;
}

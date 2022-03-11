#include <stdio.h>
int main(){
    int a[2] = {1, 2};

    void *ptr = &a;
    printf("%d\n", *(int*)ptr);
    ptr = ptr + sizeof(int);
    printf("%d\n", *(int*)ptr);
   
    return 0;
}

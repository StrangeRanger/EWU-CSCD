#include <stdio.h>

void func() {
       static int array[5] = {1, 2, 3, 4, 5};
       array[4]++;
       printf("%d\n", array[4]);
}

int main(){
        int i;
        for (i = 0; i < 5; i++){
                func();
        }
        return 0;
}

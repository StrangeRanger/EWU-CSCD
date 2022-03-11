#include <stdio.h>
#include <stdlib.h>

int main(){

    void *array[3];

    
    int* intArray = malloc(sizeof(int)*2);
    float* floatArray   = malloc(sizeof(float)*2);
    char *charArray = malloc(sizeof(char)*3);
    
    intArray[0] = 2;
    intArray[1] = 4;
    array[0] = intArray;
    floatArray[0] = 2.5;
    floatArray[1] = 4.9;
    array[1] = floatArray;
    charArray[0] = 'H';
    charArray[1] = 'i';
    charArray[2] = '!';
    array[2] = charArray;
    printf("Integer Array: intArray[0] = %d, intArray[1] = %d\n", *(int*)array[0], *(int*)(array[0]+ sizeof(int)) );
    printf("Float Array: floatArray[0] = %f, floatArray[1] = %f\n", *(float*)array[1], *(float*)(array[1]+sizeof(float)) );
    printf("Char Array: charArray[0] = %c, charArray[1] = %c, charArray[2] = %c\n", *(char*)array[2], *(char*)(array[2]+sizeof(char)),*(char*)(array[2]+sizeof(char)*2) );
    free(array[0]);
    free(array[1]);
    free(array[2]);
	
	
 return 0;

}

#include <stdio.h>

#define SIZE 10

int main(){

	int i;

	int array[SIZE];

	for (i = 0; i < SIZE; i++)
		array[i] = i;

	int *ptr;
	
	ptr = array;// sets pointer to the address of the first element of the array

	
	printf("Calling  *(ptr+i)   version: \n");

	for (i = 0; i < SIZE; i++)

		printf("%d ", *(ptr + i));
	putchar('\n');

	printf("Calling  array[i]   version: \n");

	for (i = 0; i < SIZE; i++)

		printf("%d ", array[i]);
	putchar('\n');

	printf("Calling  *(array+i)   version: \n");


	for (i = 0; i < SIZE; i++)

		printf("%d ", *(array+i));
	putchar('\n');

        printf("Calling  ptr[i]   version: \n");

	for (i = 0; i < SIZE; i++)

		printf("%d ", ptr[i]);
	putchar('\n');

	printf("Calling  *ptr++   version: \n");
	for (i = 0; i < SIZE; i++)

	printf("%d ", *(ptr++));
	putchar('\n');

	ptr = array;

	printf("Calling  *++ptr   version: \n");
	for (i = 0; i < SIZE; i++)

		printf("%d ", *++ptr);
	putchar('\n');

        ptr = array;
        
        printf("Calling  ++*ptr   version: \n");
        for (i = 0; i < SIZE; i++)
             ++*ptr;
 
       for (i = 0; i < SIZE; i++)
            printf("%d ", ptr[i]);

        putchar('\n');
	
	return 0;
}

#include <stdio.h>

int main(){

int i;
int arr[] = {10,20, 30, 40}; 
int arrSize = sizeof(arr)/sizeof(int);
int *ptr = NULL;                                                            // pts has been initialized to NULL
ptr = arr;                                                                        // ptr has been initialized to the base address of  array  ‘arr’
for ( i = 0; i <  arrSize; i++){
	printf("Address of arr[%d] = %p\n", i, &ptr[i] );
	printf("Address of arr[%d] = %p\n", i,  (ptr+i) );
	printf("Address of arr[%d] = %p\n", i, &arr[i] );
	printf("Address of arr[%d] = %p\n", i,  (arr+i) );

	printf("Value of arr[%d] = %d\n", i,  ptr[i]);
        printf("Value of arr[%d] = %d\n", i, i[ptr]);
	printf("Value of arr[%d] = %d\n", i,  arr[i]);
	printf("Value of arr[%d] = %d\n", i,  *(ptr+i));
	printf("Value of arr[%d] = %d\n", i,  *(arr+i) );
	}
return 0;

}

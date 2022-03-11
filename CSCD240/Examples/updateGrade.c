#include <stdio.h>
#define SIZE 10

int update(int a[], int size, int except){
int i;
int count = 0;
 for(i = 0; i < size; i ++){ 
     if( a[i] < except ){
         a[i] = a[i] + 10;
         count++;
     }
  }
   return count;
}


int main(){
int i;
int grades[5] = {  80, 80, 90, 60, 40 };

int numElements = sizeof(grades)/sizeof(grades[0]);

printf("Number of elements is: %d\n", numElements);

 for (i = 0; i < numElements; i++)
      printf("%d ", grades[i]);

 printf("\n");

 int ret = update(grades, numElements, 90);

 for (i = 0; i < numElements; i++)
      printf("%d ", grades[i]);

 printf("\n");

 return 0;

}

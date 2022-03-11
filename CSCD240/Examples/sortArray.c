#include <stdio.h>


void printArray(int a[], int num);
void sortArray(int a[], int num);
void swapElements(int *c, int *d);


int main(){
  int a[] = { 3, 2, 6, 4, 1};
  printf("Printing the original array .....\n");
  int n  =  sizeof(a)/sizeof(int);
  printArray(a,n);
  //sort the array
  sortArray(a, n);
  printf("Printing the sorted array .....\n");
  printArray(a, n);


  return 0;
}
void printArray(int a[], int num){
 int i;
 for (i = 0; i < num; i++){
      printf("%d ", a[i]);
 }
 printf("\n");


}
void sortArray(int a[], int num){
    int i, j;
    for (i = 0; i < num - 1; i++)
        for (j = 0; j < num - 1; j++)
             if(a[j] > a[j+1])
                swapElements(&a[j], &a[j+1]);

}

void swapElements( int *c, int *d){
     int temp = *c;
     *c = *d;
     *d = temp;
}






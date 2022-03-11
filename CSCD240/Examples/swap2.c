#include <stdio.h>
 
/* function declaration */
void swap2(int *x, int *y);
 
int main ()
{
   /* local variable definition */
   int a = 100;
   int b = 200;
 
   printf("Before swap, value of a : %d\n", a );
   printf("Before swap, value of b : %d\n", b );
 
   /* calling a function to swap the values.
    * &a indicates pointer to a ie. address of variable a and 
    * &b indicates pointer to b ie. address of variable b.
   */
   swap2(&a, &b);
 
   printf("After swap, value of a : %d\n", a );
   printf("After swap, value of b : %d\n", b );
 
   return 0;
}


/* function definition to swap the values */
void swap2(int *x, int *y)
{
   int temp;
   temp = *x;    /* save the value at address x */
   *x = *y;      /* put value at address y into memory location specified by x */
   *y = temp;    /* put temp into memory lecoation specified by y */
                 // instead of changing the formal parameter x or y,
                 // we changed (*x) and (*y). That will affect the actual parameter passed in.
   return;
}


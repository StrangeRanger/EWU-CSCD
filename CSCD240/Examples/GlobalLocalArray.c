// *****************************************************************************
//
// Name:        Hunter T.
// Date:        January 28, 2021
// Class:       CSCD 240
// Description: Compare difference between Global and Locally defined arrays.
// Note:
//              Array 'no' is implicitly initialized
//              Array 'id' is NOT implicitly initialized
//
// *****************************************************************************

#include <stdio.h>

int no[5];  // Global array

int main() {
    int i;  // For loop variable can't be created inside the loop
    int id[5];  // Local or automatic array

    printf("Printing array 'no':\n");
    for (i = 0; i < 5; i++) {
        printf("'no[%d]' is: %d\n", i, no[i]);
    }

    printf("Printing array id:\n");
    for (i = 0; i < 5; i++) {
        printf("'id[%d]' is: %d\n", i, id[i]);
    }

    return 0;
}


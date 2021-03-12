#include <math.h>
#include <stdio.h>
#include <stdlib.h>

void   swapElements(int *x, int *y);
void   sortArray(int *array, int size);
void   printArray(int *array, const int size);
double findMean(const int *array, const int size);
double findMedian(const int *array, const int size);
double findStandardDeviation(const int *array, const int size, double average);

int main() {
    int    n, *x, i;
    double mean = 0.0, median = 0.0, stdDev = 0.0;

    printf("This is the basic part of the program that asks the user to type the "
           "number of integers, i.e., 'n'. Next, allocate memory for 'n' integers, "
           "read the values of 'n' integers into the allocated memory usining scanf; "
           "next, find the mean, median and average of 'n' integers.Lastly, the "
           "allocated memory needs to be freed.\n");

    printf("\nHow many integers you would like to type:\n");
    scanf("%d", &n);
    x = calloc(n, sizeof(int));

    printf("Please type 'n' integers: \n");
    for (i = 0; i < n; i++) {
        scanf("%d", &x[i]);
    }

    printf("Displaying the numbers:\n");
    printArray(x, n);

    // Sort array
    sortArray(x, n);

    // Find mean, median, stdDev
    mean   = findMean(x, n);
    median = findMedian(x, n);
    stdDev = findStandardDeviation(x, n, mean);

    // Display mean, median, stdDev
    printf("Mean of the numbers is: %f\n", mean);
    printf("Median of the numbers is: %f\n", median);
    printf("Standard deviation of the numbers is: %f\n", stdDev);

    // Deallocate the memory ;
    free(x);
    return 0;
}

void printArray(int *array, const int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

void sortArray(int *array, const int size) {
    int i, j;

    for (i = 0; i < size - 1; i++) {
        for (j = 0; j < size - 1; j++) {
            if (array[j] > array[j + 1]) {
                swapElements(&array[j], &array[j + 1]);
            }
        }
    }
}

void swapElements(int *x, int *y) {
    int tmp;
    tmp = *x;
    *x  = *y;
    *y  = tmp;
}

double findMean(const int *array, const int size) {
    int    i;
    double mean = 0;
    for (i = 0; i < size; i++) {
        mean = mean + array[i];
    }
    mean = mean / size;
    return mean;
}

double findMedian(const int *array, const int size) {
    int median = NULL;
    if (size % 2) {
        median = array[size / 2];
    } else {
        median = array[size / 2] + array[size / 2 - 1] / 2.0;
    }
    return median;
}

double findStandardDeviation(const int *array, const int size, double average) {
    int    i;
    double newArray[size], sum = 0, result, stdDev;

    for (i = 0; i < size; i++) {
        newArray[i] = array[i] - average;
        newArray[i] = pow(newArray[i], 2);
        sum += newArray[i];
    }
    result = sum / (size - 1);
    stdDev = sqrt(result);
    return stdDev;
}

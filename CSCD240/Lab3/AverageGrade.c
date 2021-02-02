#include <stdio.h> //file Name: AverageGrade.c

int main(){
    int i = 0;
    double grade = 0, sum = 0, average;

    printf("Please input any number of grades:\n");
    scanf(" %lf", &grade);

    while(grade != -1000) {
        sum += grade;
        average = sum / ++i;

        printf("Sum is %lf\n", sum);
        printf("Average is %lf\n", average);
        scanf(" %lf", &grade);
    }
    return 0;
}

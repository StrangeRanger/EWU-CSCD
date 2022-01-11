#include <stdio.h>

int (*pFcn)(int, int);
int Add(int, int);
int Subtract(int, int);
int Multiply(int, int);
int Divide(int, int);

int main() {
    int X, Y, operation;

    printf("Enter a number: ");
    scanf(" %d", &X);
    printf("Enter another number: ");
    scanf(" %d", &Y);
    printf("Enter an operation (0=add, 1=subtract, 2=multiply, 3=Divide): ");
    scanf(" %d", &operation);

    switch (operation) {
        case 0: pFcn = Add; break;
        case 1: pFcn = Subtract; break;
        case 2: pFcn = Multiply; break;
        case 3: pFcn = Divide; break;
    }

    printf("The answer is: %d\n", pFcn(X, Y));
    return 0;
}

int Add(int x, int y) {
    int sum = x + y;
    return sum;
}

int Subtract(int x, int y) {
    int difference = x - y;
    return difference;
}

int Multiply(int x, int y) {
    int product = x * y;
    return product;
}

int Divide(int x, int y) {
    int dividen = x / y;
    return dividen;
}


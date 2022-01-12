#include <stdio.h>
#include <stdlib.h>

struct Person {
    char  name[BUFSIZ];
    char  ssn[BUFSIZ];
    int   age;
    float height;
    float weight;
};

void setData(struct Person *x);
void printData(struct Person x);

int main() {
    struct Person personOne;

    printf("Reading data...\n");
    setData(&personOne);
    printf("\n");
    printf("Printing data...\n");
    printData(personOne);

    return 0;
}

void setData(struct Person *x) {
    char buff[BUFSIZ];
    /* Get name. */
    printf("Enter your name: ");
    fgets(x->name, 100, stdin);
    /* Get SSN. */
    printf("Enter your ssn: ");
    fgets(x->ssn, 100, stdin);
    /* Get age. */
    printf("Enter your age: ");
    fgets(buff, 100, stdin);
    x->age = atoi(buff);
    /* Get height. */
    printf("Enter your height(cm): ");
    fgets(buff, 100, stdin);
    x->height = atof(buff);
    /* Get weight. */
    printf("Enter your weight(kg): ");
    fgets(buff, 100, stdin);
    x->weight = atof(buff);
}

void printData(struct Person x) {
    printf("Name: %s", x.name);
    printf("SSN: %s", x.ssn);
    printf("Age: %d\n", x.age);
    printf("Height(cm): %g\n", x.height);
    printf("Weight(kg): %g\n", x.weight);
}

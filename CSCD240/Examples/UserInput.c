#include <stdio.h>
#define MAXSIZE 10

int main() {
    char str[MAXSIZE];
    printf("Enter a string:\n");
    fgets(str, sizeof(str), stdin);
    printf("You entered: \"%s\"\n", str);

    int  i;
    char c;
    char strTwo[MAXSIZE];
    printf("Enter an integer, a character and a string:\n");
    scanf(" %d %c %s", &i, &c, strTwo);
    printf("You entered: \"%d\", \"%c\", \"%s\" \n", i, c, strTwo);
}

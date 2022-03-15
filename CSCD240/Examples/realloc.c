#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p1;
    int  i = 0, j, data;
    p1     = malloc(sizeof(int));
    if (p1 == NULL) {
        printf("No memory .....\n");
    }
    scanf("%d", &data);
    p1[i++] = data;
    p1      = realloc(p1, (i + 1) * sizeof(int));
    scanf("%d", &data);
    p1[i++] = data;

    for (j = 0; j < i; j++)
        printf("%d\n", p1[j]);
    free(p1);
    return 0;
}

#include <stdio.h>
int main() {
    int  i, j;
    char vowels[] = {'a', 'e', 'i', 'o', 'u'};
    int  freq[]   = {2, 0, 4, 3, 1};
    printf("%s%15s%15s\n", "Vowels", "Frequency", "Histogram");

    for (i = 0; i < 5; i++) {
        printf("%c%15d            ", vowels[i], freq[i]);
        for (j = 0; j < freq[i]; j++) {
            printf("%c", '*');
        }
        printf("\n");
    }

    return 0;
}

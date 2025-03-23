#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n, sum = 0;
    scanf("%d", &n);

    sum += n % 10;
    sum += (n / 10) % 10;
    sum += (n / 100) % 10;
    sum += (n / 1000) % 10;
    sum += (n / 10000);

    printf("%d\n", sum);
    return 0;
}
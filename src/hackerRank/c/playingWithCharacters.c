#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char ch;
    char st[100];
    char sen[100];

    scanf("%c", &ch);
    scanf("%s", st);
    scanf("\n");
    scanf("%[^\n]%*c", sen);

    printf("%c\n", ch);
    printf("%s\n", st);
    printf("%s\n", sen);
    return 0;
}
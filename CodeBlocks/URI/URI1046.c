#include <stdio.h>
#include <math.h>

int main(void)
{
    int start, end, x;
    scanf("%d %d", &start, &end);

    x = 24 - start + end;

    if(x > 24)
        x = abs(24 - (24 - start + end));

    printf("O JOGO DUROU %d HORA(S)\n", x);


}

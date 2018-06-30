#include <stdio.h>
#include <math.h>

int main(void)
{
    int starth, startm, endh, endm, x, y;
    scanf("%d %d %d %d", &starth, &startm, &endh, &endm);

    y = 60 - startm + endm;

    x = 24 - starth + endh;


    if(x > 24)
        x = abs(24 - (24 - starth + endh));

    if(y >= 60)
    {
        y = y % 60;
        x = x + (y / 60);
    }
    else
        x = x - 1;


    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", x, y);


}




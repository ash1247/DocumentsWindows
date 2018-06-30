#include <stdio.h>

int main(void)
{
    float num;
    int i;
    int positive = 0;

    for(i = 1; i <= 6; i++)
    {
        scanf("%f", &num);

        if( num > 0)
            positive++;

    }

    printf("%d valores positivos\n", positive);
}

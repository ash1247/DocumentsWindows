#include <stdio.h>

int main(void)
{
    float num = 0, average, total = 0;
    int i = 0, positive = 0;

    for(i = 1; i <= 6; i++)
    {
        scanf("%f", &num);

        if( num > 0)
        {
            total += num;
            positive++;
        }
    }

    average = total / positive;

    printf("%d valores positivos\n", positive);
    printf("%.1f\n", average);

    return 0;
}


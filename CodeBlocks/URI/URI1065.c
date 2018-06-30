#include <stdio.h>

int main(void)
{
    int num = 0;
    int i = 0, count = 0;

    for(i = 1; i <= 5; i++)
    {
        scanf("%d", &num);

        if( num % 2 == 0)
        {
            count++;
        }
    }

    printf("%d valores pares\n", count);

    return 0;
}



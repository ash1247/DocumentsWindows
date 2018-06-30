#include <stdio.h>

int main(void)
{
    int t;
    long int num1, num2;

    scanf("%d", &t);

    for(int i = 1; i <= t; i++)
    {
        scanf("%ld", &num1);

        if( num1 ==  0)
        {
            printf("NULL\n");
        }
        if( num1 <  0 && num1 % 2 == 0)
        {
            printf("EVEN NEGATIVE\n");
        }
        else if( num1 >  0 && num1 % 2 == 0)
        {
            printf("EVEN POSITIVE\n");
        }
        else if( num1 > 0 && num1 % 2 != 0)
        {
            printf("ODD POSITIVE\n");
        }
        else if( num1 < 0 && num1 % 2 != 0)
        {
            printf("ODD NEGATIVE\n");
        }
    }
}


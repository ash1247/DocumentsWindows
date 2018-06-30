#include <stdio.h>

int main(void)
{
    int t;
    long long int num1, num2;

    scanf("%d", &t);

    for(int i = 1; i <= t; i++)
    {
        scanf("%lld %lld", &num1, &num2);

        if( num1 ==  num2)
        {
            printf("=\n");
        }
        else if( num1 <  num2)
        {
            printf("<\n");
        }
        if( num1 >  num2)
        {
            printf(">\n");
        }
    }
}

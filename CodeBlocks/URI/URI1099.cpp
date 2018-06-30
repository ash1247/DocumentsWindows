#include <bits/stdc++.h>

int main(void)
{
    int n, i, j, x, y, odd;
    int sum = 0;

    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        scanf("%d %d", &x, &y);

        if(x >= y)
        {

            for( j = y + 1; j < x ; j++)
            {

                odd = j;
                if( odd % 2 != 0)
                {
                    sum += odd;
                }

            }
            printf("%d\n", sum );
            sum = 0;
        }

        else
        {

            for( j = x + 1; j < y ; j++)
            {

                odd = j;
                if( odd % 2 != 0)
                {
                    sum += odd;
                }

            }
            printf("%d\n", sum );
            sum = 0;
        }
    }

    return 0;
}



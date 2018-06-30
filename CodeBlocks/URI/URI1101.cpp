#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int m, n, sum = 0, i, j;

    while( scanf("%d %d", &m, &n) )
    {
        if(m <= 0 | n <= 0)
        {
            break;
        }
        else
        {
            sum = 0;
            if ( n < m)
            {
                for( i = n; i <= m; i++)
                {
                    printf("%d ", i);
                    sum += i;
                }
                printf("Sum=%d\n", sum);
            }
            else if ( n > m)
            {
                for( j = m; j <= n; j++)
                {
                    printf("%d ", j);
                    sum += j;
                }
                printf("Sum=%d\n", sum);
            }
        }

    }
    return 0;
}








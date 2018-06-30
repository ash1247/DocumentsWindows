#include <bits/stdc++.h>

int main( void )
{
    int i, j;
    int a[6][6];
    int m, n;
    int move = 0;

    for( i = 1; i <= 5; i++ )
    {
        for( j = 1; j <= 5; j++ )
        {
            scanf("%d", &a[i][j] );
        }
    }

    for( i = 1; i <= 5; i++ )
    {
        for( j = 1; j <= 5; j++ )
        {
            if( a[i][j] == 1 )
            {
                move = abs(i - 3) + abs( j - 3);
                break;
            }
        }
    }

    printf("%d\n", move);

    return 0;
}

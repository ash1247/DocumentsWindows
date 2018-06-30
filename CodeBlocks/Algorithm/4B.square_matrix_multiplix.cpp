#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;

    cin >> n;

    int a[n][n], b[n][n], c[n][n];

    for( int i = 1; i <= n; i++ )
    {
        for( int j = 1; j <= n; j++ )
        {
            cin >> a[i][j];
        }
    }

    for( int i = 1; i <= n; i++ )
    {
        for( int j = 1; j <= n; j++ )
        {
            cin >> b[i][j];
        }
    }

    for( int i = 1; i <= n; i++ )
    {
        for(int j = 1; j <= n; j++ )
        {
            (c)[i][j] = 0;
            for( int k = 1; k <= n; k++ )
            {
                c[i][j] += ( a[i][k] * b[k][j] );
            }
        }
    }

    for( int i = 1; i <= n; i++ )
    {
        for( int j = 1; j <= n; j++ )
        {
            printf("%d\t", c[i][j] );
        }
        printf("\n");
    }

    return 0;
}





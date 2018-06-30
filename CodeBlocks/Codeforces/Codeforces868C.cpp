#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, k, m = 1, flag = 0;

    cin >> n >> k;

    int half = ceil( (double)n / 2);

    int a[n][k];
    int know[4];

    for(int i = 1; i <= n; i++ )
    {
        for( int j = 1; j <= k; j++)
        {
            cin >> a[i][j];
            know[j] = 0;
        }
    }

    for(int i = 1; i <= n; i++ )
    {
        m = 1;
        for( int j = 1;j <= k; j++)
        {
            know[m] += a[i][j];
            m++;
        }
    }
    for(int i = 1; i <= k; i++ )
    {
        if( know[i] > half)
        {
            flag = 1;
            break ;
        }
    }

    if( flag == 1)
    {
        cout << "NO\n";
    }
    else
    {
        cout << "YES\n";
    }

    return 0;
}

#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int m, n;
    int i = 0;
    int least = 0;

    cin >> n >> m;

    int f[m];

    for( i = 0; i < m; i++ )
    {
        cin >> f[i];
    }

    sort( f, f + m );

    least = f[ n - 1] - f[0];

    for( i = 1; i <= m - n; i++ )
    {
        if( f[i + n - 1] - f[i] < least)
        {
            least = f[i + n - 1] - f[i] ;
        }
    }

    cout << least << endl;

    return 0;
}


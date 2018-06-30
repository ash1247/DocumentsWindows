#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n, m, count = 0;

    cin >> n >> m;

    long long int a[m];

    for( int i = 1; i <= m; i++ )
    {
        cin >> a[i];
    }

    int x = 1;

    for( int i = 1; i <= m; i++ )
    {
        if( a[i] >= x )
        {
            count += a[i] - x;
        }
        else
        {
            count += n - x + a[i];
        }

        x = a[i];

    }

    cout << count << endl;

    return 0;
}

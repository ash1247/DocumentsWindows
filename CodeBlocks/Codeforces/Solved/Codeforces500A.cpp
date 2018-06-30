#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n, t, i = 0;

    cin >> n >> t;

    int a[n];

    for( i = 1; i < n; i++ )
    {
        cin >> a[i];
    }

    i = 1;
    while( i < t )
    {
        i += a[i];
    }

    if( i == t )
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}

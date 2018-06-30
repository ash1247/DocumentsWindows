#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n, k;

    cin >> n;

    k = n;

    long long int a[n];
    long long int b[k];
    long long int sum = 0;
    long long int cap = 0;

    for( int i = 1; i <= n; i++)
    {
        cin >> a[i];
        sum += a[i];
    }

    for( int i = 1; i <= n; i++)
    {
        cin >> b[i];
    }

    sort( b + 1, b + n + 1 );

    cap = b[n] + b[n - 1];

    if( sum > cap )
    {
        cout << "NO\n";
    }
    else
    {
        cout << "YES\n";
    }

    return 0;
}

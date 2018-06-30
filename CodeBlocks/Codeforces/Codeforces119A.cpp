#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int a, b, n, k = 0;

    cin >> a >> b >> n;

    while( n >= 0)
    {
        k++;
        n -= __gcd( ( k & 1) ? a : b, n);
    }

    if( k & 1 )
    {
        cout << "1";
    }
    else
    {
        cout << "0";
    }

    return 0;
}


#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, k, x;
    int minimum = 0;

    cin >> n >> k >> x;

    int a[n];
    int b[k];

    for(int i = 1; i <= n; i++)
    {
        cin >> a[i];
    }

    for( int i = 1; i <= n - k; i++ )
    {
        minimum += a[i];
    }

    for( int i = n - k + 1; i <= n; i++ )
    {
        minimum += x;
    }

    cout << minimum << endl;


}

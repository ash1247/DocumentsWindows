#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, count = 0, min = 0, max = 0;

    cin >> n;

    int a[n];

    for( int i = 1; i <= n; i++)
    {
        cin >> a[i];
    }

    min = a[1];
    max = a[1];

    for( int i = 2; i <= n; i++ )
    {
        if( a[i] > max )
        {
            max = a[i];
            count++;
        }
        if( a[i] < min )
        {
            min = a[i];
            count++;
        }
    }

    cout << count << endl;

    return 0;
}

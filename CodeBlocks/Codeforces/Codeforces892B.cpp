#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n, count = 0;

    cin >> n;

    long int a[n];

    int j = n + 1;

    for( int i = 1; i <= n; i++)
    {
        cin >> a[i];
    }

    for( int i = n; i > 0; i-- )
    {
        if( i < j)
        {
            count++;
        }
        if( j > i - a[i] )
        {
            j = i - a[i];
        }

    }
    cout << count << endl;

    return 0;
}


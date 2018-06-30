#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, i = 0, j = 0, count = 0;

    cin >> n;

    int h[n], a[n];

    for( i = 1; i <= n; i++ )
    {
        cin >> h[i] >> a[i];
    }

    for( i = 1; i <= n; i++ )
    {
        for( j = 1; j <= n; j++ )
        {
            if( i != j & h[i] == a[j] )
            {
                count++;
            }
        }
    }

    cout << count << endl;
}

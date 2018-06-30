#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n, count = 0, k;

    cin >> n;

    long int x[n];
    long int y[n];

    for(int i = 1; i <= n; i++ )
    {
        cin >> x[i];
    }
    for(int i = 1; i <= n; i++ )
    {
        cin >> y[i];
    }

    sort( x + 1, x + n + 1);
    sort( y + 1, y + n + 1);

    for(int i = 1; i <= n; i++ )
    {
        for(int j = 1; j <= n; j++ )
        {
            long int s = ( x[i] ^ y[j] );
            int p = binary_search( x + 1, x + 1 + n, s);
            int q = binary_search( y + 1, y + 1 + n, s);
            if(  p == 1 || q == 1 )
            {
                count++;
            }
        }
    }

    if( count % 2 == 0)
    {
        cout << "Karen\n";
    }
    else
    {
        cout << "Koyomi\n";
    }

    return 0;
}

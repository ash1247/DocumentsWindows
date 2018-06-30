#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int t, q, n, m, x, y;

    cin >> q;

    while( q != 0)
    {
        t = q;
        cin >> n >> m;
        while(t--)
        {
            cin >> x >> y;

            if( x == n | y == m)
            {
                cout << "divisa\n";
            }
            else if( x > n & y > m )
            {
                cout << "NE\n";
            }
            else if( x < n & y > m)
            {
                cout << "NO\n";
            }
            else if( x < n & y < m )
            {
                cout << "SO\n";
            }
            else if( x > n & y < m )
            {
                cout << "SE\n";
            }
        }
        cin >> q;
    }
    return 0;
}

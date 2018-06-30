#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, m, i = 0;

    cin >> n >> m;

    for( i = 1; i <= 200; i++, n--)
    {
        if( i % m == 0)
        {
            n++;
        }
        if( n == 1)
        {
            cout << i << endl;
            break;
        }
    }

    return 0;

}

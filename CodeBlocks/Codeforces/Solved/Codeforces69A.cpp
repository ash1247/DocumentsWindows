#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n;

    int x = 0, y = 0, z = 0;
    cin >> n;

    int X[n * 3];

    for(int i = 1; i <= n * 3; i++ )
    {
        cin >> X[i];
        if( i % 3 == 1)
        {
            x += X[i];
        }
        if( i % 3 == 2)
        {
            y += X[i];
        }
        if( i % 3 == 0)
        {
            z += X[i];
        }
    }

    if( x == 0 & y == 0 & z == 0)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
}

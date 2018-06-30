#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int a, b, c;

    cin >> a >> b >> c;

    if( a == 1 && c == 1 )
    {
        printf("%d\n", a + b + c );
    }
    else if( a == 1 || ( b == 1 && a < c) )
    {
        printf("%d\n", (a + b) * c );
    }
    else if( c == 1 || ( b == 1 && a >= c) )
    {
        printf("%d\n", a * ( b + c ) );
    }
    else
    {
        printf("%d\n", a * b * c );
    }

    return 0;
}

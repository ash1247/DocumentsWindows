#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int a[4];
    int total = 0;

    for( int i = 1; i <= 3; i++ )
    {
        cin >> a[i];
    }

    sort( a + 1, a + 4);

    total = ( a[2] - a[1] ) + ( a[3] - a[2] );

    cout << total << endl;

    return 0;

}


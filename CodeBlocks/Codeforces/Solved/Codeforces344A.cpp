#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, i = 0, count = 1;

    cin >> n;

    int magnet[n];

    cin >> magnet[1];

    for( i = 2; i <= n; i++ )
    {
        cin >> magnet[i];

        if( magnet[i] != magnet[ i - 1] )
        {
            count++;
        }

    }

    cout << count << endl;

    return 0;
}

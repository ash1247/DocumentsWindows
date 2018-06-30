#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, tim = 0, k, i = 1;

    cin >> n >> k;

    for( i = 1; i <= n; i++)
    {
        tim +=  5 * i;
        if( tim + k > 240 )
        {
            break;
        }
    }

    cout << i - 1 << endl;

    return 0;


}


#include <bits/stdc++.h>
using namespace std;

int main( void )
{
    long long int k, p, x, y, ans = 0;
    cin >> k >> p;

    for(int i = 1; i <= k; i++ )
    {
        x = i;
        y = i;

        while( y > 0 )
        {
            x = x * 10 + ( y % 10);
            y /= 10;
        }

        ans += x;
    }


    cout << ans % p << endl;

    return 0;
}

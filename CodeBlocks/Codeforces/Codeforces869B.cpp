#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int a, b, ans = 1;

    cin >> a >> b;

    if( b - a >= 10)
    {
        cout << "0\n";
    }
    else
    {
        for(long long int i = a + 1; i <= b; i++ )
        {
            ans = ( ans * i) % 10;
        }

        cout << ans << endl;
    }

    return 0;
}

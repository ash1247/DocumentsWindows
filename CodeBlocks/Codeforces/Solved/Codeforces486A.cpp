#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long long int n;
    long long int i = 0;
    long long int ans = 0;

    cin >> n;

    if( n % 2 == 0 )
    {
        ans = n / 2;
    }
    else
    {
        ans = -n / 2 - 1;
    }

    cout << ans << endl;

    return 0;
}

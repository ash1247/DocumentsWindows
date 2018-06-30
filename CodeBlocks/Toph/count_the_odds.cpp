#include <bits/stdc++.h>
#define LLI long long int

using namespace std;

int main( void )
{
    LLI a, b;
    LLI ans = 0;

    cin >> a >> b;

    if( a % 2 == 0)
    {
        a++;
    }
    if( b % 2 == 0)
    {
        b--;
    }

    if( a > b)
    {
        ans = 0;
    }
    else
    {
        ans = b - a;
        ans = ans / 2;
        ans++;
    }

    cout << ans << endl;

    return 0;
}

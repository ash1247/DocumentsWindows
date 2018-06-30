#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;

    cin >> n;

    string ans;
    string h = "I hate ";
    string l = "I love ";
    string t = "that ";
    string it = "it";

    for(int i = 1; i <= n; i++ )
    {
        if( i > 1 )
        {
            ans += t;
        }
        if( i % 2 == 1)
        {
            ans += h;
        }
        if( i % 2 == 0)
        {
            ans += l;
        }
        if( i == n )
        {
            ans += it;
        }
    }

    cout << ans << endl;

    return 0;
}

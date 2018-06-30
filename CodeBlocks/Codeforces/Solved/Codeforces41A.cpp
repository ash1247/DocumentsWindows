#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s, t;

    cin >> s >> t;

    if( s == string( t.rbegin(), t.rend() ) )
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}

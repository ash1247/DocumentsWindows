#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string guest, host, pile;

    cin >> guest >> host >> pile;

    string mix = guest + host;

    sort( mix.begin(), mix.end() );
    sort( pile.begin(), pile.end() );

    if( mix == pile )
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

}

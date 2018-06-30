#include <bits/stdc++.h>

using namespace std;

int main ( void )
{
    int n;
    int p, q;
    int i = 0;
    int level;
    vector<int> v;

    cin >> n >> p;

    for( i = 1; i <= n; i++ )
    {
        v.push_back( i );
    }

    for( i = 1; i <= p; i++ )
    {
        cin >> level;

        v.erase( remove( v.begin(), v.end(), level ), v.end() ) ;
    }

    cin >> q;

    for( i = 1; i <= q; i++ )
    {
        cin >> level;

        v.erase( remove( v.begin(), v.end(), level ), v.end() ) ;
    }

    if( v.empty() )
    {
        cout << "I become the guy." << endl;
    }
    else
    {
        cout << "Oh, my keyboard!" << endl;
    }

    return 0;
}

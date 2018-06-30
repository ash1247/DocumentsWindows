#include <bits/stdc++.h>

using namespace std;

struct dragon
{
    int x;
    int y;
};

bool compare( const dragon& left, const dragon& right )
{
    return left.x < right.x;
}


int main( void )
{
    int s, n, flag = 0;

    cin >> s >> n;

    dragon d[n];

    for( int i = 1; i <= n; i++ )
    {
        cin >> d[i].x >> d[i].y;
    }

    sort( d + 1, d + 1 + n, compare );

    for( int i = 1; i <= n; i++ )
    {
        if( s > d[i].x )
        {
            s += d[i].y;
        }
        else
        {
            flag = 1;
            break;
        }
    }

    if( !flag )
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

    return 0;

}

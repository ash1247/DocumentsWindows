#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, m;

    cin >> n >> m;

    for(int i = 1; i <= n; i++ )
    {
        if( i % 4 == 2 )
        {
            for(int j = 1; j < m; j++ )
            {
                cout << ".";
            }
            cout << "#\n";
        }
        else if( i % 4 == 0 )
        {
            cout << "#";
            for( int j = 1; j < m; j++ )
            {
                cout << ".";
            }
            cout << "\n";
        }
        else
        {
            for(int j = 1; j <= m; j++ )
            {
                cout << "#";
            }
            cout << "\n";
        }
    }

    return 0;
}

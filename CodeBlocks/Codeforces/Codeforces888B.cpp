#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    string s;
    int x1 = 0, y1 = 0;

    cin >> n >> s;

    for(int i = 0; i < n; i++ )
    {
        if( s[i] == 'U' )
        {
            y1++;
        }
        if( s[i] == 'D' )
        {
            y1--;
        }
        if( s[i] == 'L' )
        {
            x1--;
        }
        if( s[i] == 'R' )
        {
            x1++;
        }
    }

    if( x1 == 0 && y1 == 0)
    {
        cout << n << endl;
    }
    else if( x1 + y1 == n)
    {
        cout << 0 << endl;
    }
    else if( y1 == 0)
    {
        cout << n - x1;
    }
    else if( x1 == 0)
    {
        cout << n - y1;
    }

    return 0;
}

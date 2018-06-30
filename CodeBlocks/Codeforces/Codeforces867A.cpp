#include<bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, i = 0, countF = 0, countS = 0;
    string s;


    cin >> n >> s;

    for( i = 0; i < n; i++ )
    {
        if( s[i] == 'F' & s[ i + 1 ] == 'S' )
        {
            countF++;
        }
        else if( s[i] == 'S' & s[ i + 1 ] == 'F' )
        {
            countS++;
        }
    }

    if( countS > countF )
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}

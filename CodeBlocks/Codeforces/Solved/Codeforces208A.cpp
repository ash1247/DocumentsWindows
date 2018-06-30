#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    int i = 0;
    int check = 1;

    cin >> s;

    for( i = 0; i < s.length(); i++ )
    {
        if( s[i] == 'W' & s[i + 1] == 'U' & s[i + 2] == 'B' )
        {
            i += 2;
            if( !check )
            {
                cout << " ";
            }
        }
        else
        {
            check = 0;
            cout << s[i];
        }

    }



}

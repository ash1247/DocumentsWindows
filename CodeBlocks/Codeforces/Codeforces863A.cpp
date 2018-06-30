#include <bits/stdc++.h>

using namespace std;

int main ( void )
{
    string s;

    int i = 0;
    int check = 1;

    cin >> s;

    if( s[0] == '0')
    {
        for( i = 0; i < s.length(); i++ )
        {
            if( check )
            {
                if( s[i] == '0' )
                {
                    i++;
                }
            }
            else
            {
                check = 0;
                s.erase( remove( s.begin(), s.end(), '0' ), s.end() );
            }
        }
    }

    if( s == string( s.rbegin(), s.rend() ) )
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }





}

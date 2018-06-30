#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    int x = 1;
    int a = 0, b = 0;
    cin >> s;

    size_t found = 0;

    if( s[0] == 'b')
    {
        found = s.find( 'a' );
    }

    if( found == 0)
    {
        for(int i = 0; i < s.length(); i++ )
        {
            if( s[i] == 'a' & x % 2 == 1 )
            {
                a++;
            }
            else if( s[i] == 'b' & x % 2 == 0)
            {
                b++;
            }
            else if( s[i] == 'a' & x % 2 == 1 )
            {
                a++;
            }

            if( (s[i] == 'a' & s[i + 1] == 'b') | (s[i] == 'b' & s[i + 1] == 'a') )
            {
                x++;
            }
            if( x != 0 & x % 4 == 0)
            {
                a = 0;
                b = 0;
            }

        }
    }
    else
    {
        for(int i = found; i < s.length(); i++ )
        {
            if( s[i] == 'a' & x % 2 == 1 )
            {
                a++;
            }
            else if( s[i] == 'b' & x % 2 == 0)
            {
                b++;
            }
            else if( s[i] == 'a' & x % 2 == 1 )
            {
                a++;
            }

            if( (s[i] == 'a' & s[i + 1] == 'b') | (s[i] == 'b' & s[i + 1] == 'a') )
            {
                x++;
            }
            if( x != 0 & x % 4 == 0)
            {
                a = 0;
                b = 0;
            }
        }

    }

    cout << a + b << endl;

    return 0;


}


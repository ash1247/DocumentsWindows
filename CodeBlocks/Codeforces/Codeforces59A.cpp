#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    int upper = 0, lower = 0;
    cin >> s;

    for(int i = 0; i < s.length(); i++ )
    {
        if( s[i] >= 'A' & s[i] <= 'Z' )
        {
            upper++;
        }
        else if( s[i] >= 'a' & s[i] <= 'z' )
        {
            lower++;
        }
    }

    if( lower >= upper )
    {
        transform( s.begin(), s.end(), s.begin(), ::tolower );
    }
    else
    {
        transform( s.begin(), s.end(), s.begin(), ::toupper );
    }

    cout << s << endl;
}

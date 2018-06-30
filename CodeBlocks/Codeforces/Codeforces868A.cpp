#include <bits/stdc++.h>

using namespace std;

string subString(string s, int n);

int main( void )
{
    string pass;
    int n;
    string mix;
    string ret;

    cin >> pass >> n;

    string s;

    for( int i = 1; i <= n; i++ )
    {
        cin >> s;
        mix += s;
    }

    ret = subString( mix, mix.length() );
    ret += ret;

    size_t found = ret.find( pass );

    if( found == string::npos )
    {
        cout << "NO\n";
    }
    else
    {
        cout << "YES\n";
    }

    return 0;
}

string subString(string s, int n)
{
    string ret;
    for (int i = 0; i < n; i++)
    {
        for (int len = 1; len <= n - i; len++)
        {
            ret += s.substr(i, len);
        }
    }

    return ret;

}

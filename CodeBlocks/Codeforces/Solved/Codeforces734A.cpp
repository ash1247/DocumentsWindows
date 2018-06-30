#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    string s;
    int a = 0, d = 0;

    cin >> n >> s;

    for(int i = 0; i < n; i++ )
    {
        if( s[i] == 'A')
        {
            a++;
        }
        if( s[i] == 'D')
        {
            d++;
        }
    }

    if( a > d)
    {
        cout << "Anton\n";
    }
    else if( a < d)
    {
        cout << "Danik\n";
    }
    else if( a == d)
    {
        cout << "Friendship\n";
    }

    return 0;
}

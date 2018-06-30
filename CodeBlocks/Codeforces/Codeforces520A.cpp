#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    string s;
    int count = 0;

    cin >> n;
    cin >> s;

    int a[27];

    for(int i = 0; i < n; i++ )
    {
        a[tolower(s[i]) - 'a'] = tolower(s[i]) - 'a';
    }

    for(int i = 0; i < 26; i++ )
    {
        if( a[i] == i )
        {
            count++;
        }
    }

    if( count >= 26)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }
    return 0;

}

#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    set<char> letters;
    int i = 0;

    getline(cin, s);

    for( i = 1; i < s.length(); i += 3)
    {
       if('a' <= s[i] && s[i] <= 'z')
        {
            letters.insert( s[i] );
        }
    }

    cout << letters.size() << endl;

    return 0;
}


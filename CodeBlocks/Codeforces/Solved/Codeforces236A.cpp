#include <bits/stdc++.h>

using namespace std;

int main ( void )
{
    string word;

    int i = 0, j = 0;

    cin >> word;

    sort( word.begin(), word.end() );

    word.erase( unique(word.begin(), word.end()), word.end() );

    size_t length = word.length();

    if( length % 2 == 0)
    {
        cout << "CHAT WITH HER!" << endl;
    }
    else
    {
        cout << "IGNORE HIM!" << endl;
    }

    return 0;
}

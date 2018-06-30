#include <bits/stdc++.h>

using namespace std;

int main ( void )
{
    string word;
    string edited = "hello";

    int i = 0, j = 0, count = 0;

    cin >> word;

    size_t length = word.length();

    for( int i = 0; i < length; i++ )
    {
        if( word[i] == edited[j] )
        {
            j++;
            count++;
        }
    }

    if( count == 5)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }

    return 0;
}

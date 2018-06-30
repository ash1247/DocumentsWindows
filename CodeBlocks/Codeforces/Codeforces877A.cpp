#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string s;
    int x = 0;
    int count = 0;
    cin >> s;

    string a[5] = {"Danil", "Olya", "Slava", "Ann", "Nikita"};

    for(int i = 0; i < 5; i++ )
    {
        size_t found = s.find( a[i], 0 );
        while( found != string::npos)
        {
            count++;
            found = s.find( a[i], found + 1);
        }
        size_t found1 = s.find( a[i]);
        if( found1 != string::npos)
        {
            x++;
        }

    }

    if( x == 1 & ( count == 0 | count == 1) )
    {
        cout << "Yes\n";
    }
    else
    {
        cout << "No\n";
    }

    return 0;
}

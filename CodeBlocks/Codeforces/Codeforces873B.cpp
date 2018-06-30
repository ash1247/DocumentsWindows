#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, count0 = 0, count1 = 0;

    cin >> n;

    string s;

    cin >> s;

    for(int i = 0; i < n; i++ )
    {
        if(s[i] == '0')
        {
            count0++;
        }
        if(  s[i] == '1' )
        {
            count1++;
        }
    }

    if( count1 == 0 | count0 == 0 )
    {
        cout << "0\n";
    }
    else if( count1 < count0 )
    {
        cout << count0 - count1  << endl;
    }
    else if( count1 > count0 )
    {
        cout << count1 - count0  << endl;
    }

    return 0;
}

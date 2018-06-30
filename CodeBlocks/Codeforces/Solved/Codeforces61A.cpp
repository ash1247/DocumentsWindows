#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    string a, b, ans;
    int i = 0;

    cin >> a >> b;

    ans = a;

    for( i = 0; i < a.length() ; i++ )
    {
        if( a[i] != b[i] )
        {
            ans[i] = '1';
        }
        else
        {
            ans[i] = '0';
        }
    }

    cout << ans << endl;

    return 0;
}


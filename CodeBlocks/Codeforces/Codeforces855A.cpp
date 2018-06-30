#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int i = 0;
    int j = 0;
    int k = 0;
    cin >> n;

    string a[n + 1];

    for( i = 1; i <= n; i++ )
    {
        cin >> a[i];
    }

    for( i = 1; i <= n; i++ )
    {
        k = 0;
        for( j = i; j >= 1; j--)
        {
            if(a[i] == a[j] &  j < i )
            {
                k = 1;
                break;
            }
        }

        if( k == 1 )
        {
            cout << "YES\n";
        }
        else
        {
            cout << "NO\n";
        }
    }

    return 0;


}

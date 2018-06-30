#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, coun = 0;

    cin >> n;

    int a[n];

    for(int i = 1; i <= n; i++ )
    {
        cin >> a[i];
    }

    for(int i = 2; i < n; i++ )
    {
        if( a[i] < a[i - 1] && a[i] < a[i + 1] )
        {
            coun++;
        }
        if( a[i] > a[i - 1] && a[i] > a[i + 1] )
        {
            coun++;
        }
    }

    cout << coun;

    return 0;
}

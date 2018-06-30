#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, mini = 360, sum = 0;
    cin >> n;

    int a[n];
    for( int i = 1; i <= n; i++ )
    {
        cin >> a[i];
    }

    for( int i = 1; i < n; i++)
    {
        sum = 0;
        for( int j = i; j <= n; j++)
        {
            sum += a[j];
            mini = min( mini, 2 * abs( sum - 180) );
        }
    }

    cout << mini << endl;

}

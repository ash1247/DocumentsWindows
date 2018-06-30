#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n;
    long int i = 0;

    cin >> n;

    long int a[n];
    long int count = 1;
    long int maxCount = 1;

    cin >> a[1];

    for( i = 2; i <= n; i++)
    {
        cin >> a[i];
        if( a[i] >= a[i - 1] )
        {
            count++;
            maxCount = max( count, maxCount);
        }
        else
        {
            count = 1;
        }
    }

    cout << maxCount << endl;

    return 0;
}

#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int countOdd = 0, countEven = 0;
    int lastOdd = 0, lastEven = 0;

    cin >> n;

    int a[n];

    for(int i = 1; i <= n; i++ )
    {
        cin >> a[i];
    }

    for( int i = 1; i <= n; i++ )
    {
        if( a[i] % 2 == 0)
        {
            countEven++;
            lastEven = i;
        }
        else
        {
            countOdd++;
            lastOdd = i;
        }
    }

    if( countEven < countOdd )
    {
        cout << lastEven << endl;
    }
    else
    {
        cout << lastOdd << endl;
    }

    return 0;


}


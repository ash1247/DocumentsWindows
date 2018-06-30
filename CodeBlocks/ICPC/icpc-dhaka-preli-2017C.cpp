#include <bits/stdc++.h>

using namespace std;

int main ( void )
{
    int t;
    int i = 0;
    int j = 0;
    int k = 0;
    int count = 0;

    cin >> t;

    vector<int> v;

    for( j = 1; j <= 10; j++ )
    {
        v.push_back( j );
    }

    for( i = 1; i <= t; i++ )
    {
        count = 0;

        int n;

        cin >> n;

        int a[n][n];

        for( j = 1; j <= n; j++ )
        {
            for( k = 1; k <= n; k++ )
            {
                cin >> a[j][k];
            }

        }

        vector<int> check;
        check = v;

        for( j = 1; j <= n; j++ )
        {
            for( k = 1; k <= n; k++ )
            {
                check.erase( remove(check.begin(), check.end(), a[j][k] ), check.end() );

                if( check.empty() )
                {
                    count++;
                }
            }
            if( n == 10 )
            {
                if( j % 10 == 0)
                {
                    check = v;
                }
            }
            else if( j % 2 == 0)
            {
                check = v;
            }

        }

        check = v;

        for( j = n; j >= 1; j-- )
        {
            for( k = n; k >= 1; k-- )
            {
                check.erase( remove(check.begin(), check.end(), a[j][k] ), check.end() );

                if( check.empty() )
                {
                    count++;
                }
            }

            if( n == 10)
            {
                if( j % 10 == 0)
                {
                    check = v;
                }
            }
            else if( j % 2 == 1)
            {
                check = v;
            }
        }

        cout << "Case " << i << ": " << count << endl;
    }

    return 0;
}

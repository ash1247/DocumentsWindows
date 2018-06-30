#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    int i = 0;
    int time = 0;
    int a;

    cin >> n >> a;

    int maxa = a, mina = a, mini = 0, maxi = 0;

    for( i = 1; i < n; i++)
    {
        cin >> a;

        if( a > maxa )
        {
            maxa = a;
            maxi = i;
        }
        if( a <= mina )
        {
            mina = a;
            mini = i;
        }
    }


    time = maxi + ( n - 1 - mini ) - ( mini < maxi ? 1 : 0 );

    cout << time << endl;

    return 0;
}

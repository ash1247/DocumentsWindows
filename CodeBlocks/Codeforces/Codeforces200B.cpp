#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n;
    cin >> n;

    int a[n];
    int total = 0;

    for( int i = 1; i <= n; i++ )
    {
        cin >> a[i];
        total += a[i];
    }

    printf("%.10f\n", total / (double)n );

    return 0;

}


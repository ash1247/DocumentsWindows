#include <bits/stdc++.h>
#define LLI long long int

using namespace std;

int main( void )
{
    LLI n, l, maxdist = 0;
    cin >> n >> l;

    LLI a[n];

    for(int i = 1; i <= n; i++ )
    {
        cin >> a[i];
    }

    sort( a + 1, a + n + 1);

    maxdist = 2 * max( a[1], l - a[n] );

    for(int i = 1; i < n; i++ )
    {
        maxdist = max( maxdist, llabs( a[i] - a[i + 1] ) );
    }

    printf("%.10f\n", maxdist / 2.00);

    return 0;

}

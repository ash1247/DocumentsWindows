#include <bits/stdc++.h>

int main ( void )
{
    int n;
    int total = 0;
    int i = 0;
    int mine = 0;

    scanf("%d", &n);

    int a[n];

    for( int i =0; i < n; i++ )
    {
        scanf( "%d", &a[i] );
        total += a[i];
    }

    std::sort( a, a + n );

    while (mine <= (total / 2) )
    {
        mine += a[n - i - 1];
        i++;
    }

    printf("%d\n", i);

    return 0;
}

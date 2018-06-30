#include <bits/stdc++.h>

int main( void )
{
    int n, a, b, i;
    long int cap = 0;
    long int min = 0;

    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        scanf("%d %d", &a, &b);

        cap = cap - a + b;
        if( min < cap)
        {
            min = cap;
        }
    }

    printf("%ld\n", min);
}

#include <bits/stdc++.h>

int main( void )
{
    int n, i;
    printf("Please enter the length of your binary digit: ");
    scanf("%d", &n);
    int a[n], b[n], c[n + 1];
    int carry = 0;

    for( i = 1; i <= n; i++)
    {
       scanf("%d", &a[i] );
    }

    for( i = 1; i <= n; i++)
    {
       scanf("%d", &b[i] );
    }

    for( i = 1; i <= n; i++)
    {
        c[i] = ( a[i] + b[i] + carry ) % 2;
        carry = ( a[i] + b[i] + carry ) / 2;
    }

    c[n + 1] = carry;

    for( i = 1; i <= n; i++)
    {
       printf("%d ", c[i] );
    }
}

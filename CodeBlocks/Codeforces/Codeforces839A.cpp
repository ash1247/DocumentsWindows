#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    int n, i, k;
    int arya, bran;
    int ans1, mod1;
    int array[n];

    scanf("%d %d", &n, &k);

    while( k != 0 )
    {
        i = 1;

        ans1 = k / n;
        mod1 = k % i;

        array[i] = ans1;

        k = k - ans1;

        i++;

        if( k <= 0)
        {
            break;
        }


    }


    for( i = 1; i <= n; i++)
    {
        printf("%d  ", array[i] );
    }
}

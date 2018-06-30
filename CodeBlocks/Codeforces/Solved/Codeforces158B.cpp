#include <bits/stdc++.h>

using namespace std;

int main( void )
{
    long int n;
    int i, j, k;
    int num4 = 0, num3 = 0, num2 = 0, num1 = 0;
    int ans = 0;

    scanf("%ld", &n);

    int array[n];

    for(i = 1; i <= n; i++)
    {
        scanf("%d", &array[i] );
    }

    for(i = 1; i <= n; i++)
    {
        if( array[i] == 4)
        {
            num4++;
        }
        else if( array[i] == 3 )
        {
            num3++;
        }
        else if ( array[i] == 2)
        {
            num2++;
        }
        else if( array[i] == 1)
        {
            num1++;
        }
    }

    ans = num4 + num3 + ( num2 / 2 );
    num1 -= num3;

    if( num2 % 2 == 1)
    {
        ans += 1;
        num1 -=  2;
    }

    if( num1 > 0)
    {
        ans += ( num1 + 3 ) / 4;
    }

    printf("%d\n", ans);

    return 0;
}

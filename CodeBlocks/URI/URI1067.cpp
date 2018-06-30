#include <bits/stdc++.h>

int main(void)
{
    int i, x, odd ;

    scanf("%d", &x);

    for( i = x; i >= 1 ; i--)
    {
        odd = x - (i - 1);
        if( odd % 2 != 0)
            printf("%d\n", odd );
    }

    return 0;
}

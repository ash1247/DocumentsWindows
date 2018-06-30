#include <bits/stdc++.h>

int main(void)
{
    int i, x, odd ;

    scanf("%d", &x);

    for( i = x; i <= (x + 11) ; i++)
    {
        odd = i;
        if( odd % 2 != 0)
            printf("%d\n", odd );
    }

    return 0;
}

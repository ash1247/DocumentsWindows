#include <bits/stdc++.h>

int main(void)
{
    int n, x, coun = 0, i;

    scanf("%d", &n);

    for( i = 1; i <= n ; i++)
    {
        scanf("%d", &x);
        if( x >= 10 && x <= 20)
        {
            coun += 1;
        }

    }
    printf("%d in\n", coun );
    printf("%d out\n", (n - coun) );


    return 0;
}



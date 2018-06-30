#include <bits/stdc++.h>

int main(void)
{
    int i, x, y, odd;
    int sum = 0;

    scanf("%d %d", &x, &y);

    for( i = y + 1; i < x ; i++)
    {
        odd = i;
        if( odd % 2 != 0)
        {
            sum += odd;
        }

    }
    printf("%d\n", sum );

    return 0;
}


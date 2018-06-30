#include <bits/stdc++.h>

int main( void )
{
    int n, i, count = 0;

    scanf("%d", &n);

    char color[n];

    scanf("%s", color);

    for( i = 0; i < n; i++)
    {
        for( i = 0; i < n; i++ )
        {
            printf("i in %d\n", i);
            if( color[i] == color[i + 1] )
            {
                printf("i in if %d\n", i);
                count++;
            }
            printf("i out %d\n", i);
        }
    }

    printf("%d\n", count);


}

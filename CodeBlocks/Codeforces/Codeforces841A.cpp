#include <bits/stdc++.h>

int main( void )
{
    int n, k;
    int i, j;
    int ans;
    char color[101];
    char cl;

    scanf("%d %d", &n, &k);
    scanf("%s", color);

    j = 0;

    cl = color[j];

    for( i = 0; i <= n - 1; i++)
    {
        if(color[i] == cl )
        {
            j++;
        }
    }

    if( j > k )
    {
        printf("NO\n");
    }
    else if( k == n)
    {
        if( j == 1)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
    else
    {
        printf("YES\n");
    }

}

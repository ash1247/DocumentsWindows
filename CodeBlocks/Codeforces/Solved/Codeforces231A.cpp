#include <bits/stdc++.h>

int main(void)
{
    int n;
    int a[1000][3];
    int count = 0;

    scanf("%d", &n);

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= 3; j++)
        {
            scanf("%d", &a[i][j] );
        }
    }

    for(int i = 1; i <= n; i++)
    {
        if(a[i][1] == 1 && a[i][2] == 1)
        {
            count++;
        }
        else if(a[i][2] == 1 && a[i][3] == 1)
        {
            count++;
        }
        else if(a[i][1] == 1 && a[i][3] == 1)
        {
            count++;
        }
        else if(a[i][1] == 1 && a[i][3] == 1 && a[i][2] == 1)
        {
            count++;
        }
    }

    printf("%d\n", count);
}

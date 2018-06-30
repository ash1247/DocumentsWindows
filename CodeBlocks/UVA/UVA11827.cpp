#include <bits/stdc++.h>

int main(void)
{
    int test, i, j, n, minimum = 0, studentSpeed[120];

    scanf("%d\n", &test);

    for( i = 1; i <= test; i++)
    {
        scanf("%d", &n);
        minimum = 0;

        for(j = 1; j <= n; j++)
        {
           scanf("%d", &studentSpeed[j]);

           if(studentSpeed[j] > minimum)
                minimum = studentSpeed[j];
        }

        printf("Case %d: %d\n", i, minimum);
    }
}

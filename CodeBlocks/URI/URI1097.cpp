#include <bits/stdc++.h>

int main(void)
{
    int a = 7, b, j;

    for(int i = 1; i <= 9; i += 2)
    {
        for(b = 1, j = a; b <= 3; j--, b++)
        {
            printf("I=%d J=%d\n", i, j);
        }

        a = a + 2;
    }

    return 0;
}



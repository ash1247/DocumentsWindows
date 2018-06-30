#include <bits/stdc++.h>

int main(void)
{
    int n, i, mul = 0;

    scanf("%d", &n);

    printf("2\n");
    for( i = 1; i < 10000 ; i++)
    {
        mul = (n * i) + 2;
        if(mul > 10000)
            break;
        else
        {
            printf("%d\n", mul);
        }
    }
    return 0;
}





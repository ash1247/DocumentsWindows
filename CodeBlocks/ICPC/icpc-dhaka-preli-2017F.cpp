#include <bits/stdc++.h>

int main()
{
    int P, Q, Y, result;
    scanf("%d %d %d", &P, &Q, &Y);
    result = ( (P * 5) + (Q * 2) ) * (52 * Y);

    printf("%d\n", result);

    return 0;
}


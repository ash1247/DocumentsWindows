#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int m, n, sum = 0, i, j;

    while( scanf("%d %d", &m, &n) )
    {
        if(m == n)
        {
            break;
        }
        else if ( m > n)
        {
            printf("Decrescente\n");
        }
        else if ( m < n)
        {
            printf("Crescente\n");
        }
    }
    return 0;
}








#include <stdio.h>
#include <math.h>

int crossout(int n);

int main(void)
{
    int n;
    scanf("%d", &n);
    crossout(n);
    return 0;
}

int crossout(int n)
{
    int i, j;
    int prime[n + 1];

    for( i = 2; i <= n; i++)
    {
        prime[i] = 1;
    }

    prime[0] = 0;
    prime[1] = 0;

    for( i = 2; i <= sqrt(n); i++)
    {
        if( prime[i] == 1 )
        {
            for(j = 2; i * j <= n; j++)
                prime[i * j] = 0;
        }

    }

    printf("\nPrime numbers in range 1 to %d are: \n", n);
    for (i = 2; i <= n; i++)
        {
            if (prime[i] != 0)
            {
               printf("%d\n", i);
            }
        }
}

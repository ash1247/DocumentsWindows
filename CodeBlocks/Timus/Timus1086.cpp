#include <bits/stdc++.h>
#define MAX 20000

using namespace std;

int main(void)
{
    int n, i, j, t;
    int k = 1;
    int prime[MAX];
    int ansPrime[MAX];

    for( i = 2; i <= MAX; i++)
        {
            prime[i] = 1;
        }

    prime[0] = 0;
    prime[1] = 0;

    for( i = 2; i <= sqrt(MAX); i++)
    {
        if( prime[i] == 1 )
        {
            for(j = 2; i * j <= MAX; j++)
                prime[i * j] = 0;
        }

    }

    for (i = 2; i <= MAX; i++)
        {
            if (prime[i] != 0)
            {
                ansPrime[k] = i;
                k++;
            }
        }

    cin >> t;

    for( i = 1; i <= t; i++)
    {
        cin >> n;
        printf("%d\n", ansPrime[n] );
    }

}



#include <bits/stdc++.h>

long long int process(long long int m,long long int n);
using namespace std;

int main(void)
{
    long long int i, j, coun, high, low, highCoun;
    while(scanf("%lld %lld", &i, &j) != EOF)
    {
        high = max(i, j);
        low = min(i, j);
        highCoun = 0;
        for(int l = high; l >= low; l--)
        {
            coun = process(low, l);
            if(coun > highCoun)
                highCoun = coun;
        }
        printf("%lld %lld %lld\n", i, j, highCoun + 1);

    }
}

long long int process(long long int m,long long int n)
{
    int coun = 0;

    while( n != 1)
    {
        if( n == 1)
        {
            coun++;
            break;
        }
        if(n % 2 == 0)
        {
            n = n / 2;
            coun++;
        }
        else
        {
            n = (3 * n) + 1;
            coun++;
        }

    }
    return coun;

}


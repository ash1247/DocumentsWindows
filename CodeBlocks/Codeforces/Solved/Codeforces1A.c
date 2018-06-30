#include <stdio.h>

long long int ceil(long long int a,long long int b);

int main(void)
{
    long long int m, n, a, flag;

    scanf("%lld %lld %lld", &n, &m, &a);

    flag = ( ceil(n , a) ) * ( ceil( m , a) );

    printf("%lld\n", flag);

    return 0;
}

long long int ceil(long long int a,long long int b)
{
    if(a % b == 0)
        return (a / b);
    else
        return (a / b) + 1;
}

#include <bits/stdc++.h>

int main(void)
{
    int a, b, c, d, e;
    int pos = 0, neg = 0, odd = 0, even = 0;

    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);

    if(a < 0)
        neg += 1;
    if(b < 0)
        neg += 1;
    if(c < 0)
        neg += 1;
    if(d < 0)
        neg += 1;
    if(e < 0)
        neg += 1;
    if(a > 0)
        pos += 1;
    if(b > 0)
        pos += 1;
    if(c > 0)
        pos += 1;
    if(d > 0)
        pos += 1;
    if(e > 0)
        pos += 1;


    if(a % 2 == 0)
        even += 1;
    else
        odd += 1;
    if(b % 2 == 0)
        even += 1;
    else
        odd += 1;
    if(c % 2 == 0)
        even += 1;
    else
        odd += 1;
    if(d % 2 == 0)
        even += 1;
    else
        odd += 1;
    if(e % 2 == 0)
        even += 1;
    else
        odd += 1;

    printf("%d valor(es) par(es)\n", even);
    printf("%d valor(es) impar(es)\n", odd);
    printf("%d valor(es) positivo(s)\n", pos);
    printf("%d valor(es) negativo(s)\n", neg);

    return 0;
}

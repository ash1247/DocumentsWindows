#include <stdio.h>
#include <stdlib.h>

float convertToDollars(float taka);
void passByValue(int i);
void passByAddress(int *i);

int main( void )
{
    int tuna = 20;

    float taka = 80.00;

    float usd = convertToDollars(taka);

    printf("%.2f Taka = %.2f USD\n", taka, usd);

    passByValue(tuna);

    printf("Passing by value, tuna is now %d\n", tuna);

    passByAddress(&tuna);

    printf("Passing by value, tuna is now %d\n", tuna);

    return 0;
}

float convertToDollars(float taka)
{
    float usd = taka / 80.00;
    return usd;
}

void passByAddress(int *i)
{
    *i = 64;
    return;
}

void passByValue(int i)
{
    i = 99;
    return;
}

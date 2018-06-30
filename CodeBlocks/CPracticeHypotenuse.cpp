#include <stdio.h>
#include <math.h>

double CalHypotenuse(double number1, double number2);
long long int integerPower(int base, int exponent);

int main(void)
{
    double number1, number2;

    scanf("%lf %lf", &number1, &number2);

    double result = CalHypotenuse(number1, number2);
    int expo = integerPower((int)number1, (int)number2);

    printf( "Ans is %.2lf\n", result);
    printf( "Ans is %d\n", expo);
}


double CalHypotenuse(double number1, double number2)
{
    return sqrt( (number1 * number1) + (number2 * number2) );
}

long long int integerPower( int base, int exponent)
{
    return (int)pow( base, exponent);
}

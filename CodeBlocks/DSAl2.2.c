#include <stdio.h>
#include <math.h>

int main(void)
{
    float a, b, c, d, e, f, x, x1, x2;


    printf("enter A: ");
    scanf("%f", &a);

    printf("enter B: ");
    scanf("%f", &b);

    printf("enter C: ");
    scanf("%f", &c);

    d = ( (b * b) - (4 * a * c) );

    if ( d > 0 )
    {
        x1 = ( -b + sqrt(d) ) / (2 * a)  ;
        x2 = ( -b - sqrt(d) ) / (2 * a) ;
        printf("x1 = %f\nx2 = %f\n", x1, x2);
    }

    else if ( d == 0)
    {
        x = -b / (2 * a );
        printf("Unique Solution\nx = %f\n", x );
    }

    else
        printf("No real solutions.\n");
}

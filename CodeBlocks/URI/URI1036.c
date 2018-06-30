#include <stdio.h>
#include <math.h>

int main(void)
{
    float a, b, c, d, r1, r2 , power;

    scanf("%f %f %f", &a, &b, &c);

    d = ( (b * b) - (4 * a * c) )  ;
    printf("%f\n", d);

    if( d >= 0 && a != 0)
    {
        r1 =  ( (-b + (sqrt((b * b) - (4 * a * c) ))) / (2 * a) );
        r2 =  ( (-b - (sqrt((b * b) - (4 * a * c) ) )) / (2 * a) );

        printf("R1 = %.5f\n", r1);
        printf("R2 = %.5f\n", r2);
    }
    else
        printf("Impossivel calcular\n");
}

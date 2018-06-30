#include <stdio.h>

int main(void)
{
    float a, b, c, area, perimeter;

    scanf("%f %f %f", &a, &b, &c);


   if( a < (b + c) && b < (a + c) && c < (b + a))
   {
        perimeter = a + b + c;
        printf("Perimetro = %.1f\n", perimeter);
    }

    else
    {
        area = (a + b) * .5 * c;
        printf("Area = %.1f\n", area);
    }

    return 0;
}

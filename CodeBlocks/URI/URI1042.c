#include <stdio.h>

int main(void)
{
    int a, b, c;
    int x, y, z;



    scanf("%d %d %d", &a, &b, &c);

    x = a;
    y = b;
    z = c;


   if( a < b && a < c )
   {
        if(b < c)
            printf("%d\n%d\n%d\n", a, b, c);
        else if( b > c)
            printf("%d\n%d\n%d\n", a, c, b);
    }

   else if( b < a && b < c )
   {
        if( a < c)
            printf("%d\n%d\n%d\n", b, a, c);
        else if( a > c)
            printf("%d\n%d\n%d\n", b, c, a);
    }
    else if(c < a && c < b )
    {
        if( a < b )
            printf("%d\n%d\n%d\n", c, a, b);
        else if( a > b)
            printf("%d\n%d\n%d\n", c, b, a);
    }

    printf("\n%d\n%d\n%d\n", x, y, z);

    return 0;

}

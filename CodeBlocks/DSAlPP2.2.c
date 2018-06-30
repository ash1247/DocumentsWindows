#include <stdio.h>
#include <math.h>

int check (int a, int b);

int main(void)
{
    int a;

    scanf("%d", &a);

    if( a > 10 )
           check(a, 2);
    else
      printf("Please enter a integer larger than 10.");

    return 0;
}

int check (int a, int b)
{
    if( a == 1)
        printf("It's not a prime number\n");
    else
        {
        for(b = 2; b < sqrt(a); b++)
        {
            if(a % b == 0)
            break;
        }
        if( a % b == 0)
            printf("It's not a prime number\n");
        else
            printf("It's a prime number\n");
        }


}

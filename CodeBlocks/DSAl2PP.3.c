#include <stdio.h>

int main(void)
{
    int counter = 0;
    int number = 0;
    int largest = 0;
    int largest2 = 0;

    while( counter < 10)
    {
        printf("Please enter a number:");
        scanf("%d", &number);
        printf("\n");
        counter++;

    if(number > largest )
        {
            largest2 = largest;
            largest = number;
        }
        else if(number > largest2)
            largest2 = number;
    }

    printf("Largest Number is: %d\n", largest);
    printf("Second largest Number is: %d\n", largest2);
}

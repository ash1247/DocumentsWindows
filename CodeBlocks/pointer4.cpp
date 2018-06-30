#include <stdio.h>
#include <stdlib.h>;
#include <ctype.h>
#include <string.h>
#include <math.h>;

int main( void )
{
    int i, howMany;
    int total = 0;
    float avg = 0.0;
    int *pointsArray;

    printf("How many numbers do you want to average?\n");
    scanf("%d", &howMany);

    pointsArray = (int *) malloc(howMany * sizeof(int) );

    printf("Enter them: \n");

    for(int i = 0; i < howMany; i++)
    {
        scanf("%d", &pointsArray[i] );
        total += pointsArray[i];
    }

    avg = (float) total / (float)howMany;

    printf("The average is %.2f\n", avg);
    //free( points );

    return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int main(void)
{
    int i;
    int meatBalls[5] = {7, 9, 43, 2, 98};
    int tuna = 19;
    int *pTuna = &tuna;

    printf( "Address \t tuna \t Value \n");
    printf( "%p \t %s \t %d\n", pTuna, "tuna", tuna);
    printf( "%p \t %s \t %p\n", &pTuna, "pTuna", pTuna);

    printf("\n*pTuna %d \n", *pTuna);

    *pTuna = 71;

    printf("\n*pTuna: %d\n", *pTuna);
    printf("\ntuna: %d\n", tuna);

    printf("Element \t Address \t Value\n");

    for(i = 0; i < 5; i++)
    {
        printf("meatBalls[%d] \t %p \t %d \n", i, &meatBalls[i], meatBalls[i] );
    }

    printf("\nmeatBalls \t\t %p \n", meatBalls);

    printf("\n*meatBalls \t\t %d \n", *meatBalls);

    printf("\n*meatBalls + 2 \t\t %d \n", *(meatBalls + 2) ) ;
}

#include <bits/stdc++.h>

int main( void )
{
    int i=0, j=0 , key = 0, N;
    clock_t t;
    clock_t start, end;
    float time = 0.0;

    printf("Please enter how many numbers you want to enter: ");
    scanf("%d", &N);

    printf("\n");

    int array[N];

    srand( t );

    for(i = 1; i <= N; i++ )
    {
        array[i] = rand();
    }

    printf( "\n\n\n" );

    printf("Before Sorting...\n");
    for(i = 1; i <= N; i++ )
    {
        if( i % 6 == 0)
        {
            printf("\n");
        }
        printf( "%d \t\t", array[i]);
    }

    printf( "\n\n\n" );

    start = clock();

    for( i = 1; i <= N - 1; i++)
    {
        for ( j = N; j >= i + 1; j-- )
        {
            if( array[j] < array[j - 1] )
            {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
            }
        }
    }

    end = clock();

    printf("After Sorting...\n");
    for(i = 1; i <= N; i++ )
    {
        if( i % 6 == 0)
        {
            printf("\n");
        }
        printf( "%d \t\t", array[i]);
    }

    time = ((double)(end - start)) / CLOCKS_PER_SEC;

    printf("\n\nTotal time taken %.3lf s\n", time);

    return 0;
}

#include <bits/stdc++.h>

int main( void )
{
    int i=0, j=0 , key = 0, N;

    printf("Please enter how many numbers you want to enter: ");
    scanf("%d", &N);

    printf("\n");

    int array[N];

    for(i = 1; i <= N; i++ )
    {
        printf("Please enter number %d: ", i);
        scanf( "%d", &array[i] );
    }

    printf( "\n\n\n" );

    printf("Before Sorting...\n");
    for(i = 1; i <= N; i++ )
    {
        printf( "Number %d is %d\n", i, array[i]);
    }

    printf( "\n\n\n" );

    for( j = 2; j <= N; j++)
    {
        key = array[j];

        i = j - 1;

        while ( (i > 0) && (array[i] > key) )
        {
            array[ i + 1] = array[i];
            i = i - 1;
        }
        array[ i + 1 ] = key;
    }

    printf("After Sorting...\n");
    for(i = 1; i <= N; i++ )
    {
        printf("Number %d is %d\n", i, array[i] );
    }

    return 0;
}

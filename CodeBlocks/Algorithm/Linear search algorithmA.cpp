#include <bits/stdc++.h>

int main(void)
{

    int i=0, j=0 , key = 0, N, search;

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

    printf("Please enter the value you want to search for: ");
    scanf("%d", &search);

    for(i = 1; i <= N; i++)
    {
        if ( array[i] == search)
        {
           j = i;
           break;
        }
        else
        {
            j = 0;
        }
    }

    if( j == 0)
    {
        printf("%d is not available in the array", search);
    }
    else
    {
        printf("%d is in the location of %d", search, j);
    }

    return 0;


}

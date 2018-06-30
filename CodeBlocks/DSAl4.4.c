#include <stdio.h>

void bubbleSort(int *const array, int size);

void swap(int *a, int *b );

int main(void)
{
    int ladata[100];
    int k = 1;
    int n;

    printf("How many numbers you want to enter: ");
    scanf("%d", &n);

    for(k = 1; k <= n; k++)
    {
        printf("Enter the %d number: ", k);
        scanf("%d", &ladata[k] );
    }

    printf("\nThe number entered in original order\n");
    for(k = 1; k <= n; k++)
    {
        printf("%6d", ladata[k] );
    }

    bubbleSort(ladata, n);

    printf("\nIn ascending order after Bubble Sort\n");
    for(k = 1; k <= n; k++)
        printf("%6d", ladata[k] );

    return 0;

}

void bubbleSort(int *const array, int size)
{
    void swap(int *a, int *b );

    int pass;
    int j;

    for( pass = 1; pass <= size - 1; ++pass )
    {
        for( j = 1; j <= size - 1; ++j)
        {
            if( array[ j ] > array[ j + 1 ] )
            {
                swap( &array[ j ], &array[ j + 1 ] );
            }
        }
    }
}

void swap(int *a, int *b )
{
    int hold = *a;
    *a = *b;
    *b = hold;
}

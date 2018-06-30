#include <bits/stdc++.h>

int BinSearchR( int v, int a, int b);
void InsertionSort(int * array, int n);

int main( void )
{
    int i, j, n, min, tmp;
    clock_t start, end;
    double time;

    std::cout << "Please enter the size of the array: ";
    std::cin >> n;
    printf("\n");

    int array[n];


    for(i = 1; i <= n; i++)
    {
        array[i] = rand();
    }

    printf("Before Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", array[i] );
    }

    start = clock();

    InsertionSort( array, n);

    int v;
    scanf("%d", &v);
    BinSearchR(1, n, v);

    end = clock();

    time = ( (double)(end - start) ) / CLOCKS_PER_SEC;

    printf("\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", array[i] );
    }

    std::cout << "\n\nTotal time taken " << time << " s.";
}

void InsertionSort(int * array, int n)
{
    int i, j, key;
    for( j = 2; j <= n; j++)
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
}

int BinSearchR( int v, int a, int b)
{
    if ( a > b )
    {
        return 0;
    }

    int m = ( a + b) / 2;

    if( m == v )
    {
        return m;
    }

    if( m < v)
    {
        return BinSearchR(v, a, m);
    }
    else
    {
        return BinSearchR(v, m + 1, b);
    }
}

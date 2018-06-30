#include <bits/stdc++.h>

void merge( int * array, int p, int q, int r);
void merge_sort(int * array, int p, int r);

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

    merge_sort(array, 1, n);

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


void merge( int * array, int p, int q, int r)
{
    int n1 = q - p + 1;
    int n2 = r - q;
    int i, j, k, m;
    int leftArray[ n1 ];
    int rightArray[ n2 ];

    for( i = 1; i <= n1; i++)
    {
        leftArray[i] = array[ p + i - 1];
    }

    for( j = 1; j <= n1; j++)
    {
        rightArray[j] = array[ q + j ];
    }

    i = 1;
    j = 1;
    k = p;

    while( i != n1 + 1 && j != n2 + 1)
    {
        if( leftArray[i] <= rightArray[j] )
        {
            array[k] = leftArray[i];
            i++;
        }
        else
        {
            array[k] = rightArray[j];
            j++;
        }

        k++;
    }

    if( i == n1 + 1)
    {
        for( m = j; m <= n2; m++)
        {
            array[k] = rightArray[m];
            k++;
        }
    }

    if( j == n2 + 1)
    {
        for( m = i; m <= n1; m++)
        {
            array[k] = leftArray[m];
            k++;
        }
    }

}

void merge_sort(int * array, int p, int r)
{
    if( p < r)
    {
        int q = (p + r) / 2;
        merge_sort( array, p, q);
        merge_sort( array, q + 1, r);
        merge(array, p, q, r);
    }
}

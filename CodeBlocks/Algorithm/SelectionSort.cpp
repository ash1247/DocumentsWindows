#include <bits/stdc++.h>

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

    for( i = 1; i <= n - 1; i++)
    {
        min = i;

        for( j = i + 1; j <= n; j++)
        {
            if( array[j] < array[min] )
            {
                min = j;
            }
        }

        tmp = array[i];
        array[i] = array[min];
        array[min] = tmp;

       //std::swap(array[min], array[i] );
    }

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

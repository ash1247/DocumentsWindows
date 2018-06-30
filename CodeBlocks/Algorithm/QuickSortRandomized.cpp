#include <bits/stdc++.h>

int partition( int * array, int p, int r);
void randomizedQuicksort(int * array, int p, int r);
int randomizedPartition(int * array, int p, int r);

int main( void )
{
    int i, n, p, r;
    clock_t start, end;
    double tim;

    std::cout << "Please enter how many inputs you want: ";
    std::cin >> n;

    int array[n];

    printf("\n\n");

    srand( time( NULL ) );

    for( i = 1; i <= n; i++)
    {
        array[i] = rand();
    }

    printf("Before Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 5 == 1 )
        {
            printf("\n");
        }
        printf("%d \t\t", array[i] );
    }

    start = clock();

    p = 1;
    r = n;

    randomizedQuicksort( array, p, r );

    end = clock();

    tim = ( (double)(end - start) ) / CLOCKS_PER_SEC;

    printf("\n\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 5 == 1 )
        {
            printf("\n");
        }
        printf("%d \t\t", array[i] );
    }

    std::cout << "\n\nTotal time taken " << tim << " s.\n\n";

    return 0;

}

int partition(int * array, int p, int r){

	int i, j;
	i = p - 1;
	int x = array[r];

	for(j = p; j <= r - 1; j++){
		if( array [j] <= x )
        {
			i++;
			std::swap( array[i], array[j] );
		}
	}

	std::swap( array[i + 1], array[r] );

	return i + 1;
}

int randomizedPartition(int * array, int p, int r)
{
    int i = ( p + (rand() % ( r - p + 1 ) ) ) ;

    std::swap(array[r], array[i] );

    return partition( array, p, r );
}

void randomizedQuicksort(int * array, int p, int r)
{
    if( p < r )
    {
        int q = randomizedPartition( array, p, r );
        randomizedQuicksort( array, p, q - 1);
        randomizedQuicksort( array, q + 1, r);
    }
}

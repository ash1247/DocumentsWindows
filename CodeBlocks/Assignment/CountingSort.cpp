#include <bits/stdc++.h>

void counting_sort(int *A, int *B, int n);

int main( void )
{
    int i, n;
    clock_t start, end;
    double time;

    std::cout << "Please enter the size of the array: ";
    std::cin >> n;
    printf("\n");

    int A[n];
    int B[n];

    for(i = 1; i <= n; i++)
    {
        A[i] = rand();
    }

    printf("Before Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", A[i] );
    }

    start = clock();

    counting_sort( A, B, n);

    end = clock();

    time = ( (double)(end - start) ) / CLOCKS_PER_SEC;

    printf("\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", A[i] );
    }

    std::cout << "\n\nTotal time taken " << time << " s.";

    return 0;
}


void counting_sort(int *A, int *B, int n){
	int i, j;
	int k = n - 3;
	int C[k];

	for(i = 0; i <= k; i++)
		C[i] = 0;

	for(j = 1; j <= n; j++)
		C[A[j] ] = C[A[j] ] + 1;

	for(i = 1; i <= k; i++)
		C[i] = C[i] + C[i-1];

	for(j = n; j >= 1; j--){
		B[C[A[j] ] ] = A[j];
		C[A[j] ] = C[A[j] ] - 1;
	}
}

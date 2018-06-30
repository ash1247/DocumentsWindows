#include <bits/stdc++.h>

void counting_sort(int *A, int *B, int n, int k);

int main( void )
{
    int i, j, n, k = 0;

    std::cout << "Please enter the size of the array: ";
    std::cin >> n;
    printf("\n");

    int A[n];
    int B[n];

    for(i = 1; i <= n; i++)
    {
        A[i] = rand();
        k = std::max(k, A[i] );
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

    counting_sort(A, B, n, k);

    printf("\nAfter Sorting.. \n");
    for(i = 1; i <= n; i++)
    {
        if( i % 6 == 0 )
        {
            printf("\n");
        }
        printf("%d \t\t", B[i] );
    }

    return 0;
}


void counting_sort(int *A, int *B, int n, int k)
{
    int C[k];
    int i, j;

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
